package com.BatHhouse.crm.Repositories;

import com.BatHhouse.crm.ForRepo.CustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerDTO, Integer> {

}
