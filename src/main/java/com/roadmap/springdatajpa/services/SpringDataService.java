package com.roadmap.springdatajpa.services;

import com.roadmap.springdatajpa.models.SpringDataModel;
import com.roadmap.springdatajpa.repositories.SpringDataRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpringDataService {

    final SpringDataRepository springDataRepository;
    public SpringDataService(SpringDataRepository springDataRepository) {
        this.springDataRepository = springDataRepository;
    }

    @Transactional
    public static SpringDataModel save(SpringDataModel springDataModel) {
        return springDataRepository.save(springDataModel);
    }
}
