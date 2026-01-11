package pl.edu.vistula.firstrestapispring.Product.support.exсeption;

import java.util.function.Supplier;

public class ProductExceptionSupplier {
    public static Supplier<ProductNotFoundExeption> productNotFound(Long id) {
        return ()  -> new ProductNotFoundExeption(id);
    }
}
