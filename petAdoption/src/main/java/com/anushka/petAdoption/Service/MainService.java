package com.anushka.petAdoption.Service;

import com.anushka.petAdoption.Entity.Pet;
import com.anushka.petAdoption.Entity.Users;
import com.anushka.petAdoption.Model.APIResponse;
import com.anushka.petAdoption.Repository.PetRepo;
import com.anushka.petAdoption.Repository.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    PetRepo petRepo;
    @Autowired
    UserRepo userRepo;


    public Pet findPet(int id) {
        List<Pet> petList = petRepo.findAll();
        System.out.println(petRepo.getPetWithAInName().get(0).getName());
        for (Pet pet : petList) {
            System.out.println(pet.isIsadopted());
            if (pet.getId() == id) {
                return pet;
            }
        }
        return null;
    }


    public APIResponse checkCredentials(String username, String password) {
        APIResponse apiResponse = new APIResponse();
        List<Users> listOfUsers = userRepo.findByUsername(username);
        if (listOfUsers.isEmpty()) {
            apiResponse.setStatusCode(409);
            apiResponse.setErrorMessage("Incorrect Username, please try again");
            return apiResponse;
        } else {
            Users user = listOfUsers.get(0);
            if (!user.getPassword().equals(password)) {
                apiResponse.setStatusCode(409);
                apiResponse.setErrorMessage("Incorrect password, please try again");
                return apiResponse;
            } else {
                apiResponse.setStatusCode(200);
                return apiResponse;
            }
        }

    }

    public Pet addPet(Pet pet) {
        petRepo.save(pet);
        return pet;
    }

    public APIResponse addUser(Users user) {
        APIResponse apiResponse = new APIResponse();
        String username = user.getUsername();
        List<Users> listOfUser = userRepo.findByUsername(username);
        if (listOfUser.isEmpty()) {
            userRepo.save(user);
            apiResponse.setStatusCode(200);
            apiResponse.setErrorMessage("Gadbad");
            apiResponse.setResponse(user);
            return apiResponse;
        } else {
            apiResponse.setStatusCode(409);
            apiResponse.setErrorMessage(username + " already exists");
            apiResponse.setResponse(user);
            return apiResponse;
        }
    }


}
