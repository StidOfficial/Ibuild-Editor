/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ibuild.editor.Console;

import ibuild.editor.*;
import ibuild.editor.Envirenement.EnvirenementGlobal;
import ibuild.editor.Console.CommandeConsole;

/**
 *
 * @author quentin
 */
public class MainConsole {
    
    public MainConsole() {
        System.out.println("-  Console de dévellopeur -> Activé   -");
        System.out.println("---------------------------------------");
        CommandeConsole commande = new CommandeConsole();
    }
    
}
