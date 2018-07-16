package myIO.itheima_06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ���ı��ļ��ж�ȡ���ݵ�ArrayList�����У�����������
 * ÿһ��������Ϊһ���ַ���Ԫ��
 * 
 * ������
 * 		A:�������뻺��������
 * 		B:�������϶���
 * 		C:��ȡ���ݣ�ÿ�ζ�ȡһ�����ݣ��Ѹ���������Ϊһ��Ԫ�ش洢��������
 * 		D:�ͷ���Դ
 * 		E:��������
 */
public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		//�������뻺��������
		BufferedReader br = new  BufferedReader(new FileReader("array.txt"));
		
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//��ȡ���ݣ�ÿ�ζ�ȡһ�����ݣ��Ѹ���������Ϊһ��Ԫ�ش洢��������
		String line;
		while((line=br.readLine())!=null) {
			array.add(line);
		}
		
		//�ͷ���Դ
		br.close();
		
		//��������
		for(int x=0; x<array.size(); x++) {
			String s = array.get(x);
			System.out.println(s);
		}
	}
}
