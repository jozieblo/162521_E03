import java.io.File;
import java.util.Arrays;

public class Z3
{
    public static void main(String[] args)
    {
        String path="C:\\Users\\jarek\\OneDrive\\Pulpit";
        String roz = ".png";
        String[] lista = zwrocBezroz(path,roz);
        System.out.print(Arrays.toString(lista));
    }
    public static String[] zwrocBezroz(String path, String roz)
    {
        File file = new File(path);
        return file.list((dir, name) -> !name.endsWith(roz));

    }
}
