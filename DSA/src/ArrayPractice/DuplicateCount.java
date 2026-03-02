package ArrayPractice;

public class DuplicateCount {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3};
        int n = a.length;
        int duplicateCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == -1)
                continue;
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    isDuplicate = true;
                    a[j] = -1;
                }
            }
            if (isDuplicate)
                duplicateCount++;
        }
        System.out.println("duplicate count: " + duplicateCount);
        System.out.print("array without duplicates: ");
        for (int i = 0; i < n; i++) {
            if (a[i] != -1)
                System.out.print(a[i] + " ");
        }
    }
}
