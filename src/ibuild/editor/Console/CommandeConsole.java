/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ibuild.editor.Console;
import ibuild.editor.CloseEditor;
import ibuild.editor.Console.CommandeConsole;
import ibuild.editor.Envirenement.EnvirenementGlobal;
import java.io.*;
import java.util.*;

/**
 *
 * @author quentin
 */
public class CommandeConsole {
    
    public CommandeConsole() {
    PrintStream out = System.out;
    InputStream in = System.in;
    Scanner scan = new Scanner(in);
    String code, trimedCode, lowerCode;
    do {
        out.print("ConsoleDev> ");
        code = scan.nextLine();
        trimedCode = code.trim();
        lowerCode = trimedCode.toLowerCase();
        if (lowerCode.equals("exit")) {
            CloseEditor Close = new CloseEditor();
        }if (lowerCode.equals("start")) {
            EnvirenementGlobal EnvirenementMain = new EnvirenementGlobal();
            System.out.println("[LOGS] Envirenement de travail lancé.");
        }if (lowerCode.equals("/help")){
            System.out.println("Toutes les commandes :");
            System.out.println(" > exit (pour quitter)");
        }else {
            System.out.println("[ERROR Console] Commande introuvable.");
            System.out.println("[ERROR Console] /help pour plus d'aide.");
        }
       } while(true);
    }
}
