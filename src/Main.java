import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedController<String> stringLinked = new LinkedController<>();
//        Linked<String> stringLinked = new LinkedController<>();
        stringLinked.addFirst("Agnia");
        stringLinked.addFirst("Sasha");
        stringLinked.addLast("Dima");
        stringLinked.addLast("Ira");

        for (String s1 : Arrays.asList("Fox", "Alex", "Nick", "Nata")) {
            stringLinked.add(s1);
            System.out.println(s1);
        }
        //        System.out.println(stringLinked.size());
//        System.out.println(stringLinked.getElementByIndex(2));

//        for (String s : stringLinked) {
//            System.out.println(s);
//        }
            Iterator iterator = stringLinked.descendingIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
//}