package musteriYonetimSistemi.concretes;

import musteriYonetimSistemi.abstarcts.BaseCustomerManager;
import musteriYonetimSistemi.abstarcts.CustomerCheckService;
import musteriYonetimSistemi.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
CustomerCheckService customerCheckService ;
public StarbucksCustomerManager(CustomerCheckService customerCheckService)
{this.customerCheckService=customerCheckService;
	}	
@Override
public void Save(Customer customer) {
	
	if(customerCheckService.CheckIfRealPerson(customer))
	{
		super.Save(customer);
	}
	else
	{
		System.out.println("Not a valid person");
	}

}


}
