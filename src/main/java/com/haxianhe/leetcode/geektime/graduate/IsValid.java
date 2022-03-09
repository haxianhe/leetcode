package com.haxianhe.leetcode.geektime.graduate;

import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author haxianhe haxianhe@gmail.com
 * Created on 2022-03-09
 */
public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if (stack.empty() || c != stack.pop()) {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        int n = s.length() / 2;
        for (int i = 0; i < n; i++) {
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }
        return s.length() == 0;
    }
}
