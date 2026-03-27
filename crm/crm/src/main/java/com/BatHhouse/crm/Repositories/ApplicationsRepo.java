package com.BatHhouse.crm.Repositories;

import com.BatHhouse.crm.ForRepo.ApplicationsDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationsRepo extends JpaRepository<ApplicationsDTO, Integer> {
}
