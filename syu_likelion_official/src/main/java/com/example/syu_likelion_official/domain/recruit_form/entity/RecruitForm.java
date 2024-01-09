package com.example.syu_likelion_official.domain.recruit_form.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class RecruitForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long studentNum;
    private String email;
    private String mobileNum;
    private Boolean gender;
    private String q1Motivation;
    private String q2Experience;
    private String q3ProjectTODo;
    private String q4Track1;
    private String q5Track2;
    private Boolean ifHasLaptop;
    private Boolean ifSessionAvaliable;
    private String portfolio;
    private Integer password;
}
