package com.llk.vip.function;

import com.llk.vip.entity.AdminEntity;
import com.llk.vip.entity.MovieEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by 林力克 on 2018/7/12.
 */
public interface AdminFunction {
    public AdminEntity adminlogin(String aname, String apassword)throws Exception;


}
