package com.BatHhouse.crm.Repositories;

import com.BatHhouse.crm.ForRepo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    @Query(value = "SELECT * FROM заказчик WHERE gmail = ?1", nativeQuery = true)
    Customer findByEmailNative(String email);
}
