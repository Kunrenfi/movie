package com.llk.vip.function;

import org.springframework.transaction.annotation.Transactional;

import com.llk.vip.entity.UserEntity;

/**
 * Created by Administrator on 2017/3/15 0015.
 */
public interface UserFunction {
	/**
	 * 用户登录
	 * @param uphone
	 * @param upassword
	 * @return
	 * @throws Exception
	 */
    public UserEntity login(String uphone,String upassword)throws Exception;
    @Transactional
    UserEntity updatePassword(String uid,String oldPassword,String newPasswrod,String newPasswordConfirm)throws Exception;
    @Transactional
	UserEntity addUser(String uname,String uphone,String upassword)throws  Exception;
    
    
}
