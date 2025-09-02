package les32.task4;

import java.util.Comparator;
import java.util.Objects;

public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat firstCat, Cat secondCat) {
        int result = Double.compare(firstCat.getWeight(), secondCat.getWeight());
        if (result == 0) {
            result = firstCat.getColor().compareTo(secondCat.getColor());
        }
    return result;
    }
}
