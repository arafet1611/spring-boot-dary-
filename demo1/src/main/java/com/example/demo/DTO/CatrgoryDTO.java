package com.example.demo.DTO;

import com.example.demo.Model.Category;
import org.modelmapper.ModelMapper;

public class CatrgoryDTO {

        private String categoryName;
        private int numberOfProducts;

        public CatrgoryDTO(String categoryName, int numberOfProducts) {
            this.categoryName = categoryName;
            this.numberOfProducts = numberOfProducts;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public int getNumberOfProducts() {
            return numberOfProducts;
        }

        public void setNumberOfProducts(int numberOfProducts) {
            this.numberOfProducts = numberOfProducts;
        }
   /* public static CatrgoryDTO fromCategory(Category category) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(category, CatrgoryDTO.class);
    }*/
    }

