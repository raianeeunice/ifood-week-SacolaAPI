package raiane.dio.sacola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import raiane.dio.sacola.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
