package com.msi.service.service.impl;

import com.msi.mapper.ActivityDao;
import com.msi.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

  @Autowired
  ActivityDao activityDao;


  @Override
  public boolean getUserInfo(String userName) {

    return activityDao.insertUser(1);
  }
}
