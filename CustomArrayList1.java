package Arraypack;

public class CustomArrayList1 {


        private static final int DEFAULT_CAPACITY = 10;
        private Object[] elements;
        private int size;

        public CustomArrayList1() {
            this.elements = new Object[DEFAULT_CAPACITY];
            this.size = 0;
        }

        public void add(T element) {
            if (size == elements.length) {
                increaseCapacity();
            }
            elements[size++] = element;
        }

        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            return (T) elements[index];
        }

        public int size() {
            return size;
        }

        private void increaseCapacity() {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    public class CustomArrayListExample {
        public static void main(String[] args) {
            // Create a custom ArrayList of integers
            CustomArrayList<Integer> customList = new CustomArrayList<>();

            // Add elements to the list
            customList.add(1);
            customList.add(2);
            customList.add(3);

            // Get and print elements from the list
            System.out.println("Element at index 0: " + customList.get(0));
            System.out.println("Element at index 1: " + customList.get(1));
            System.out.println("Element at index 2: " + customList.get(2));

            // Print the size of the list
            System.out.println("Size of the list: " + customList.size());
        }
    }

}
