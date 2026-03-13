package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rays.common.BaseServiceImpl;
import com.rays.dao.PermissionDAOInt;
import com.rays.dto.PermissionDTO;

@Service
@Transactional
public class PermissionServiceImpl extends BaseServiceImpl<PermissionDTO, PermissionDAOInt> implements PermissionServiceInt {

}