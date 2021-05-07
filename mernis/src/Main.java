import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws RemoteException {
			
		
		
			
			
			KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
			
			boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong("12345678901"), 
					"PETEK MİSLİNA", 
					"AYDIN", 
					2002
					);
		
			System.out.println(" ---------------- MERNİS TC DOĞRULAMA ---------------- ");
			
			System.out.println(" Mernis Tc Doðrulama :  " + (result ? "doğrulandı" : " Hatalı "));
	}

}
