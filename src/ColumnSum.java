import java.util.*;

class Solution
{
    public void colsum(int[][] array,int r,int c)
    {
        int sum=0;
        int[] result=new int[c];
        for(int i=0;i<c;i++)
        {
            sum=0;
            for(int j=0;j<r;j++)
            {
                sum+=array[j][i];
            }
            result[i]=sum;
        }
        System.out.println(Arrays.toString(result));

    }
}

class ColumnSum
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int columns=scanner.nextInt();
        int[][] array=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        Solution solution =new Solution();
        solution.colsum(array,rows,columns);
    }
}
