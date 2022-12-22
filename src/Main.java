import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedController<String> stringLinked = new LinkedController<>();
//        Linked<String> stringLinked = new LinkedController<>();
        stringLinked.addLast("Agnia");
        stringLinked.addLast("Sasha");
        stringLinked.addLast("Dima");
        stringLinked.addLast("Ira");

//        System.out.println(stringLinked.size());
//        System.out.println(stringLinked.getElementByIndex(2));
//
//        for (String s : stringLinked) {
//            System.out.println(s);
//        }
        Iterator iterator = stringLinked.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}