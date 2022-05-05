package com.FaceNet.demo.Repo;

import com.FaceNet.demo.Model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Long> {

    @Query(value = "DELETE FROM product WHERE product.PRODUCT_ID = :id", nativeQuery = true)
    void del(@Param("id") Long id);


}
