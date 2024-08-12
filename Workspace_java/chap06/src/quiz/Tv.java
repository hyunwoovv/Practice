package quiz;

import java.util.Scanner;

public class Tv {
//전원
//	볼륨 up/down 0~10
//	>> 볼륨의 범위를 벗어나지 못하게 해주세요
//	채널 up/down/직접입력
//	정보보기 : 현재 전원상태, 볼륨, 채널 정보 출력
	boolean now = false;

	int remocon;

	int loud = 0;
	int channel=1;

	void powerOff() {
		System.out.println("전원이 꺼졌당.");
		now = false;
		return;
	}

	void powerOn() {
		System.out.println("전원이 켜졌당");
		if (now == true) {
			System.out.println("전원이 이미 켜져있습니다.");
		}
		now = true;
		if (now == false) {
			System.out.println("전원을 켜주세요.");
		}
		return;
	}

	void 볼륨up() {
		if (now==true&&loud<10) {
			System.out.println("현재 볼륨은"+ ++loud +"입니다.");
			
		} else if(loud==10&&now==true){
			System.out.println("볼륨의 최대치 입니다.");
		}else {System.out.println("전원이 켜져있지 않습니다.");}
		}
	void 볼륨down() {
		if(now==true&&loud>0) {
			--loud;
			System.out.println("현재 볼륨은"+loud+"입니다.");
			
		}
		else if(loud==0&&now==true){
		System.out.println("볼륨이 최소치 입니다");
			
		}else {
			System.out.println("전원이 켜져있지 않습니다.");
		}
	}
void 채널up() {
	if(now==true&&channel>0) {
		System.out.println("현재 채널은 "+channel+"번 입니다.");
		++channel;
	}else{
		System.out.println("전원이 켜져있지 않습니다.");
	}
}
void 채널down() {
	if(now==true&&channel>0) {
		System.out.println("현재 채널은 "+channel+"번 입니다.");
		--channel;
	}else if(now==true&&channel<=0) {
		System.out.println("존재하지 않는 채널입니다.");
	}else {
		System.out.println("전원이 켜져있지 않습니다.");
	}
}
void 현재정보() {
	if(now == true) {
		System.out.println(" 전원 : ON "+" 채널 : "+ channel+" 볼륨 : " + loud);
	}
}
}
