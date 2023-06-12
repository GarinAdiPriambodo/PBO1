/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author garin
 */
    public class datasetPengembalian {
        private ArrayList<String> idpengembalian;
        private ArrayList<String> LP;
        private ArrayList<String> JB;
        private ArrayList<String> NP;

        public datasetPengembalian () {
        idpengembalian = new ArrayList<>();
        LP             = new ArrayList<>();
        JB             = new ArrayList<>();
        NP             = new ArrayList<>();
    }
        
    public void addIdPengembalian (String value){
        this.idpengembalian.add(value);
}

    public ArrayList<String> getDataIdPengembalian(){
        return this.idpengembalian;
}
    
    public void addLamaPinjam (String value) {
        this.LP.add(value);
    }
    
    public ArrayList<String> getDataLamaPinjam () {
        return this.LP;
    }
    
    public void addJumlahBuku (String value) {
        this.JB.add(value);
    }
    
    public ArrayList<String> getDataJumlahBuku () {
        return this.JB;
    }
    
    public void addNomerPinjam (String value) {
        this.NP.add(value);
    }
    
    public ArrayList<String> getDataNomerPinjam () {
        return this.NP;
    }
    
}

