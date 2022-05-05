package com.FaceNet.demo.Model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "quanly_dm", catalog = "")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PRODUCT_ID", nullable = false)
    private long productId;
    @Basic
    @Column(name = "PRODUCT_NAME", nullable = true, length = 250)
    private String productName;
    @Basic
    @Column(name = "VENDOR_ID", nullable = true)
    private Long vendorId;
    @Basic
    @Column(name = "IMAGES", nullable = true, length = 250)
    private String images;
    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 3000)
    private String description;
    @Basic
    @Column(name = "RATING", nullable = true, precision = 0)
    private Double rating;
    @Basic
    @Column(name = "STATUS", nullable = true)
    private Boolean status;
    @Basic
    @Column(name = "CREATED_DATE", nullable = false)
    private Timestamp createdDate;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return productId == that.productId && Objects.equals(productName, that.productName) && Objects.equals(vendorId, that.vendorId) && Objects.equals(images, that.images) && Objects.equals(description, that.description) && Objects.equals(rating, that.rating) && Objects.equals(status, that.status) && Objects.equals(createdDate, that.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, vendorId, images, description, rating, status, createdDate);
    }
}
