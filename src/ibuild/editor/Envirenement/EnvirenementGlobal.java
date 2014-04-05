/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ibuild.editor.Envirenement;
import ibuild.editor.CloseEditor;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author quentin
 */
public class EnvirenementGlobal extends JFrame{
    
    private JMenuBar menuBar = new JMenuBar();
    private JMenu Fichier = new JMenu("Fichier");
    private JMenu Edition = new JMenu("Edition");
    private JMenu Affichage = new JMenu("Affichage");
    private JMenu Outils = new JMenu("Outils");
    private JMenu Aide = new JMenu("Aide");

    private JMenuItem NProjet = new JMenuItem("Nouveau projet");
    private JMenuItem OProjet = new JMenuItem("Ouvrir un projet");
    private JMenuItem NFichier = new JMenuItem("Nouveau fichier");
    private JMenuItem OFichier = new JMenuItem("Ouvrir un fichier");
    private JMenuItem FProjet = new JMenuItem("Fermer un projet");
    private JMenuItem FAProjet = new JMenuItem("Fermer tous les projets");
    private JMenuItem IProjet = new JMenuItem("Importer un projet");
    private JMenuItem EProjet = new JMenuItem("Exporter un projet");
    private JMenuItem Quitter = new JMenuItem("Quitter");
    
    private JMenuItem Retour = new JMenuItem("Retour");
    private JMenuItem Precedent = new JMenuItem("Precedent");
    private JMenuItem Copier = new JMenuItem("Copier");
    private JMenuItem Coller = new JMenuItem("Coller");
    
    static void add(JTabbedPane tabbedPane, String label) {
    JButton button = new JButton(label);
    tabbedPane.addTab(label, button);
    }
    
    public EnvirenementGlobal() {
        
        JTabbedPane tabbedpane = new JTabbedPane();
        
        this.setUndecorated(false);
        this.getContentPane().setBackground(Color.white);
        this.setTitle("Ibuild Editor - Accueil [Alpha 0.1]");
        this.setSize(800, 800);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        
        this.menuBar.add(Fichier);
        this.menuBar.add(Edition);
        this.menuBar.add(Affichage);
        this.menuBar.add(Outils);
        this.menuBar.add(Aide);
        
        this.Fichier.add(NProjet);
        this.Fichier.add(OProjet);
        this.Fichier.addSeparator();
        this.Fichier.add(NFichier);
        this.Fichier.add(OFichier);
        this.Fichier.addSeparator();
        this.Fichier.add(FProjet);
        this.Fichier.add(FAProjet);
        this.Fichier.addSeparator();
        this.Fichier.add(IProjet);
        this.Fichier.add(EProjet);
        this.Fichier.addSeparator();
        this.Fichier.add(Quitter);
        
        this.Edition.add(Retour);
        this.Edition.add(Precedent);
        this.Edition.addSeparator();
        this.Edition.add(Copier);
        this.Edition.add(Coller);
        
        this.setJMenuBar(menuBar);
        
        Quitter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
              CloseEditor Close = new CloseEditor();
            }        
        });
        
        NFichier.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
              tabbedpane.addTab("Nouveau Fichier", new JEditorPane());
            }        
        });

        tabbedpane.addTab("Page de démarrage", new JLabel("En cours de construction.."));

        tabbedpane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        getContentPane().add(tabbedpane, BorderLayout.CENTER);
    }
}
