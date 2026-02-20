package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ResourceDTO;
import com.rays.form.ResourceForm;
import com.rays.service.ResourceServiceInt;

@RestController
@RequestMapping(value = "Resource")
public class ResourceCtl extends BaseCtl<ResourceForm, ResourceDTO, ResourceServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {

        ORSResponse res = new ORSResponse(true);

        HashMap<String, String> statusMap = new HashMap<>();

        statusMap.put("ACTIVE", "ACTIVE");
        statusMap.put("INACTIVE", "INACTIVE");
        statusMap.put("MAINTENANCE", "MAINTENANCE");

        res.addResult("statusList", statusMap);

        return res;
    }
}