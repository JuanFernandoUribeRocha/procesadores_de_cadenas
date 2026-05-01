import javax.swing.*;

public class Morse {
   public boolean Traducir() {
      
      boolean bandera = true;
      boolean regresarMenu = true;
      int opcion = 0;
      
      String[] letras = {
         "A","B","C","D","E","F","G","H","I","J","K","L","M",
         "N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
         "0","1","2","3","4","5","6","7","8","9"
      };
      
      String[] morse = {
         ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
         "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",
         "-----",".----","..---","...--","....-",".....","-....","--...","---..","----."
      };
      
      while (bandera) {
         
         try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
               "*** CÓDIGO MORSE ***\n\n" +
               "1. Texto a Morse\n" +
               "2. Morse a Texto\n" +
               "3. Regresar al menú principal\n" +
               "4. Finalizar programa\n\n" +
               "Elige una opción:"
            ));
         } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa una opción numérica válida.");
            opcion = 0;
         } catch (NullPointerException e) {
            opcion = 3;
         }
         
         switch (opcion) {
            case 1 :
               String texto = JOptionPane.showInputDialog("Ingresa el texto que deseas convertir a Morse:");
               
               if (texto != null) {
                  texto = texto.toUpperCase().trim();
                  String resultado = "";
                  
                  for (int i = 0; i < texto.length(); i++) {
                     String caracter = String.valueOf(texto.charAt(i));
                     
                     if (caracter.equals(" ")) {
                        resultado = resultado + " / ";
                     } else {
                        boolean encontrado = false;
                        
                        for (int j = 0; j < letras.length; j++) {
                           if (caracter.equals(letras[j])) {
                              resultado = resultado + morse[j] + " ";
                              encontrado = true;
                              break;
                           }
                        }
                        
                        if (!encontrado) {
                           resultado = resultado + "? ";
                        }
                     }
                  }
                  
                  JOptionPane.showMessageDialog(null, "Resultado:\n\n" + resultado);
               }
               
               int opcionFinalUno = Integer.parseInt(JOptionPane.showInputDialog(
                  "¿Qué deseas hacer ahora?\n\n" +
                  "1. Hacer una nueva entrada\n" +
                  "2. Regresar al menú principal\n" +
                  "3. Finalizar programa"
               ));
               
               switch (opcionFinalUno) {
                  case 1 :
                     bandera = true;
                     break;
                  case 2 :
                     bandera = false;
                     regresarMenu = true;
                     break;
                  case 3 :
                     bandera = false;
                     regresarMenu = false;
                     break;
                  default :
                     JOptionPane.showMessageDialog(null, "Opción inválida. Regresando al menú principal.");
                     bandera = false;
                     regresarMenu = true;
               }
               break;
               
            case 2 :
               String codigo = JOptionPane.showInputDialog(
                  "Ingresa el código Morse:\n\n" +
                  "Usa espacios entre letras y / entre palabras."
               );
               
               if (codigo != null) {
                  codigo = codigo.trim();
                  String[] partes = codigo.split(" ");
                  String resultado = "";
                  
                  for (int i = 0; i < partes.length; i++) {
                     if (partes[i].equals("/")) {
                        resultado = resultado + " ";
                     } else {
                        boolean encontrado = false;
                        
                        for (int j = 0; j < morse.length; j++) {
                           if (partes[i].equals(morse[j])) {
                              resultado = resultado + letras[j];
                              encontrado = true;
                              break;
                           }
                        }
                        
                        if (!encontrado) {
                           resultado = resultado + "?";
                        }
                     }
                  }
                  
                  JOptionPane.showMessageDialog(null, "Resultado:\n\n" + resultado);
               }
               
               int opcionFinalDos = Integer.parseInt(JOptionPane.showInputDialog(
                  "¿Qué deseas hacer ahora?\n\n" +
                  "1. Hacer una nueva entrada\n" +
                  "2. Regresar al menú principal\n" +
                  "3. Finalizar programa"
               ));
               
               switch (opcionFinalDos) {
                  case 1 :
                     bandera = true;
                     break;
                  case 2 :
                     bandera = false;
                     regresarMenu = true;
                     break;
                  case 3 :
                     bandera = false;
                     regresarMenu = false;
                     break;
                  default :
                     JOptionPane.showMessageDialog(null, "Opción inválida. Regresando al menú principal.");
                     bandera = false;
                     regresarMenu = true;
               }
               break;
               
            case 3 :
               bandera = false;
               regresarMenu = true;
               break;
               
            case 4 :
               bandera = false;
               regresarMenu = false;
               break;
               
            default :
               JOptionPane.showMessageDialog(null, "Opción inválida.");
         }
      }
      
      return regresarMenu;
   }
}