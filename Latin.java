import javax.swing.*;

public class Latin {
   public boolean Convertir() {
      
      boolean bandera = true;
      boolean regresarMenu = true;
      int opcionFinal = 0;
      
      while (bandera) {
         
         String palabra = JOptionPane.showInputDialog("Ingresa una sola palabra:");
         
         if (palabra != null) {
            palabra = palabra.toUpperCase().trim();
            
            if (palabra.contains(" ")) {
               JOptionPane.showMessageDialog(null, "Solo puedes ingresar una palabra, no oraciones.");
            } else if (palabra.length() > 0) {
               String ultimaLetra = palabra.substring(palabra.length() - 1);
               String restoPalabra = palabra.substring(0, palabra.length() - 1);
               String resultado = ultimaLetra + restoPalabra + "AE";
               
               JOptionPane.showMessageDialog(null, "Resultado:\n\n" + resultado);
            }
         }
         
         opcionFinal = Integer.parseInt(JOptionPane.showInputDialog(
            "¿Qué deseas hacer ahora?\n\n" +
            "1. Hacer una nueva entrada\n" +
            "2. Regresar al menú principal\n" +
            "3. Finalizar programa"
         ));
         
         switch (opcionFinal) {
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
      }
      
      return regresarMenu;
   }
}