public class MinimumNumber 
{
    public static void main(String[] args) 
    {
        int[] arr = {18, 12, -7, 3, 14, 28, 67};

        System.out.println(min(arr));
    }
    
    //assume arr.length != 0
    static int min(int[] arr)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i] < ans)
            {
                ans = arr[i];
            }
        }
        return ans;
    }
}
