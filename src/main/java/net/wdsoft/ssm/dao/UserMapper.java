package net.wdsoft.ssm.dao;

import net.wdsoft.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by jwd on 2017/6/22.
 */
public interface UserMapper {

    public User getUserById(@Param("userId") int userId);

}
