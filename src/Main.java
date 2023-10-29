import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        Arrays.asList(new Package(0.46364363),
////                )
//        BFD.packItems();
//        }
        ArrayList<Container> containers = new ArrayList<>();
        containers.add(new Container(40,75,35));
        containers.add(new Container(42,65,40));
        containers.add(new Container(35,55,50));
        containers.add(new Container(55,50,55));
        containers.add(new Container(65,30,60));
        containers.add(new Container(30,20,80));

        ArrayList<Package> packages  = new ArrayList<>();
        packages.add(new Package(0.3456887));
        packages.add(new Package(0.3456887));
        packages.add(new Package(0.455645347));
        packages.add(new Package(0.6756887));
        packages.add(new Package(0.23456887));
        packages.add(new Package(0.67856887));
        packages.add(new Package(0.4556887));
        packages.add(new Package(0.24566887));

      var containers1 =   BFD.packItems(packages,containers);

        for (Container c:
             containers1) {
            System.out.println(c);
        }


     }
}