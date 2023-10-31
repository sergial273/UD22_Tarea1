package UD22_Tarea1.UD22_Tarea1;

import connexion.Connector;
import controllers.Controlador;
import models.Cliente;
import views.Anadir;
import views.MenuInicio;
import views.Quitar;
import views.Ver;

public class App 
{

	
    public static void main( String[] args )
    {
        Cliente c = new Cliente();
        MenuInicio ini = new MenuInicio();
        Anadir a = new Anadir();
        Ver v = new Ver();
        Connector con = new Connector();
        Quitar q = new Quitar();
        Controlador control = new Controlador(ini, c, a, v, con, q);
        control.iniciarVista();
    }
}
