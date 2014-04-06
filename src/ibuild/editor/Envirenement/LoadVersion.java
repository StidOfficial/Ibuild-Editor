/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ibuild.editor.Envirenement;
import ibuild.editor.ConfEditor;
import javax.swing.*;
import java.net.*;
import java.io.*; 

/**
 *
 * @author quentin
 */
public class LoadVersion extends JFrame{
    private JPanel pan = new JPanel();
    private JProgressBar progressbar = new JProgressBar();
    
    public LoadVersion() throws MalformedURLException, IOException {
        ConfEditor conf = new ConfEditor();
        String version_now = conf.getProperty("version");
        this.setTitle("Recherche de mise a jour...");
        this.setSize(400, 100);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        pan.add(progressbar);
        this.setContentPane(pan);
        this.setVisible(true);
        this.getContentPane().setLayout(null);
        progressbar.setIndeterminate(true);
        progressbar.setBounds(11, 20, 375, 20);
        
        URL oracle = new URL("http://localhost/ibuildeditor/version_info");
        URLConnection yc = oracle.openConnection();
        
        System.out.println("[MAJ] Connexion en cours...");
        this.setTitle("Connexion en cours...");
        
        
        try (BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()))) {
            String inputLine;
            String version = in.readLine();
            while ((inputLine = in.readLine()) != null)
                System.out.println("[MAJ] Version récupérer depuis le serveur > " + version);
                this.setTitle("Vérification de la version...");
                if (version.equals(version_now)) {
                    System.out.println("[MAJ] Version " + version + " a jours !");
                    this.setTitle("Logiciel a jours !");
                }else{
                    System.out.println("[MAJ] Une nouvelle version est sortie. [" + version + "]");
                    this.setTitle("En cours de mise a jours...");
                    
                    // Syteme de mise a jours a rajouté quand la version est dépasse.
                }
            System.out.println("[MAJ] Déconnexion");
            
         this.setVisible(false);
        }
    }
}
