package com.FaceNet.demo.Controller;

import com.FaceNet.demo.Model.ProductEntity;
import com.FaceNet.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/findAll")
    public List<ProductEntity> findAll(){
        List<ProductEntity> list =productService.findAll();
        return list;
    }

    @GetMapping("/add")
    public void add(@RequestBody ProductEntity product){
        productService.save(product);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        productService.del(id);
    }

    @GetMapping("/edit")
    public void edit(@RequestBody ProductEntity product){
        productService.save(product);
    }

    @GetMapping("/findById/{id}")
    public Optional<ProductEntity> findById(@PathVariable Long id){
        return  productService.findById(id);
    }

}
