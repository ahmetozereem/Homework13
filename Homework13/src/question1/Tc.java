package question1;

import java.util.Scanner;

public class Tc {
	
	String tc;

	public Tc() {
		super();
	}

	public Tc(String tc) {
		super();
		this.tc = tc;
	}
	
	public void tcSorgula () {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("TC Kimlik numarasını 11 rakam olarak giriniz");
		
		String tcgir=scan.nextLine();
		
		String str2 [] = tcgir.split("");
		
		
		
		  for (String string : str2) {
		  
		  if (!Character.isDigit(string.charAt(0))) {
		  
		  throw new
		  IllegalArgumentException("Hatalı giriş, TC numaralardan oluşmalıdır");
		  
		  }
		  
		  }
		 
		try {
			
			 if (str2.length!=11) {
				 
				 throw new IllegalArgumentException("Girilen TC 11 rakamdan oluşmalıdır");
				
			 }
			 					 
			 else {
				 
				 try {
						
						if (Integer.parseInt(str2[10])%2==0) {
							System.out.println("Girilen TC: "+tcgir);
						}
						
						else {
							 throw new IllegalArgumentException("TC nin son rakamı çift sayi olmalidir");
						}
						
						
					}catch (IllegalArgumentException  e) {
						e.printStackTrace();
				}
			 }
				
			}catch (IllegalArgumentException  e) {
				e.printStackTrace();
			}
		
		finally {
			
			scan.close();
			
			System.out.println("---Scanner finally içinde Kapatıldı---");
		}
		}
		
		
	}


