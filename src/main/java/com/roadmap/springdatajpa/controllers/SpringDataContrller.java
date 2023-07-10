package com.roadmap.springdatajpa.controllers;

import com.roadmap.springdatajpa.dtos.SpringDataDto;
import com.roadmap.springdatajpa.models.SpringDataModel;
import com.roadmap.springdatajpa.services.SpringDataService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/springdata")
public class SpringDataContrller {

    final SpringDataService springDataService;

    public SpringDataContrller(SpringDataService springDataService) {
        this.springDataService = springDataService;
    }

    @PostMapping
    public ResponseEntity<Object> saveSpringData(@RequestBody @Valid SpringDataDto springDataDto){
        var springDataModel = new SpringDataModel();
        BeanUtils.copyProperties(springDataDto, springDataModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(SpringDataService.save(springDataModel));
    }
}
