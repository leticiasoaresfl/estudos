public class Area {

    public static int calculaArea(int lado, int altura) {
       return lado * altura;

   }
    public static int calculaArea(int lado) {
       return lado * lado;

   }
   public static void main(String[] args) {

       System.out.println(Area.calculaArea(2, 3)); // Área do retângulo

       System.out.println(Area.calculaArea(2));    // Área do quadrado

   }

}


