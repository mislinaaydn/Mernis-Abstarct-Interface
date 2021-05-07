package Abstract;

import Entity.Customer;
import Utils.CheckServiceUtils;
import Ýnterfaces.CustomerCheckService;
import Ýnterfaces.Result;

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
			System.out.println("Baþarýlý bir þekilde kaydedildi");
			return;
		}else {
			System.out.println("kaydetme baþarýsýz");
		}
		
		super.Save(customer);
	}
	
	
	
}
