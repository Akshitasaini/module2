package com.example.demo.service;

import java.util.List;

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

/*@Override
@Transactional
public Item findItemById(String itemId) {
	// TODO Auto-generated method stub
	return itemRepository.findItemById(itemId);
}*/

}
