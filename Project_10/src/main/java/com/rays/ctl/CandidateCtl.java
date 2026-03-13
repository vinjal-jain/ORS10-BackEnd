package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CandidateDTO;
import com.rays.form.CandidateForm;
import com.rays.service.CandidateServiceInt;

@RestController
@RequestMapping(value = "Candidate")
public class CandidateCtl extends BaseCtl<CandidateForm, CandidateDTO, CandidateServiceInt> {

@GetMapping("/preload")
public ORSResponse preload() {

    ORSResponse res = new ORSResponse(true);

    HashMap<String, String> skillList = new HashMap<>();
    skillList.put("JAVA", "JAVA");
    skillList.put("SPRING_BOOT", "SPRING BOOT");
    skillList.put("ANGULAR", "ANGULAR");
    skillList.put("REACT", "REACT");
    skillList.put("DEVOPS", "DEVOPS");

    res.addResult("skillList", skillList);

    return res;
}

}