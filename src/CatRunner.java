import java.util.ArrayList;
import java.util.Locale;

public class CatRunner {
    public static void main(String[] args){
        ArrayList <Cat> cats = new ArrayList <Cat>();
        Cat cherry = new Cat("Cherry");
        Cat strawberry = new Cat("Strawberry");
        Cat blackberry = new Cat("Blackberry");
        cats.add(cherry);
        cats.add(strawberry);
        cats.add(blackberry);
        System.out.println(cats);

        Cat cat4 = new Cat("Blueberry");
        Cat oldCat = cats.set(2, cat4);

        System.out.println(cats);
        System.out.println(oldCat);

        cat4.setName(cat4.getName() + " Pie");
        System.out.println(cat4);
        System.out.println(cats);

        for (int i = 0; i < cats.size(); i ++){
            Cat currentCat = cats.get(i);
            currentCat.setName(currentCat.getName().toUpperCase());
        }

        System.out.println(cats);

        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}
