package Activity9;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

    public static void main(String[] args) {
        
    List<String> MyList = new ArrayList<String>();

        MyList.add("Firstname");
        MyList.add("secondname");
        MyList.add("thirdname");
        MyList.add("fourthname");
        MyList.add("fifthname");
    

    for (String i:MyList)
    {
        System.out.println("added values");
System.out.println(i);


    }

    System.out.println("get name :  " +MyList.get(2));
    System.out.println("is name eixts : " +MyList.contains("firstname"));
    System.out.println("is name eixts: " +MyList.contains("Firstname"));
    System.out.println ("total size : " +MyList.size());
    System.out.println("remove one value :" +MyList.remove(1));
    System.out.println("updated size : " +MyList.size());


    }

    

}

