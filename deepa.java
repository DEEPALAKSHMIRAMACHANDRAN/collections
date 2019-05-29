import java.util.*;
public class deepa {
public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(12);
al.add(13);
al.add(15);
ArrayList<Integer> key=new ArrayList<Integer>(al);
ArrayList<Integer> al2=new ArrayList<Integer>();
al2.add(20);
al2.add(25);
al2.add(27);
key.addAll(al2);
System.out.println(key);
System.out.println(key.get(2));
key.set(2,56);
System.out.println(key);
}
}