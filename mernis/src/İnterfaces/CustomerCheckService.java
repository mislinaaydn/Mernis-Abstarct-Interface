package İnterfaces;

import Entity.Customer;

public interface CustomerCheckService {
	
	Result CheckIfRealPerson(Customer customer);
	Result CheckIfYoungerAgeThan(Customer customer, int age); 
}
