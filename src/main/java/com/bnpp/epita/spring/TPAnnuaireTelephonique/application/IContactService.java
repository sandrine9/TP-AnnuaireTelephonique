package com.bnpp.epita.spring.TPAnnuaireTelephonique.application;

import com.bnpp.epita.spring.TPAnnuaireTelephonique.domaine.Contact;

import java.util.List;

public interface IContactService {

    public void create(Contact c);
    public List<Contact> findByLastName(String lastName);

    public List<Contact> findByFirstNameAndLastName(String firstName, String lastName);

    public List<Contact> findByPhoneNumber(String phoneNumber);
}
