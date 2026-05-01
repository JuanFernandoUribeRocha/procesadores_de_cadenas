import javax.swing.*;

public class Menu {
   public static void main(String a[]) {
      
      boolean banderaMenu = true;
      int opcion = 0;
      
      while (banderaMenu) {
         
         try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
               "*** MENÚ PRINCIPAL ***\n\n" +
               "1. Código Morse\n" +
               "2. Latin cerdo\n" +
               "3. Generador de oraciones\n" +
               "4. Finalizar programa\n\n" +
               "Elige una opción:"
            ));
         } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa una opción numérica válida.");
            opcion = 0;
         } catch (NullPointerException e) {
            opcion = 4;
         }
         
         switch (opcion) {
             case 1 :
               Morse Uno = new Morse();
               banderaMenu = Uno.Traducir();
               break;
               
            case 2 :
               Latin Dos = new Latin();
               banderaMenu = Dos.Convertir();
               break;
               
            case 3 :
               Oraciones Tres = new Oraciones();
               banderaMenu = Tres.Generar();
               break;
               
            case 4 :
               JOptionPane.showMessageDialog(null, "Programa finalizado con éxito.");
               banderaMenu = false;
               break;
               
            default :
               JOptionPane.showMessageDialog(null, "Opción inválida.");         }
      }
   }
}