package com.rays.ctl;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.OfferDTO;
import com.rays.form.OfferForm;
import com.rays.service.OfferServiceInt;

@RestController
@RequestMapping(value = "Offer")
public class OfferCtl extends BaseCtl<OfferForm, OfferDTO, OfferServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "ACTIVE");
		map.put(2, "INACTIVE");
		map.put(3, "EXPIRED");

		res.addResult("statusList", map);

		System.out.println("inside preload");

		OfferDTO dto = new OfferDTO();
		List<DropdownList> list = baseService.search(dto, userContext);
		res.addResult("statusList", list);

		return res;
	}
}
