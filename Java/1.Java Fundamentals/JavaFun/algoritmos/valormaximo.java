/**
 * valormaximo
 */
public class valorMaximo {
    public static void main(String[] args) {
        int valorMaximo = {1, 3, 5, 2};
        int array2 = valorMaximo[0];
            for (int i = 0; i <valorMaximo.length; i++) 
            {
                if (valorMaximo[i] > array2) 
                {
                    array2 = valorMaximo[i];
                
                }   
                System.out.println(array2);
            }
        }
    }
    

//     public void imprimirValorMaximo(int [1, 3, 5, 2] valorMaximo)
//     {
//         int array2 = valorMaximo[0];
//         for (int i = 0; i <valorMaximo.length; i++) 
//         {
//             if (valorMaximo[i] > array2) 
//             {
//                 array2 = valorMaximo[i];
                
//             }
//             System.out.println(array2);
//         }
        
//     }
// }