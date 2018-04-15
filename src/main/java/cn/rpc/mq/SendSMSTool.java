package cn.rpc.mq;

import java.util.Random;

public class SendSMSTool {

	public static boolean sendSMS(String phone, String content) {
		System.out.println("发送短信内容【" + content + "】到手机号：" + phone);
		return new Random().nextBoolean();
	}
}
