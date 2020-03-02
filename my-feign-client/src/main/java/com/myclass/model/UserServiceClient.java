package com.myclass.model;

import java.util.List;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Groups;

@FeignClient("user-service")
public interface UserServiceClient {
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	@LoadBalanced
	public String userDetails(@PathVariable("userId") int userId);
	@LoadBalanced
	@RequestMapping(value = "/getAllGroups", method = RequestMethod.GET)
	public List<Groups> getAllGroups();

}
