package pl.edu.vistula.firstrestapispring.Product.support.exсeption;

public class ProductNotFoundExeption extends RuntimeException {
    public ProductNotFoundExeption(Long id) {
        super(String.format("Product with %d not found", id));
    }
}
