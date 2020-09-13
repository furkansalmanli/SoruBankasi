

package sorubankası;

import java.util.*;

public abstract class soru {
protected String cevaplar;
protected String kategori;
protected String dogruCevap;
protected String soru;

protected int puan;
protected int soruTipi;
protected int soruPuani;
protected int soruZorlugu;
static Vector<soru> sorular = new Vector<soru>();
public soru() {
	super();
	
}
public soru(String kategori, String soru, String cevaplar, String dogruCevap, int puan, int soruZorlugu) {
	super();
	this.kategori = kategori;
	this.soru = soru;
	this.cevaplar = cevaplar;
	this.dogruCevap = dogruCevap;
	this.puan=puan;
	this.soruZorlugu = soruZorlugu;
}
public int getSoruTipi() {
	return soruTipi;
}

public void setSoruTipi(int soruTipi) {
	this.soruTipi = soruTipi;
}
public String getDogruCevap() {
	return dogruCevap;
}

public void setDogruCevap(String dogruCevap) {
	this.dogruCevap = dogruCevap;
}
public int getPuan() {	
	return soruPuani;
}

public void setPuan(int soruPuani) {
	this.soruPuani = soruPuani;
}
public int getSoruZorlugu() {
	return soruZorlugu;
}

public void setSoruZorlugu(int soruZorlugu) {
	this.soruZorlugu = soruZorlugu;
}
}


