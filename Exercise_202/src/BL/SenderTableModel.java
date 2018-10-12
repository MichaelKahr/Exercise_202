package BL;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        try {
            band = b;
            fireTableStructureChanged();
        } catch (Exception ex) {

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

    public void load(File f) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        
        Sender s;

        try {
            while ((s = (Sender) ois.readObject()) != null) {
                sender.add(s);
            }
        } catch (EOFException eof) {
            System.out.println("EOF Exception");
        }

    }

    public void save(File f) throws IOException {
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(f));

        for (Sender s : sender) {
            ous.writeObject(s);
        }
        ous.flush();
        ous.close();

    }

}
