package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Item;
import com.example.demo.service.repo.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService{
private ItemRepository itemRepository;
@Autowired
public ItemServiceImpl(ItemRepository itemRepository) {
	super();
	this.itemRepository = itemRepository;
}

@Override
@Transactional
public List<Item> getAllItem() {
	// TODO Auto-generated method stub
	return itemRepository.findAll();
}

@Override
@Transactional
public Item createItem(Item item) {
	// TODO Auto-generated method stub
	return itemRepository.insert(item);
}

@Override
@Transactional
public Optional<Item> findItemById(String itemId) {
	Optional<Item> item = itemRepository.findById(itemId);
	return item;
}

@Override
@Transactional
public void deleteItemById(String itemId) {
	itemRepository.deleteById(itemId);
	
}

@Override
@Transactional
public void deleteAll() {
	// TODO Auto-generated method stub
	itemRepository.deleteAll();
}

}
