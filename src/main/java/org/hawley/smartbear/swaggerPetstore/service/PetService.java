package org.hawley.smartbear.swaggerPetstore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hawley.smartbear.swaggerPetstore.database.DatabaseClass;
import org.hawley.smartbear.swaggerPetstore.model.Pet;

public class PetService {
	
	private Map<Long, Pet> pets = DatabaseClass.getPets();
	
	public PetService() {
		pets.put(1L, new Pet(1, "Mr. Doggie"));
		pets.put(2L, new Pet(2, "Ms. Kitty"));
	}
	
	public List<Pet> getAllPets() {
		return new ArrayList<Pet>(pets.values());
	}
	
	public Pet getPet(long id) {
		return pets.get(id);
	}
	
	public Pet addPet(Pet pet) {
		pet.setId(pets.size() + 1);
		pets.put(pet.getId(), pet);
		return pet;
	}
}
