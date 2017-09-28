/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Alumno
 */
public class Calculadora {
    float num1=0,num2=0,res=0;
    /**
     * Constructor para los 2 numeros
     * @param Num1
     * @param Num2 
     */
    public Calculadora(float Num1,float Num2) {
        num1=Num1;
        num2=Num2;
    }
    /**
     * Metodo para obetener el resultado de la operación escrita
     * <ul>
     * <li>"Suma"</li>
     * <li>"Resta"</li>
     * <li>"Multiplicación"</li>
     * <li>"División"</li>
     * </ul>
     * @param op 
     */
    public void Calcular(String op){
        if(op.equals("Suma")){
            res=num1+num2;
        }else if(op.equals("Resta")){
            res=num1-num2;
        }else if(op.equals("Multiplicación")){
            res=num1*num2;
        }else if(op.equals("División")){
            res=num1/num2;
        }
    }
    /**
     * Obtiene el resultado
     * @return 
     */
    public float getRes() {
        return res;
    }
    
}
