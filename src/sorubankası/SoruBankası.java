
package sorubankası;
import java.util.ListIterator;
import java.util.Scanner;
import java.io.*;



public class SoruBankası extends soru implements dosyadanOkuYaz{
static Scanner sc = new Scanner(System.in);
static kategoriListeleme kl = new kategoriListeleme();
   
    public static void main(String[] args) {
        System.out.println("1-Yeni Soru Ekleme");
    	System.out.println("2-Soru Listele");
    	System.out.println("Lütfen Bir Seçim Yapınız");
    	int secim1 = sc.nextInt();
    	switch (secim1) {
		case 1:{
			SoruBankası se = new SoruBankası();
			se.yeniSoruEkle();
		}
			break;
		case 2: {kl.dosyadanOkuYaz();
			for(int i = 0; i < sorular.size(); i++) {
			System.out.println(i+1+sorular.get(i).kategori);
			}
			System.out.println("Lütfen Bir Kategori Seçiniz");
			int c = sc.nextInt();
			kl.kategoriyeGoreListele(sorular.get(c-1).kategori);
		}
			break;
		case 3:
			break;
		default:System.err.println("Enter integer number between 1-3");
			break;
		}
    }
    public SoruBankası()
    {}
    
    
	public SoruBankası(String kategori, String soru, String cevaplar, String dogruCevap, int puan, int soruZorlugu) {
		super(kategori, soru, cevaplar, dogruCevap,puan,soruZorlugu);
		}

	public  void yeniSoruEkle()
    {	
    	System.out.println("-----------------------------");
		System.out.println("Lutfen Sorunun Kategorisini Seçiniz.");
    	System.out.println("-----------------------------");
    	String kategori = sc.next();
    	System.out.println("-----------------------------");
		System.out.print("Soru Giriniz: ");
    	System.out.println("-----------------------------");
		String soru = sc.next();
    	System.out.println("-----------------------------");    	
		System.out.println("Lutfen Sorunun Tipini Seçiniz.");
		System.out.println("1-) Çoktan Seçmeli");
		System.out.println("2-) Boşluk Doldurma");
		System.out.println("3-) Doğru Yanlış");
		System.out.println("-----------------------------");
		int secim2 = sc.nextInt();
		switch (secim2) {
		case 1:
		{
	    System.out.println("-----------------------------");
	    System.out.println("Lütfen Şıkları Giriniz.");
	    System.out.println("A Şıkkı");
	    String cevaplar = "A-) "+sc.next();
	    System.out.println("B Şıkkı");
	    cevaplar = cevaplar + "B-) "+sc.next();
	    System.out.println("C Şıkkı");
	    cevaplar = cevaplar +"C-) "+sc.next();
	    System.out.println("D Şıkkı");
	    cevaplar = cevaplar + "D-) "+sc.next();	    
	    System.out.println("Lütfen Doğru Şıkkı Giriniz.");
	    String dogruCevap = sc.next();  
	    break;
		}
		case 2:
		{
			String cevaplar ="";
		    System.out.println("-----------------------------");
  		    System.out.println("Lütfen Doğru Cevabı Giriniz.");
		    String dogruCevap = sc.next();  
		    System.out.println("-----------------------------");
		    break;
		}
		case 3:
		{
			String cevaplar ="";
			System.out.println("-----------------------------");
  		    System.out.println("Lütfen Doğru Cevabı Giriniz.");
		    String dogruCevap = sc.next();  
		    System.out.println("-----------------------------");
		    break;
		}}
	    System.out.println("-----------------------------");
	    System.out.println("Lütfen Sorunun Puanını Giriniz.");
	    System.out.println("-----------------------------");
	    int puan = sc.nextInt();  
	    System.out.println("-----------------------------");
	    System.out.println("Lütfen Zorluk Seçiniz.");
	    System.out.println("1-) Kolay");
	    System.out.println("2-) Orta");
	    System.out.println("3-) Zor");
	    System.out.println("-----------------------------");
	    int soruZorlugu = sc.nextInt();

	    SoruBankası yenisoru = new SoruBankası(kategori,soru,cevaplar,dogruCevap,puan,soruZorlugu);
	    sorular.add(yenisoru);
	    
	    

            System.out.println(sorular.get(0).soruZorlugu);

	    dosyayaYaz();
    
    }
    static void dosyayaYaz() {
    	DataOutputStream dos = dosyadanOkuYaz.openDataOutputStream("Sorubankasi2.dat");
    	for(int i = 0; i< sorular.size(); i++){	
    		try{
    			dos.writeInt((sorular.get(i)).soruTipi);
    			dos.writeInt((sorular.get(i)).soruZorlugu);
    			dos.writeUTF((sorular.get(i)).kategori);
    			dos.writeUTF((sorular.get(i)).soru);	
    			dos.writeUTF((sorular.get(i)).cevaplar);
    			dos.writeUTF((sorular.get(i)).dogruCevap);
    			dos.writeDouble((sorular.get(i)).puan);

    		}catch(IOException e){};
    	}
    	dosyadanOkuYaz.closeDataOutputStreamFile(dos);
    	}

    }
    

        
    }
    
}
