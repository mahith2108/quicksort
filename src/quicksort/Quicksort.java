/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author mahith
 */
public class Quicksort {

    /**
     * @param args the command line arguments
     */
    public static int a[];
    public static int last;
   
    
    public static void main(String[] args) {
        // TODO code application logic here
    
         int[] k={2,1,-12,-11};
         a=k;
         last=k.length;
         //print();
         //quicksort(0,last);
         //print();
         //bubbleSort();
         //print();
         // shellsort();
          selectionSort();
         print();
    }
    
    public static void quicksort(int left,int right){
        
        int pivot,pivot_index;
        if(left<right){
                    
            pivot=a[left];
            pivot_index=left;
            
            for(int i=(left+1);i<last;i++){
            
                if(a[i]<=pivot){
                
                   pivot_index=pivot_index+1;
                   swap(pivot_index,i);
                }
                
            }    
                swap(left,pivot_index);
                quicksort(left,pivot_index-1);
                quicksort(pivot_index+1,right);           
        }
    
    }
    
    public static void swap(int index,int index1){
    
         int tmp;
         tmp=a[index];
         a[index]=a[index1];
         a[index1]=tmp;
    
    }        
    public static void print(){
    
         for(int i=0;i<last;i++){
         
            System.out.print(a[i]+ " ");
         
         }
        System.out.println(" ");
    }
    
    public static void bubbleSort(){
    
        for(int i=0;i<last;i++){
         
            for(int j=0;j<last-1;j++){
            
                if(a[j+1]<a[j]){
                
                   swap(j,j+1);
                }
            }
        
        }
    
    }
    
    public static void shellsort(){
        int j=last-1;
            for(int i=0;i<last;i++){
               
                if((j-i)<=i){
               
                   break;
               }
                   
                if(a[j-i]<a[i]){
               
                  swap(i,j-i);
                  System.out.print(i + " "+(j-i));
               }
              
           }
       
              
        bubbleSort();
    }  
    
    public static void selectionSort(){
         
            for(int i=0;i<last;i++){
            int k=i;
                for(int j=i+1;j<last;j++){
               
                    if(a[j]<a[i]){
                       
                       if(a[j]<a[k]) 
                          k=j;
                          System.out.println(i +" "+ k);
                    } 
                                
               }
                
                if(k!=i){
                
                  swap(k,i);
                }
               
           }
    
    }
    
}
