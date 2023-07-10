package com.roadmap.springdatajpa.controllers;

import com.roadmap.springdatajpa.dtos.SpringDataDto;
import com.roadmap.springdatajpa.models.SpringDataModel;
import com.roadmap.springdatajpa.services.SpringDataService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/springdata")
public class SpringDataController {

    @Autowired
    private SpringDataService springDataService;

    public SpringDataController(SpringDataService springDataService) {
        this.springDataService = springDataService;
    }

    @PostMapping
    public ResponseEntity<Object> saveSpringData(@RequestBody SpringDataDto springDataDto){
        var springDataModel = new SpringDataModel();
        BeanUtils.copyProperties(springDataDto, springDataModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(springDataService.save(springDataModel));
    }
}
