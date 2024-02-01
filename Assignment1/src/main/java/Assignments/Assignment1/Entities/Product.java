package Assignments.Assignment1.Entities;

public class Product {
    private int id;
    private String brand_name;
    private int submission_number;
    private String ingredients;
    private String manufacturer;

    public Product(int id, String brand_name, int submission_number, String ingredients, String manufacturer) {
        this.id= id;
        this.brand_name = brand_name;
        this.submission_number = submission_number;
        this.ingredients = ingredients;
        this.manufacturer = manufacturer;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public int getSubmission_number() {
        return submission_number;
    }

    public void setSubmission_number(int submission_number) {
        this.submission_number = submission_number;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
