package org.EmailTrigger;
public class Email {

	
	private String toMail;
	private String body;
	private String subject;
	private String attachmentPath;
	
	
	public Email() {
		
	}
	
	public Email(String toMail, String body, String subject, String attachmentPath) {
		super();
		this.toMail = toMail;
		this.body = body;
		this.subject = subject;
		this.attachmentPath = attachmentPath;
	}
	public String getToMail() {
		return toMail;
	}
	public void setToMail(String toMail) {
		this.toMail = toMail;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAttachmentPath() {
		return attachmentPath;
	}
	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}
	
	
	
	
}
