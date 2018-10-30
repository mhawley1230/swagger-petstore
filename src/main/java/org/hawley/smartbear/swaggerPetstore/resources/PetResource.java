package org.hawley.smartbear.swaggerPetstore.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hawley.smartbear.swaggerPetstore.model.Pet;
import org.hawley.smartbear.swaggerPetstore.service.PetService;

@Path("/pets")
@Produces(MediaType.APPLICATION_JSON)
public class PetResource {
	
  PetService petService = new PetService();

  @GET
  public List<Pet> getPets() {
      return petService.getAllPets();
  }

  
  @GET
  @Path("/{petId}")
  public Pet getPetById(@PathParam("petId") long petId) {
      return petService.getPet(petId);
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Pet addPet(Pet pet) {
		return petService.addPet(pet);
  }
}
