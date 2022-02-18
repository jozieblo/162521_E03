import java.time.LocalDate;
import java.util.LinkedList;

public class Z1
{
    public static void main(String[] args)
    {
        LinkedList<Integer> liczba = new LinkedList<>();
        liczba.add(1);
        liczba.add(2);
        liczba.add(3);
        LinkedList<LocalDate> data = new LinkedList<>();
        data.add(LocalDate.of(10,10,10));
        data.add(LocalDate.of(11,11,11));
        data.add(LocalDate.of(12,12,12));
        data.add(LocalDate.of(13,12,13));
        redukuj(liczba);
    }
    public static <T> void  redukuj(LinkedList<T> tab)
    {
        int n=1; // usuwa n+1 (drugi w tym przypadku) element
        for(int i=0;i<tab.size()-1;i++)
        {
            tab.remove(n);
            n=n+n;
            if(n>tab.size())
            {
                break;
            }
        }
        System.out.print(tab);
    }

}
