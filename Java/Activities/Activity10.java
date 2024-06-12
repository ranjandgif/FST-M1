package Activity10;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {


    public static void main(String[] args) {

Set<String> hs = new HashSet<>();
hs.add("object1");
hs.add("object2");
hs.add("object3");
hs.add("object4");
hs.add("object5");
hs.add("object6");

System.out.println("total size :" +hs.size());
System.out.println("removal a value " +hs.remove("object1"));
System.out.println("removal a value that is already removed " +hs.remove("object1"));
System.out.println("is name eixts: " +hs.contains("object2"));

for (String i:hs)
{
System.out.println(i);
    
}







}
}
