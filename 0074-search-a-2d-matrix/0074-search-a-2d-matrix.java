class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m=matrix.length, n=matrix[0].length;
        int l=0,h=m*n-1;

        while(l<=h)
        {
            int mid=(l+h)>>1;
            int i=mid/n,j=mid%n;

            if(matrix[i][j]==target)
            return true;
            else if(matrix[i][j]>target)
            h=mid-1;
            else
            l=mid+1;
         }
         return false;
        
    }
}