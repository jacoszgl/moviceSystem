package cn.eternal.com.result;

/**
 * @program: moviceSystem
 * @description:
 * @author: zgl
 * @create: 2019-10-08 22:54
 **/
public class CodeMsg {
    private String msg;
    private int code;

    //通用
    public static CodeMsg SUCC = new CodeMsg("succ",0);
    public static CodeMsg FAIL = new CodeMsg("fail",50010);

    //

    public CodeMsg(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }


}
