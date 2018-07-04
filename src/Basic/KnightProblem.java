/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author Litesh
 */
public class KnightProblem {
    public static void main(String args[])
    {
        int path[][]=knightProblem();
        printBoard(path);
     
    }

    private static int[][] knightProblem() {
        int sol[][]=new int[8][8];  
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
                sol[i][j]=-1;
        sol[0][0]=0;
        
        int pos_row[]={2,2,-2,-2,1,-1,1,-1};
        int pos_col[]={1,-1,1,-1,2,2,-2,-2};
        if(knightProblemUtil(sol,0,0,pos_row,pos_col,0))
        {printBoard(sol);return sol;}
        else 
            return null;
    }

    private static void printBoard(int mat[][]) {
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
                System.out.print(mat[i][j]+"  ");
            System.out.println();
        }
    }

    private static boolean knightProblemUtil(int[][] sol,int x,int y, int[] row, int[] col,int step) {
            int next_r,next_c;
            if(step==8*8)
               return true;
            for(int i=0;i<8;i++)
            {  
                next_r=x+row[i];
                next_c=y+col[i];
                if(validMove(sol,next_r,next_c))
                {
                    sol[next_r][next_c]=step;
                    if(knightProblemUtil(sol, next_r, next_c, row, col, step+1))
                        return true;
                    else
                        sol[next_r][next_c]=-1;
                }
            }
            return false;
    }   
    
    private static boolean validMove(int [][]sol,int row,int col)
    {
        if(row>=0 && row<8 && col>=0 && col<8 && sol[row][col]==-1)
            return true;
        return false;}

    
}
