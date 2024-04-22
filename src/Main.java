public class Main {
    public static void main(String[] args) {

        //TODO: Crear los siguientes pasos para comprobar el funcionamiento del programa 
        // Crear una veterinaria

        Veterinaria vet = new Veterinaria();

        // Crear dos clientes

        Cliente clie1 = new Cliente("Manuel", "Calle Falsa, 123", "12345698");
        Cliente clie2 = new Cliente("Paco", "Calle Falsa, 345", "98765432");

        // Agregar clientes a la veterinaria

        vet.agregarCliente(clie1);
        vet.agregarCliente(clie2);

        // Crear dos animales

        Animal ani1 = new Animal("Patucos", "Gato", "común", clie1);
        Animal ani2 = new Animal("Orejas", "Perro", "Caniche", clie2);


        // Agregar animales a la veterinaria

        vet.agregarAnimal(ani1);
        vet.agregarAnimal(ani2);


        //Crear un veterinario 

        Veterinario veterinario1 = new Veterinario("Manuel", "Gatos");


        // Crear una consulta


        Consulta consulta = new Consulta("22/04/2024", "Dolor barriga", "Diagnostico 1", "mas Whiscas", veterinario1);


        // Asignar la consulta a un animal

        ani1.agregarConsulta(consulta);


        //Imprimir todas las consultas de los animales de la clínica 


        vet.imprimirConsultas();


    }

}