/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ibuild.editor;
import java.util.*;
import java.util.Properties;

/**
 *
 * @author quentin
 */
public class ConfEditor {
    Properties FicherConfig;
   public ConfEditor() {
    FicherConfig = new java.util.Properties();
    try {
      FicherConfig.load(this.getClass().getClassLoader().
      getResourceAsStream("./configuration/configuration.cfg"));
    }catch(Exception erreur){
        System.out.println("[ERROR] Configuration : " + erreur);
    }
   }
  
   public String getProperty(String key)
   {
    String value = this.FicherConfig.getProperty(key);
    return value;
   }
}
