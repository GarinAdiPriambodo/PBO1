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
public class datasetPeminjaman {
    private ArrayList<String> idpinjam;
    private ArrayList<String> TP;
    private ArrayList<String> JB;
    private ArrayList<String> idB;
    private ArrayList<String> idA;

        public datasetPeminjaman(){
        idpinjam = new ArrayList<>();
        TP       = new ArrayList<>();
        JB       = new ArrayList<>();
        idB      = new ArrayList<>();
        idA      = new ArrayList<>();
        }
         
public void addIdPinjam (String value){
    this.idpinjam.add(value);
}

public ArrayList<String> getDataIdPinjam(){
    return this.idpinjam;
}

public void addTanggalPinjam (String value){
    this.TP.add(value);
}

public ArrayList<String> getDataTanggalPinjam(){
    return this.TP;
}

public void addJumlahBuku (String value){
    this.JB.add(value);
}

public ArrayList<String> getDataJumlahBuku(){
    return this.JB;
}

public void addIdBuku (String value){
    this.idB.add(value);
}

public ArrayList<String> getDataIdBuku(){
    return this.idB;
}

public void addIdAnggota (String value){
    this.idA.add(value);
}

public ArrayList<String> getDataIdAnggota(){
    return this.idA;
}

}