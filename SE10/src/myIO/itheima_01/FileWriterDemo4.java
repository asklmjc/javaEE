package myIO.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ���ʵ�����ݵĻ���?
 * 		\n����ʵ�ֻ��У�����windowsϵͳ�Դ��ļ��±��򿪲�û�л��У�����Ϊʲô��?��Ϊwindowsʶ��Ļ��в���\n������\r\n
 * 		windows:\r\n
 * 		linux:\n
 * 		mac:\r
 * ���ʵ�����ݵ�׷��д��?
 * 		FileWriter(String fileName, boolean append)
 */
public class FileWriterDemo4 {
	public static void main(String[] args) throws IOException {
		//�������������
		//FileWriter fw = new FileWriter("c.txt");
		FileWriter fw = new FileWriter("c.txt",true); //��ʾ׷��д�룬Ĭ����false
		
		for(int x=0; x<10; x++) {
			fw.write("hello"+x);
			fw.write("\r\n");
		}
		
		//�ͷ���Դ
		fw.close();
	}
}
