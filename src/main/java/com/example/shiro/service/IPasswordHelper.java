package com.example.shiro.service;

import com.example.shiro.entity.User;
import org.apache.shiro.crypto.RandomNumberGenerator;

public interface IPasswordHelper {

    void setRandomNumberGenerator(RandomNumberGenerator randomNumberGenerator);

    void setAlgorithmName(String algorithmName);

    void setHashIterations(int hashIterations);

    void encryptPassword(User user);

}