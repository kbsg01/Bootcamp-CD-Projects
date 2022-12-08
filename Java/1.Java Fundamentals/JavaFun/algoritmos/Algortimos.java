public class Algortimos {
    public static void main(String[] args) {
        multiplicar(3, 5, 7);
    }
    public static void multiplicar(int num1, int num2, int num3) {
         int total = 0;
         for (int i = 0; i< num2; i++){
            total += num1;
         }
         
         int total2 = 0;
         //15

         for(int i = 0; i < num3; i ++){
            total2 += total;
         }

         System.out.println(total2);
    }
}
