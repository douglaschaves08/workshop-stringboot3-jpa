package dodochaves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dodochaves.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
