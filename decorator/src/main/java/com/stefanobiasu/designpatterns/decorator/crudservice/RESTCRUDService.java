package com.stefanobiasu.designpatterns.decorator.crudservice;

import com.stefanobiasu.designpatterns.decorator.item.Item;
import com.stefanobiasu.designpatterns.decorator.item.ItemSearch;

/**
 * REST implementation of ICRUDService.
 */
public class RESTCRUDService implements ICRUDService {

    @Override
    public Item create(Item item) {
        System.out.println("Item saved in remote server");
        return item;
    }

    @Override
    public Item read(ItemSearch itemSearch) {
        System.out.println("Item fetched from remote server");
        return new Item();
    }

    @Override
    public Item update(Item item) {
        System.out.println("Item updated in remote server");
        return item;
    }

    @Override
    public boolean delete(Item item) {
        System.out.println("Item deleted from remote server");
        return true;
    }
}
