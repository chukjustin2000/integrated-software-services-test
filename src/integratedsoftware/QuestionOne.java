package integratedsoftware;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class QuestionOne {

    public static void main(String[] args) {
        int[]integerArray1 = new int[]{1,5,7,4,1,2};
        int[]integerArray2 = new int[]{-1,-3};
        int[]integerArray3 = new int[]{1,2,3};

        int result1 = getTheSmallestNonOccurringInteger(integerArray1);
        int result2 = getTheSmallestNonOccurringInteger(integerArray2);
        int result3 = getTheSmallestNonOccurringInteger(integerArray3);

        System.out.println("Result for Array 1 is " + result1);
        System.out.println("Result for Array 2 is " + result2);
        System.out.println("Result for Array 2 is " + result3);
    }

    private static int getTheSmallestNonOccurringInteger(int[] integerArray) {
        Set<Integer> integerSet = new HashSet<>();

        Arrays.stream(integerArray).filter(i->i > 0).forEach(i -> integerSet.add(i));

        for (int integer = 1; integer <= integerArray.length + 1; integer++) {
            if (!integerSet.contains(integer)) {
                return integer;
            }
        }

        return 0;
    }
}
