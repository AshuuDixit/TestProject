
 
class p14{
 
public static int maxArea(int[] a)
{
 
    int Area = 0;
     
    for(int i = 0; i < a.length; i++)
    {
        for(int j = i + 1; j < a.length; j++)
        {
            Area = Math.max(
                Area, Math.min(a[i], a[j]) *
                              (j - i));
        }
    }
    return Area;
}
 

public static void main(String[] args)
{
    int a[] = {1,8,6,2,5,4,8,3,7};
   
 
    System.out.println(maxArea(a));
    
}
}
 