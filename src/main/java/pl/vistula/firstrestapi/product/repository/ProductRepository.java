
package pl.vistula.firstrestapi.product.repository;

import pl.vistula.firstrestapi.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
