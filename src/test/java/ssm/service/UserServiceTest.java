package ssm.service;

import net.wdsoft.ssm.pojo.User;
import net.wdsoft.ssm.service.IUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jwd on 2017/6/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext*.xml")
public class UserServiceTest {

    @Autowired
    IUserService userService;

    @Test
    public void getUserByIdTest() {
        User user = userService.getUserById(1);
        Assert.assertNotNull(user);
    }
}
