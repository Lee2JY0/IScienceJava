package ch03;

public class StatisticsCastingTest {
	public static void main(String[] args) {
		double lottoprobability = 0.000001235;
		long population = 6973738433L;
		
		System.out.println("�ζǿ� ��÷�� Ȯ�� : " + lottoprobability);
		int intlottoprobability = (int)lottoprobability;
		System.out.println("�ζǿ� ��÷�� Ȯ�� int�� ��ȯ : " + intlottoprobability);
		
		System.out.println("������ �α� �� : " + population);
		int intpopulation = (int)population;
		System.out.println("������ �α� �� int�� ��ȯ" + intpopulation);
	}
}
