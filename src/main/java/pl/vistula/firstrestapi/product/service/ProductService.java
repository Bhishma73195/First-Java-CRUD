package pl.vistula.firstrestapi.product.service;

import pl.vistula.firstrestapi.product.api.request.ProductRequest;
import pl.vistula.firstrestapi.product.api.request.UpdateProductRequest;
import pl.vistula.firstrestapi.product.api.response.ProductResponse;
import pl.vistula.firstrestapi.product.domain.Product;
import pl.vistula.firstrestapi.product.repository.ProductRepository;
import pl.vistula.firstrestapi.product.support.ProductMapper;
import pl.vistula.firstrestapi.product.support.exception.ProductExceptionSupplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductService(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProductResponse create(ProductRequest request) {
        Product product = mapper.toEntity(request);
        return mapper.toResponse(repository.save(product));
    }

    public ProductResponse find(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));
        return mapper.toResponse(product);
    }

    public List<ProductResponse> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    public ProductResponse update(Long id, UpdateProductRequest request) {
        Product product = repository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));
        mapper.update(product, request);
        return mapper.toResponse(repository.save(product));
    }

    public void delete(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));
        repository.deleteById(product.getId());
    }
}

