package com.projectfast.journalApp.Service;

import com.projectfast.journalApp.Repositary.JournalEntryRepositary;
import com.projectfast.journalApp.entity.JournalEntry;
import com.projectfast.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepositary journalEntryRepositary;

    @Autowired
    private UserService userService;

    @Transactional
    public void saveEntry(JournalEntry journalEntry, String userName){
        try {
            User user= userService.findByUserName(userName);
            journalEntry.setDate(LocalDateTime.now());
            JournalEntry saved = journalEntryRepositary.save(journalEntry);
            user.getJournalEntries().add(saved);

            userService.saveUser(user);
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException("An Runtime Exception Occured",e);
        }

    }

    public void saveEntry(JournalEntry journalEntry){

        journalEntryRepositary.save(journalEntry);
    }

    public List<JournalEntry> getAll(){

        return journalEntryRepositary.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id){

        return journalEntryRepositary.findById(id);
    }
@Transactional
    public boolean deleteById(ObjectId id, String userName){
        boolean removed = false;
        try {
            User user= userService.findByUserName(userName);
            removed = user.getJournalEntries().removeIf(x -> x.getId().equals(id));
            if (removed){
                userService.saveUser(user);
                journalEntryRepositary.deleteById(id);
            }
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException("An error occurred while deleting the entry",e);

        }
        return removed;


    }



}
