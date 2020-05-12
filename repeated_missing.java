import java.math.*;
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        long act_sum=0;
        long theo_sum=0;
        BigInteger act_sqsum=BigInteger.ZERO;
        BigInteger theo_sqsum=BigInteger.ZERO;
        long a1=0,b1=0,c1=0;
        int size=A.size();
        long N=(long)(size);
        for(int i=0;i<size;i++)
        {
            act_sum+=Long.valueOf(A.get(i));
            //System.out.println(act_sum);
        }
        if(N%2==0)
        {
            long half=N/2;
            theo_sum=half*(N+1);
            //System.out.println(theo_sum);
        }
        else
        {
            long half=(N+1)/2;
            theo_sum=half*N;
            //System.out.println(theo_sum);
        }
        BigInteger diff=BigInteger.valueOf(act_sum-theo_sum);
        for(int i=0;i<size;i++)
        {
            act_sqsum=act_sqsum.add(BigInteger.valueOf((A.get(i)*(A.get(i)))));
            //System.out.println(act_sqsum);
        }
        /*if(size%6==0)
        {
            a1=N/6;
            b1=N+1;
            c1=(2*N)+1;
        }
        else if(size%2==0)
        {
            a1=N/2;
            if((size+1)%3==0)
            {
                b1=(N+1)/3;
                c1=(2*N)+1;
            }
            else
            {
                b1=N+1;
                c1=((2*N)+1)/3;
            }
        }
        else
        {
            if(size%3==0)
            {
                a1=N/3;
                b1=(N+1)/2;
                c1=(2*N)+1;
            }
            else
            {
                if((size+1)%3==0)
                {
                    a1=N;
                    b1=(N+1)/6;
                    c1=(2*N)+1;
                }
                else
                {
                    a1=N;
                    b1=(N+1)/2;
                    c1=((2*N)+1)/3;
                }
            }
        }*/
        //theo_sqsum=a1*b1*c1;
        //System.out.println(theo_sqsum);
        a1=N;
        b1=(N+1);
        long a1b1=a1*b1;
        //System.out.println("a1b1"+a1b1);
        c1=(2*N)+1;
        //System.out.println("c1"+c1);
        BigInteger abc=BigInteger.valueOf(a1b1).multiply(BigInteger.valueOf(c1));
        //System.out.println("abc"+abc);
        theo_sqsum=abc.divide(BigInteger.valueOf(6));
        //System.out.println("theosqsum"+theo_sqsum);
        BigInteger sqdiff=act_sqsum.subtract(theo_sqsum);
        //System.out.println("sqdiff"+sqdiff);
        BigInteger numsum=sqdiff.divide(diff);
        //System.out.println("numsum"+numsum);
        BigInteger biga=numsum.add(diff).divide(BigInteger.valueOf(2));
        //System.out.println("biga"+biga);
        BigInteger bigb=numsum.subtract(biga);
        //System.out.println("bigb"+bigb);
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ans.add(biga.intValue());
        ans.add(bigb.intValue());
        return ans;
    }
}