package inventory;

import javax.swing.*;

public class Inventory {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Buenas tardes...\nTe saluda Logistics\n " +
                "Sistema para determinar el método de envío de su paquete");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce el peso (kg): "));
        double distancia = Double.parseDouble(JOptionPane.showInputDialog("Introduce la distancia (km): "));
        String tipo_producto = JOptionPane.showInputDialog(null, "Indica si el producto es frágil (S/N): ");
        if (peso > 50 && distancia > 100) {
            JOptionPane.showMessageDialog(null, "El paquete se enviará por transporte pesado");
        } else if (peso < 10 && peso > 0 && distancia < 20) {
            JOptionPane.showMessageDialog(null, "El paquete se enviará por dron");
        } else if (peso < 50 && tipo_producto.equalsIgnoreCase("S")){
            JOptionPane.showMessageDialog(null, "El paquete se enviará por Envío Premium");
        } else if (peso <= 0 || distancia <= 0) {
            JOptionPane.showMessageDialog(null, "El peso o la distancia no puede ser negativo");
        } else if (distancia >= 20 && distancia <= 100 && tipo_producto.equalsIgnoreCase("N")) {
            JOptionPane.showMessageDialog(null, "Envío estándar");
        }else {
            JOptionPane.showMessageDialog(null, "Su producto no puede ser procesado");
        }
    }
}
