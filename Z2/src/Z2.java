import java.util.Iterator;

public class Z2
{
    public static void main(String[] args)
    {
        String[] napis = new String[]{"1","2","3","4","5"};
        Integer[] liczba = new Integer[]{1,2,3,4,5};
        wypisz(napis);
    }
    public static  void wypisz (String tab[])
    {
        for(int i=0;i<tab.length;i+=2)
        {
            System.out.print(tab[i]+", ");
        }
    }
}
