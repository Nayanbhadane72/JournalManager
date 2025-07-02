package com.projectfast.journalApp.Repositary;

import com.projectfast.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepositary extends MongoRepository<JournalEntry, ObjectId> {

}
