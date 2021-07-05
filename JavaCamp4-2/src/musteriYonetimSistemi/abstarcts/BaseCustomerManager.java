package musteriYonetimSistemi.abstarcts;

import musteriYonetimSistemi.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to database: "+customer.FirstName);
		
	}

}
