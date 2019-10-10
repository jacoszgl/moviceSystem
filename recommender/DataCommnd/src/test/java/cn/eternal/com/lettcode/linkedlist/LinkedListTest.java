package cn.eternal.com.lettcode.linkedlist;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: moviceSystem
 * @description:
 * @author: zgl
 * @create: 2019-09-28 22:53
 **/
public class LinkedListTest {

    static ListNode head;
    public  static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    @Test
    public void test1(){
       // ListNode ls = "{1,2,3,4,5}";
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        if (curr != null){
            ListNode nextTemp = curr.next;
            prev = curr.next;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private ListNode reverseList2(ListNode head){
        /*ListNode preHead =  head;//反转后前一根节点
        ListNode currNode = null;//当前节点
        for (int i = 0;  head != null; i++){
            preHead = head.next;
            head.next = currNode;
            currNode = head;
            head = preHead;
        }
        return currNode;*/
        ListNode preHead = head;//反转后前一根节点
        ListNode currNode = null;
        return  currNode;
    }

    private ListNode reverseList3(ListNode head){
        ListNode preNode = null; //反转后前一节点
        ListNode curr = head;
        while (curr !=null){
            ListNode next = head.next;
            preNode = curr.next;
            preNode = curr;
            curr = next;
        }
        return preNode;
    }

    void printlt(ListNode node){
        while (node != null){
            System.out.println("node..." + node.val);
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedListTest list = new LinkedListTest();
        list.head = new ListNode(85);
        list.head.next = new ListNode(15);
        list.head.next.next = new ListNode(4);
        list.head.next.next.next = new ListNode(20);

        System.out.println("Given Linked list");
        list.printlt(head);
        head = list.reverseList3(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printlt(head);
    }
}
