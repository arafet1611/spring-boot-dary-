package com.example.demo.Service;

import com.example.demo.DTO.ProductDTO;
import com.example.demo.Model.MyProductList;
import com.example.demo.Model.User;

import java.util.List;

public interface MyProductListService {
    MyProductList addProductToList(User user, ProductDTO productDTO);
    List<ProductDTO> getProductsByUser(User user);
}