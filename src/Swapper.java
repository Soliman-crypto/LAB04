public class Swapper {

    public static <T> void swapElements(T[] array, int index1, int index2) {

    if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
        throw new IllegalArgumentException("error");
    }

    T temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
}


}

