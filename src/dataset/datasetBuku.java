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
   public class datasetBuku {
    private ArrayList<String> idbuku;
    private ArrayList<String> judul;
    private ArrayList<String> penulis;
    private ArrayList<String> kategori;
    
    
     public datasetBuku () {
        idbuku   = new ArrayList<>();
        judul    = new ArrayList<>();
        penulis  = new ArrayList<>();
        kategori = new ArrayList<>();
    
     }

public void addIdBuku (String value){
    this.idbuku.add(value);
}

public ArrayList<String> getDataIdBuku(){
    return this.idbuku;
}

public void addJudul (String value){
    this.judul.add(value);
}

public ArrayList<String> getDataJudul(){
    return this.judul;
}

public void addPenulis (String value){
    this.penulis.add(value);
}

public ArrayList<String> getDataPenulis(){
    return this.penulis;
}

public void addKategori (String value){
    this.kategori.add(value);
}

public ArrayList<String> getDataKategori(){
    return this.kategori;
}
    
} 
