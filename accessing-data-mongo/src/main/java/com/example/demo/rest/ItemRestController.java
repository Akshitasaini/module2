package com.example.demo.rest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.repo.ItemRepository;

@RestController
@RequestMapping("/api")
public class ItemRestController {
	private ItemRepository itemRepository;

	@Autowired
	public ItemRestController(ItemRepository itemRepository) {
		super();
		this.itemRepository = itemRepository;
	}

	@PostMapping("/items")
	public Item createItem(@RequestBody Item item) {
		item.setDate(LocalDate.now());
		return itemRepository.insert(item);
	}

	@GetMapping("/items")
	public List<Item> getAllItem() {

		return itemRepository.findAll();
	}

	@GetMapping("/items/{itemId}")
	public Optional<Item> getItemById(@PathVariable String itemId) {
		Optional<Item> item = itemRepository.findById(itemId);
		return item;
	}

	@DeleteMapping("/items/{itemId}")
	public void deleteById(@PathVariable String itemId) {
		itemRepository.deleteById(itemId);
	}
	@DeleteMapping("/items")
	public void deleteAll() {
		itemRepository.deleteAll();
	}
	@PutMapping("/items")
	public Item updateItem(@RequestBody Item item) {
		return itemRepository.save(item);
	}
}
