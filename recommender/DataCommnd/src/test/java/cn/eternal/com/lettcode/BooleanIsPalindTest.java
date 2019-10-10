package cn.eternal.com.lettcode;

import org.junit.Test;

/**
 * @program: moviceSystem
 * @description:
 * @author: zgl
 * @create: 2019-09-22 21:17
 **/
public class BooleanIsPalindTest {
    @Test
    public void testIsPalind(){
        //输入数字
        String x = "4193 with words";
        string_to_int_include_char(x);
        //bool_match_string(x);
       // String_to_int_icludeRegex(x);
       // string2Int(x);
       // isPalind(x);


    }
    private boolean isPalind(int x ){
        int num = 0;
        int isPadlind = x;
        while (x > 0){
            num = (num * 10) + (isPadlind % 10);
            isPadlind = isPadlind / 10;
        }
        return (num == x);
    }

    /**"42"
     * string to Integer
     * @param a
     * @return
     */
    private int string2Int(String a){
        int i = Integer.parseInt(a);
        if (i < Math.pow(-2,31))  Math.pow(-2,31);
        if (i > Math.pow(2,31)-1) Math.pow(2,31);
        System.out.println(i);
        return i;
    }

    /**
     * "   -42"
     * @param a
     * @return
     */
    private int String_to_int_icludeRegex(String a){
        String a1 = a.replaceAll("-","").trim();
        System.out.println("a1...="+a1);
        return Integer.parseInt(a1);
    }

    /**
     * Input: "4193 with words"
     * Output: 4193
     * Explanation: Conversion stops at digit '3'
     * as the next character is not a numerical digit.
     * @param str
     * @return
     */
    private int string_to_int_include_char(String str){
        String[] split = str.trim().split(".*[a-z].*");
        //String s1 = split[1];
        int a = 0;
        for (String x :split){
            System.out.println("...s"+x);
            a = Integer.valueOf(x);
        }
        return a;
    }
    /**
     * include a-z
     * @param a
     * @return
     */
    private boolean  bool_match_string(String a){
        boolean matches = a.trim().matches((".*[a-z]+.*"));
        return matches;
    }

}
