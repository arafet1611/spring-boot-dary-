package com.example.demo.Controller;


import com.example.demo.DTO.CatrgoryDTO;
import com.example.demo.Model.Category;
import com.example.demo.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/api/categories")
    public class CategoryController {

        @Autowired
        private CategoryService categoryService;

        @GetMapping("/")
        public List<Category> getAllCategories() {
            return categoryService.getAllCategories();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Category> getCategoryById(@PathVariable("id") Long id) {
            Category category = categoryService.getCategoryById(id);
            if (category != null) {
                return ResponseEntity.ok(category);
            } else {
                return ResponseEntity.notFound().build();
            }
        }
    @GetMapping("/info")
    public ResponseEntity<List<CatrgoryDTO>> getCategoryInfo() {
        List<CatrgoryDTO> categoryInfoList = categoryService.getCategoryInfo();
        return ResponseEntity.ok(categoryInfoList);
    }
}
