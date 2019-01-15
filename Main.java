public class Main {
 
 
    public static void main(String[] args) {
 
		// 1 Question. //
		
			System.out.println("Hello world?");
		
		// 2 Question. //
			
			System.out.println(isPalindrome("Здоровеньки"));
		
			System.out.println(isPalindrome("шабаш"));
        
		// 3 Question. //
        
			for (int i = 0; i < 100; i++) {
        
            if (isPrime(i))
                System.out.println(i);
        }
    }
	
    public static boolean isPalindrome(String string) {
        
    return new StringBuilder(string).reverse().toString().equals(string);
    }
 
    public static boolean isPrime(final int num) {
        
    return num > 1 && IntStream.range(2, num).noneMatch(index -> num % index == 0);
    }

}
