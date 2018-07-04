/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.Arrays;

/**
 *
 * @author Litesh
 */
public class RatProblem {
    private boolean RatProblemPath(int n,int maze[][])
    {
        int sol[][]=new int[n][n];
        for(int i=0;i<n;i++)
            Arrays.fill(sol[i], 0);
           if(RatProblemPathUtil(n,maze,sol,0,0))
            {
                printSol(sol, n);
                return true;
            }
        return false;
    }
    
    
    private boolean RatProblemPathUtil(int n, int[][] maze, int[][] sol,int x,int y) {
        if(x==n-1 && y==n-1)
        { sol[x][y] = 1;return true;}
//        System.out.println();
//        printSol(sol,n);
        if(isSafe(n,maze,x,y))
        {
            sol[x][y]=1;
            if(RatProblemPathUtil(n, maze, sol, x+1, y))
                return true;
            if(RatProblemPathUtil(n, maze, sol, x, y+1))
                return true;
             if(RatProblemPathUtil(n, maze, sol, x, y-1))
                return true;
            sol[x][y] = 0;
            return false;
         }
        return false;
    }
    
    private void printSol(int [][] sol,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(sol[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        RatProblem ratProblem=new RatProblem();
        int[][] maze=new int [][]{{1,1,0,0,0},{0,1,0,1,0},{1,1,0,0,0},{1,0,0,0,0},{1,1,1,1,1}};
        ratProblem.printSol(maze,5);
        System.out.println();
        boolean sol= ratProblem.RatProblemPath(5,maze);
        if(sol == false)
            System.out.println("No Way");
     }

    private boolean isSafe(int n,int[][] maze, int x, int y) {
        return (x<n && y<n && x>=0 && y>=0 && maze[x][y]==1) ;   
    }

    
}
