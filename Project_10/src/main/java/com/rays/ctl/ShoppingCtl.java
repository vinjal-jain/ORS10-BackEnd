package com.rays.ctl;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.ShoppingDTO;
import com.rays.form.ShoppingForm;
import com.rays.service.ShoppingServiceInt;

@RestController
@RequestMapping(value = "Shopping")
public class ShoppingCtl extends BaseCtl<ShoppingForm, ShoppingDTO, ShoppingServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {

        ORSResponse res = new ORSResponse(true);

       
        HashMap<String, String> shopNameMap = new HashMap<>();

        shopNameMap.put("Shop A", "Shop A");
        shopNameMap.put("Shop B", "Shop B");
        shopNameMap.put("Shop C", "Shop C");
        shopNameMap.put("Shop D", "Shop D");

        res.addResult("shopNameList", shopNameMap);

        
        ShoppingDTO dto = new ShoppingDTO();
        List<DropdownList> list = baseService.search(dto, userContext);

        res.addResult("shoppingList", list);

        return res;
    }
}
