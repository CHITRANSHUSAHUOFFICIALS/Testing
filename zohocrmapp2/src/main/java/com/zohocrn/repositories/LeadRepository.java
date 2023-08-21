package com.zohocrn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrn.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
