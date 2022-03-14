package com.example.application;

import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tsweets
 * Date: 3/12/22 - 6:41 PM
 */

@Endpoint
@AnonymousAllowed
public class GroceryEndpoint {

    private final List<GroceryItem> groceryItemList = new ArrayList<>();

    @Nonnull
    public List<@Nonnull GroceryItem> getGroceryList() {
        return groceryItemList;
    }

    public GroceryItem save(GroceryItem item) {
        groceryItemList.add(item);
        return item;
    }
}
