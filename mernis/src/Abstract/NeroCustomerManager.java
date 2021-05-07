package Abstract;

import Entity.Customer;

public class NeroCustomerManager extends CustomerManager {

	@Override
	public void Save(Customer customer) {
	System.out.println(customer.firstName+" kaydedildi");
		
	}
}