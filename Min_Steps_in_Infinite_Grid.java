public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps=0;
        int arrl=A.size();
        for(int i=0;i<arrl-1;i++)
        {
            steps=steps+Math.max(Math.abs(A.get(i+1)-A.get(i)),Math.abs(B.get(i+1)-B.get(i)));
        }
        return steps;
    }
    
    
}