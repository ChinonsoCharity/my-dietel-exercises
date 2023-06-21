package Chapter9;

public class MyList {
    private boolean isEmpty;
    private int capacity = 5;
    private String array[] = null;
    private int size = 0;
    private String items;

    public MyList() {
        this.array = new String[capacity];
    }

    public String[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = new String[capacity];
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void isListEmpty() {
        isEmpty = true;
    }

//    public void add(String items) {
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] == null) {
//                array[i] = items;
//                System.out.println(items + " inserted into list");
//                break;
//            }
//        }

//    }


    public void add(String items) {
        ensureCapacity();
        array[size++] = items;
    }

    public void add(String items, int index) {
        if (index > (size - 1)) {
            System.out.println("index out o bound");
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = items;
        size++;

    }

    public void remove(String items) {
        for (int i = 0; i < size; i++) {
            if (items.equals(array[i])) {
                array[i] = null;
                size--;
            }
        }
    }

    public void remove(int index) {
        for (int i = 0; i < size; i++) {
            if (array[index].equals(array[i])) {
                array[i] = null;
                size--;
            }
        }
    }


    private void ensureCapacity() {
        if (size == capacity) {
            System.out.println("The List is overflowing");
            capacity = capacity * 2;
            System.out.println("Hurruy,New List Capacity is " + capacity);
            String newArray[] = new String[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

//    public String getByIndex(int index) {
//        array[index] = items;
//        return items;
//    }

    public String getByIndex(int index) {
        for (int i = 0; i < size; i++)
            if (index == i)
                 items = array[i];
        return items;


    }
}
