package com.itheima.dao;

import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DaoTest {
    public static void main(String[] args) {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
            ItemsDao itemsDao = (ItemsDao)applicationContext.getBean("itemsDao");
            Items items = new Items();
            items.setName("商品名称");
            items.setPrice(16666f);
            items.setPrice(10f);
            itemsDao.save(items);
        System.out.println("商品列表：：："+itemsDao.findAll());
        }
}
