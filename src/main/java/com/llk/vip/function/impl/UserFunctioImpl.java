package com.llk.vip.function.impl;

import com.llk.common.ThisSystemException;
import com.llk.common.ThisSystemUtil;

import static com.llk.common.AssertThrowUtil.*;
import com.llk.vip.dao.UserDao;
import com.llk.vip.entity.UserEntity;
import com.llk.vip.function.UserFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/15 0015.
 */
@Service
public class UserFunctioImpl implements UserFunction{
   @Autowired
   UserDao udao;
    @Override
    public UserEntity login(String uphone, String upassword) throws Exception {
        /*
        if(account==null||account.trim().length()==0){
            throw new ThisSystemException("账户不能为空!");
        }
        */
		uphone=$("账户不能为空!",uphone);
        upassword=$("密码不能为空!",upassword);

        UserEntity u=udao.select("uphone",uphone);
        if(u==null){
            throw new ThisSystemException("账号不存在!");
        }

        if(!u.getUpassword().equals(upassword)){
            throw new ThisSystemException("密码错误");
        }


        return u;
    }
    
	public UserEntity updatePassword(String uid,String oldPassword, String newPassword, String newPasswordConfirm)
			throws Exception {
		//1验证参数
		uid=$("id不能为空",uid);
		oldPassword=$("旧密码必须填写!",oldPassword);
		newPassword=$("新密码必须填写!",newPassword);
		newPasswordConfirm=$("新密码确认必须填写!",newPasswordConfirm);
		System.out.println(newPassword+"-"+newPasswordConfirm);
		assertEquals("两次密码不一致", newPassword, newPasswordConfirm);
		assertNotEquals("新密码和旧密码不能一样", oldPassword,newPassword);
		//2找到用户
		UserEntity u=udao.select("uid", uid);
		/*
		if(u==null){
			throw new ThisSystemException("无法找到用户");
		}
		*/
		assertNotNull("无法找到用户", u);

		//3验证旧密码
		assertEquals("旧密码不正确", u.getUpassword(),oldPassword);
		//4更新密码

		u.setUpassword(newPassword);
		
		udao.update(u);
		
		return u;
	}
    @Override
	public UserEntity addUser(String uname,String uphone,String upassword)throws  Exception{
		uname=$("姓名不能为空！",uname);
		uphone=$("手机号不能为空！",uphone);
		upassword=$("密码不能为空",upassword);

		UserEntity u=new UserEntity();
		u.setUid(ThisSystemUtil.uuid());
		u.setUname(uname);
		u.setUphone(uphone);
		u.setUpassword(upassword);

		udao.insert(u);
    	return u;
	}


}
