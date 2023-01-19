package question2;

import java.util.ArrayList;
import java.util.List;

public class MusikKontrolChecked {

	public static void main(String[] args) throws MusikKontrolCheckedException {
		
		musikListesiKontrol( "Demir, Mabel Matiz");

	}
	
	public static void musikListesiKontrol(String str) throws MusikKontrolCheckedException {
		
		List <String> musiklist = new ArrayList<> ();
		
		musiklist.add("Demir, Mabel Matiz"); musiklist.add("Ellerin , Melike Şahin"); musiklist.add("Yaz Gülü, irem derici");
		
		
			
			if ((musiklist.contains(str))) {System.out.println(".....Bu müzük listeden çalınıyor ....");}
			
			else {
				throw new MusikKontrolCheckedException ("!!! Bu Müsik Listeden Bulunamadı");
			}
			
	}

}
