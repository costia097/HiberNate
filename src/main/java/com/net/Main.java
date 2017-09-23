package com.net;

import com.net.model.Customer;
import com.net.model.Item;
import com.net.model.Role;
import com.net.model.User;
import com.net.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appConfig.xml");
        log.info("Done");
        UserService userService = (UserService) applicationContext.getBean("userService");
//        List<User> userByName = userService.findUserByName();
//        userByName.forEach(user-> System.out.println(user.getName()+" "+user.getEmail()+" "+user.getPassword()+" "+user.getItems()));

//        User userA = new User();
//        Set<Item> items = new HashSet<>();
//        userA.setName("A");
//        userA.setEmail("@A");
//        userA.setPassword("123a");
//
//        Item item1 = new Item();
//        item1.setName("One");
//        item1.setPrice(10L);
//        item1.setUser(userA);
//
//        Item item2 = new Item();
//        item2.setName("Two");
//        item2.setPrice(20L);
//        item2.setUser(userA);
//
//        Item item3 = new Item();
//        item3.setName("three");
//        item3.setPrice(30L);
//        item3.setUser(userA);
//
//        items.add(item1);
//        items.add(item2);
//        items.add(item3);
//
//        userA.setItems(items);
//
//        userService.saveUser(userA);

        Customer customer1 = new Customer();
        customer1.setName("A");
        Customer customer2 = new Customer();
        customer2.setName("B");
        HashSet<Role> roles = new HashSet<>();
        roles.add(new Role("role 1"));
        roles.add(new Role("role 2"));
        customer1.setRoles(roles);
        customer2.setRoles(roles);
        userService.saveCustomer(customer1);
        userService.saveCustomer(customer2);
    }
}
