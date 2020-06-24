package ch03;

public class StatisticsCastingTest {
	public static void main(String[] args) {
		double lottoprobability = 0.000001235;
		long population = 6973738433L;
		
		System.out.println("로또에 당첨될 확률 : " + lottoprobability);
		int intlottoprobability = (int)lottoprobability;
		System.out.println("로또에 당첨될 확률 int형 변환 : " + intlottoprobability);
		
		System.out.println("전세계 인구 수 : " + population);
		int intpopulation = (int)population;
		System.out.println("전세계 인구 수 int형 변환" + intpopulation);
	}
}
