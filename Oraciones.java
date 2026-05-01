import javax.swing.*;
import java.util.Random;

public class Oraciones {
   public boolean Generar() {
      
      boolean bandera = true;
      boolean regresarMenu = true;
      int opcionFinal = 0;
      Random random = new Random();
      
      String[] sujetos = {
         "El perro",
         "La maestra",
         "Mi amigo",
         "El alumno",
         "La computadora"
      };
      
      String[] verbos = {
         "corre",
         "estudia",
         "programa",
         "lee",
         "escribe"
      };
      
      String[] predicados = {
         "en la escuela",
         "todos los días",
         "muy rápido",
         "con mucha emoción",
         "en la tarde"
      };
      
      while (bandera) {
         
         int posicionSujeto = random.nextInt(sujetos.length);
         int posicionVerbo = random.nextInt(verbos.length);
         int posicionPredicado = random.nextInt(predicados.length);
         
         String oracion = sujetos[posicionSujeto] + " " + verbos[posicionVerbo] + " " + predicados[posicionPredicado] + ".";
         
         JOptionPane.showMessageDialog(null, "Oración generada:\n\n" + oracion);
         
         opcionFinal = Integer.parseInt(JOptionPane.showInputDialog(
            "¿Qué deseas hacer ahora?\n\n" +
            "1. Generar otra oración\n" +
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