package ziouane.umontpellier.tpspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ziouane.umontpellier.tpspringboot.models.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
