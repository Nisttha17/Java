//Returns true, if the target value is found in the string n returns false, if its not found.
public class search_in_string 
{
    public static void main(String[] args)
    {
        String str = "NistthaMishra";

        char target = 'M';

        System.out.println(SearchInString(str, target));
      
    }

    static boolean SearchInString(String str, char target)
    {
        if(str.length() == 0)
        {
            return false;
        }

        for(int i=0; i<str.length(); i++)
        {
            if(target == str.charAt(i))
            {
                return true;
                
            }
        }
        return false;
    }
   
}
