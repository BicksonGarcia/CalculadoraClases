package org.alanlopez.bean;

public class Multiplicacion {

    // atributos
    private double num1;
    private double num2;
    
    
    //constructor nulo
    public Multiplicacion(){

    }

    //constructor con args.
    public Multiplicacion(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    //Métodos de acceso
        public double getNum1() {
        return num1;
        }
        
        
        
        public void setNum1(double num1) {
        this.num1 = num1;
        }
        
        
        
        public double getNum2() {
        return num2;
        }
        
        
        
        public void setNum2(double num2) {
        this.num2 = num2;
        }
        
        public double Multi(double num1, double num2){
        double result = num1 * num2;
        return result;
        }
}
