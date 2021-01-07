<?php
/**
 * Created by PhpStorm.
 * @author haxianhe
 * @date 2021/1/8
 * @time 12:00 上午
 */


class Leetcode_557_ReverseWords
{
    /**
     * @param String $s
     * @return String
     */
    function reverseWords($s) {
        if (empty($s)){
            return "";
        }

        $strArray = explode(" ", $s);
        $result = [];
        foreach ($strArray as $str){
            $revStr = strrev($str);
            array_push($result, $revStr);
        }

        return implode(" ", $result);
    }
}