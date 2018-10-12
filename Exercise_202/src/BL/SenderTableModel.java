package BL;

import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

public class SenderTableModel extends AbstractTableModel {

    private static String[] colNames = {"Sender", "Frequenz", "Band"};
    private static String[] colNames2 = {"Sender", "Frequenz"};
    private boolean band = true;
    private LinkedList<Sender> sender = new LinkedList<>();

    public void add(Sender s) {
        sender.add(s);
        fireTableRowsInserted(sender.size() - 1, sender.size() - 1);
    }

    @Override
    public int getRowCount() {
        return sender.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    public void setBand(boolean b) {
        try{
        band = b;
        fireTableStructureChanged();
        }catch(Exception ex){
            
        }
    }

    @Override
    public String getColumnName(int i) {
        if (band) {
            return colNames[i];
        } else {
            return colNames2[i];
        }
    }

    @Override
    public Object getValueAt(int row, int col) {
        Sender s = (Sender) sender.get(row);
        return s;
    }

}
