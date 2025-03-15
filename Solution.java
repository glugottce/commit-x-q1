import java.io.*;
import java.util.*;
public class Solution
{
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int res=arr[0];
    for(int i=1;i<n;i++)
    {
        max=Math.max(arr[i],max+arr[i]);
        res=Math.max(max,res);
    }
    System.out.print(res);
}
}