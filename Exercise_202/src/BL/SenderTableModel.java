package BL;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

public class SenderTableModel extends AbstractTableModel{
    
    private static String[] colNames = {"Sender","Frequenz","Band"};
    private LinkedList<Sender> sender = new LinkedList<>();

    public void add(Sender s){
        sender.add(s);
        fireTableRowsInserted(sender.size()-1, sender.size()-1);
    }
    
    @Override
    public int getRowCount() {
        return sender.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Sender s = (Sender) sender.get(col);
        return s;
    }

}
