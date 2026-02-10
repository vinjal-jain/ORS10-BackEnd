package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ActivityDAOInt;
import com.rays.dto.ActivityDTO;

@Service
@Transactional
public class ActivityServiceImpl
		extends BaseServiceImpl<ActivityDTO, ActivityDAOInt>
		implements ActivityServiceInt {
}
