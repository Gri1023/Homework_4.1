public class Main {
    public static void main(String[] args) {
        int[] vals = {2, 5, -3, 11, 193, -2};
        for (int i=0;i<vals.length;i++)
        System.out.print(vals[i]+ " ");

        int sum = 0;
        int n=0;
        while (n<vals.length)
        {
            sum=sum+vals[n];
            n++;
        }
        System.out.println(" ");
        System.out.println("The sum is: " + sum);
    }
}