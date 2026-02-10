package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.OfferDAOInt;
import com.rays.dto.OfferDTO;

@Service
@Transactional
public class OfferServiceImpl 
		extends BaseServiceImpl<OfferDTO, OfferDAOInt> 
		implements OfferServiceInt {

}
