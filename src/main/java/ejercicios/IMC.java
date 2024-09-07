
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {

    public static String evaluar(int peso, double estatura, int edad) {
        double imc = (peso) / (double)(Math.pow(estatura, 2));
        if (edad <= 44) {
            if (imc < 22.0) {
                return "bajo";
            } if (imc > 22.0) {
                return "medio";
            } }if(edad > 44){
            if(imc<22.0){
                    return "medio";
                }if(imc>22.0){
                    return "alto";
                }
            }
        return null;
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();
        
        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
