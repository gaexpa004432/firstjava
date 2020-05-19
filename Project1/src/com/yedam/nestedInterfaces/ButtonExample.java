package com.yedam.nestedInterfaces;

import com.yedam.nestedInterfaces.Button.OnClickListener;

class CallListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("turn on");
	}
	
}
class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("메세지 왔어요");
	}
	
}
public class ButtonExample {

	public static void main(String[] args) {
		Button b = new Button();
		b.setOnClickListener(new MessageListener());
		b.touch();
		b.setOnClickListener(new CallListener());
		b.touch();
	}

}
