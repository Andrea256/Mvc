/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import Vista.PaginaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author andreaorjuela
 */
public class Controlador implements ActionListener {

    Modelo modelo;
    PaginaPrincipal vista;

    public Controlador(Modelo modelo, PaginaPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.B_operacion.addActionListener(this);
        this.vista.B_suma.addActionListener(this);
        this.vista.B_resta.addActionListener(this);
    }

    public void inicioPagina() {

        vista.setTitle("Modelo MVC");
        vista.setLocationRelativeTo(null);

    }

    public void actionPerformed(ActionEvent e) {

        /*
        modelo.setNumero1(Integer.parseInt(vista.TF_numero1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.TF_numero2.getText())); 
        System.out.println("Entra al controlador");
        modelo.operacion();
        modelo.operacionSuma();
        
        vista.TF_Resultado.setText(String.valueOf(modelo.getResultadoOperacion()));
        vista.TF_suma.setText(String.valueOf(modelo.getResultadoSuma()));*/
        int i = 0;

        if (e.getSource() == vista.B_suma) {
            i = 1;
        } else if (e.getSource() == vista.B_operacion) {
            i = 2;
        } else if (e.getSource() == vista.B_resta) {
            i = 3;
        }

        switch (i) {

            case 1:
                suma();
                break;
            case 2:
                operacion();
                break;
            case 3:
                resta();
                break;

        }
    }

    public void suma() {
        modelo.setNumero1(Integer.parseInt(vista.TF_numero1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.TF_numero2.getText()));

        modelo.operacionSuma();
        vista.TF_Resultado.setText(String.valueOf(modelo.getResultadoOperacion()));

    }

    public void operacion() {
        modelo.setNumero1(Integer.parseInt(vista.TF_numero1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.TF_numero2.getText()));

        modelo.operacion();
        vista.TF_Resultado.setText(String.valueOf(modelo.getResultadoOperacion()));

    }

    public void resta() {
        modelo.setNumero1(Integer.parseInt(vista.TF_numero1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.TF_numero2.getText()));

        modelo.operacionResta();
        vista.TF_Resultado.setText(String.valueOf(modelo.getResultadoOperacion()));

    }

}
