package org.bickson.system;

import javax.swing.JOptionPane;

import org.alanlopez.bean.Division;
import org.alanlopez.bean.Multiplicacion;
import org.alanlopez.bean.Resta;
import org.alanlopez.bean.Salir;
import org.alanlopez.bean.Suma;

public class Principal {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Programador: Alán López Lucas");
        Menu();
    }

    public static void Menu() {

        int Opcion;        

        JOptionPane.showMessageDialog(null, "Elija una opción");
        Opcion = (Integer.parseInt(JOptionPane.showInputDialog(null, "1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division \n 5. Salir")));
        switch (Opcion) {
            case 1:
                Suma1();
                break;

            case 2:
                Resta1();
                break;

            case 3:
                Multiplicacion();
                break;

            case 4:
                Division();
                break;
        
            default:
                Salir.exit();;
                break;
        }
        
    }

    public static void Suma1(){
        Suma suma = new Suma (0,0);
        suma.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor")));
        suma.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor")));
        JOptionPane.showMessageDialog(null, "La suma es: " + String.valueOf(suma.sumatoria(suma.getNum1(), suma.getNum2())));
    }

    public static void Resta1() {
        Resta resta = new Resta (0,0);
        resta.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor")));
        resta.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor")));
        JOptionPane.showMessageDialog(null, "La suma es: " + String.valueOf(resta.RestaP(resta.getNum1(), resta.getNum2())));
    }

    public static void Multiplicacion() {
        Multiplicacion multiplicacion = new Multiplicacion (0,0);
        multiplicacion.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor")));
        multiplicacion.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor")));
        JOptionPane.showMessageDialog(null, "La suma es: " + String.valueOf(multiplicacion.Multi(multiplicacion.getNum1(), multiplicacion.getNum2())));
    }

    public static void Division() {
        Division division = new Division (0,0);
        division.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor")));
        division.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor")));
        JOptionPane.showMessageDialog(null, "La suma es: " + String.valueOf(division.Div(division.getNum1(), division.getNum2())));
    }
}
