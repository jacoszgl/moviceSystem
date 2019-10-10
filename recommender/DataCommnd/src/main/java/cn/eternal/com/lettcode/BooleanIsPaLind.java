package cn.eternal.com.lettcode;

/**
 * @program: moviceSystem
 * @description:
 * @author: zgl
 * @create: 2019-09-11 06:40
 **/
public class BooleanIsPaLind {
    public static boolean booleanIsPalind(int x){
       int num = 0;
       int isPalind = x;
       while (isPalind > 0){
           num = (num * 10) + (isPalind % 10);
           System.out.println("num"+ num);
           isPalind = isPalind / 10;
       }
        System.out.println("....num="+num);
       return (num == x);
    }

    public static void main(String[] args) {
        int x = 1324531;
        booleanIsPalind(x);

    }
}
