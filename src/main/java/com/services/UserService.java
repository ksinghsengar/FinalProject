package com.services;

import com.model.User;

import java.util.List;


public interface UserService {

    public boolean saveOrUpdateUser(User user);
   public List<User> getUser();
//    public boolean deleteUser(User users);*/
//   public  boolean checkPassword(User user);
}
