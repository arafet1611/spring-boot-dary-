package com.example.demo.ServiceImp;

import com.example.demo.DTO.ProductDTO;
import com.example.demo.Model.MyProductList;
import com.example.demo.Model.Product;
import com.example.demo.Model.User;
import com.example.demo.Repository.MyProductListRepository;
import com.example.demo.Service.MyProductListService;
import com.example.demo.Service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MyProductListServiceImpl implements MyProductListService {

    @Autowired
    private MyProductListRepository myProductListRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public MyProductList addProductToList(User user, ProductDTO productDTO) {
        Product product = productService.getProductById(productDTO.getId());
        MyProductList myProductList = new MyProductList(user, product);
        return myProductListRepository.save(myProductList);
    }

    @Override
    public List<ProductDTO> getProductsByUser(User user) {
        List<MyProductList> myProductList = myProductListRepository.findByUser(user);
        return myProductList.stream()
                .map(mp -> modelMapper.map(mp.getProduct(), ProductDTO.class))
                .collect(Collectors.toList());
    }
}
