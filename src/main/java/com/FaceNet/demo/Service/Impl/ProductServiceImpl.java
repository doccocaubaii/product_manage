package com.FaceNet.demo.Service.Impl;

import com.FaceNet.demo.Model.ProductEntity;
import com.FaceNet.demo.Repo.ProductRepo;
import com.FaceNet.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;
    @Override
    public List<ProductEntity> findAll(){
        List<ProductEntity> list = productRepo.findAll();
        return list;
    }
    @Override
    public void save(ProductEntity product){
        productRepo.save(product);
    }

    @Override
    public void del(Long id){
        productRepo.del(id);
    }

    @Override
    public Optional<ProductEntity> findById(Long id){
        return productRepo.findById(id);
    }
}
