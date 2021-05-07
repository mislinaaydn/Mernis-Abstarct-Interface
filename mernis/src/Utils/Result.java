package Utils;

public class Result implements Ýnterfaces.Result{

	@Override
	public boolean isSuccess() {
		// TODO Auto-generated method stub
		return success;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success = success;
	}
	
	public Result(Boolean success, String message) {
		this(success);
		this.message = message;
}
}