package com.roadmap.springdatajpa.dtos;

import javax.validation.constraints.NotBlank;

public class SpringDataDto {
    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @NotBlank
    @Size (max = 11)
    private int CPF;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }


}
