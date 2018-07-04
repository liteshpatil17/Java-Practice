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
public class QueenProblem {
    class position
    {
        int row, col;
        position(int row,int col)
        {this.row=row;this.col=col;}
    }
    public position[] queenProblem(int n)
    {
        boolean placed;
        position[] pos=new position[n];
        placed=queenProblemUtil(n,pos,0);
        if(!placed)
            return new position[]{null};
        return pos;
    }
    
    private boolean queenProblemUtil(int n,position[] pos,int row)
    {
        if(row==n)
            return true;
        for(int col=0;col<n;col++)
        {
            boolean isSafe=true;
            for(int q=0;q<row;q++)
            {
                if(pos[q].col==col || pos[q].row==row || pos[q].row + pos[q].col ==row+col || pos[q].row - pos[q].col==row-col)
                {isSafe=false;break;}
            }
            if(isSafe!=false)
            {  
                pos[row]=new position(row,col);
                if(queenProblemUtil(n, pos, row+1)) 
                    return true;
            }
             
        }
        return false;
    }
    
    private static void  printPositions(position[] pos,int n)
    {
        for(int i=0;i<n;i++)
            System.out.println(pos[i].row+"  "+pos[i].col);
    }
    
    public static void main(String args[])
    {
    QueenProblem q=new QueenProblem();
    int n=8;
    printPositions(q.queenProblem(n),n);
    }
}
