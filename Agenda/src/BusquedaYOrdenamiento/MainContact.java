package BusquedaYOrdenamiento;

public class MainContact {

    public static void main(String[] args) throws Exception {

        Contact[] friends = new Contact[7];

        friends[0] = new Contact("Sergio", "Mendez", "238393939");
        friends[1] = new Contact("Juan", "Lopez", "238123456");
        friends[2] = new Contact("Ivan", "Valencia", "239152626");
        friends[3] = new Contact("Rocio", "Martinez", "238159595");
        friends[4] = new Contact("Pedro", "Martinez", "238154848");
        friends[5] = new Contact("Diana", "Ortiz", "238585858");
        friends[6] = new Contact("Luis", "Perez", "238987456");
        friends[7] = new Contact("Rodolfo", "Mendez", "238393939");
        friends[8] = new Contact("Neri", "Mendez", "238393939");
        friends[9] = new Contact("Cristian", "Mendez", "238393939");
        friends[10] = new Contact("Paola", "Mendez", "238393939");
        friends[11] = new Contact("Mariana", "Mendez", "238393939");
        friends[12] = new Contact("Rocio", "Mendez", "238393939");
        friends[13] = new Contact("Samanta", "Mendez", "238393939");
        friends[14] = new Contact("Edgar", "Sanchez", "238393939");
        friends[15] = new Contact("Marcos", "Hernandez", "238393939");
        friends[16] = new Contact("Jhonatan", "Sanchez", "238393939");


        SortAndSearch<Contact> lista = new SortAndSearch<>();

        // ordenar lista
        // lista.selectionSort(friends);
        lista.bubbleSort(friends);

        for (int index = 0; index < friends.length; index++) {
            System.out.println(friends[index]);
        }

        System.out.println(lista.linearSearch(friends, 0, 6,
                new Contact("Yedid", "Curioca", "1")));

    }
}
