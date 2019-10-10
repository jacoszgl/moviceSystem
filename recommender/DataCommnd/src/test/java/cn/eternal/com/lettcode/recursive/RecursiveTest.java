package cn.eternal.com.lettcode.recursive;

import cn.eternal.com.alog.recursive.Recursive;
import org.junit.Test;

/**
 * @program: moviceSystem
 * @description:
 * @author: zgl
 * @create: 2019-10-06 23:12
 **/
public class RecursiveTest {

    @Test
    public  void show(){
        Recursive re = new Recursive();
      //  System.out.println(re.getNums(10));
        System.out.println(re.show(6));
    }
}
