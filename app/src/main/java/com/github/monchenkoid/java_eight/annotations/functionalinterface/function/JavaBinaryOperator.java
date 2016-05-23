package com.github.monchenkoid.java_eight.annotations.functionalinterface.function;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

/**
 * @author Iryna Monchenko
 * @version on 05.05.2016
 */
public class JavaBinaryOperator {

    private static final String TAG = JavaBinaryOperator.class.getSimpleName();

    public static void run(){
        Map<String,String> map = new HashMap<>();
        map.put("X", "A");
        map.put("Y", "B");
        map.put("Z", "C");
        binaryOperatorFun((s1,s2)-> s1+"-"+s2,map).forEach(x-> Log.i(TAG, x));
    }

    private static List<String> binaryOperatorFun(BinaryOperator<String> binaryOpt, Map<String,String> map){
        List<String> biList = new ArrayList<>();
        map.forEach((s1,s2)->biList.add(binaryOpt.apply(s1,s2)));
        return biList;
    }
}