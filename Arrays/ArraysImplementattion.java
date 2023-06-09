package Arrays;

/**
 * arrays
 */
class arrays {
    int[] arr = null;

    public arrays(int size) {
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int number) {
        try {
            if (arr[index] == Integer.MIN_VALUE) {
                arr[index] = number;
                System.out.println("Sucessffully Inserted");
            } else {
                System.out.println("Sucessffully Not Inserted");
            }
        } catch (Exception e) {

        }
    }

    public void Traversal() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ", ");
        }
    }

    public void Search(int element) {
        for (int i = 0; i < arr.length; i++) {
            try {
                if (arr[i] == element) {
                    System.out.println("Element is found at index : " + i);
                } else {
                    System.out.println("Element is not found");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        }
    }

    public void delete(int ValueToBeDeleted) {
        try {
            arr[ValueToBeDeleted] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

public class ArraysImplementattion {
    public static void main(String[] args) {
        arrays arrays = new arrays(0);
        arrays.insert(0, 1);
        arrays.insert(1, 2);
        arrays.insert(2, 3);
    }
}
