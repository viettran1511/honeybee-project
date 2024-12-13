package com.honeybee.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ProductDTO {

    @NotBlank(message = "Product name is not blank!")
    private String name;
    @NotBlank(message = "Description is not blank!")
    private String description;

    @NotNull(message = "Price is not blank!")
    @Positive(message = "Price must positive!")
    private Double price;

    // Getters và Setters
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
