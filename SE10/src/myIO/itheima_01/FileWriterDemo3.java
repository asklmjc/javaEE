package myIO.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * void write(String str):дһ���ַ�������
 * void write(String str,int index,int len):дһ���ַ����е�һ��������
 * void write(int ch):дһ���ַ�����,����дint���͵ĺô��Ǽȿ���дchar���͵����ݣ�Ҳ����дchar��Ӧ��int���͵�ֵ��'a',97
 * void write(char[] chs):дһ���ַ���������
 * void write(char[] chs,int index,int len):дһ���ַ������һ��������
 */
public class FileWriterDemo3 {
	public static void main(String[] args) throws IOException {
		//�������������
		FileWriter fw = new FileWriter("b.txt");
		
		//void write(String str):дһ���ַ�������
		//fw.write("abcde");
		
		//void write(String str,int index,int len):дһ���ַ����е�һ��������
		//fw.write("abcde",0,5);
		//fw.write("abcde",1,3);
		
		//void write(int ch):дһ���ַ�����,����дint���͵ĺô��Ǽȿ���дchar���͵����ݣ�Ҳ����дchar��Ӧ��int���͵�ֵ��'a',97
		//fw.write('a');
		//fw.write(97);
		
		//void write(char[] chs):дһ���ַ���������
		char[] chs = {'a','b','c','d','e'};
		//fw.write(chs);
		
		//void write(char[] chs,int index,int len):дһ���ַ������һ��������
		//fw.write(chs,0,5);
		fw.write(chs,2,3);
		
		//�ͷ���Դ
		fw.close();
	}
}
