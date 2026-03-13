package com.rays.ctl;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CompanyDTO;
import com.rays.form.CompanyForm;
import com.rays.service.CompanyServiceInt;

@RestController
@RequestMapping(value = "Company")
public class CompanyCtl extends BaseCtl<CompanyForm, CompanyDTO, CompanyServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {

        ORSResponse res = new ORSResponse(true);

        HashMap<String, String> cityList = new HashMap<>();
        cityList.put("Indore", "Indore");
        cityList.put("Bhopal", "Bhopal");
        cityList.put("Ujjain", "Ujjain");
        cityList.put("Dewas", "Dewas");

        res.addResult("cityList", cityList);

        return res;
    }
}