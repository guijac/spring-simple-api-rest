package com.guijac.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
    
    private String firstName;
    private String lastName;

    public Student (String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

    }

}
