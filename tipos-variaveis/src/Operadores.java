public class Operadores {
    
    public static void main(String[] args) {
        String nomeUm = "Cesar";
        String nomeDois = new String("Cesar") ;
            System.out.println(nomeUm.equals(nomeDois) );
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
                if (numero1 > numero2){
                    System.out.println("e falso");
                }
            System.out.println("numeroUM e igual a numeroDois " + simNao); 
            simNao = numero1 != numero2;
            System.out.println("numeroUm e igual a numeroDois? " + simNao); 
            simNao = numero1 > numero2;
                System.out.println("numeroUm e maior que numeroDois? " + simNao);
        }
}
