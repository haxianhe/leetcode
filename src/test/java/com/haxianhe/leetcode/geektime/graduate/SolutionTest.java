package com.haxianhe.leetcode.geektime.graduate;

import org.junit.Test;

/**
 * @author haxianhe haxianhe@gmail.com
 * Created on 2022-03-09
 */
public class SolutionTest {

    @Test
    public void isValidTest() {
        String str = "()[]{()}";
        System.out.println(new IsValid().isValid2(str));
    }
}
