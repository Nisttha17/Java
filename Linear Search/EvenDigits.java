//1295. Find no. of nos.that have Even Numbers of Digits.
public class EvenDigits 
{
    public int findNumbers(int[] nums)
    {
        int count = 0;

        for(int num : nums)
        {
            int len = String.valueOf(num).length();

            if(len % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        int[] nums = {12, 345, 2, 6, 7896, 1, 67};

        EvenDigits obj = new EvenDigits();

        int res = obj.findNumbers(nums);

        System.out.println("Numbers with even digits: "+ res);
    }

}
