public class max_sum_contiguous_subarray {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int length=A.size();
        int global_max=Integer.MIN_VALUE;
        int local_max=0;
        for(int i=0;i<length;i++)
        {
            local_max=Math.max(A.get(i),local_max+A.get(i));
            if(local_max>global_max)
                global_max=local_max;
        }
        return global_max;
    }
}
