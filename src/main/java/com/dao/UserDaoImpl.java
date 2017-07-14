package com.dao;

import com.model.User;
//import com.util.UserUtil;
import com.util.UserUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.security.auth.login.Configuration;
import java.util.List;


@Repository
//@Transactional
public class UserDaoImpl implements UserDao {

    SessionFactory sessionFactory ;

    public boolean saveOrUpdateUser(User user) {
        System.out.println("inside userDao Impl");
        sessionFactory = UserUtil.getSessionFactory();
        System.out.println("SessionFactory ");
        Session session = sessionFactory.openSession();
        System.out.println("Session ");
        session.beginTransaction();
        System.out.println("Session begin");
        System.out.println("firstname1:"+user.getFirstName());
        System.out.println("last1 "+user.getLastName());
        System.out.println("email1 "+user.getEmail());
        System.out.println("user1 "+user.getUserName());
        System.out.println("active:"+user.getActive());
        System.out.println("admin: "+user.getAdmin());
        session.save(user);
        System.out.println("saved ");
        session.getTransaction().commit();
        System.out.println("After session");
        return true;
    }

    public List<User> getUser() {
         sessionFactory = UserUtil.getSessionFactory();
         Session session  = sessionFactory.openSession();
         session.beginTransaction();
          return session.createQuery("from User").list();

    }

    public boolean deleteUser(User user) {
        try {
            sessionFactory = UserUtil.getSessionFactory();
            Session session =  sessionFactory.openSession();
            session.beginTransaction();
            session.delete(user);
            return true;
        }
        catch (Exception ex) {
            return false;
        }

    }

    @Override
    public boolean validateUser(String loginUser,String loginPassword) {
        sessionFactory = UserUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        String hql = "from User where (userName = ?  or email = ?) and password = ? ";
        Query query = session.createQuery(hql)
                .setString(0, loginUser)
                .setString(1, loginUser)
                .setString(2, loginPassword);
        return query.list().isEmpty();
    }
}
