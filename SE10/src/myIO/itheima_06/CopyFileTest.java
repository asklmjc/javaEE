package myIO.itheima_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �����ı��ļ�(5�ַ�ʽ)
 * 
 * ����Դ��
 * 		FileWriterDemo.java
 * Ŀ�ĵأ�
 * 		Copy.java
 */
public class CopyFileTest {
	public static void main(String[] args) throws IOException {
		/*
		method1("FileWriterDemo.java","Copy.java");
		method2("FileWriterDemo.java","Copy.java");
		method3("FileWriterDemo.java","Copy.java");
		method4("FileWriterDemo.java","Copy.java");
		method5("FileWriterDemo.java","Copy.java");
		*/
		
		String srcFileName = "FileWriterDemo.java";
		String destFileName = "Copy.java";
		
//		method1(srcFileName,destFileName);
//		method2(srcFileName,destFileName);
		method3(srcFileName,destFileName);
//		method4(srcFileName,destFileName);
//		method5(srcFileName,destFileName);
	}
	
	//������һ�ζ�дһ���ַ���
	public static void method5(String srcFileName,String destFileName) throws IOException {
		//�������뻺��������
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		//�����������������
		BufferedWriter bw = new BufferedWriter(new FileWriter(destFileName));
		
		//һ�ζ�дһ���ַ���
		String line;
		while((line=br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//�ͷ���Դ
		bw.close();
		br.close();
	}
	
	//������һ�ζ�дһ���ַ�����
	public static void method4(String srcFileName,String destFileName) throws IOException {
		//�������뻺��������
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		//�����������������
		BufferedWriter bw = new BufferedWriter(new FileWriter(destFileName));
		
		//һ�ζ�дһ���ַ�����
		char[] chs = new char[1024];
		int len;
		while((len=br.read(chs))!=-1) {
			bw.write(chs,0,len);
		}
		
		//�ͷ���Դ
		bw.close();
		br.close();
	}
	
	//������һ�ζ�дһ���ַ�
	public static void method3(String srcFileName,String destFileName) throws IOException {
		//�������뻺��������
		BufferedReader br = new BufferedReader(new FileReader(srcFileName));
		//�����������������
		BufferedWriter bw = new BufferedWriter(new FileWriter(destFileName));
		
		//һ�ζ�дһ���ַ�
		int ch;
		while((ch=br.read())!=-1) {
			bw.write(ch);
		}
		
		//�ͷ���Դ
		bw.close();
		br.close();
	}
	
	//������һ�ζ�дһ���ַ�����
	public static void method2(String srcFileName,String destFileName) throws IOException {
		//��������������
		FileReader fr = new FileReader(srcFileName);
		//�������������
		FileWriter fw = new FileWriter(destFileName);
		
		//һ�ζ�дһ���ַ�����
		char[] chs = new char[1024];
		int len;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs,0,len);
		}
		
		//�ͷ���Դ
		fw.close();
		fr.close();
	}
	
	//������һ�ζ�дһ���ַ�
	public static void method1(String srcFileName,String destFileName) throws IOException {
		//��������������
		FileReader fr = new FileReader(srcFileName);
		//�������������
		FileWriter fw = new FileWriter(destFileName);
		
		//һ�ζ�дһ���ַ�
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		
		//�ͷ���Դ
		fw.close();
		fr.close();
	}
}
