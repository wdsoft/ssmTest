package net.wdsoft.ssm.service;

import net.wdsoft.ssm.pojo.User;
import net.wdsoft.ssm.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jwd on 2017/6/22.
 */
@Service("userService")
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;
//
    public User getUserById(int userId) {
//        return null;
        return userMapper.getUserById(1);
    }
}
