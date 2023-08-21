package com.zohocrn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrn.entities.Contacts;

public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
