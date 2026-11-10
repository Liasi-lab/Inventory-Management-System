/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomorlima;

import java.sql.Date;

/**
 *
 * @author asus
 */
public class productData {
    
    private Integer productId;
    private String type;
    private String brand;
    private String productName;
    private Double price;
    private String stock;
    private String image;
    private Date date;
    
    public productData(Integer productId, String type, String brand, String productName, Double price, String stock, String image, Date date){
        this.productId = productId;
        this.type = type;
        this.brand = brand;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.image = image;
        this.date = date;
    }
    
    public Integer getProductId(){
        return productId;
    }
    public String getType(){
        return type;
    }
    public String getBrand(){
        return brand; 
    }
    public String getProductName(){
        return productName;
    }
    public Double getPrice(){
        return price;
    }
    public String getStock(){
        return stock;
    }
    public String getImage(){
        return image;
    }
    public Date getDate(){
        return date;
    }
}
