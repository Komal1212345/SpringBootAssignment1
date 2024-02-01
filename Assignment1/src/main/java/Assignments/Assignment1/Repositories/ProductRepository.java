package Assignments.Assignment1.Repositories;
import Assignments.Assignment1.Entities.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

import java.util.List;
@Repository
public class ProductRepository {


    private final List<Product> list = new ArrayList<Product>();

    public List<Product> getAllProducts() {
        return list;
    }

    public Product findById(int id) {
        for (Product p : list) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }


    public Product save(Product product) {
        Product p = new Product();
        p.setId(product.getId());
        p.setBrand_name(product.getBrand_name());
        p.setSubmission_number(product.getSubmission_number());
        p.setIngredients(product.getIngredients());
        p.setManufacturer(product.getManufacturer());
        list.add(p);
        return p;
    }
}

