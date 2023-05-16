package com.example.demo.DTO;

import com.example.demo.Model.Product;
import org.modelmapper.ModelMapper;

public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private double price;
    private CatrgoryDTO category;

    public ProductDTO() {}

    public ProductDTO(Long id, String name, String description, double price, CatrgoryDTO category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CatrgoryDTO getCategory() {
        return category;
    }

    public void setCategory(CatrgoryDTO category) {
        this.category = category;
    }

   /* public static ProductDTO fromProduct(Product product) {
        ModelMapper modelMapper = new ModelMapper();
        ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
        productDTO.setCategory(CatrgoryDTO.fromCategory(product.getCategory()));
        return productDTO;
    }*/
}
