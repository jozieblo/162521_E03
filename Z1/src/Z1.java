public class Z1
{
    public static void main(String[] args)
    {
        Integer[] liczba1 = new Integer[]{1,2,3};
        Integer[] liczba2 = new Integer[]{3,2,1};
        System.out.println(palindrom(liczba2));

    }
    public static <T extends Comparable <T>> boolean palindrom (T[] tab)
    {
        int koniec = tab.length-1;
        for(int i=0;i!=koniec;i++)
        {
            if(tab[i].compareTo(tab[koniec])==0)
            {
                return true;
            }
            koniec--;
        }
        return false;
    }
}
