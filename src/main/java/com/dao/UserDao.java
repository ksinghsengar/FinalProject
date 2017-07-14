package com.dao;

import com.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by krishan on 7/13/2017.
 */

public interface UserDao {

    public boolean saveOrUpdateUser(User user);
   public List<User> getUser();
//    public boolean deleteUser(User user);*/
//   public  boolean checkPassword(User user);
}
