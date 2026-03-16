package password;
import javax.swing.*;


public class ValidatePassword {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Ingrese la contraseña:");

        int numeros = 0;
        int mayusculas = 0;

        for (int i = 0; i < password.length(); i++) {

            char c = password.charAt(i);

            if (c >= '0' && c <= '9') {
                numeros++;
            }

            if (c >= 'A' && c <= 'Z') {
                mayusculas++;
            }
        }
        if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Tu contraseña es insegura");
        } else if (numeros > 0 && mayusculas > 0) {
            JOptionPane.showMessageDialog(null, "Tu contraseña es fuerte");
        } else if (numeros > 0) {
            JOptionPane.showMessageDialog(null, "Tu contraseña es moderada");
        } else {
            JOptionPane.showMessageDialog(null, "Tu contraseña es insegura");
        }
    }
}
