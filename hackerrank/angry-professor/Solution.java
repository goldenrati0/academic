/*
 * https://www.hackerrank.com/challenges/angry-professor
 */

import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner ana = new Scanner(System.in);
        
        int testCase = ana.nextInt();
        ana.nextLine();
        
        for(int z=1; z<=testCase; z++){
            
            String x = ana.nextLine();
            Scanner anaX = new Scanner(x);
            int[] studentInClassAndThreshold = new int[2];
            int indexManager = 0;
            
            while(anaX.hasNextInt()){
                
                studentInClassAndThreshold[indexManager] = anaX.nextInt();
                indexManager++;
            }            
            
            x = ana.nextLine();
            anaX = new Scanner(x);
            
            int[] timer = new int[ studentInClassAndThreshold[0] ];
            
            for(int i=0; i<studentInClassAndThreshold[0]; i++){
                
                timer[i] = anaX.nextInt();
            }
            
            int studentsInTime = 0;
            
            for(int i=0; i<timer.length; i++){
                
                if(timer[i] <= 0){
                    
                    studentsInTime++;
                }
            }
            
            if(studentsInTime >= studentInClassAndThreshold[1]){
                
                System.out.println("NO");
            }else{
                
                System.out.println("YES");
            }
        }
    }
}