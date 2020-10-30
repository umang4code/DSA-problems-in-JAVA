public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        int profit=0;
        boolean hold=false;
        int hold_price=0;
        int size=A.size();
        for(int i=0;i<size-1;i++)
        {
            if(hold==true)
            {
                if(A.get(i)>hold_price)
                {
                    profit+=A.get(i)-hold_price;
                    hold=false;
                }
            }
            if(hold==false)
                if(A.get(i+1)>A.get(i))
                {
                    hold=true;
                    hold_price=A.get(i);
                }
        }
        if(hold==true&&A.get(size-1)>hold_price)
            profit+=A.get(size-1)-hold_price;
        return profit;
    }
}
