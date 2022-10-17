package BusquedaYOrdenamiento;

public class Main {
    // Busqueda Lineal
    public static void main(String[] args) throws Exception {

        Integer[] numeros = { 2, 5, 8, 6, 4, 3, 0, 9 };
        SortAndSearch<Integer> s = new SortAndSearch<>();

        System.out.println(s.linearSearch(numeros, 0, 7, 100));

        String[] nombres = { "juan", "maria", "paco", "luis" };
        SortAndSearch<String> sn = new SortAndSearch<>();
        System.out.println(sn.linearSearch(nombres, 0, 3, "yedid"));

        // Busqueda binaria

        Integer[] numeros2 = { 2, 5, 8, 16, 24, 31, 40, 49, 65, 78, 122 };
        System.out.println(s.binarySearch(numeros2, 0, numeros2.length - 1, 1000));

        // Ordenamiento por seleccion
        System.out.println("Ordenamiento x selección");
        s.selectionSort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Ordenacion por insercion
        System.out.println("Ordenamiento x inserción");
        s.insertSort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Ordenacion por burbuja
        System.out.println("Ordenamiento x Burbuja");
        s.bubbleSort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // ordedenacion rapida
        System.out.println("Ordenamiento Rapida");
        s.quicksort(numeros, 0, 7);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
