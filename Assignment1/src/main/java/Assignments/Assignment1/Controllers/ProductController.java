package Assignments.Assignment1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import Assignments.Assignment1.Services.ProductService;
import Assignments.Assignment1.Entities.Product;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    //Create a new product
    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    //Retrieve all products
    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Retrieve a specific product by ID
    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return productService.findById(productId);
    }

    // Update an existing product
    @PutMapping("/update/{productId}")
    public Product updateProduct(@PathVariable int productId, @RequestBody Product updatedProduct) {
        Product existingProduct = productService.findById(productId);
        if (existingProduct != null) {
            existingProduct.setBrand_name(updatedProduct.getBrand_name());
            existingProduct.setSubmission_number(updatedProduct.getSubmission_number());
            existingProduct.setIngredients(updatedProduct.getIngredients());
            existingProduct.setManufacturer(updatedProduct.getManufacturer());
            return productService.saveProduct(existingProduct);
        } else {
            throw new RuntimeException("Product not found with id: " + productId);
        }
    }

    // Delete a product by ID
    @DeleteMapping("/delete/{productId}")
    public String deleteProduct(@PathVariable int productId) {
        Product existingProduct = productService.findById(productId);
        if (existingProduct != null) {
            productService.deleteProduct(existingProduct);
            return "Product with id " + productId + " has been deleted.";
        } else {
            throw new RuntimeException("Product not found with id: " + productId);
        }
    }
}
