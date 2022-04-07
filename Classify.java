import java.util.*;

public class Classify {
    public static void main(String [] args) {
        System.out.println("Classify ...");
        Classify c = new Classify();
        c.cc(new MyCollection());
        c.cc(new ArrayList());
        c.cc(new HashSet());
    }

    void cc(Collection c) {
        System.out.println("collection ...");
    }

    void cc(List l) {
        System.out.println("list ...");
    }

    void cc(Set s) {
        System.out.println("set ...");
    }

}
