package com.c4.write.provider.Controller;

import com.c4.write.provider.bean.Item;
import com.c4.write.provider.bean.TestConfigBean;
import com.c4.write.provider.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private TestConfigBean testConfigBean;

    /**
     * 对外提供接口服务，查询商品信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "item/{id}")
    public Item queryItemById(@PathVariable("id") Long id) {
        return this.itemService.queryItemById(id);
    }

    @GetMapping(value = "testConfig")
    public String testConfig(){
        return testConfigBean.toString();
    }









}
