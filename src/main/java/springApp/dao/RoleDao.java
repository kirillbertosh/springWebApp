package springApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springApp.entities.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
