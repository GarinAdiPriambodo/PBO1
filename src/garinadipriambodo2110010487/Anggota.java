/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garinadipriambodo2110010487;

/**
 *
 * @author garin
 */
public class Anggota {
    private String id, pw, nama, jk, alamat, hp, email;
    
    public Anggota(){}
     public void setIdAnggota(String id){
        this.id=id;
    }
    
    public String getIdAnggota(){
        return this.id;
    }

    public void setPassword(String pw){
        this.pw=pw;
    }
    
    public String getPassword(){
        return this.pw;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return this.nama;
    }

     public void setJenisKelamin(String jk){
        this.jk=jk;
    }
    
    public String getJenisKelamin(){
        return this.jk;
    }
    
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setNoHP(String hp){
        this.hp=hp;
    }
    
    public String getNoHP(){
        return this.hp;
    }
}   
