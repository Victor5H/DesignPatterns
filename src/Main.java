import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        return 10;
        System.out.println(rob(new int[]{1, 2, 3, 1}));
        System.out.println(rob(new int[]{2,7,9,3,1}));
    }
    public int dfs(int []nums,int i){
        if(i>=nums.length) return 0;
        if(t[i]!=-1) return t[i];
        int with = dfs(nums,i+2)+nums[i];
        int without = dfs(nums,i+1);
        return t[i] = Math.max(with,without);
    }
    static int []t;
    public static int rob(int[] nums) {
        t=new int[nums.length];
        int []dp = new int[nums.length];
        dp[dp.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            int with=nums[i];
            int without = dp[i+1];
            if(i+2<nums.length){
                with +=dp[i+2];
            }
            dp[i] = Math.max(with,without);
        }
        return dp[0];
    }
}