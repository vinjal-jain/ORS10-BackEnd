package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ActivityDTO;
import com.rays.form.ActivityForm;
import com.rays.service.ActivityServiceInt;

@RestController
@RequestMapping(value = "Activity")
public class ActivityCtl extends BaseCtl<ActivityForm, ActivityDTO, ActivityServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);

		HashMap<Integer, String> statusMap = new HashMap<>();
		statusMap.put(1, "PENDING");
		statusMap.put(2, "COMPLETED");
		statusMap.put(3, "FAILED");

		res.addResult("activityStatusList", statusMap);

		return res;
	}
}
