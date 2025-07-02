package com.projectfast.journalApp.Repositary;

import com.projectfast.journalApp.entity.JournalEntry;
import com.projectfast.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepositary extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);

    void deleteByUserName(String username);
}
