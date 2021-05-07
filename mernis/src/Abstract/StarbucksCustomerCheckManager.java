package Abstract;

import Entity.Customer;
import Ýnterfaces.RealPersonService;
import Ýnterfaces.Result;

public class StarbucksCustomerCheckManager  extends CustomerCheckManager {
private RealPersonService realPersonService;
	
	public StarbucksCustomerCheckManager(RealPersonService realPersonService){
		this.realPersonService = realPersonService;
	}
	
	@Override
	public Result CheckIfRealPerson(Customer customer) {
		
		return realPersonService.CheckIfRealPerson(customer);
	}
}