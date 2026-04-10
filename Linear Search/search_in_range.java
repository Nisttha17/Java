public class search_in_range 
{
    public static void main(String[] args) 
    {
        int[] arr = {2, 45, 67, 89, 0, 6, 15};
        int target = 45;

        System.out.println(SearchInRange(arr, target, 1, 3));
    }

    static int SearchInRange(int[] arr, int target, int start, int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        // for(int i = start; i < end; i++)
        // {
        //     if(arr[i] == target)
        //     {
        //         return i;
        //     }
        // }

        int i =start;
        while(i < end)
        {
            if(arr[i] == target)
         {
                 return i;
             }
             i++;
        }
        return -1;
    }
    
}
