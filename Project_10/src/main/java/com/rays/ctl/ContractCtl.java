package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ContractDTO;
import com.rays.form.ContractForm;
import com.rays.service.ContractServiceInt;

@RestController
@RequestMapping(value = "Contract")
public class ContractCtl
		extends BaseCtl<ContractForm, ContractDTO, ContractServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);

		HashMap<Integer, String> cityMap = new HashMap<>();
		cityMap.put(1, "Indore");
		cityMap.put(2, "Bhopal");
		cityMap.put(3, "Mumbai");
		cityMap.put(4, "Delhi");

		res.addResult("cityList", cityMap);

		return res;
	}
}
