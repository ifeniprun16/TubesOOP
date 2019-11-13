package RFR_M6_EKKY_1202184072_SI4206;

import java.util.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ekky
 */
public class TableMahasiswa extends AbstractTableModel{

    List<DataMahasiswa> ls = new ArrayList<DataMahasiswa>();
    private String TABLE_HEADER[];

    public TableMahasiswa(List<DataMahasiswa> ls) {
        this.TABLE_HEADER = new String []{"No","Nama","Kelas","Jurusan","Fakultas"};
        this.ls = ls;
    }
    public void addMahasiswa(DataMahasiswa dataMahasiswa){
        ls.add(dataMahasiswa);
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
    }
    public void deleteMahasiswa(int posisi){
        ls.remove(posisi);
        fireTableRowsDeleted(posisi,posisi);
    }
    public DataMahasiswa dataMahasiwa(int posisi){
        return ls.get(posisi);
    }
    
    @Override
    public int getRowCount() {
    return ls.size();
    }
    @Override
    public int getColumnCount(){
        return TABLE_HEADER.length;
    }
    
    public String getColimnName(int column){
        return TABLE_HEADER[column];
    }
    @Override
    public Object getValueAt(int rowIndex,int columnIndex){
        DataMahasiswa dataMahasiswa = ls.get(rowIndex);
        switch(columnIndex){
            case 0 : return dataMahasiswa.getPosisi()+1;
            case 1 : return dataMahasiswa.getNama();
            case 2 : return dataMahasiswa.getKelas();
            case 3 : return dataMahasiswa.getJurusan();
            case 4 : return dataMahasiswa.getFakultas();
            default : return null;
        }
    }
}

