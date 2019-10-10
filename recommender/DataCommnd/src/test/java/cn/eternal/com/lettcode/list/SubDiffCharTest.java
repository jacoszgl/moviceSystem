package cn.eternal.com.lettcode.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: moviceSystem
 * @description:
 * @author: zgl
 * @create: 2019-09-28 16:15
 **/
public class SubDiffCharTest {

    @Test
    public void subRepetionChar(){
        String str = "adsdswewe";
        lengStr(str);
    }

    private int lengStr(String str){
        int n = str.length();
        int ns = 0;
        for (int i = 0; i < n ; i++)
            for (int j = i + 1; j <= n; j++)
                if(allUniqe(str, i, j)) ns = Math.max(ns, j - i);
        System.out.println("...."+ns );
                return  ns;
    }

    private  boolean allUniqe(String str, int start, int end){
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character c = str.charAt(i);
            if (set.contains(c)) return false;
        }
        return true;
    }
}
