import javax.swing.JOptionPane;
import BusquedaYOrdenamiento.*;

public class App {
    public static void main(String[] args) throws Exception {
        String opcion = JOptionPane.showInputDialog(null, "Seleccione una opcion de busqueda: \n1. Sin orden \n2. Ordenación por selección \n3. Ordenación por inserción \n4. Ordenación por método burbuja \n5. Búsqueda lineal \n6. Búsqueda binaria \n7. Salir del Programa", "Seleccionar Opcion", 0);
        int number = Integer.parseInt(opcion);
        Integer[] numeros = { 2, 5, 8, 6, 4, 3, 0, 9 };
        SortAndSearch<Integer> s = new SortAndSearch<>();

        while(number == 7){
            if(number == 1){

            } if(number == 2){
                System.out.println("Ordenamiento x selección");
                s.selectionSort(numeros);
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }

            } if(number == 3){
                System.out.println("Ordenamiento x inserción");
                s.insertSort(numeros);
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }

            } if(number == 4) {
                System.out.println("Ordenamiento x Burbuja");
                s.bubbleSort(numeros);
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println(numeros[i]);
                }

            } if (number == 5) {
                System.out.println(s.linearSearch(numeros, 0, 7, 100));

            } if (number == 6) {
                Integer[] numeros2 = { 2, 5, 8, 16, 24, 31, 40, 49, 65, 78, 122 };
                System.out.println(s.binarySearch(numeros2, 0, numeros2.length - 1, 1000));        
            }
        }
    }
}
