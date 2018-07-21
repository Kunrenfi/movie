package com.llk.vip.web.handler;

import com.llk.vip.entity.MovieEntity;
import com.llk.vip.function.MovieFunction;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 林力克 on 2018/7/13.
 */
@Controller
public class MovieHandle {
    @Autowired
    MovieFunction mfun;

    @RequestMapping(value = "addmovie.do",method = RequestMethod.GET)
    public String addmovie(){
        return "addmovie";
    }

   @RequestMapping(value = "addmovie.do",method = RequestMethod.POST)
    public String addmv(String mname, String mprice, HttpServletRequest request){
        try{
            MovieEntity m=mfun.addmovie(mname,mprice);
            HttpSession session=request.getSession();
        }catch (Exception e){
            request.setAttribute("message",e.getMessage());
            return "forward:/addmovie.jsp";
        }
        return "redirect:/success.do";
    }
    @RequestMapping(value = "select.do" ,method = RequestMethod.GET)
    public String select(){
        return "selectmovie";
    }

    @RequestMapping(value = "select.do" ,method = RequestMethod.POST)
    public String selectMovie(String mname,HttpServletRequest request){
        try {
            List<MovieEntity> movieEntities=mfun.selectmovie(mname);
            HttpSession session= request.getSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "selectmovie";
    }
}
