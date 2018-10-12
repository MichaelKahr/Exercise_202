package BL;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class SenderTableRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Sender s = (Sender) value;
        JLabel label = new JLabel();
        label.setOpaque(true);
        Color c;
        if(s.getBand().equals("FM")){
            c = Color.red;
        }else{
            c = Color.blue;
        }
        label.setBackground(c);
        switch(column){
            case 0: label.setText(s.getName());break;
            case 1: label.setText(String.format("%.2f",s.getFrequenz()));break;
            case 2: label.setText(s.getBand());break;
        }
        return label;
    }

}
