package com.services;

import com.dao.UserDao;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public boolean saveOrUpdateUser(User user) {
        return userDao.saveOrUpdateUser(user);
    }

    public List<User> getUser() {
        return userDao.getUser();
    }

//    public boolean deleteUser(User user) {
//        return userDao.deleteUser(user);
//    }*/
 /*public boolean checkPassword(User user){
     return userDao.checkPassword(user);
 }*/
}
