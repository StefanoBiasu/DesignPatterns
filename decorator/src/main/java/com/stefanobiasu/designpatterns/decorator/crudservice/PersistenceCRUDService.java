package com.stefanobiasu.designpatterns.decorator.crudservice;

import com.stefanobiasu.designpatterns.decorator.item.Item;
import com.stefanobiasu.designpatterns.decorator.item.ItemSearch;

/**
 * Persistence implementation of ICRUDService
 */
public class PersistenceCRUDService implements ICRUDService {
    @Override
    public Item create(Item item) {
        System.out.println("Item saved in database");
        return item;
    }

    @Override
    public Item read(ItemSearch itemSearch) {
        System.out.println("Item fetched from database");
        return new Item();
    }

    @Override
    public Item update(Item item) {
        System.out.println("Item updated in database");
        return item;
    }

    @Override
    public boolean delete(Item item) {
        System.out.println("Item deleted from database");
        return true;
    }
}
