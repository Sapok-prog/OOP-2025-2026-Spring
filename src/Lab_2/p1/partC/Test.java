package Lab_2.p1.partC;

import java.util.HashSet;

public class Test {

    public static void main(String[] args){

        HashSet<iPad> iPads = new HashSet<>();
        iPad iPad1 = new iPad("Neo" , 2022 , iPad.Version.PRO_MAX, 2);
        iPad iPad2 = new iPad("Neo" , 2022 , iPad.Version.PRO , 2);

        System.out.println(iPad1.equals(iPad2));
        iPads.add(iPad1);
        iPads.add(iPad2);
        System.out.println(iPads.size());

    }

}
