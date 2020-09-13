
package sorubankası;



import java.io.*;
public interface dosyadanOkuYaz {
	public static DataInputStream openDataInputStream(String filename){
		File dosya =  new File(filename);
		   DataInputStream input = null;
	       try{
	           input = new DataInputStream(new FileInputStream(dosya));
	       }catch(IOException e){
	           System.err.println("Dosya Adı Geçersiz");
	       }
	       
	       return input;
	   } 
	   
	   public static DataOutputStream openDataOutputStream(String filename){
		   File dosya =  new File(filename);
		   DataOutputStream output = null;
	       try{

	           output = new DataOutputStream(new FileOutputStream(dosya));
	       }catch(IOException e){
	           System.err.println("Dosya Adı Geçersiz");
	       }
	       
	       return output;
	   } 
	   
	   public static BufferedInputStream openBufferedInputStream(String filename){
		   BufferedInputStream input = null;
	       
	       try{

	           input = new BufferedInputStream(new FileInputStream(filename));
	       }catch(IOException e){
	           System.err.println("Dosya Adı Geçersiz");
	       }
	       
	       return input;
	   } 
	   
	   public static void closeDataOutputStreamFile(DataOutputStream file){
	       try{
	           file.close();
	       }catch(IOException e){System.err.println("Dosya Kapatılamadı");}
	  }
	   public static void closeDataInputStreamFile(DataInputStream file){
	       try{
	           file.close();
	       }catch(IOException e){System.err.println("Dosya Kapatılamadı");}
	  }

}

