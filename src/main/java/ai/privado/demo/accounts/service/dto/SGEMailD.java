package ai.privado.demo.accounts.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SGEMailD {

	private String emailid;
	private String subject;
	private String msgBody;
	private String voice_recognition;

	public String getEmailid() {
		return emailid;
	}
	public String getVoice() {
		return voice;
	}

	public void setVoice_recognition(String voice) {
		this.voice_recognition = voice_recognition;
	}
	
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}

}
