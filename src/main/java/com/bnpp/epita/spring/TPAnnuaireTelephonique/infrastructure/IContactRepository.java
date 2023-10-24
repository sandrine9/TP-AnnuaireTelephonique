package com.bnpp.epita.spring.TPAnnuaireTelephonique.infrastructure;

import com.bnpp.epita.spring.TPAnnuaireTelephonique.domaine.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ConcurrentModificationException;
import java.util.List;

@Repository
public interface IContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findByLastName (String lastName);
    List<Contact> findByFirstNameAndLastName(String firstName, String lastName);
    List<Contact> findByPhoneNumber(String phoneNumber);
}
