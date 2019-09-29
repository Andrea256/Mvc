/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author andreaorjuela
 */
public class Modelo {

    private int numero1;
    private int numero2;
    private int resultadoOperacion;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultadoOperacion() {
        return resultadoOperacion;
    }

    public void setResultadoOperacion(int resultadoOperacion) {
        this.resultadoOperacion = resultadoOperacion;
    }

    public int operacion() {
        this.resultadoOperacion = this.numero1 * this.numero2;
        System.out.println("multiplicacion");
        return this.resultadoOperacion;
    }

    public int operacionSuma() {
        this.resultadoOperacion = this.numero1 + this.numero2;
        System.out.println("suma");
        return this.resultadoOperacion;
    }

    public int operacionResta() {
        this.resultadoOperacion = ((this.numero1) - (this.numero2));
        System.out.println("resta");
        return this.resultadoOperacion;
    }

}
