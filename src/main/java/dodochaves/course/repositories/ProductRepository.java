package dodochaves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dodochaves.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
