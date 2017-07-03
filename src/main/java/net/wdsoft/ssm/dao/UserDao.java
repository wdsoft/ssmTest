package net.wdsoft.ssm.dao;

import net.wdsoft.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by jwd on 2017/6/22.
 */
public interface UserDao {

    public User getUserById(@Param("userId") int userId);

}
