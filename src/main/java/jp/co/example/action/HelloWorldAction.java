package jp.co.example.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public static final String MESSAGE = "HelloWorld (･ω･)b";

	public String execute() throws Exception {
		setMessage(MESSAGE);
		return SUCCESS;
	}

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
