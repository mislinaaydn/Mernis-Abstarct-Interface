package Abstract;

import Entity.Customer;
import �nterfaces.ICustomerService;

public class CustomerManager implements ICustomerService{


	@Override
	public void Save(Customer customer) {
		System.out.println(customer.getFirstName() + " Ba�ar�l� bir �ekilde kaydedildi.");
		
	}

}
