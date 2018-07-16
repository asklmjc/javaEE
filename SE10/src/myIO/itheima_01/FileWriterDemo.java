package myIO.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �������ļ���д����
 * 		д����--�����--FileWriter
 * 
 * FileWriter:
 * 		FileWriter(String fileName):����һ���ļ�����
 * 
 * �����д���ݵĲ��裺
 * 		A:�������������
 * 		B:��������������д���ݵķ���
 * 		C:�ͷ���Դ
 */
public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		//�������������
		FileWriter fw = new FileWriter("D:\\workspace-javaSE\\SE10\\src\\myIO\\cc.txt");
		/*
		 * �������������������Щ����:
		 * 		A:����ϵͳ��Դ������һ���ļ�
		 * 		B:�������������
		 * 		C:�����������ָ���ļ�
		 */
		
		//��������������д���ݵķ���
		//дһ���ַ�������
		fw.write("IO�����");
		//����û��ֱ��д���ļ�����ʵ��д�����ڴ滺����
		fw.flush();
		
		//�ͷ���Դ
		//֪ͨϵͳ�ͷź͸��ļ���ص���Դ
		fw.close();
		
		//while(true) {}
	}
}
