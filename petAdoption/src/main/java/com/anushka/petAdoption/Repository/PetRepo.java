package com.anushka.petAdoption.Repository;

import com.anushka.petAdoption.Entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PetRepo extends JpaRepository<Pet,Integer> {
    @Query(nativeQuery = true,value = "SELECT * FROM Pet WHERE name LIKE '%a';")
    public List<Pet> getPetWithAInName();

}
