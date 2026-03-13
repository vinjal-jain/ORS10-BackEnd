package com.rays.ctl;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PermissionDTO;
import com.rays.form.PermissionForm;
import com.rays.service.PermissionServiceInt;

@RestController
@RequestMapping(value = "Permission")
public class PermissionCtl extends BaseCtl<PermissionForm, PermissionDTO, PermissionServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {

        ORSResponse res = new ORSResponse(true);

        HashMap<String, String> map = new HashMap<>();
        map.put("READ", "READ");
        map.put("WRITE", "WRITE");
        map.put("UPDATE", "UPDATE");
        map.put("DELETE", "DELETE");

        res.addResult("accessTypeList", map);

        return res;
    }
}