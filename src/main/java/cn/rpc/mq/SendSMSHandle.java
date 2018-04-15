package cn.rpc.mq;

import java.util.Map;

public class SendSMSHandle {
	
	public SendStatus handleMessage(Map<String, Object> body) {
		System.out.println(body);
		String phone = body.get("phone").toString();
		String content = body.get("content").toString();
		boolean is = SendSMSTool.sendSMS(phone, content);
		SendStatus ss = new SendStatus();
		ss.setPhone(phone);
		ss.setResult(is ? "SUCCESS" : "FAIL");
		return ss;
	}
	
	public String handleMessage(byte[] body) {
		String _body = new String(body);
		System.out.println(_body);
		String[] sms = _body.split(":");
		String phone = sms[0];
		String content = sms[1];
		boolean is = SendSMSTool.sendSMS(phone, content);
		return is ? "SUCCESS" : "FAIL";
	}
}
