package io.iprody.lessons.lesson6;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4};
        int[] target = {5, 6, 7};
        target = arrayCopy(sourceArray, target);

        System.out.println();

        int[] sourceArray1 = {1, 2, 3, 4};
        int[] target1 = {5, 6, 7};
        target1 = arrayCopy(sourceArray1, target1);
    }

    public static int[] arrayCopy(int[] source, int[] target) {
        System.out.print("Исходный массив source - ");
        System.out.println(Arrays.toString(source));

        System.out.print("Исходный массив targetArray - ");
        System.out.println(Arrays.toString(target));

        int[] copyTwoArrays = new int[source.length + target.length];
        int indexCopyTwoArrays = 0;

        for (int valueTarget : target) {
            copyTwoArrays[indexCopyTwoArrays] = valueTarget;
            indexCopyTwoArrays++;
        }

        for (int valueSourceArray : source) {
            copyTwoArrays[indexCopyTwoArrays] = valueSourceArray;
            indexCopyTwoArrays++;
        }

        System.out.print("Массив после копирования - ");
        System.out.println(Arrays.toString(copyTwoArrays));
        return copyTwoArrays;
    }

    public static int[] arrayCopyV2(int[] source, int[] target) {
        int[] copyTwoArrays = new int[source.length + target.length];

        System.arraycopy(target, 0, copyTwoArrays, 0, target.length);
        System.arraycopy(source, 0, copyTwoArrays, target.length, source.length);

        System.out.print("Массив после копирования - ");
        System.out.println(Arrays.toString(copyTwoArrays));
        return copyTwoArrays;
    }

}
