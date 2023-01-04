package dodochaves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dodochaves.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
