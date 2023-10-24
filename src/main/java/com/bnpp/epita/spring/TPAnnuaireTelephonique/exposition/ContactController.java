package com.bnpp.epita.spring.TPAnnuaireTelephonique.exposition;

import com.bnpp.epita.spring.TPAnnuaireTelephonique.application.IContactService;
import com.bnpp.epita.spring.TPAnnuaireTelephonique.domaine.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contact")
public class ContactController {

    @Autowired
    IContactService service;

    @PostMapping
    public void create(@RequestBody Contact c){
        service.create(c);
    }

    @PostMapping("/findByLastName")
    public List<Contact> findByLastName(@RequestBody String lastName) {
        return service.findByLastName(lastName);
    }

    @PostMapping("/findByFirstNameAndLastName")
    public List<Contact> findByFirstNameAndLastName(@RequestBody Contact c) {
        return service.findByFirstNameAndLastName(c.getFirstName(), c.getLastName());
    }
    /* avec GetMapping
    @GetMapping("/find/{firstName}/{lastName}")
    public List<Contact> findByFirstNameAndLastName(@PathVariable("firstName") String firstname, @PathVariable("lastName") String lastname) {
        return service.findByFirstNameAndLastName(firstname, lastname);
    }

     */

    @PostMapping("/findByPhone")
    public List<Contact> findByPhoneNumber(@RequestBody String phoneNumber) {
        return service.findByPhoneNumber(phoneNumber);
    }
}
