package com.example.shiro.service;

import org.apache.shiro.crypto.RandomNumberGenerator;

import com.example.shiro.entity.User;

public interface IPasswordHelper {

	void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator);

	void setAlgorithmName(String algorithmName);

	void setHashIterations(int hashIterations);

	void encryptPassword(User user);

}