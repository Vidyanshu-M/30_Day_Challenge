class TestDataEmptyArray {
    public static int[] get_array() {
        return new int[]{};
    }
}

class TestDataUniqueValues {
    public static int[] get_array() {
        return new int[]{7, 4, 9, 2, 5}; 
    }
    public static int get_expected_result() {
        return 3; 
    }
}

class TestDataExactlyTwoDifferentMinimums {
    public static int[] get_array() {
        return new int[]{10, 3, 25, 3, 40};
    }
    public static int get_expected_result() {
        return 1;
    }
}

public class Day_27_Solution1 {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }
    public static void main(String[] args) {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            minimum_index(seq);
            throw new AssertionError("Exception wasn't thrown as expected");
        } catch (IllegalArgumentException e) {

        }
        
        int[] seq2 = TestDataUniqueValues.get_array();
        if (minimum_index(seq2) != TestDataUniqueValues.get_expected_result()) {
            throw new AssertionError("Test 2 Failed");
        }
        int[] seq3 = TestDataExactlyTwoDifferentMinimums.get_array();
        if (minimum_index(seq3) != TestDataExactlyTwoDifferentMinimums.get_expected_result()) {
            throw new AssertionError("Test 3 Failed");
        }
        System.out.println("OK");
    }
}