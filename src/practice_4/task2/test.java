package practice_4.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] main){

        Plane MAX737  = new Plane("737 MAX" , 2022 , "Boeing" , 1003 , 12496);
        Plane MAX829 = new Plane("829 MAX" , 2024 , "Boeing" , 1003, 16496);
        Plane A380 = new Plane("A380" , 2023 , "Airbus" , 1090 , 17689);

        List<FlyableThings> planes = Arrays.asList(MAX737 , MAX829 , A380);

        Bird Amigos = new Bird("Amigos" , 25 , "Parrot" , 60 , 2000);
        Bird Luis = new Bird("Luis" , 14 , "Eagle" , 45 , 3000);

        List<FlyableThings> birds = Arrays.asList(Amigos ,Luis);


        List<FlyableThings> planesAndBirds = Arrays.asList(MAX737 , MAX829 , A380 , Amigos , Luis);

        //sorting
        Collections.sort(planes , new ThingsFlyHeightComparator());
        for (FlyableThings flyableThing : planes){
            System.out.println(flyableThing);
        }

        System.out.println();
        System.out.println();

        Collections.sort(birds , new ThingsSpeedComparator());
        for (FlyableThings flyableThing : birds){
            System.out.println(flyableThing);
        }

        System.out.println();
        System.out.println();

        Collections.sort(planesAndBirds , new ThingsSpeedComparator().thenComparing(new ThingsFlyHeightComparator()));
        for (FlyableThings flyableThing : planesAndBirds){
            System.out.println(flyableThing);
        }

    }
}
