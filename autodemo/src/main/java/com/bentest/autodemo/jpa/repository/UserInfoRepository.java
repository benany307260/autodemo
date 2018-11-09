package com.bentest.autodemo.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bentest.autodemo.entity.UserInfo;

/**
 *	用户JpaRepository
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,Long> {

} 