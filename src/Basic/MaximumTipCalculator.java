/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Litesh
 */

//   static int MaxTipX(int A[],int B[],int X,int Y,int N)
//    {
//        int tip=0;
//        for(int i=0;i<N;i++)
//        {
//            if(B[i]>A[i] && Y>=1)
//            {tip=tip+B[i]; Y--;}
//            else if(B[i]<A[i] && X>=1)
//            {tip=tip+A[i]; X--;}
//            else 
//                {
//                    if(X>Y)
//                     {tip=tip+A[i]; X--;}
//                     else if(Y>X)
//                     {tip=tip+B[i]; Y--;}
//                     else if(Y==X)
//                     {tip=tip+A[i];X--;}
//                }
//        }
//        return tip;
//    }
//    
//   
//   static int MaxTipY(int A[],int B[],int X,int Y,int N)
//    {
//        int tip=0;
//        for(int i=0;i<N;i++)
//        {
//            if(B[i]>A[i] && Y>=1)
//            {tip=tip+B[i]; Y--;}
//            else if(B[i]<A[i] && X>=1)
//            {tip=tip+A[i]; X--;}
//            else if(A[i]==B[i])
//                {
//                    
//                     if(X>Y)
//                     {tip=tip+A[i]; X--;}
//                     else if(Y>X)
//                     {tip=tip+B[i]; Y--;}
//                     else if(Y==X)
//                     {tip=tip+A[i];Y--;}
//                }
//        }
//        return tip;
//    }
//   
//   
//     public static void main(String args[])
//    {
//        Scanner sc=new Scanner(System.in);
//        int test=sc.nextInt();
//        sc.nextLine();
//        while(test>0)
//        { 
//            int N=sc.nextInt();
//            int X=sc.nextInt();
//            int Y=sc.nextInt();
//            sc.nextLine();
//            int A[]=new int[N];
//            int B[]=new int[N];
//            for(int i=0;i<N;i++)
//                A[i]=sc.nextInt();
//             
//            for(int i=0;i<N;i++)
//                B[i]=sc.nextInt();
//            
//            int MaxTipX=MaxTipX(A, B, X, Y, N);
//            int MaxTipY=MaxTipY(A, B, X, Y, N);
//            if(MaxTipX>MaxTipY)
//                System.out.println(MaxTipX);
//            else
//                System.out.println(MaxTipY);
//
//            if(sc.hasNextLine()){
//            sc.nextLine();
//            }
//            
//       test--;}
//    }
//}

class arrData{
    int diff;
    int loc;
    
    public arrData(int a,int b,int locn){
        diff=a>=b?a-b:b-a;
        loc=locn;
    }
}

class compareFn implements Comparator<arrData>{
    
    public int compare(arrData a,arrData b){
        return b.diff-a.diff;
    }
}

public class MaximumTipCalculator {
	 public static int maxTip(int[]Xarr,int[] Yarr,int X,int Y,int N){
        ArrayList<arrData> data=new ArrayList<>(N);
        for(int i=0;i<N;i++){
            data.add(new arrData(Xarr[i],Yarr[i],i));
        }
        Collections.sort(data,new compareFn());
        int tip=0;
        for(int i=0;i<N;i++){
            if(Xarr[data.get(i).loc] > Yarr[data.get(i).loc]){
                if(X>0){
                    tip+=Xarr[data.get(i).loc];
                    X--;
                }else{
                    tip+=Yarr[data.get(i).loc];
                    Y--;
                }
            }else{
                if(Y>0){
                    tip+=Yarr[data.get(i).loc];
                    Y--;
                    
                }else{
                 tip+=Xarr[data.get(i).loc];
                    X--;
                }
            }
        }
        return tip;
        
    }
    
    
    public static void main (String[] args){
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        s.nextLine();
        while(T-->0){
            int N=s.nextInt();
            int X=s.nextInt();
            int Y=s.nextInt();
            s.nextLine();
            int[] Xarr=new int[N];
            int[] Yarr=new int[N];
            for(int i=0;i<N;i++){
                Xarr[i]=s.nextInt();
            }
            s.nextLine();
            for(int i=0;i<N;i++){
                Yarr[i]=s.nextInt();
            }
            if(s.hasNextLine())
            s.nextLine();
            
        System.out.println(maxTip(Xarr,Yarr,X,Y,N));
        }
    }
}