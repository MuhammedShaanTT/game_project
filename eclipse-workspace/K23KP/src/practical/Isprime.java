package practical;

public class Isprime {
	String primetest(int n) {
		for(int i=2;i<n;i++) {
			if(n%1==0) {
				return "not prime";
			}
		}
		return "prime";
	}
}
