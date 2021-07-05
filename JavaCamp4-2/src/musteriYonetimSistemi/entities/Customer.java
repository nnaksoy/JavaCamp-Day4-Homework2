package musteriYonetimSistemi.entities;

import java.util.Date;

import musteriYonetimSistemi.abstarcts.Entity;

public class Customer implements Entity {
 public int id;
 public String FirstName;
 public String LastName;
 public Date DateOfBirth;
 public String NationalityId;
public Customer(int id, String firstName, String lastName,Date DateOfBirth,String nationalityId) {
	super();
	this.id = id;
	this.FirstName = firstName;
	this.DateOfBirth=DateOfBirth;
	LastName = lastName;
	
	NationalityId = nationalityId;
}
 
 
}
