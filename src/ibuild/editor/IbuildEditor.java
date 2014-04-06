/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ibuild.editor;
import ibuild.editor.ConfEditor;
import ibuild.editor.Console.*;
import ibuild.editor.Envirenement.*;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author Stid
 */
public class IbuildEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.invokeLater(new Runnable() {
 
                @Override
                public void run() {
                    //Le code pour lancer ton application
                }
            });
        } catch (Exception ex) {
            //Erreur inconnnue ou de look and feel
        }
        
        ConfEditor conf = new ConfEditor();
        String version = conf.getProperty("version");
        String console = conf.getProperty("console");
        
        System.out.println("Bienvenue sur Ibuild Editor " + version + " Alpha !");
        System.out.println("Tous droits réservés ses créateurs.");
        String os_name = System.getProperty("os.name", "");
        String os_version = System.getProperty("os.version", "");
        System.out.println("Vous avez " + os_name + " " + os_version + ".");
        System.out.println("---------------------------------------");
        Thread.sleep(2000);
        System.out.println("Vérification de la version...");
        LoadVersion Update = new LoadVersion();
        System.out.println("Lancement de l'interface graphique...");
        EnvirenementGlobal EnvirenementMain = new EnvirenementGlobal();
        System.out.println("Lancement de la console DEV...");
        System.out.println("Bienvenue sur Ibuild Editor !");
        System.out.println("---------------------------------------");
        if (console.equals("on")) {
            MainConsole Main = new MainConsole();
        }else{
            System.out.println("- Console de dévellopeur -> Désactivé -");
            System.out.println("---------------------------------------");
        }
    }
    
}
