package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.repo.ItemRepository;

@SpringBootApplication
public class MongoIntegrationApplication implements CommandLineRunner{
	private ItemRepository itemRepository;
@Autowired
	public MongoIntegrationApplication(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MongoIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
