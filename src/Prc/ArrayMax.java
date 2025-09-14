package Prc;

public class ArrayMax {
    public static void main(String[] args) {

        int a[] = {2, 133, 34, 7300};


        for (int i = 0; i < a.length; i++) {

            for(int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }

            }

        }

        for (int z = 0; z<a.length; z++){

            System.out.print(a[z] + ",");
        }


    }
}