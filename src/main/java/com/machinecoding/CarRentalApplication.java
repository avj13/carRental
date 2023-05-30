package com.machinecoding;

import com.machinecoding.Store.Store;
import com.machinecoding.User.User;
import com.machinecoding.Vehicle.Car;
import com.machinecoding.Vehicle.Vehicle;
import com.machinecoding.Vehicle.VehicleType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

public class CarRentalApplication {

	List<Store> storeList;
	List<User> userList;

	CarRentalApplication(List<Store> stores, List<User> users) {

		this.storeList = stores;
		this.userList = users;
	}


	public Store getStore(Location location){

		//based on location, we will filter out the Store from storeList.
		return storeList.get(0);
	}




}