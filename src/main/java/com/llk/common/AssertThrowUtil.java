package com.llk.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/3/15 0015.
 */
public class AssertThrowUtil {
	
    public static String assertNotBlank(String message,String target){
        if(target==null||(target=target.trim()).length()==0){
            throw new ThisSystemException(message);
        }
        return target;
    }
    
    public static String $(String message,String target){
        return assertNotBlank(message,target);
    }
    public static void assertNotNull(String message,Object o){
    	if(o==null){
    		throw new ThisSystemException(message);
    	}
    }
    public static void assertNull(String message,Object o){
    	if(o!=null){
    		throw new ThisSystemException(message);
    	}
    }
    public static void assertEquals(String message,Object a,Object b){
    	if(a==null?a!=b:!a.equals(b)){
    		throw new ThisSystemException(message);
    	}
    }
    public static void assertNotEquals(String message,Object a,Object b){
    	if(a==null?a==b:a.equals(b)){
    		throw new ThisSystemException(message);
    	}
    }
    public static void assertTrue(String message,boolean b){
        if(!b){
            throw new ThisSystemException(message);
        }

    }
    public static void assertFalse(String message,boolean b){
        if(b){
            throw new ThisSystemException(message);
        }
    }

    public static void assertPatternMatch(String message,String reg,String target){
        Pattern pattern=Pattern.compile(reg);
        Matcher matcher = pattern.matcher(target);
        if(!matcher.matches()){
            throw new ThisSystemException(message);
        }
    }
}
