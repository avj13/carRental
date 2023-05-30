package com.machinecoding;

import com.machinecoding.Store.Store;
import com.machinecoding.User.User;

import java.util.List;

public class VehicleRental {

    List<Store> storeList;
    List<User> userList;

    public VehicleRental(List<Store> storeList, List<User> userList) {
        this.storeList = storeList;
        this.userList = userList;
    }

    // get store based on location
    public Store getStore(Location location) {
        for(Store store : storeList){
            if(store.getLocation().equals(location))
                return store;

        }
        return null;
    }


}
