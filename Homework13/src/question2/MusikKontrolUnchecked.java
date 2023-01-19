package question2;

import java.util.ArrayList;
import java.util.List;

public class MusikKontrolUnchecked {

	
		
		public static void main(String[] args)  {
			
			try {
				musikListesiKontrol( "Demir, Mbel Matiz");
			} catch (MusikKontrolUncheckedException e) {
				
				e.printStackTrace();
			}

		}
		
		public static void musikListesiKontrol(String str) throws MusikKontrolUncheckedException {
			
			List <String> musiklist = new ArrayList<> ();
			
			musiklist.add("Demir, Mabel Matiz"); musiklist.add("Ellerin , Melike Şahin"); musiklist.add("Yaz Gülü, irem derici");
			
			
				
				if ((musiklist.contains(str))) {System.out.println(".....Bu müzük listeden çalınıyor ....");}
				
				else {
					throw new MusikKontrolUncheckedException ("!!! Bu Müsik Listeden Bulunamadı");
				}
				
		}


	}


