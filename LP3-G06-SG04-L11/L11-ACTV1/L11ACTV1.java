package com.mycompany.l11.actv1;

public class L11ACTV1{
    public static void main(String[] args) {
        
        // Arreglo de Personas
        Persona[] personas = {new Persona("John", "Address1", "123456789"),
                              new Persona("Alice", "Address2", "987654321")};
        Contenedora<Persona> contenedorPersonas = new Verificadora<>(personas);

        System.out.println(contenedorPersonas.contiene(new Persona("John", "", ""))); // Imprime "SI tiene John"
        System.out.println(contenedorPersonas.contiene(new Persona("Bob", "", "")));  // Imprime "NO tiene Bob"
        
        // Arreglo de Goodies
        Goodies[] goodies = {new Goodies(1, "Item1", 10.0f),
                            new Goodies(2, "Item2", 20.0f)};
        Contenedora<Goodies> contenedorGoodies = new Verificadora<>(goodies);

        System.out.println(contenedorGoodies.contiene(new Goodies(1, "", 0.0f)));   // Imprime "SI tiene 1"
        System.out.println(contenedorGoodies.contiene(new Goodies(3, "", 0.0f)));   // Imprime "NO tiene 3"
        
        // Arreglo de Estudiantes
        Estudiante[] estudiantes = {new Estudiante("Bob", "", "", "CS", new Procedencia("Dept1", "Prov1")),
                                   new Estudiante("Alice", "", "", "Math", new Procedencia("Dept2", "Prov2"))};
        Contenedora<Estudiante> contenedorEstudiantes = new Verificadora<>(estudiantes);

        System.out.println(contenedorEstudiantes.contiene(new Estudiante("Alice", "", "", "", null))); // Imprime "SI tiene Alice"
        System.out.println(contenedorEstudiantes.contiene(new Estudiante("John", "", "", "", null)));  // Imprime "NO tiene John"
        
    }
}
