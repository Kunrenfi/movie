package com.llk.vip.function.impl;

import com.llk.common.ThisSystemException;
import com.llk.common.ThisSystemUtil;
import com.llk.vip.dao.MovieDao;
import com.llk.vip.entity.MovieEntity;
import com.llk.vip.function.MovieFunction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static com.llk.common.AssertThrowUtil.$;

/**
 * Created by 林力克 on 2018/7/13.
 */
@Service
public class MovieFunctionImpl implements MovieFunction {
    @Autowired
    MovieDao mdao;

    @Override
    public MovieEntity addmovie(String mname, String mprice)throws Exception{
        mname=$("电影名不能为空",mname);
        mprice=$("价格不能为空",mprice);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(new Date());
        Date mstarttime=calendar.getTime();
       calendar.add(Calendar.HOUR,2);
       Date mendtime=calendar.getTime();

        MovieEntity m=new MovieEntity();
        m.setMid(ThisSystemUtil.uuid());
        m.setMname(mname);
        m.setMprice(mprice);
        m.setMstarttime(mstarttime);
        System.out.println(mendtime);
        m.setMendtime(mendtime);
        mdao.insert(m);



        return m;
    }

@Override
  public   List<MovieEntity> selectmovie(String mname)throws Exception {


    mname = $("电影名不能为空", mname);
    List<MovieEntity> movieEntities = mdao.selectList("mname", mname);
    if (movieEntities == null)
        throw new ThisSystemException("电影不存在!");

        return movieEntities;
    }
}

