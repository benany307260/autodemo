package com.bentest.autodemo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bentest.autodemo.entity.UserInfo;
import com.bentest.autodemo.jpa.repository.UserInfoRepository;

@Service
public class UserInfoService {
	
	private final static Logger logger = LoggerFactory.getLogger(UserInfoService.class);
	
    @Autowired
    private UserInfoRepository userInfoRepository;
    
    /**
     * 保存用户
     * @param userInfo 用户
     * @return
     */
    public boolean addUserInfo(UserInfo userInfo){
    	userInfoRepository.save(userInfo);
        return true;
    }
    
    /**
     * 查询所有用户
     * @return 用户集合
     */
    public List<UserInfo> findAllUserInfo(){
    	return userInfoRepository.findAll();
    }
}