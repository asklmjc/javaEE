package myIO.itheima_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ����
 * 		����Ŀ·���µ�FileWriterDemo.java�е����ݸ��Ƶ���Ŀ·���µ�Copy.java��
 * 
 * ����Դ��
 * 		FileWriterDemo.java -- ������ -- FileReader -- ��Ч�Ķ����� -- BufferedReader
 * Ŀ�ĵأ�
 * 		Copy.java -- д���� -- FileWriter -- ��Ч��д���� -- BufferedWriter
 */
public class CopyFileDemo {
	public static void main(String[] args) throws IOException {
		//�������뻺��������
		BufferedReader br = new BufferedReader(new FileReader("FileWriterDemo.java"));
		//�����������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.java"));
		
		//��д����
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//�ͷ���Դ
		bw.close();
		br.close();
	}
}
