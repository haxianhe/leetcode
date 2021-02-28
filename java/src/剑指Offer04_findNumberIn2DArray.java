/**
 * Created by IDEA.
 *
 * @author haxianhe
 * @date 2021/2/28
 * @time 7:06 下午
 */

class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        //参数校验
        if(matrix.length == 0){
            return false;
        }

        //起始点
        int x = matrix.length - 1;//行
        int y = 0;                //列

        //搜索
        while(x >= 0 && y < matrix[0].length){
            if(matrix[x][y] < target){
                y++;
            }else if(matrix[x][y] > target){
                x--;
            }else{
                return true;
            }
        }

        return false;
    }
}
