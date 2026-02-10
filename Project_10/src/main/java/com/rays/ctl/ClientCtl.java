package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ClientDTO;
import com.rays.form.ClientForm;
import com.rays.service.ClientServiceInt;

@RestController
@RequestMapping(value = "Client")
public class ClientCtl extends BaseCtl<ClientForm, ClientDTO, ClientServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);

		HashMap<Integer, String> priorityMap = new HashMap<>();
		priorityMap.put(1, "HIGH");
		priorityMap.put(2, "MEDIUM");
		priorityMap.put(3, "LOW");

		res.addResult("priorityList", priorityMap);

		return res;
	}
}
