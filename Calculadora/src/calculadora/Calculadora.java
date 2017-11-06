/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author matias.martinez
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 3){
            try {
                int op1 = Integer.parseInt(args[1]);
                int op2 = Integer.parseInt(args[2]);

                System.out.println(op1 + op2);
            }catch(Exception ex){
                System.out.println("Parametros incorrectos");
            }
        }else{
             System.out.println("Uso: Calculadora operador operando1 operando2");
        }
    }
    
}
