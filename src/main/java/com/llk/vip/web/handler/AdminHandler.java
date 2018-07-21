package com.llk.vip.web.handler;

import com.llk.common.ThisSystemException;
import com.llk.vip.entity.AdminEntity;
import com.llk.vip.entity.MovieEntity;
import com.llk.vip.function.AdminFunction;
import com.llk.vip.function.MovieFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by 林力克 on 2018/7/12.
 */
@Controller
public class AdminHandler {
    @Autowired
    AdminFunction afun;


@RequestMapping(value = "adminlogin.do",method = RequestMethod.GET)
public String adminlogin(){
    return "adminlogin";
}

@RequestMapping(value = "adminlogin.do",method = RequestMethod.POST)
    public String admin(String aname,String apassword,HttpServletRequest request)throws Exception {
    try{
        AdminEntity a = afun.adminlogin(aname, apassword);
        HttpSession session=request.getSession();
        session.setAttribute("currentUser",a);
    }catch (Exception e){
        request.setAttribute("message",e.getMessage());
        return "adminlogin";
    }
    return "redirect:/adminindex.do";

}
@RequestMapping(value = "success.do")
    public  String success(){
        return "success";
    }
@RequestMapping(value = "adminindex.do")
public String loginindex(){
    return "adminindex";
}


}
