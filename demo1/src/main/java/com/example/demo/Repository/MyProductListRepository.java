package com.example.demo.Repository;

import com.example.demo.Model.MyProductList;
import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyProductListRepository extends JpaRepository<MyProductList, Long> {
    List<MyProductList> findByUser(User user);
}
