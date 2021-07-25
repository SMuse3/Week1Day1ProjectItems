package day1main;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Explicit Type Casting...");
		
		// WPA for Explicit Type Casting; double-> float-> long -> int -> short -> byte //
		// Coverts data from higher range type to lower range type //
		
		double doubleCastType = 100; 
		float floatCastType = (float)doubleCastType;
		long longCastType = (long)floatCastType;
		int intCastType = (int)longCastType; 
		short shortCastType = (short)intCastType; 
		byte byteCastType = (byte)shortCastType;
			
		
		System.out.println("double type = " + doubleCastType);
		System.out.println("float type = " + floatCastType);
		System.out.println("long type = " + longCastType);
		System.out.println("Integer (int)  type = " + intCastType);
		System.out.println("short type = " + shortCastType);
		System.out.println("byte type = " + byteCastType);
		
		
		
		
		

	}

}
