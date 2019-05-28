import java.util.*;

public class LinkedListTest{
  public static void main(String args[]){
    LinkedList<String>list = new LinkedList();

    String name1 = "ALICE";
    String name2 = "BOB";

    list.add(name1);
    list.add(name2);

    String firstname = (String)list.getFirst();
    String secondname = (String)list.get(1);

    System.out.println("listの要素数は" + list.size());
    System.out.println("listの最初の要素は" + firstname + "2番目の要素は" + secondname);

    String name3 = "CINDY";
    String name4 = "DAVE";

    list.add(name3);
    list.remove(name1);
    list.addFirst(name4);

    Object[] array = list.toArray();
    for(Object x: array){
      System.out.println(x);
    }

    /*Iterator it = list.iterator();

    System.out.println("要素の走査");
    while(it.hasNext()){
      String st = (String)it.next();
      System.out.println();*/

  }
}
