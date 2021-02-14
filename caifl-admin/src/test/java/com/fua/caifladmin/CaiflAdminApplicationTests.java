package com.fua.caifladmin;

import com.fua.caifladmin.entity.User;
import com.fua.caifladmin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class CaiflAdminApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void contextLoads() {
    }


    @Test
    void testLogin(){
        User caifl = userService.queryByName("caifl");
        System.out.println("hello world!");
        System.out.println(caifl.toString());
//        List<User> users = userService.queryList();
//        System.out.println("hello world!");
//        System.out.println(users);
    }

}
