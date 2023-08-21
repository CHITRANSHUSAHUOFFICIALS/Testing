package com.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.entites.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
