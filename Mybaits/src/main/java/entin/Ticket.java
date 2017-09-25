package entin;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ticket {
  private String customerName;
  private String subject;
  private String body;
  private Map<String,Attachment> attachment = new LinkedHashMap<>();
private Object attachments;
public Ticket(String customerName, String subject, String body, Map<String, Attachment> attachment) {
	super();
	this.customerName = customerName;
	this.subject = subject;
	this.body = body;
	this.attachment = attachment;
}
public Ticket() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}
public void setAttachment(Map<String, Attachment> attachment) {
	this.attachment = attachment;
}
public Attachment getAttachment(String name) {
	return this.attachment.get(name);
}
public Collection<Attachment> getAttachments(){
	return this.attachment.values();
}
public void addAttachment(Attachment attachment) {
	this.attachment.put(attachment.getName(), attachment);
	
}
public int getNumberOfAttachment() {
	return this.attachment.size();
}

}
