package testcase;

public class BaseResponse<T> {

	private String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public T getResult() {
		return Result;
	}
	public void setResult(T result) {
		Result = result;
	}
	private T Result;
}
