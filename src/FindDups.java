import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class FindDups {

    public static HashMap<Integer, Integer> findDupsInSortedList(List<Integer> values) {

        HashMap<Integer, Integer> result = new HashMap<>();

        for (Integer i :
                values) {
            if (!result.containsValue(i)) {
                result.put(i, 1);
            }
        }
        return result;

    }


    public static LinkedList<Integer> findDupsFromSortedLinkedlist(LinkedList<Integer> values) {

        if (values.size() == 0 || values.size() == 1) {
            return values;
        } else {
            for (int i = 0; i < values.size(); i++) {
                if(values.size()!=i+1){
                if (values.get(i) == values.get(i + 1)) {
                    values.remove(i);
                }}

            }
        }

        return values;

    }

    public static void main(String[] args) {
        Integer[] values = {1, 1, 2, 3, 4, 5, 5, 6};
        List question = Arrays.asList(values);
        HashMap<Integer, Integer> result = findDupsInSortedList(question);
        System.out.println(result);

        LinkedList question1 = new LinkedList();
        question1.add(1);
        question1.add(1);
        question1.add(2);
        question1.add(3);
        question1.add(4);
        question1.add(5);
        question1.add(6);
        LinkedList<Integer> result1 = findDupsFromSortedLinkedlist(question1);
        System.out.println(result1);

    }
}
