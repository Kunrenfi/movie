package com.llk.vip.function.impl;

import com.llk.common.ThisSystemException;
import com.llk.vip.dao.AdminDao;
import com.llk.vip.entity.AdminEntity;
import com.llk.vip.entity.MovieEntity;
import com.llk.vip.function.AdminFunction;
import org.springframework.beans.factory.annotation.Autowired;
import static com.llk.common.AssertThrowUtil.*;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by 林力克 on 2018/7/12.
 */
@Service
public class AdminFunctionImpl implements AdminFunction{
    @Autowired
    AdminDao adao;

    @Override
    public AdminEntity adminlogin(String aname, String apassword)throws Exception{
        aname=$("账户不能为空!",aname);
        apassword=$("密码不能为空!",apassword);

        AdminEntity a=adao.select("aname",aname);
        if(a==null){
            throw new ThisSystemException("账号不存在!");
        }

        if(a.getApassword().equals(apassword)){
            throw new ThisSystemException("密码错误");
        }
        return a;

    }

}
