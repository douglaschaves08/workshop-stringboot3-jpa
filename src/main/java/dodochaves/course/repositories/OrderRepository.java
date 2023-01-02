package dodochaves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dodochaves.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
