/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_hashmap;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author sgomezpintos
 */
public class HashClass implements Hash{
    
    HashMap<Integer,String> lista = new HashMap<Integer,String>();

    @Override
    public void putValue(HashMap<Integer, String> lista ) {
        String c=JOptionPane.showInputDialog(null,"Introduce el nombre");
        int d=Integer.parseInt(JOptionPane.showInputDialog(null,"valor de la clave"));
        lista.put(d,c);
    }

    @Override
    public void getValue(HashMap<Integer, String> lista ) {
        int e=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca clave que desea buscar"));
        System.out.println(lista.get(e));
    }

}
