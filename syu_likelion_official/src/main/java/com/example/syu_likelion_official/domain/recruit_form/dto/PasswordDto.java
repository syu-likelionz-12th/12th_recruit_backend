package com.example.syu_likelion_official.domain.recruit_form.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PasswordDto {
    private String password;
    private Long studentNum;
}
