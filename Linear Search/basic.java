public class basic
{
    public static void main(String[] args) 
    {
        int[] arr = {23, 2, 0, -3, -1, 19, 67, 96, 14};
        int target = 22;

        int ans = LinearSearch(arr, target);
        System.out.println(ans);
    }

    static int LinearSearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        for(int i=0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }

        return Integer.MAX_VALUE;
    }
}