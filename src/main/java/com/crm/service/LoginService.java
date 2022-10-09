package com.crm.service;

import com.crm.model.UsersModel;
import com.crm.repository.UsersRepository;

import java.util.List;

public class LoginService {
    UsersRepository usersRepository=new UsersRepository();
    public boolean checkLogin(String email,String password){

        List<UsersModel> list=usersRepository.getUsersByEmailAndPassword(email,password);
        if (list.size()>0){
            return true;
        }
        else
        {
            return false;
        }

    }

}
