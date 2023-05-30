package com.haxianhe.leetcode.original;

import java.util.Arrays;

/**
 * @author haxianhe <haxianhe@gmail.com>
 * Created on 2023-05-30
 */
public class FindMaxNumLessThanN {
    /**
     * 输入一个数字n，给一个数组a，求小于n由数组a的数组成的最大数
     * <p>
     * example：
     * N = 23214 , a = [2, 4, 9]
     * Res = 22999
     */
    public Long findMaxNum(int n, int[] A) {
        //1.参数校验
        if (A.length == 0 || n <= 0) {
            return -1L;
        }
        Arrays.sort(A);
        char[] nCharArray = Integer.toString(n).toCharArray();
        int[] nIntArray = new int[nCharArray.length];
        int[] result = new int[nCharArray.length];
        boolean maxFlag = false;

        //2.初始化数组
        for (int i = 0; i < nCharArray.length; i++) {
            nIntArray[i] = Integer.parseInt(String.valueOf(nCharArray[i]));
        }

        //3.对于目标数n，从高位到低位逐位判断，如果大于继续判断，如果等于继续判断下一位，如果小于后续位值取最大值
        for (int i = 0; i < nCharArray.length; i++) {
            if (maxFlag) {
                result[i] = A[A.length - 1];
            } else {
                for (int j = A.length - 1; j >= 0; j--) {
                    if (nIntArray[i] == A[j]) {
                        result[i] = A[j];
                        break;
                    } else if (nIntArray[i] > A[j]) {
                        result[i] = A[j];
                        maxFlag = true;
                    }
                }
            }
        }
        return (long) getIntFromArray(result);
    }

    private static int getIntFromArray(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result * 10 + num;
        }
        return result;
    }
}
