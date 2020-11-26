package ziouane.umontpellier.tpspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ziouane.umontpellier.tpspringboot.models.Location;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
