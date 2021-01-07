<?php
/**
 * Created by PhpStorm.
 * @author haxianhe
 * @date 2021/1/8
 * @time 12:08 上午
 */

//Leetcode_557_ReverseWords Test
include_once "Leetcode_557_ReverseWords.php";

$str = "Let's take LeetCode contest";
$obj = new Leetcode_557_ReverseWords();
$result = $obj->reverseWords($str);
print_r($result);