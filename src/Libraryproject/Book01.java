package Libraryproject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Book01 {
	public static List<String> kitapAdi= new ArrayList<>();
	public static List<String> yazarAdi= new ArrayList<>();
	public static List<String> yayinYili= new ArrayList<>();
	public static List<Double> fiyat= new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/*1.Bu programda kitaplar, Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat
           gibi bilgiler içerebilmelidir.
           2. Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara
                   vermelidir.
          3. Kullanıcı sisteme Kitap eklemeyebimeli, silebilmeli, arama ve
         tüm kitapları listeleme gibi işlemleri yapabilmelidir.
          4. Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü
         sunulmalıdır ve Kullanıcı programı bitirene kadar işlemlere devam
          edebilmelidir.
          ========= KİTAP PROGRAMI =============
           1: Kitap ekle
           2: Numara ile kitap sil
           3: Numara ile kitap ara
           4: Tüm kitapları listele
           5: Bitti
		 */
		
		int secim;
		
		
		do {
			secim = menuGoster();
		switch ( secim ) {
		case 1:
			System.out.println("1.secim");
			kitapEkle();
		break;
		case 2:kitapSil();
		break;
		case 3:kitapAra();
		break;
		case 4:kitapListele();
		break;
		
		
		default:
			break;
		}}while(secim!=5);
		
		
		
		
		
		
		kitapEkle();
		
		
		
		
		
		
	}
	public static void kitapListele() {
		
		
	}
	public static void kitapAra() {
		// TODO Auto-generated method stub
		
	}
	public static void kitapSil() {
		// TODO Auto-generated method stub
		
	}
	public static int menuGoster() {
	   int secim;
	 
	  
	   do {
		   System.out.println(" ========= KİTAP PROGRAMI =============");
			System.out.println(" 1: Kitap ekle\n 2: Numara ile kitap sil \n 3: Numara ile kitap ara \n 4: Tüm kitapları listele \n 5: Bitti");
			System.out.println("Lutfen 1-5 arasi secim yapınız");
			secim = scan.nextInt();
			if (secim<1 || secim>5) {
				System.out.println("Yanlıs giris  yaptınız Lutfen 1-5 arası deger giriniz");
			}
	} while (secim<1 || secim>5);
	  
	  
	   return secim;
	}
	
	
	public static void kitapEkle() {
		
		
	}
}