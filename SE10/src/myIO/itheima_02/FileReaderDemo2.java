package myIO.itheima_02;

import java.io.FileReader;
import java.io.IOException;

/*
 * �����������ݵĲ��裺
 * 		A:��������������
 * 		B:��������������Ķ����ݷ���
 * 		C:�ͷ���Դ
 */
public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		//��������������
		//FileReader fr = new FileReader("fr2.txt");
		FileReader fr = new FileReader("FileWriterDemo.java");
		
		/*
		//��������������Ķ����ݷ���
		//int read(char[] cbuf)��һ�ζ�ȡһ���ַ���������ݣ����ص���ʵ�ʶ�ȡ���ַ�����
		char[] chs = new char[5];
		
		//��һ�ζ�����
		int len = fr.read(chs);
		System.out.println("len:"+len);
		//System.out.println(new String(chs));
		System.out.println(new String(chs,0,len));
		
		//�ڶ��ζ�����
		len = fr.read(chs);
		System.out.println("len:"+len);
		//System.out.println(new String(chs));
		System.out.println(new String(chs,0,len));
		
		//�����ζ�����
		len = fr.read(chs);
		System.out.println("len:"+len);
		System.out.println(new String(chs,0,len));
		
		//���Ƿ��ֶ�ȡ����ķ�ʽ���ƶȺܸߣ�����ѭ���Ľ������ǲ�֪��ʲôʱ�����ѭ��
		len = fr.read(chs);
		System.out.println("len:"+len);
		len = fr.read(chs);
		System.out.println("len:"+len);
		//ͨ�����ԣ�����֪�������ʵ�ʶ�ȡ������-1��ʱ��˵��û��������
		 * 
		 */
		
		//char[] chs = new char[5];
		char[] chs = new char[1024]; //���������1024����������
		int len;
		//1:fr.read(chs)
		//2:len=fr.read(chs)
		//3:len != -1
		while((len=fr.read(chs))!=-1) {
			//System.out.println(new String(chs,0,len));
			System.out.print(new String(chs,0,len));
		}
		
		//�ͷ���Դ
		fr.close();
	}
}
