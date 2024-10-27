//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = [0,1]
//输出：[[0,1],[1,0]]
// 
//
// 示例 3： 
//
// 
//输入：nums = [1]
//输出：[[1]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// nums 中的所有整数 互不相同 
// 
//
// Related Topics 数组 回溯 👍 2985 👎 0

  
package com.haxianhe.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class Permutations{
  public static void main(String[] args) {
       Solution solution = new Permutations().new Solution();
  }
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, path, used, res);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> path, boolean[] used, List<List<Integer>> res) {
        // 当路径长度等于数组长度时，找到一种排列，加入结果中
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        // 遍历数组中的每个数
        for (int i =0; i< nums.length; i++) {
            // 如果这个数已经在路径中了，跳过
            if (used[i]) {
                continue;
            }
            //选择当前数字，标记为已使用
            path.add(nums[i]);
            used[i] = true;
            //递归
            backtrack(nums, path, used, res);
            //撤销选择
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}