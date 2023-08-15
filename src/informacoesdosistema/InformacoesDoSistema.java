/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package informacoesdosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.awt.Toolkit.getDefaultToolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author anderson.akira
 */
public class InformacoesDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Date relogio = new Date();
        System.out.print("A data e horario:");
        System.out.println(relogio.toString());
     
        Locale loc = Locale.getDefault();
        System.out.print("A linguagem do sistema :");
        System.out.println(loc.getDisplayLanguage());
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolucao do seu sistema:"+ d.width +"X"+ d.height);
    }
    
}
