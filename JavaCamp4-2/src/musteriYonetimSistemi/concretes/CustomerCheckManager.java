package musteriYonetimSistemi.concretes;

import musteriYonetimSistemi.abstarcts.CustomerCheckService;
import musteriYonetimSistemi.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{


	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
