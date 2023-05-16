package com.example.demo.Service;

import com.example.demo.DTO.CatrgoryDTO;
import com.example.demo.Model.Category;

import java.util.List;

public interface CategoryService {
        List<Category> getAllCategories();
        Category getCategoryById(Long id);
    List<CatrgoryDTO> getCategoryInfo();
    }

