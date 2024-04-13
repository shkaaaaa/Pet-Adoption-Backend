package com.anushka.petAdoption.Repository;

import com.anushka.petAdoption.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepo extends JpaRepository<Users,String>{

    @Query(nativeQuery = true,value = "SELECT * FROM Users WHERE username = :username")
    public List<Users> findByUsername(@Param("username") String username);

}
