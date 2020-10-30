public class Solution {
    public int canJump(ArrayList<Integer> A) {
        int len=A.size();
        boolean[] dp=new boolean[len+1];
        dp[len]=true;
        int nearest_possible_index=len;
        for(int i=len-1;i>=1;i--)
        {
            if((A.get(i-1)+i)>=nearest_possible_index)
            {
                dp[i]=true;
                nearest_possible_index=i;
                //System.out.print("\nValue of "+i+"is "+dp[i]);
                //System.out.print("\nValue of nearest possible index is "+nearest_possible_index);
            }
        }
        return dp[1]?1:0;
    }
}
