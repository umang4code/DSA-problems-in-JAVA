public class rotate_matrix {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int row=a.size()-1;
        int curr_row=0;
        int temp=0;
        for(int i=0;i<=(row/2);i++)
        {
            curr_row=row-i;
            for(int j=i;j<curr_row;j++)
            {
                temp=a.get(i).get(j);
                a.get(i).set(j,a.get(curr_row-(j-i)).get(i));
                a.get(curr_row-(j-i)).set(i,a.get(curr_row).get(curr_row-(j-i)));
                a.get(curr_row).set(curr_row-(j-i),a.get(j).get(curr_row));
                a.get(j).set(curr_row,temp);
            }
        }
    }
}
