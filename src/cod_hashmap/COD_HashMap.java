/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_hashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sgomezpintos
 */
public class COD_HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList();
        HashMap<Integer, String> lista = new HashMap<Integer, String>();
        HashClass obx = new HashClass();
        InterfaceList obxx = new InterfaceList();

        obx.putValue(lista);
        obx.getValue(lista);

        obxx.putElement(al);
        obxx.getElement(al);
    }

}
