package com.roadmap.springdatajpa.repositories;

import com.roadmap.springdatajpa.models.SpringDataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataRepository extends JpaRepository<SpringDataModel, Long> {

}
