
//Problem Statement:
/*For given three arrays, write a Java program to print the common elements in the arrays*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class findCommonElementsArray {
    public static void main(String[] args) {
        // Given arrays
        Integer[] a = { 1, 2, 3, 4, 5, 6 };
        Integer[] b = { 1, 2, 3, 4, 5, 6 };
        Integer[] c = { 1, 3, 4, 0 };
        // Find the smallest array
        ArrayList list = new ArrayList<>();
        list.add(a.length);
        list.add(b.length);
        list.add(c.length);
        Collections.sort(list);
        int smallestSize = (int) list.get(0);

        // Sort all the arrays
        ArrayList aL = new ArrayList<>(Arrays.asList(a));
        ArrayList bL = new ArrayList<>(Arrays.asList(b));
        ArrayList cL = new ArrayList<>(Arrays.asList(c));
        Collections.sort(aL);
        Collections.sort(bL);
        Collections.sort(cL);

        // Find the common elements
        ArrayList commonElements = new ArrayList<>();
        for (int i = 0; i < smallestSize; i++) {
            if (a.length == smallestSize) {
                if (bL.contains(a[i]) && cL.contains(a[i])) {
                    commonElements.add(a[i]);
                }
            }
            if (b.length == smallestSize) {
                if (aL.contains(b[i]) && cL.contains(b[i])) {
                    commonElements.add(b[i]);
                }
            }
            if (c.length == smallestSize) {
                if (bL.contains(c[i]) && aL.contains(c[i])) {
                    commonElements.add(c[i]);
                }
            }
        }
        // Print the common elements
        System.out.println(commonElements);

    }
}