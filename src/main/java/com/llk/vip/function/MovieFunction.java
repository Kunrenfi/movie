package com.llk.vip.function;

import org.springframework.transaction.annotation.Transactional;
import com.llk.vip.entity.MovieEntity;
import java.util.Date;
import java.util.List;

/**
 * Created by 林力克 on 2018/7/13.
 */
public interface MovieFunction {
    @Transactional
    public MovieEntity addmovie(String mname, String mprice)throws Exception;

    @Transactional
    List<MovieEntity> selectmovie(String mname)throws Exception;
}
