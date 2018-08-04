package com.c4.write.consumer.service;

import com.c4.write.consumer.FeignClient.ItemFeignClient;
import com.c4.write.consumer.bean.Item;
import com.c4.write.consumer.propertiesBean.OrderProerties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ItemService {
    // Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private OrderProerties orderProerties;
    @Autowired
    private ItemFeignClient itemFeignClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @HystrixCommand(fallbackMethod = "queryItemByIdFallbackMethod") // 进行容错处理
    public Item queryItemById(Long id) {
        return itemFeignClient.queryItemById(id);
    }
    public Item queryItemByIdFallbackMethod(Long id){ // 请求失败执行的方法
        return new Item(id, "查询商品信息出错!", null, null, null);
    }


}
