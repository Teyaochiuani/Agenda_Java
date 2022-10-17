package BusquedaYOrdenamiento;

public class SortAndSearch<T extends Comparable> {

    // 1. Busqueda lineal

    public boolean linearSearch(T[] data, int min, int max, T target) {

        int index = min;
        boolean found = false;

        while (!found && index <= max) {

            if (data[index].compareTo(target) == 0) { // 0=igual, -1 =inferior, 1=mayor
                found = true;
            }
            index++;

        }
        return found;

    }

    // Busqueda Binaria

    public boolean binarySearch(T[] data, int min, int max, T target) {

        boolean found = false;

        int midpoint = (min + max) / 2;

        if (data[midpoint].compareTo(target) == 0) {
            found = true;
        } else if (data[midpoint].compareTo(target) > 0) {
            if (min <= midpoint - 1) {
                found = binarySearch(data, min, midpoint - 1, target);

            }

        } else if (midpoint + 1 <= max) {
            found = binarySearch(data, midpoint + 1, max, target);

        }
        return found;

    }

    // ordenamiento por selección
    public void selectionSort(T[] data) {
        int min;
        T temp;

        for (int index = 0; index < data.length - 1; index++) {

            min = index;

            for (int scan = index + 1; scan < data.length; scan++) {
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }
            }

            temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }

    }

    // ordenamiento por inserción
    public void insertSort(T[] data) {

        for (int index = 1; index < data.length; index++) {

            T key = data[index];
            int position = index;

            while (position > 0 && data[position - 1].compareTo(key) > 0) {
                data[position] = data[position - 1];
                position--;
            }
            data[position] = key;
        }

    }

    // Método Burbuuja

    public void bubbleSort(T[] data) {
        int position, scan;
        T temp;

        for (position = data.length - 1; position >= 0; position--) {

            for (scan = 0; scan <= position - 1; scan++)
                if (data[scan].compareTo(data[scan + 1]) > 0) {
                    temp = data[scan];
                    data[scan] = data[scan + 1];
                    data[scan + 1] = temp;
                }

        }

    }

    // ordenación rápida

    public void quicksort(T[] data, int min, int max) {

        int indexiofPartition;

        if (max - min > 0) {

            indexiofPartition = findPartition(data, min, max);
            // izquierda
            quicksort(data, min, indexiofPartition - 1);
            // derecha
            quicksort(data, indexiofPartition + 1, max);

        }
    }// metodo quick

    private int findPartition(T[] data, int min, int max) {

        int left, right;
        T temp, partitionelement;

        partitionelement = data[min];
        left = min;
        right = max;

        while (left < right) {

            while (data[left].compareTo(partitionelement) <= 0 && left < right) {
                left++;
            }
            while (data[right].compareTo(partitionelement) > 0) {
                right--;
            }

            if (left < right) {
                temp = data[left];
                data[left] = data[right];
                data[right] = temp;
            }

        }

        temp = data[min];
        data[min] = data[right];
        data[right] = temp;
        return right;

    }

}
