package br.com.fatecararas.f290_dsm_produtos_ms.resources;

import br.com.fatecararas.f290_dsm_produtos_ms.domain.entities.ProductEntity;
import br.com.fatecararas.f290_dsm_produtos_ms.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductResource {

    private final ProductRepository repository;

    public ProductResource(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> findById(@PathVariable("id") Integer id) throws Exception {
        Optional<ProductEntity> optional = repository.findById(id);
        if(optional.isEmpty()) throw new Exception("Product not found. Id: "+id);
        return ResponseEntity.ok(optional.get());
    }
}
