package br.com.fatecararas.f290_dsm_produtos_ms.repositories;

import br.com.fatecararas.f290_dsm_produtos_ms.domain.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
