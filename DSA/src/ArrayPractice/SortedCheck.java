package ArrayPractice;

public class SortedCheck {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        boolean sorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                sorted = false;
                break;
            }
        }
        if(sorted) {
        	System.out.println("sorted");
        } else {
        	System.out.println("not sorted");
        }
    }
}
