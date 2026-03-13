package com.rays.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.CandidateDTO;

public class CandidateForm extends BaseForm {

    @NotEmpty(message = "Candidate Code is required")
    private String candidateCode;

    @NotEmpty(message = "Candidate Name is required")
    private String candidateName;

    @NotEmpty(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotEmpty(message = "Skill Set is required")
    private String skillSet;

    public String getCandidateCode() {
        return candidateCode;
    }

    public void setCandidateCode(String candidateCode) {
        this.candidateCode = candidateCode;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    @Override
    public CandidateDTO getDto() {
        CandidateDTO dto = initDTO(new CandidateDTO());
        dto.setCandidateCode(candidateCode);
        dto.setCandidateName(candidateName);
        dto.setEmail(email);
        dto.setSkillSet(skillSet);
        return dto;
    }
}