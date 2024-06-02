package greeen.utils;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.io.File;

public class ImageRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        if (value != null) {
            String imagePath = (String) value;
            ImageIcon imageIcon = new ImageIcon(imagePath);
            Image image = imageIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(image));
        }
        return label;
    }
}

