package com.rays.ctl;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.ATMDTO;
import com.rays.form.ATMForm;
import com.rays.service.ATMServiceInt;

@RestController
@RequestMapping(value = "ATM")
public class ATMCtl extends BaseCtl<ATMForm, ATMDTO, ATMServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {

        ORSResponse res = new ORSResponse(true);

        // Location dropdown
        HashMap<String, String> locationMap = new HashMap<>();
        locationMap.put("Indore", "Indore");
        locationMap.put("Bhopal", "Bhopal");
        locationMap.put("Ujjain", "Ujjain");
        locationMap.put("Dewas", "Dewas");

        res.addResult("locationList", locationMap);

        // Existing ATM records
        ATMDTO dto = new ATMDTO();
        List<DropdownList> list = baseService.search(dto, userContext);
        res.addResult("atmList", list);

        return res;
    }
}
