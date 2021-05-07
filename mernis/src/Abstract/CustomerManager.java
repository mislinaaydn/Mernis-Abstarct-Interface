package Abstract;

import Entity.Customer;
import Ýnterfaces.ICustomerService;

public class CustomerManager implements ICustomerService{


	@Override
	public void Save(Customer customer) {
		System.out.println(customer.getFirstName() + " Baþarýlý bir þekilde kaydedildi.");
		
	}

}
