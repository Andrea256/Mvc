
import Controlador.Controlador;
import Modelo.Modelo;
import Vista.PaginaPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andreaorjuela
 */
public class Main {
    
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        PaginaPrincipal pagina = new PaginaPrincipal();
        Controlador controlador = new Controlador(modelo, pagina);
        
        controlador.inicioPagina();
        pagina.setVisible(true);
        
    }
    
}
