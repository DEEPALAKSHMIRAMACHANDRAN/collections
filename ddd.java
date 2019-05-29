import java.util.*;
public class ddd {
public static void main(String[] args) {
ArrayList<String> al=new ArrayList<String>();
al.add("deepa");
al.add("dks");
al.add("djfdk");
ArrayList<String> key=new ArrayList<String>(al);
ArrayList<String> al2=new ArrayList<String>();
al2.add("dki");
al2.add("sjk");
al2.add("saj");
key.addAll(al2);
System.out.println(al);
System.out.println(key.get(2));
key.set(2,"lion");
System.out.println(key);
key.removeIf(k->(k.contains("lion")));
System.out.println(key);
}
}