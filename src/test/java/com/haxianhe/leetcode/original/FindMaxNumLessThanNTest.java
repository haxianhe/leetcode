package com.haxianhe.leetcode.original;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author yourname <haxianhe@kuaishou.com>
 * Created on 2023-05-30
 */
public class FindMaxNumLessThanNTest {
    FindMaxNumLessThanN findMaxNumLessThanN = new FindMaxNumLessThanN();

    @Test
    public void testFindMaxNum() throws Exception {
        Long result = findMaxNumLessThanN.findMaxNum(23214, new int[] {2,4,9});
        Assert.assertEquals(Long.valueOf(22999), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme