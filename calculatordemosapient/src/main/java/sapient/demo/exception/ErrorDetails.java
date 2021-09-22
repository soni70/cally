package sapient.demo.exception;

import java.sql.Date;

public class ErrorDetails {
	private Date timestamp;
	private String path;

	public ErrorDetails(String details, String message, String path) {

		this.path = path;
		this.message = message;
		this.details = details;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	private String message;
	public String details;
}
