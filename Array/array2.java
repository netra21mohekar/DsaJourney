public class array2 {

    int[] evenArray(int[] array2) {
        int n = array2.length;
        int count = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 != 0) {
                count++;
            }
        }

        int[] array5 = new int[count];
        int index = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 != 0) {
                array5[index] = array2[i];
                index++;
            }
        }
        return array5;
    }

    public static void main(String[] args) {
        array2 m = new array2();
        int[] k = m.evenArray(new int[] {3, 4, 7, 10, 2, 6, 5});

        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i] + " ");
        }

    }
}

