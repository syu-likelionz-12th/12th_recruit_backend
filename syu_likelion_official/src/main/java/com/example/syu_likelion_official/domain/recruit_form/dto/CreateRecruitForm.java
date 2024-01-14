package com.example.syu_likelion_official.domain.recruit_form.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateRecruitForm {
    private Long id;
    private Long studentNum;
    private String email;
    private String mobileNum;
    private Boolean gender;
    private String q1Motivation;
    private String q2Experience;
    private String q3ProjectToDo;
    private String q4Track1;
    private String q5Track2;
    private Boolean ifHasLaptop;
    private Boolean ifSessionAvaliable;
    private String portfolio;
    private Integer password;
}
