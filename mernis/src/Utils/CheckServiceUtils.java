package Utils;

import Ýnterfaces.Result;

public class CheckServiceUtils {
	public static Result runCheckServices(Result[] customerCheckServices) {
		for (Result customerCheckService : customerCheckServices) {
			if(!customerCheckService.isSuccess()) {
				return customerCheckService;
			}
		}
		return new Utils.Result(true);
		
	}
}
