package com.example.syu_likelion_official.domain.recruit_form.service;

import com.example.syu_likelion_official.domain.recruit_form.dto.CreateRecruitForm;
import com.example.syu_likelion_official.domain.recruit_form.entity.RecruitForm;
import com.example.syu_likelion_official.domain.recruit_form.repository.RecruitFormRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class RecruitFormService {
    private RecruitFormRepository recruitFormRepository;
    public void create(CreateRecruitForm createRecruitForm) {
        RecruitForm recruitForm = RecruitForm.builder()
                .studentNum(createRecruitForm.getStudentNum())
                .email(createRecruitForm.getEmail())
                .mobileNum(createRecruitForm.getMobileNum())
                .gender(createRecruitForm.getGender())
                .q1Motivation(createRecruitForm.getQ1Motivation())
                .q2Experience(createRecruitForm.getQ2Experience())
                .q3ProjectToDo(createRecruitForm.getQ3ProjectToDo())
                .q4Track1(createRecruitForm.getQ4Track1())
                .q5Track2(createRecruitForm.getQ5Track2())
                .ifHasLaptop(createRecruitForm.getIfHasLaptop())
                .ifSessionAvaliable(createRecruitForm.getIfSessionAvaliable())
                .portfolio(createRecruitForm.getPortfolio())
                .password(createRecruitForm.getPassword())
                .build();
        recruitFormRepository.save(recruitForm);
    }
}
