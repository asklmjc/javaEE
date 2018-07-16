package myIO.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �����д���ݵĲ��裺
 * 		A:�������������
 * 		B:��������������д���ݷ�������ˢ�»�����
 * 		C:�ͷ���Դ
 * 
 * ���·������Ե�ǰ��Ŀ���Եģ�����Ŀ�ĸ�Ŀ¼��(a.txt)
 * ����·�������̷���ʼ��·��(d:\\a.txt)
 * 
 * close()��flush()����������
 * 		flush():ˢ�»������������󻹿��Լ���ʹ�á�
 * 		close():��ˢ�»�������Ȼ��֪ͨϵͳ�ͷ���Դ�������󲻿����ٱ�ʹ���ˡ�
 */
public class FileWriterDemo2 {
	public static void main(String[] args) throws IOException {
		//�������������
		//FileWriter fw = new FileWriter("d:\\a.txt");
		FileWriter fw = new FileWriter("a.txt");
		
		//��������������д���ݷ�������ˢ�»�����
		fw.write("helloworld");
		fw.flush();
		fw.write("java");
		fw.flush();
		
		//�ͷ���Դ
		fw.close();
		
		//Stream closed
		//fw.write("javaee");
		//fw.flush();
	}
}
