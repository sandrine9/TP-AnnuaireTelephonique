package com.bnpp.epita.spring.TPAnnuaireTelephonique.application;

import com.bnpp.epita.spring.TPAnnuaireTelephonique.domaine.Contact;
import com.bnpp.epita.spring.TPAnnuaireTelephonique.infrastructure.IContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements IContactService {

    @Autowired
    IContactRepository repo;

    @Override
    public void create(Contact c) {
        repo.save(c);
    }

    @Override
    public List<Contact> findByLastName(String lastName) {
        //System.out.println(lastName);
        return repo.findByLastName(lastName);
    }

    @Override
    public List<Contact> findByFirstNameAndLastName(String firstName, String lastName) {
        return repo.findByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public List<Contact> findByPhoneNumber(String phoneNumber) {
        return repo.findByPhoneNumber(phoneNumber);
    }
}
