package FinalTPBomberosApp.Origenes;


import FinalTPBomberosApp.Vistas.GestionBomberosApp;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        
          GestionBomberosApp miapp=new GestionBomberosApp();
          miapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          miapp.setLocationRelativeTo(null);
          miapp.setVisible(true);
    }
}