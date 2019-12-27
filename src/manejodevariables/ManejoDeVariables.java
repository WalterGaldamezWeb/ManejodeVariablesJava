package manejodevariables;
/**
 *
 * @author Walter Galdamez
 */
public class ManejoDeVariables {

    public static void main(String[] args) {
        /*Manejo de Variables en java

        Variables Tipos primitivos

        #### Enteros ###
        -boolean(true o false)(default false)
        -byte(8 bits)(default 0)
        -short(16 bits)(default 0)
        -char(16 bits)(default \u0000)
        -long(64 bits)(default 0)
        -int(32 bits)(default 0)

        ### Flotantes ###
        -float(32 bits)(default 0.0)
        -double(64 bits)(default 0.0)
        */

            //variables boolean, declaracion
            boolean bool1;
            //Inializacion
            bool1=true;
            //Declaracion e Inializacion
            boolean bool2=false;
            System.out.println("Valor boolean1:"+bool1);
            System.out.println("Valor boolean2:"+bool2);
            System.out.println("");

            //Variable byte
            byte b1=10;
            //En hexadecimal
            byte b2=0xa;
            System.out.println("Valor byte1:"+b1);
            System.out.println("Valor byte2:"+b2);
            System.out.println("");

            //Variable short
            short a1=2;
            System.out.println("Valor short:"+a1);
            System.out.println("");

            //Variable tipo char
            char ch1=65,ch2='A';
            System.out.println("Valor char1:"+ch1);
            System.out.println("Valor char2:"+ch2);
            System.out.println("");

            //Variable Enteras
            int decimal=100;
            int octal=0144;
            int hexa=0x64;
            System.out.println("Valor int decimal:"+decimal);
            System.out.println("Valor int octal:"+octal);
            System.out.println("Valor int hexadecimal:"+hexa);
            System.out.println("");

            //Variables flotantes
            float f1=15,f2=22.3f;
            System.out.println("Valor float1:"+f1);
            System.out.println("Valor float2:"+f2);
            System.out.println("");

            //Variables tipo double
            double d1=11.0,d2=30.15d;
            System.out.println("Valor double1:"+d1);
            System.out.println("Valor double2:"+d2);
            System.out.println("");   

    }
    
}
