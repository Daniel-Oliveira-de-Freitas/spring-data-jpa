package com.roadmap.springdatajpa.repositories;

import com.roadmap.springdatajpa.models.SpringDataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataRepository extends JpaRepository<SpringDataModel, Long> {

}
