package Abstract;

import Entity.Customer;
import Utils.CheckServiceUtils;
import �nterfaces.CustomerCheckService;
import �nterfaces.Result;

public class StarbucksCustomerManager extends CustomerManager  {

	
private CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void Save(Customer customer) {

		Result result =  CheckServiceUtils.runCheckServices(new Result[] {
				customerCheckService.CheckIfRealPerson(customer), 
				customerCheckService.CheckIfYoungerAgeThan(customer, 15)
				});
		
		if(!result.isSuccess()) {
			System.out.println("Ba�ar�l� bir �ekilde kaydedildi");
			return;
		}else {
			System.out.println("kaydetme ba�ar�s�z");
		}
		
		super.Save(customer);
	}
	
	
	
}
