package com.anushka.petAdoption.Controller;

import com.anushka.petAdoption.Entity.Pet;
import com.anushka.petAdoption.Entity.Users;
import com.anushka.petAdoption.Model.APIResponse;
import com.anushka.petAdoption.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PetRestController {

    @Autowired
    MainService petService;


    @GetMapping(value = "/getPet")
    public Pet getPet(@RequestParam(value = "id")int id){
        return petService.findPet(id);

    }

    @PostMapping(value = "/addPet")
    public Pet addPet(@RequestBody Pet pet){
        return petService.addPet(pet);

    }

    @PostMapping(value = "/addUser")
    public APIResponse addUser(@RequestBody Users user){
        return petService.addUser(user);
    }

    @GetMapping(value = "/login")
    public APIResponse login(@RequestHeader(value = "username")String username, @RequestHeader(value = "password")String password){
        return petService.checkCredentials(username,password);
    }








}
