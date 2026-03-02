package Practice; 

import java.util.Scanner; 

public class NewProductIDInsertion { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int noOfProd = sc.nextInt(); 
        int[] newProdIDs = new int[noOfProd + 1]; 
        for (int i = 0; i < noOfProd; i++) { 
            newProdIDs[i] = sc.nextInt(); 
        }
        int newProdID = sc.nextInt(); 
        int index = noOfProd; 
        for (int i = 0; i < noOfProd; i++) { 
            if (newProdIDs[i] > newProdID) { 
                index = i; 
                break; 
            } 
        } 
        for (int i = noOfProd; i > index; i--) { 
            newProdIDs[i] = newProdIDs[i - 1]; 
        } 
        newProdIDs[index] = newProdID; 
        for (int i = 0; i < newProdIDs.length; i++) { 
            System.out.print(newProdIDs[i] + " "); 
        } 
        sc.close(); 
    } 
}