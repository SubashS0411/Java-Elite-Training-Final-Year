import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Animal");
        list.add("Rockstar");
        System.out.println("All Names: ");
        list.forEach(name-> System.out.print(name+" "));
        System.out.println("Names start with A");
        list.stream()
                .filter(name->name.startsWith("A"))
                .forEach(name-> System.out.print(name+" "));
    }
}
