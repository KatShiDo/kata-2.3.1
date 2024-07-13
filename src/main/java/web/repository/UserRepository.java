package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
