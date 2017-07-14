package com.services;

import com.dao.UserDao;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public boolean saveOrUpdateUser(User user) {

        user.setDateCreated(new Date());
        user.setLastUpdated(new Date());
        user.setAdmin(false);
        user.setActive(true);

        return userDao.saveOrUpdateUser(user);
    }

    public List<User> getUser() {
        return userDao.getUser();
    }

    public boolean deleteUser(User user) {
        return userDao.deleteUser(user);
    }

     public boolean validateUser(String loginUser, String loginPassword){
         if(userDao.validateUser(loginUser,loginPassword)){

             return false;
         }
         return true;
     }

}
