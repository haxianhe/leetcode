package com.haxianhe.leetcode.jzoffer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PrintListFromTailToHeadTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void printListFromTailToHead() {
        ListNode listNode = new ListNode(67);
        ListNode listNode1 = new ListNode(0);
        listNode.next = listNode1;
        ListNode listNode2 = new ListNode(24);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(58);
        listNode2.next = listNode3;
        PrintListFromTailToHead obj = new PrintListFromTailToHead();
        ArrayList<Integer> result = obj.printListFromTailToHead(listNode);
        System.out.println(result);
    }
}