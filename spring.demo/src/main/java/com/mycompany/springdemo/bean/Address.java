package com.mycompany.springdemo.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ Component("add")
public class Address {
private String address1;
private String address2;
private String pincode;
@Override
public String toString() {
	return "Address [address1=" + address1 + ", address2=" + address2 + ", pincode=" + pincode + "]";
}


}





