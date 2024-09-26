package com.wxy;

import com.wxy.model.domain.User;
import com.wxy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class D17ApplicationTests {

    @Autowired
    private UserService userService;

//    查
    @Test
    public void testFindAll() {
        System.out.println(userService.findAll());
    }

//    增
    @Test
    public void testInsert() {
        User user = new User();
        user.setName("王显四");
        user.setAge(24);
        userService.insert(user);

        testFindAll();
    }


//    改
    @Test
    public void testUpdate() {
        User user = userService.findById(4);
        user.setName("王显五");
        user.setAge(25);
        userService.update(user);

        testFindAll();
    }

    @Test
    public void testDelete() {
        userService.delete(4);

        testFindAll();
    }
}
