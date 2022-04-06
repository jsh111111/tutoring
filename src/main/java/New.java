import java.util.Scanner;
public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~99 입력하세요");
        int number = scanner.nextInt();
        if (number>0 & number<=10) {
            System.out.print(((number%3)==0)?"ha":number);
        }
        else if (number>10 & number<=20) {
            System.out.print(((number%3)==1)?"ha":number);
        }
        else if (number>20 & number<=29) {
            System.out.print(((number%3)==1)?"ha":number);
        }
        else if (number>29 & number<=39) {
            System.out.print(((number%3)==0)?"haha":"ha");
        }
        else if (number>39 & number<=50) {
            System.out.print(((number%3)==1)?"ha":number);
        }
        else if (number>50 & number<=59) {
            System.out.print(((number%3)==2)?"ha":number);
        }
        else if (number>60 & number<=69) {
            System.out.print(((number%3)==0)?"haha":"ha");
        }
        else if (number>69 & number<=80) {
            System.out.print(((number%3)==1)?"ha":number);
        }
        else if (number>80 & number<=89) {
            System.out.print(((number%3)==2)?"ha":number);
        }
        else if (number>89 & number<=99) {
            System.out.print(((number%3)==0)?"ha":"haha");
        }
        scanner.close();
    }
}
