package cn.eternal.com.lettcode;

/**
 * @program: moviceSystem
 * @description:
 * @author: zgl
 * @create: 2019-09-29 20:35
 **/
public class Node {
    private int data;
    private Node next;

    public Node(int data){
        this.data = data;
    }
    public Node (int data, Node next){
        this.data = data;
        this.next = next;
    }

    public int getData(){
        return data;
    }

}
