package org.hawley.smartbear.swaggerPetstore.database;

import java.util.HashMap;
import java.util.Map;

import org.hawley.smartbear.swaggerPetstore.model.Pet;

public class DatabaseClass {
	
	private static Map<Long, Pet> pets = new HashMap<>();
	
	public static Map<Long, Pet> getPets() {
		return pets;
	}
} 
