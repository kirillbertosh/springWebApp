package springApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springApp.entities.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
