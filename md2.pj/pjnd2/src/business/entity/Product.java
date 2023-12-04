package business.entity;

import business.util.Formatter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product implements Serializable {
    private Long productId;
    private String productName;
    private Long categoryId;
    private String description;
    private double unitPrice;
    private int stock;
    private LocalDateTime creat_at;
    private LocalDateTime update_at;
    private boolean status;

    public Product() {
    }


    public Product(Long productId, String productName, Long categoryId, String description, double unitPrice, int stock, LocalDateTime creat_at, LocalDateTime update_at, boolean status) {
        this.productId = productId;
        this.productName = productName;
        this.categoryId = categoryId;
        this.description = description;
        this.unitPrice = unitPrice;
        this.stock = stock;
        this.creat_at = creat_at;
        this.update_at = update_at;
        this.status = status;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDateTime getCreat_at() {
        return creat_at;
    }

    public void setCreat_at(LocalDateTime creat_at) {
        this.creat_at = creat_at;
    }

    public LocalDateTime getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(LocalDateTime update_at) {
        this.update_at = update_at;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "Product[" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", categoryId=" + categoryId +
                ", description='" + description + '\'' +
                ", unitPrice=" + Formatter.getNumberFormatterVND().format(unitPrice) +
                ", stock=" + stock +
                ", creat_at=" + dtf.format(creat_at) +
                ", update_at=" + dtf.format(update_at) +
                ", status=" + (status?"Hiện":"Ẩn") +
                ']';
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
