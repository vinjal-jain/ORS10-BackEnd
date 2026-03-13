package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CandidateDAOInt;

import com.rays.dto.CandidateDTO;


@Service
@Transactional
public class CandidateServiceImpl extends BaseServiceImpl<CandidateDTO, CandidateDAOInt> implements CandidateServiceInt{

}