/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ibuild.editor.Envirenement;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author quentin
 */
public class NewProject extends JFrame{
    
    public NewProject() {
        this.setUndecorated(false);
        this.getContentPane().setBackground(Color.white);
        this.setTitle("Ibuild Editor - Nouveau Projet");
        this.setSize(500, 600);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setResizable(false);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);
    }
}
