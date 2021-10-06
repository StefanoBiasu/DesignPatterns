package com.stefanobiasu.designpatterns.decorator;

import com.stefanobiasu.designpatterns.decorator.crudservice.ICRUDService;
import com.stefanobiasu.designpatterns.decorator.crudservice.PersistenceCRUDService;
import com.stefanobiasu.designpatterns.decorator.crudservice.RESTCRUDService;
import com.stefanobiasu.designpatterns.decorator.crudservice.decorators.CRUDServiceDecorator;
import com.stefanobiasu.designpatterns.decorator.item.Item;
import com.stefanobiasu.designpatterns.decorator.item.ItemSearch;

public class Main {

    public static void main(String[] args) {

        // Call persistence crud service
        System.out.println("Calling persistence CRUD service ... ");
        ICRUDService persistenceCRUDService = new PersistenceCRUDService();
        runService(persistenceCRUDService);

        // Call REST crud service
        System.out.println("\n Calling REST CRUD service ...");
        ICRUDService restCRUDService = new RESTCRUDService();
        runService(restCRUDService);

        // Call Decorator crud service
        System.out.println("\n Calling decorator CRUD service ...");
        ICRUDService decoratorCRUDService = new CRUDServiceDecorator();
        runService(decoratorCRUDService);
    }

    private static void runService(ICRUDService crudService) {
        crudService.create(new Item());
        crudService.read(new ItemSearch());
        crudService.update(new Item());
        crudService.delete(new Item());
    }
}
