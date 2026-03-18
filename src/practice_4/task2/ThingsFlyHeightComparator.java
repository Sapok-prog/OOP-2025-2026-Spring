package practice_4.task2;

import java.util.Comparator;

public class ThingsFlyHeightComparator implements Comparator<FlyableThings> {

    @Override
    public int compare(FlyableThings o1, FlyableThings o2) {
        return -(o1.getFlyHeight() - o2.getFlyHeight());
    }

}
