package Java_prog;

public class P20 
{
    public static int removeDuplicate(int arr[], int n)
         {  
        if (n==0)
        {  
            return n;  
        }    
        int j = 0;     //for next element  
        
        for (int i=0; i < n-1; i++)
        {  
            if (arr[i] != arr[i+1])
            {  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;  
    }  
       
    public static void main (String[] args)
    {  
        int arr[] = {10,20,20,30,30,40,50,50};  
        int len = arr.length;  
        System.out.println("length before = "+len);
        len = removeDuplicate(arr, len);  
        //printing array elements  
        for (int i=0; i<len; i++)  
        {
           System.out.println(arr[i]); 
        }
        System.out.println("length after remove duplicate = "+len);
    }
}
