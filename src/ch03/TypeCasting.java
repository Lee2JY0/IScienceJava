package ch03;

public class TypeCasting {
	public static void main(String[] args) {
		long billwealth = 7000000000L;
		
		System.out.println("Original value : " + billwealth);
		
		double doublebBillwealth = billwealth;
		System.out.println("double 형으로 형변환 : " + doublebBillwealth);
		
		int intBillwealth = (int)billwealth;
		System.out.println("int형으로 형변환 : " + intBillwealth);
	}
}
