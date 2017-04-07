package actividad.pkg11;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author elver
 */
public class Actividad11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        inicio();
        iconos();
        ventanaMensaje();
        inputDialog();
        confirmDialog();
        dialogo();
        despedida();       
        System.out.println("FIN");
    }
    public static void ventanaMensaje(){
        JOptionPane.showMessageDialog(null, "Continúe por los diferentes tipos de ventana que existen");
    }
    public static void inputDialog(){
        String entrada = JOptionPane.showInputDialog("Ingrese un numero o texto: ");
        JOptionPane.showMessageDialog(null, "Usted ingresó la siguiente información: "+entrada);
    }
    public static void confirmDialog(){
        int ax = JOptionPane.showConfirmDialog(null, "Es usted humano?");
        if(ax == JOptionPane.YES_OPTION)
            JOptionPane.showMessageDialog(null, "Usted es maravilloso");
        else if(ax == JOptionPane.NO_OPTION)
            JOptionPane.showMessageDialog(null, "Usted es un ser desagradable >:v");
    }
    public static void dialogo(){
        String[] opciones = {"Contento", "Triste", "Melancolico" };
 
        int opcion = JOptionPane.showOptionDialog(
                               null           
                             , "Como te siente hoy?"     
                             , "Opciones Personalizadas"     
                             , JOptionPane.DEFAULT_OPTION   
                             , JOptionPane.INFORMATION_MESSAGE  
                             , null                       
                             , opciones                      
                             , null                             
                           );
 
        JOptionPane.showMessageDialog(null, "Ha escogido "+opciones[opcion]);
    }
    public static void despedida(){
        JOptionPane.showMessageDialog(null, "Hasta luego");
    }
    public static void inicio(){
        JOptionPane.showMessageDialog(null, "Bienvenido a mi ventana, los tipos de iconos para JOptionPane son:");
    }
    public static void iconos(){
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "ERROR_MESSAGE", " MENSAJE DE ERROR ", 
                                        JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(frame, "INFORMATION_MESSAGE", " MENSAJE INFORMATIVO ", 
                                        JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(frame, "PLAIN_MESSAGE", " MENSAJE SENCILLO", 
                                        JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(frame, "QUESTION_MESSAGE", " MENSAJE DE PREGUNTA ", 
                                        JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(frame, "WARNING_MESSAGE", " MENSAJE DE ADVERTENCIA ", 
                                        JOptionPane.WARNING_MESSAGE);
    }
}
