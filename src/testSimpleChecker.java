import java.util.ArrayList;
import java.util.List;

class testSimpleChecker {

  public static void main(String[] args) {


    simpleChecker checker = new simpleChecker(3,4);//two argument
    boolean result = checker.isSame();
    System.out.println(result);
    simpleChecker checker2 = new simpleChecker(4);//one argument
    String result2 = checker2.typeOf();
    System.out.println(result2);
    List list = new ArrayList();
    list.add(3);
    list.add(5);
    list.add("test");
    simpleChecker checker3 = new simpleChecker(list);//list argument
    boolean areThereAnyDifferent = checker3.anyDifferent();

    }
}
