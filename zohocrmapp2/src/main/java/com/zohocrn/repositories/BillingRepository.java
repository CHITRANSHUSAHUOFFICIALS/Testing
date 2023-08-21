package com.zohocrn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrn.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
