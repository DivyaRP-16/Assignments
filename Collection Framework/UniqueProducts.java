import java.util.HashSet;


public class UniqueProducts {
    public static void main(String[] args) {
        HashSet<Object> h = new HashSet<Object>();
        h.add("Product1");
        h.add("Product2");
        h.add("Product3");
        h.add("Product4");
        h.add("Product5");
        h.add("Product6");
        h.add("Product7");
        h.add("Product8");
        h.add("Product9");
        h.add("Product10");


            System.out.println(h);
        h.add("Product1");
        System.out.println(h);



    }
}