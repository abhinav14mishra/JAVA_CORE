public class Alphabet_StarPattern 
{public static void main(String[] args)
    {
        int n=10;
        //Program to print A
       for(int i=1; i<=n; i++)
       {
        for(int j=1; j<=n; j++)
        {   
            if(i==1||j==n||j==1||i==n/2)
            {
                System.out.print("*");
            }
            
            else
            {
                System.out.print(" ");
            } 
        }
        System.out.println();
       }
       
       System.out.println();
        //Program to print B
        for(int i=1; i<=n; i++)
        {
         for(int j=1; j<=n; j++)
         {   
             if(i==1&&j<n||j==n&&i>1&&i<n
             ||i==n&&j<n
             
             ||j==1||i==n/2)
             {
                 System.out.print("*");
             }
             
             else
             {
                 System.out.print(" ");
             } 
         }
         System.out.println();
        }

        System.out.println();
        
         //Program to print C
        for(int i=1; i<=n; i++)
        {
         for(int j=1; j<=n; j++)
         {   
             if(i==1&&j>1||i==n&&j>1&&j<=n||j==1&&i>1&&i<n)
             {
                 System.out.print("*");
             }
             
             else
             {
                 System.out.print(" ");
             } 
         }
         System.out.println();
        }

        System.out.println();
        //Program to print D
        for(int i=1; i<=n; i++)
        {
         for(int j=1; j<=n; j++)
         {   
             if(i==1&&j<n||j==n&&i>1&&i<n
             ||i==n&&j<n
             
             ||j==1)
             {
                 System.out.print("*");
             }
             
             else
             {
                 System.out.print(" ");
             } 
         }
         System.out.println();
        }

        System.out.println();
        //Program to print E
        for(int i=1; i<=n; i++)
        {
         for(int j=1; j<=n; j++)
         {   
             if(i==1||i==n||j==1||i==n/2)
             {
                 System.out.print("*");
             }
             
             else
             {
                 System.out.print(" ");
             } 
         }
         System.out.println();
        }

        System.out.println();
        //Program to print F
        for(int i=1; i<=n; i++)
        {
         for(int j=1; j<=n; j++)
         {   
             if(i==1||j==1||i==n/2)
             {
                 System.out.print("*");
             }
             
             else
             {
                 System.out.print(" ");
             } 
         }
         System.out.println();
        }
        
        System.out.println();
        //Program to print H
       for(int i=1; i<=n; i++)
       {
        for(int j=1; j<=n; j++)
        {   
            if(j==n||j==1||i==n/2)
            {
                System.out.print("*");
            }
            
            else
            {
                System.out.print(" ");
            } 
        }
        System.out.println();
       }

       System.out.println();
       n=10;
        //Program to print G
       for(int i=1; i<=n; i++)
       {
        for(int j=1; j<=n; j++)
        {   
            if(i==1&&j>1||i==n&&j>1&&j<=6||j==1&&i>1&&i<n||j==6&&i>4||j==n&&i>4||i==5&&j>=7&&j<=8)
            {
                System.out.print("*");
            }
            
            else
            {
                System.out.print(" ");
            } 
        }
        System.out.println();
       }

       //Program to print I
       n=11;
       for(int i=1; i<=n; i++)
       {
        for(int j=1; j<=n; j++)
        {   
            if(i==1||i==n||j==(n+1)/2)
            {
                System.out.print("*");
            }
            
            else
            {
                System.out.print(" ");
            } 
        }
        System.out.println();
       }
       System.out.println();

       //Program to print N
       n=11;
       for(int i=1; i<=n; i++)
       {
        for(int j=1; j<=n; j++)
        {   
            if(j==1||j==n||j==i)
            {
                System.out.print("*");
            }
            
            else
            {
                System.out.print(" ");
            } 
        }
        System.out.println();
       }
       System.out.println();

       //Program to print P
       n=11;
       for(int i=1; i<=n; i++)
       {
        for(int j=1; j<=n; j++)
        {   
            if(j==1||i==1&&j<n||i==(n+1)/2&&j<n||j==n&&i<(n+1)/2&&i>1)
            {
                System.out.print("*");
            }
            
            else
            {
                System.out.print(" ");
            } 
        }
        System.out.println();
       }

       System.out.println();

       //Program to print W
       n=10;
       for(int i=1; i<=n; i++)
       {
        for(int j=1; j<=n*2; j++)
        {   
            if(j==1||j==n*2||i+j==n+1||j-i==n)
            {
                System.out.print("*");
            }
            
            else
            {
                System.out.print(" ");
            } 
        }
        System.out.println();
       }

       
       System.out.println();

       //Program to print S
       n=11;
       for(int i=1; i<=n; i++)
       {
        for(int j=1; j<=n; j++)
        {   
            if(i==1||i==(n+1)/2||i==n||j==1&&i<(n+1)/2||j==n&&i>(n+1)/2)
            {
                System.out.print("*");
            }
            
            else
            {
                System.out.print(" ");
            } 
        }
        System.out.println();
       }

       System.out.println();

       //Program to print K
       n=11;
       for(int i=1; i<=n; i++)
       {
        for(int j=1; j<=n; j++)
        {   
            if(j==1||i+j==7||i-j==5)
            {
                System.out.print("*");
            }
            
            else
            {
                System.out.print(" ");
            } 
        }
        System.out.println();
       }

       //Program to print V
       n=11;
       for(int i=1; i<=n; i++)
       {
        for(int j=1; j<=n; j++)
        {   
            if(i+j==17||i-j==5)
            {
                System.out.print("*");
            }
            
            else
            {
                System.out.print(" ");
            } 
        }
        System.out.println();
       }




       



    }      
    }
