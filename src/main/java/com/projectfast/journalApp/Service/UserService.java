package com.projectfast.journalApp.Service;

import com.projectfast.journalApp.Repositary.UserRepositary;
import com.projectfast.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepositary userRepositary;


    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public void saveNewUser(User user){
        user. setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER"));
        userRepositary.save(user);
    }

    public void saveAdmin(User user) {
        user. setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USER", "ADMIN"));
        userRepositary.save(user);
    }

    public void saveUser(User user){

        userRepositary.save(user);
    }

    public List<User> getAll(){

        return userRepositary.findAll();
    }

    public Optional<User> findById(ObjectId id){

        return userRepositary.findById(id);
    }

    public void deleteById(ObjectId id){

        userRepositary.deleteById(id);
    }

    public User findByUserName(String userName){
        return userRepositary.findByUserName(userName);
    }


}
