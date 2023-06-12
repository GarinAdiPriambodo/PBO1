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
public class datasetDenda {
      private ArrayList<String> iddenda;
      private ArrayList<String> idpinjam;
      private ArrayList<String> DL;
      private ArrayList<String> TK;
      private ArrayList<String> ket;
      
     public datasetDenda(){
     iddenda  = new ArrayList<>();
     idpinjam = new ArrayList<>();
     DL       = new ArrayList<>();
     TK       = new ArrayList<>();
     ket      = new ArrayList<>();
     }
     
public void addIdDenda (String value){
    this.iddenda.add(value);
}

public ArrayList<String> getDataIdDenda(){
    return this.iddenda;
}   

public void addIdPinjam (String value){
    this.idpinjam.add(value);
}

public ArrayList<String> getDataIdPinjam(){
    return this.idpinjam;
}

public void addDeadline (String value){
    this.DL.add(value);
}

public ArrayList<String> getDataDeadline(){
    return this.DL;
}

public void addTanggalKembali (String value){
    this.TK.add(value);
}

public ArrayList<String> getDataTanggalKembali(){
    return this.TK;
}

public void addKeterangan (String value){
    this.ket.add(value);
}

public ArrayList<String> getDataKeterangan(){
    return this.ket;
}

}