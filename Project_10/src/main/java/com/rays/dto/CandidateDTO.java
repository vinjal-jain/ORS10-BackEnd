package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CANDIDATE")
public class CandidateDTO extends BaseDTO {

    @Column(name = "CANDIDATE_CODE", length = 50)
    private String candidateCode;

    @Column(name = "CANDIDATE_NAME", length = 100)
    private String candidateName;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "SKILL_SET", length = 200)
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
    public String getKey() {
        return id + "";
    }

    @Override
    public String getValue() {
        return candidateName;
    }

    @Override
    public String getUniqueKey() {
        return "candidateCode";
    }

    @Override
    public String getUniqueValue() {
        return candidateCode;
    }

    @Override
    public String getLabel() {
        return "Candidate Name";
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("candidateName", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("candidateCode", candidateCode);
        return map;
    }
}