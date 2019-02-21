/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_hashmap;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sgomezpintos
 */
public class InterfaceList implements ClassList{
 public  ArrayList<String> al= new ArrayList();

    @Override
    public void putElement(ArrayList<String> al) {
        String a=JOptionPane.showInputDialog(null,"Introduce el nombre");
       al.add(a);
    }

    @Override
    public void getElement(ArrayList<String> al) {
        int b=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce posicion a buscar"));
        System.out.println(al.get(b));
    }
    
}
