package com.llk.common;

import java.util.List;

import com.llk.vip.entity.MovieEntity;
import org.apache.ibatis.annotations.Param;

public interface AbstractDao<T> {
	void insert(T t)throws Exception;
	void delete(@Param("key")String ukfield,@Param("value")Object value)throws Exception;
	
	void update(T t)throws Exception;
	
	T select(@Param("key")String ukfield,@Param("value")Object value)throws Exception;
	List<T> selectList(@Param("key")String ukfield, @Param("value")Object value)throws Exception;
	boolean exsits(@Param("key")String ukfield,@Param("value")Object value)throws Exception;
	List<T> selectLike(@Param("key")String key)throws Exception;
	
}
