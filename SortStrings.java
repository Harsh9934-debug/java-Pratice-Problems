import java.util.*;
class SortStrings  
{  
    public static void main(String args[])   
    {  
        //defining an array of type String  
        String city[] = {"Dehli", "Hyderabad", "Bengaluru", "Chennai", "Mysuru"};  
        int size = city.length;  
        //logic for sorting   
        for(int i = 0; i < size - 1; i++)   
        {  
            for (int j = i + 1; j < size; j++)   
            {  
                //compares each element of the array to all the remaining elements  
                if(city[i].compareTo(city[j]) > 0)   
                {  
                    //swapping array elements  
                    String temp = city[i];  
                    city[i] = city[j];  
                    city[j] = temp;  
                }  
            }  
        }  
        //prints the sorted array in ascending order  
        System.out.println(Arrays.toString(city));  
    }  
}