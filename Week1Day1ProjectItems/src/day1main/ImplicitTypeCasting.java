package day1main;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Implicit Type Casting...");
		
		// WPA for Implicit Type Casting; byte-> short-> int -> long -> float -> double //
		// Coverts data from lower range type to higher range type //
		
		byte byteCastType = 100;
		short shortCastType = byteCastType; 
		int intCastType = shortCastType; 
		long longCastType = intCastType;
		float floatCastType = longCastType; 
		double doubleCastType = floatCastType; 
		
		
		System.out.println("byte type = " + byteCastType);
		System.out.println("short type = " + shortCastType);
		System.out.println("Integer (int)  type = " + intCastType);
		System.out.println("long type = " + longCastType);
		System.out.println("float type = " + floatCastType);
		System.out.println("double type = " + doubleCastType);

	}

}
