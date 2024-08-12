package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path ="c:\\temp\\text.txt";
		try(
				InputStream is = new FileInputStream(path);
				){
			
			//퍼담을 바가지 설정
//			int BUFFER_SIZE = 1024*8;
			int BUFFER_SIZE = 2;
			byte[] datas = new byte[BUFFER_SIZE];
			
			int result = 0;
			String data="";// 실제 읽은 byte가 누적 
			//바가지로 읽은 바이트를 돌려줌
			//읽을 게 없으면 -1
			//result = is.read(datas);
//			while(result !=-1) {
//				result = is.read(datas);
//				
//				if(result!=-1) {
//				data+=new String(datas,0,result);
//				System.out.println(datas);
//				}
//			}
			while((result = is.read(datas))!=-1) {
				data+=new String(datas,0,result);
				
		
			}
			System.out.println("----------------------");
			System.out.println(data);
		}catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
