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
public class datasetAnggota {
    private ArrayList<String> idAnggota;
    private ArrayList<String> nama;
    private ArrayList<String> jk;
    private ArrayList<String> alamat;
    private ArrayList<String> hp;
    private ArrayList<String> email;
    
        public datasetAnggota () {
            idAnggota = new ArrayList<>();
            nama      = new ArrayList<>();
            jk        = new ArrayList<>();
            alamat    = new ArrayList<>();
            hp        = new ArrayList<>();
            email     = new ArrayList<>();
        }
        
    public void addIdAnggota (String value){
        this.idAnggota.add(value);
    }

    public ArrayList<String> getDataIdAnggota(){
        return this.idAnggota;
    }
    
    public void addNamaAnggota (String value){
        this.nama.add(value);
    }

    public ArrayList<String> getDataNamaAnggota(){
        return this.nama;
    }
    
    public void addJenisKelamin (String value){
        this.jk.add(value);
    }

    public ArrayList<String> getDataJenisKelamin(){
        return this.jk;
    }

    public void addAlamat (String value){
        this.alamat.add(value);
    }

    public ArrayList<String> getDataAlamat(){
        return this.alamat;
    }

    public void addNoHP (String value){
        this.hp.add(value);
    }

    public ArrayList<String> getDataNoHP(){
        return this.hp;
    }
    
    public void addEmail (String value){
        this.email.add(value);
    }

    public ArrayList<String> getDataEmail(){
        return this.email;
    }    
    
}   
