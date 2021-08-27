package casting;


public class Main {


    public static void main(String[] args) {
        
        int numero = 100;
        
        // Conversion implicita de tipo
        long numeroLong = numero;
        
        // Conversion implicita de tipo
        float numeroFloat = numeroLong;
        
        System.out.println("Valor int: " + numero);
        System.out.println("Valor long: " + numeroLong);
        System.out.println("Valor float: " + numeroFloat);
        
        // Conversion explicita
        double numeroDouble = 100.04;
        long numberLong = (long) numeroDouble;
        int numberInt = (int) numberLong;
        
        System.out.println("Valor double: " + numeroDouble);
        System.out.println("Valor long: " + numberLong);
        System.out.println("Valor int: " + numberInt);
        
    }
    
}
