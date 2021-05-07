package Abstract;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import Entity.Customer;
import İnterfaces.CustomerCheckService;
import İnterfaces.Result;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public Result CheckIfRealPerson(Customer customer) {
		
		return new Utils.Result(true);
	}

	@Override
	public Result CheckIfYoungerAgeThan(Customer customer, int age) {

		LocalDate todayDateTime = LocalDate.now();
		LocalDate birthDate = customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int yearDifference = Period.between(birthDate, todayDateTime).getYears();
		if(yearDifference < age) {
		return new Utils.Result(false, age + " yaþýndan küçük olamaz.");
		}
		return new Utils.Result(true);
	}


}
