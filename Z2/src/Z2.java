import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Z2
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> liczby = new LinkedHashSet<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(3);
        LinkedHashSet<String> napis = new LinkedHashSet<>();
        napis.add("1");
        napis.add("2");
        napis.add("3");
        LinkedHashSet<Character> znak = new LinkedHashSet<>();
        znak.add('a');
        znak.add('b');
        znak.add('c');
        usuwanie2(liczby);
        System.out.print(liczby);

    }
//    public static <E extends Iterable <?>> void usuwanie(E lista)
//    {
//        Iterator iterator = lista.iterator();
//        while (iterator.hasNext())
//        {
//            var poprzedni = iterator.next();
//            if(!iterator.hasNext())
//            {
//                iterator.remove(poprzedni);
//            }
//        }
//    }
    public static<T> void usuwanie2(LinkedHashSet <T> lista)
    {
        int licznik =0;
       for(int i=0;i<lista.size();i++)
       {
           licznik++;
       }
       int przed = licznik-1;
       lista.remove(przed);
    }

}
