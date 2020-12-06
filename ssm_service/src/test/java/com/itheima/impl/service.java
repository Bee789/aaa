package com.itheima.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class service {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService itemsService = ((ItemsService) applicationContext.getBean("itemsServiceImpl"));

        Items items = new Items();
        items.setName("华为手机");
        items.setPrice(9999f);
        itemsService.save(items);
        List<Items> list = itemsService.findAll();

        System.out.println(list);
       /* for (Items im : list) {
            System.out.println(im);
        }*/
    }
}
