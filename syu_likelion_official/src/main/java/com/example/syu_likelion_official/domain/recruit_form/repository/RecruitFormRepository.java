package com.example.syu_likelion_official.domain.recruit_form.repository;

import com.example.syu_likelion_official.domain.recruit_form.entity.RecruitForm;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RecruitFormRepository extends JpaRepository<RecruitForm, Long> {
    List<RecruitForm> findByPassword(String password);
}
