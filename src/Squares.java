import java.util.Scanner;
public class Squares {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to display all numbers" +
                " \nfrom 1 to your input and their squares. ");
        int user_input = scn.nextInt();
        int i;
        int sq;
        for (i = 1; i <= user_input; i += 1){
            sq = i*i;
            System.out.println(i+"..."+sq);
        }
    }
}
