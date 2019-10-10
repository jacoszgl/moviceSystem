package cn.eternal.com.alog.recursive;

/**
 * @program: moviceSystem
 * @description: 递归
 * @author: zgl
 * @create: 2019-10-06 21:06
 **/
public class Recursive {
    /**
     *  用递归实现斐波那契数列,适用于求解比较小的位置数值
     *      * 0 1 1 2 3 5 8 13 21...
     * @param n
     * @return
     */
    private int getNums(int n){
        if (n <= 2) return 1;
        else {
            return getNums(n - 1) + getNums(n - 2);
        }
    }

    /**
     * fact number
     * @param n
     * @return
     */
    private int getFact(int n ){
        if (n  == 1) return 1;
        return getFact(n -1) * n;
    }

    private void getDir(){

    }

    public int show(int n){
        return getFact(n);
    }
}
