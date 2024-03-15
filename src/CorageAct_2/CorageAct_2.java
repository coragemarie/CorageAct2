
package CorageAct_2;


import java.util.Arrays; 



public class CorageAct_2 {
    
    public static void main(String[]args) {
        int[] Elements = {10, 20, 30, 40, 50};
        
        System.out.println("Print Array =  " + Arrays.toString(Elements));
        System.out.println("First Element: " + Elements[0]);
        System.out.println("Second Element: " + Elements[1]);
        System.out.println("Third Element: " + Elements[2]);
        System.out.println("Fourth Element: " + Elements[3]);
        System.out.println("Fifth Element: " + Elements[4]);
        
        
        int sum = Elements[0] + Elements[1] + Elements[3] + Elements[4];
        System.out.println("\nThe sum is : " + sum);
        
        int max; 
        max = Math.max(Elements[0], Math.max(Elements[1], Math.max(Elements[2], Math.max(Elements[3], 
                Elements[4]))));
        
        System.out.println("Maximum Value: " + max);
    
    }
    
}

    

