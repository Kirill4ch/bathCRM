package com.BatHhouse.crm.Repositories;

import com.BatHhouse.crm.ForRepo.BathDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BathRepo extends JpaRepository<BathDTO, Integer>{

}
