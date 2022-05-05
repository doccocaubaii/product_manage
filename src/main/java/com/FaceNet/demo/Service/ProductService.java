package com.FaceNet.demo.Service;

import com.FaceNet.demo.Model.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {

    void save(ProductEntity product);
    List<ProductEntity> findAll();
    void del(Long id);
    Optional <ProductEntity> findById(Long id);

}
