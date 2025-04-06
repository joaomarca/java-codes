public class BinarySearch {
    public static void main(String[] args) {

        int[] lista = {1, 3, 5, 7, 9, 11};

        int index = binarySearch(lista, 9);

        if (index == -1) {
            System.out.println("Item não encontrado!");
        }

        System.out.println(index);
    }

    public static int binarySearch(int[] list, int target) {

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            int guess = list[middle];
            if (target == guess) {
                return middle;
            } else if (target > guess) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}
