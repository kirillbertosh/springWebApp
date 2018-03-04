package springApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springApp.dao.RoleDao;
import springApp.dao.UserDao;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import springApp.entities.Role;
import springApp.entities.User;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    //@Autowired
    //private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void save(User user) {
        //user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        userDao.save(user);
    }

    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
