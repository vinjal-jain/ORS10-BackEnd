package com.rays.service;


import org.springframework.stereotype.Service;
import com.rays.common.BaseServiceImpl;
import com.rays.dao.CompanyDAOInt;
import com.rays.dto.CompanyDTO;

@Service
public class CompanyServiceImpl extends BaseServiceImpl<CompanyDTO, CompanyDAOInt> implements CompanyServiceInt {

    
}