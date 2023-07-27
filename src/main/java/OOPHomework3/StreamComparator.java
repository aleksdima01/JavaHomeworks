package OOPHomework3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        int resultOfCompare = o1.getCountGroups().compareTo(o2.getCountGroups());
        if (resultOfCompare == 0) {
            System.out.println("Количество групп в потоках одинаковое!");
        }
        if (resultOfCompare == 1) {
            System.out.println("Количество групп в 1-м потоке больше!");
        }
        if (resultOfCompare == -1) {
            System.out.println("Количество групп во 2-м потоке больше!");
        }
        return resultOfCompare;
    }
}
