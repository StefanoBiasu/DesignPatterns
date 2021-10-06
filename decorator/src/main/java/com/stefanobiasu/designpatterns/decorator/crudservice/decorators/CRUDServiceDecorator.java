package com.stefanobiasu.designpatterns.decorator.crudservice.decorators;

import com.stefanobiasu.designpatterns.decorator.crudservice.ICRUDService;
import com.stefanobiasu.designpatterns.decorator.crudservice.PersistenceCRUDService;
import com.stefanobiasu.designpatterns.decorator.crudservice.RESTCRUDService;
import com.stefanobiasu.designpatterns.decorator.item.Item;
import com.stefanobiasu.designpatterns.decorator.item.ItemSearch;

/**
 * Decorator of ICRUDService where both existing implementations are involved.
 */
public class CRUDServiceDecorator implements ICRUDService {

    private ICRUDService persistenceCRUDService = new PersistenceCRUDService();
    private ICRUDService restCRUDService = new RESTCRUDService();

    @Override
    public Item create(Item item) {
        final Item persistedItem = persistenceCRUDService.create(item);
        final Item RESTItem = restCRUDService.create(persistedItem);
        return RESTItem;
    }

    @Override
    public Item read(ItemSearch itemSearch) {
        Item item = persistenceCRUDService.read(itemSearch);
        if (item == null) {
            item = restCRUDService.read(itemSearch);
        }
        return item;
    }

    @Override
    public Item update(Item item) {
        final Item persistedItem = persistenceCRUDService.create(item);
        final Item RESTItem = restCRUDService.create(persistedItem);
        return RESTItem;
    }

    @Override
    public boolean delete(Item item) {
        // otherwise, implement a rollback
        return persistenceCRUDService.delete(item) && restCRUDService.delete(item);
    }
}
