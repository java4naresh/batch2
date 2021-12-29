import static java.util.stream.IntStream.rangeClosed;
class Exercise2 {
    
   public static void main(String[] args) {
        int Deficient = 0;
        int Perfect= 0;
        int Abundant = 0;
 
        for (int i = 1; i <= 100; i++) {
            int sum = Sum(i);
            if (sum < i)
                Deficient++;
            else if (sum == i)
                Perfect++;
            else
                Abundant++;
        }
        System.out.println("Number Counting [(integers) between 1 to 10,00]: ");
        System.out.println("Deficient number: " + Deficient);
        System.out.println("Perfect number: " + Perfect);
        System.out.println("Abundant number: " + Abundant);
    }
     public static int Sum(int num) {
        return rangeClosed(1, (num + 1) / 2).filter(i -> num % i == 0 && num != i).sum();
    }
}
