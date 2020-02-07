package com.example.demo.model;



import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.model.product.Product;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data
@Document
public class Item {
@Id
private String itemId;
private String itemName;
private double itemPrice;
//@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-mm-yyyy")
@JsonIgnore
private  LocalDate date ;
private Product product;


}
