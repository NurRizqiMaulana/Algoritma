package Model;

import interfaces.ContohInterfaces;

public class Perhitungan implements ContohInterfaces {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a,int _b,int _hasil){
        this.a=_a;
        this.b=_b;
        _hasil=0;
        this.hasil=_hasil;
        printJudulClass("Print judul dalam Class Perhitunngan");
    }

    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        // TODO Auto-generated method stub
        System.out.println("Judul Dalam Interfaces");
    }

    @Override
    public void HitungTambah() {
        // TODO Auto-generated method stub
        this.hasil=this.a+this.b;
        
    }

    @Override
    public void HitungKali() {
        // TODO Auto-generated method stub
        this.hasil=this.a*this.b;
        
    }
    //Method Return dari hasiltambah dengan parameter
    public int hsltmbh(int a1,int b2){
        this.a = a1;
        this.b = b2;
        HitungTambah();
        return this.hasil;
    }

    //Method return dari hasilkali
    public int hslkli(int _a,int _b){
        this.a = _a;
        this.b = _b;
        HitungKali();
        return this.hasil;
    }
}
