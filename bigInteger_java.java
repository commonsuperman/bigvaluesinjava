import java.util.*;
import java.math.BigInteger; 
public class Main{ 
Scanner scan = new Scanner(System.in); 
BigInteger biginteger = new BigInteger(); 
//to initialize BigInteger with 0 , 1, or 10 ... make the argument to "ZERO", "ONE", "TEN" 
BigInteger n = scan.nextBigInteger(); 
BigInteger[] arr = new BigInteger[n]; 
for(BigInteger i=0; i<n; i++) { 
arr[i] = scan.nextBigInteger(); 
}
//adding all the elements of the array 
BigInteger sum = 0; 
for(BigInteger j=0; j<n; j++){ 
sum = sum + arr[j]; 
} 
System.out.println(sum); 
}