
package sorubankası;

public class kategoriListeleme extends SoruBankası {
    
    void kategoriyeGoreListele(String kategorial) {
		for (int i = 0; i < sorular.size(); i++) {
			if(sorular.get(i).kategori.contains(kategorial)) {
				System.out.println((i+1)+". Soru: ");
				System.out.println(sorular.get(i).soru);
				System.out.println((i+1)+". Sorunun Zorlugu: ");
				if(sorular.get(i).soruZorlugu ==1) {System.out.println("Kolay");}
				if(sorular.get(i).soruZorlugu ==2) {System.out.println("Orta");}
				if(sorular.get(i).soruZorlugu ==3) {System.out.println("Zor");}
				System.out.println((i+1)+". Sorunun Kategorisi: ");
				System.out.println(sorular.get(i).kategori);		
				System.out.println((i+1)+". Sorunun Cevapları: ");
				System.out.println(sorular.get(i).cevaplar);
				System.out.println((i+1)+". Sorunun Doğru Cevabı: ");
				System.out.println(sorular.get(i).dogruCevap);
				System.out.println((i+1)+". Sorunun Puanı: ");
				System.out.println(sorular.get(i).soruPuani);
			}
			}
  }
    
   
}


