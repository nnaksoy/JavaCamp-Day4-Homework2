package musteriYonetimSistemi.adapters;

import java.rmi.RemoteException;

import musteriYonetimSistemi.abstarcts.CustomerCheckService;
import musteriYonetimSistemi.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	KPSPublicSoapProxy client =new KPSPublicSoapProxy();
	try {
		return client.TCKimlikNoDogrula(Long.parseLong(customer.NationalityId),customer.FirstName.toUpperCase(), customer.LastName.toUpperCase(), customer.DateOfBirth.getYear());
	} catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
		
	}

}
