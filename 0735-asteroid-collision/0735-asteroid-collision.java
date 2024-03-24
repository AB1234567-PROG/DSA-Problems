class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=0;i<asteroids.length;i++)
        {
            boolean flag=false;
            boolean flag1=false;
          if(st.isEmpty()) 
              st.push(asteroids[i]);
            else
            {
                while(!st.isEmpty() && st.peek()>0 && asteroids[i]<0)
                      {
                           flag=true;
                          if(Math.abs(st.peek())<Math.abs(asteroids[i]))
                          {
                             flag1=true;
                            st.pop();
                          }
                          
                          else if(Math.abs(st.peek())==Math.abs(asteroids[i]))
                              {
                                flag1=false;
                                st.pop();
                                break;
                              }
                          else
                          {
                            flag1=false;
                              break;
                          }
                              
                      }
                
                if(flag==false || flag1==true)
                 st.push(asteroids[i]);   
            }    
            
        }
        int[] res= new int[st.size()];
        
        for(int i=res.length-1;i>=0;i--)
        {
            res[i]=st.pop();
        }
        
        return res;
        
    }
}