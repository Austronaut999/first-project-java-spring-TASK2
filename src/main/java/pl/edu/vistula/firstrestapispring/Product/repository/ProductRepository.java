package pl.edu.vistula.firstrestapispring.Product.repository;

import org.springframework.data.jpa.domain.AbstractPersistable_;
import org.springframework.stereotype.Repository;
import pl.edu.vistula.firstrestapispring.Product.domain.Product;

import java.util.*;

@Repository
public class ProductRepository {
    protected final Map<Long, Product> map = new HashMap<>();
    protected long counter = 1L;

    public Product save(Product entity) {
        setId(entity);
        return entity;
    }

    private Product setId(Product entity) {
        if (entity.getId() != null) {
            map.put(entity.getId(), entity);
        } else {
            entity.setId(counter);
            map.put(counter, entity);
            counter++;
        }
        return entity;
    }


    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(map.get(id));
    }

    public List<Product> findALL(){
        return new ArrayList<>(map.values());
    }


    public void deleteById(Long id){
        map.remove(AbstractPersistable_.id);
    }


    }

