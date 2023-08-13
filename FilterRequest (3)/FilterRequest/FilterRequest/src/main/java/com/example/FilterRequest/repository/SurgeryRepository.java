package com.example.FilterRequest.repository;

import com.example.FilterRequest.dto.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SurgeryRepository extends JpaRepository<Surgery, Integer> {

@Query(value="SELECT `id`, `ticket_Id`, `name`, `time`, `status`, `date` FROM `filterstatus` WHERE `status`=:status",nativeQuery = true)
   List<Surgery> findBystatus(@Param("status") String status);
}
