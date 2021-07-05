package musteriYonetimSistemi;

import java.sql.Date;
import java.time.LocalDate;

import musteriYonetimSistemi.abstarcts.BaseCustomerManager;
import musteriYonetimSistemi.adapters.MernisServiceAdapter;
import musteriYonetimSistemi.concretes.NeroCustomerManager;
import musteriYonetimSistemi.concretes.StarbucksCustomerManager;
import musteriYonetimSistemi.entities.Customer;

public class Main {

	

	public static void main(String[] args) {
		
BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
customerManager.Save(new Customer(1,"Fatma","Saðlam",new  Date(2001,6,23),"12345678910"));
	}

}
