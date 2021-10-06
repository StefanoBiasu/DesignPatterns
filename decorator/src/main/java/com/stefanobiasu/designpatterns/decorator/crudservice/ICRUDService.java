package com.stefanobiasu.designpatterns.decorator.crudservice;

import com.stefanobiasu.designpatterns.decorator.item.Item;
import com.stefanobiasu.designpatterns.decorator.item.ItemSearch;

/**
 * Definition of a simple CRUD service
 */
public interface ICRUDService {
    /**
     * Returns the created item
     *
     * @param item the created item
     * @return
     */
    Item create(Item item);

    /**
     * Reads an object from datasource, given search input parameter
     *
     * @param itemSearch item search
     * @return The read item
     */
    Item read(ItemSearch itemSearch);

    /**
     * Updates an item.
     *
     * @param item The item to update
     * @return The updated item
     */
    Item update(Item item);

    /**
     * Deletes an item.
     *
     * @param item item to delete
     * @return true if ok, false otherwise.
     */
    boolean delete(Item item);
}
