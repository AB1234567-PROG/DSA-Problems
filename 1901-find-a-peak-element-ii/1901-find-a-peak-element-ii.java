class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
        int m=mat.length,n=mat[0].length;
       return rc(mat,m,n);
    }

    int[] rc(int[][] mat,int m,int n)
    {
        int l=0, h=n-1;
        int[] res={-1,-1};

        while(l<=h)
        {
            int mid = (l+h)>>1;
            int ind = maxel(mat,m,n,mid);
            int left = (mid>0)?mat[ind][mid-1]:-1;
            int right = (mid<n-1)?mat[ind][mid+1]:-1;

            if(mat[ind][mid]>left && mat[ind][mid]>right)
            {res[0]=ind;
            res[1]=mid;
            return res;}

            else if(mat[ind][mid]<left)
             h=mid-1;
             else
             l=mid+1;
        } 

        return res;
    }

    int maxel(int[][] mat, int m, int n, int mid)
    {
        int big=mat[0][mid];
        int r=0;

        for(int i=0; i<m; i++)
        {
            if(big<mat[i][mid])
            {
                big=mat[i][mid];
                  r=i;
            }
        }
        return r;
    }
    
}