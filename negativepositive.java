import java.io.*;

class Negativepositive {
    public static void main(String args[]) throws IOException {
        int num;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter a number");
        num = Integer.parseInt(br.readLine());
        if (num < 0.0)
            System.out.println(num + " is a negative");
        else if (num > 0.0)
            System.out.println(num + " is a positive");
        else
            System.out.println(num + " is 0.0");
    }
}