package principal;
public class Principal {
    public static void main(String[] args) {
        Perro Fido; 
        Perro Pelusa;
        
        Fido = new Perro("chihuhua",4,"marron",5.3,37.5);
        Pelusa = new Perro("pequines",6,"blanco",6.7,39.0);
        
        Fido.IncreEdad(2);
        Pelusa.IncreEdad(5);
        
        System.out.println(Fido);
        System.out.println(Pelusa);
        
        Diagnostico Pasiente = new Diagnostico();
        //Pasiente.AptoVacunaA(Fido);
        Pasiente.AptoVacunaB(Fido.getEdad(),Fido.peso, Fido.getTemp());
    }
}
