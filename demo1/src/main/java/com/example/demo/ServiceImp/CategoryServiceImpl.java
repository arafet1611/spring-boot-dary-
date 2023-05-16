package com.example.demo.ServiceImp;

import com.example.demo.DTO.CatrgoryDTO;
import com.example.demo.Model.Category;
import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<CatrgoryDTO> getCategoryInfo() {
        List<CatrgoryDTO> categoryInfoList = new ArrayList<>();
        List<Category> categoryList = categoryRepository.findAll();
        for (Category category : categoryList) {
            String categoryName = category.getName();
            int numProducts = category.getProducts().size();
            CatrgoryDTO categoryInfo = new CatrgoryDTO( categoryName, numProducts);
            categoryInfoList.add(categoryInfo);
        }
        return categoryInfoList;
    }
}