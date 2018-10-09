public class zad3
{
    public static void main(String[] args)
    {
        int[] array = {3,2,14,1,2,3,6};
        System.out.println(array123(array));
    }
    public static boolean array123(int[] nums)
    {
        for (int i=0; i < (nums.length-2); i++)
        {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }
}