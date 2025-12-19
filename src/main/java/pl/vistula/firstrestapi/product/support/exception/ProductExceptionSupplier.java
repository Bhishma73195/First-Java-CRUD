package pl.vistula.firstrestapi.product.support.exception;

import java.util.function.Supplier;

public class ProductExceptionSupplier {

    public static Supplier<ProductNotFoundException> productNotFound(Long id) {
        return () -> new ProductNotFoundException("Product not found with id: " + id);
    }
}
