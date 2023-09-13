// Import statement:
import java.util.ArrayList;
class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int number){
    if (number <= 2){
      return true;
    }
    for (int i =2;i<number;i++){
      if (number%i==0){
        return false;
      }
    }
    return true;
  }

  public ArrayList<Integer> onlyPrime(int[] numbers){
    ArrayList<Integer> primes = new ArrayList<Integer>();

    for (Integer num:numbers){
      if (isPrime(num)){
        primes.add(num);
      }
    }

    return primes;
  }
  
  
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.isPrime(7));
    System.out.println(pd.onlyPrime(numbers));
  }  

}
