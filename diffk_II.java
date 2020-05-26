public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int diffPossible(final List<Integer> A, int B) {
        HashSet<Integer> setOfValues=new HashSet<Integer>(); 
        for(int i=0;i<A.size();i++)
        {
            if(setOfValues.contains(A.get(i)-B)||setOfValues.contains(A.get(i)+B))
                return 1;
            setOfValues.add(A.get(i));
        }
        return 0;
    }
}
