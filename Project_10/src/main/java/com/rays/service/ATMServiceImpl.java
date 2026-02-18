package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ATMDAOInt;
import com.rays.dto.ATMDTO;

@Service
@Transactional
public class ATMServiceImpl
		extends BaseServiceImpl<ATMDTO, ATMDAOInt>
		implements ATMServiceInt {

}
