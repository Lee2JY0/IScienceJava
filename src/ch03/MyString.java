package ch03;

public class MyString {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		String lee = "�̼���";
		String we = name + lee;
		String strage = "23";
		
		System.out.println("�������� �ٹ��� ���� �� ����� : " + name + "," + lee);
		System.out.println("��ü�� ��� : " + we);
		
		int age = Integer.parseInt(strage);
		
		System.out.println("������ ���̴� : " + (age + 1));
	}
}
