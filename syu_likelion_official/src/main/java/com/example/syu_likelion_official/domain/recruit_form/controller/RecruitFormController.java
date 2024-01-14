package com.example.syu_likelion_official.domain.recruit_form.controller;


import com.example.syu_likelion_official.domain.recruit_form.dto.CreateRecruitForm;
import com.example.syu_likelion_official.domain.recruit_form.entity.RecruitForm;
import com.example.syu_likelion_official.domain.recruit_form.service.RecruitFormService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class RecruitFormController {

    private RecruitFormService recruitFormService;
    @PostMapping("/recruit/form/create")
    public ResponseEntity<Void> createRecruitForm(@RequestBody CreateRecruitForm createRecruitForm) {
        recruitFormService.create(createRecruitForm);
        ResponseEntity<Void> responseEntity = null;
        return responseEntity;
    }

}
