//给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。 
//
// 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。 
//
// 你必须设计并实现时间复杂度为 O(n) 的算法解决此问题。 
//
// 
//
// 示例 1: 
//
// 
//输入: [3,2,1,5,6,4], k = 2
//输出: 5
// 
//
// 示例 2: 
//
// 
//输入: [3,2,3,1,2,4,5,5,6], k = 4
//输出: 4 
//
// 
//
// 提示： 
//
// 
// 1 <= k <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 
//
// Related Topics 数组 分治 快速选择 排序 堆（优先队列） 👍 2503 👎 0

  
package com.haxianhe.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KthLargestElementInAnArray{
  public static void main(String[] args) {
       Solution solution = new KthLargestElementInAnArray().new Solution();
  }
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int quickSelect(List<Integer> nums, int k) {
        Random rand = new Random();
        int pivot = nums.get(rand.nextInt(nums.size()));
        List<Integer> big = new ArrayList<>();
        List<Integer> small = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();

        for (int num : nums) {
            if (num > pivot) {
                big.add(num);
            } else if (num < pivot) {
                small.add(num);
            } else {
                equal.add(num);
            }
        }

        if ( k <= big.size()) {
            return quickSelect(big, k);
        } else if (k <= big.size() + equal.size()) {
            return pivot;
        } else {
            return quickSelect(small, k - big.size() - equal.size());
        }
    }
      public int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return quickSelect(list, k);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}