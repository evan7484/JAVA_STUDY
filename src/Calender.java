import java.util.Scanner;

public class Calender {
    private static final int[] Max_Days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int GetMaxDays(int month){
        return Max_Days[month];
    }


    public static void main(String[] args) {

        Calender cal = new Calender();

        Scanner scanner = new Scanner(System.in);
        System.out.println("횟수를 입력하세요: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++){

            System.out.println("달을 입력하세요: ");
            int number  = scanner.nextInt();

            if (number == 1 | number == 3 | number == 5 | number == 7 | number == 8 | number == 10 | number == 12){
                System.out.println("일 월 화 수  목  금  토");
                System.out.println("1  2  3 4   5   6  7");
                System.out.println("8 9  10 11 12  13 14");
                System.out.println("15 16 17 18 19 20 21");
                System.out.println("22 23 24 25 26 27 28");
                System.out.println("29 30 31");
            }
            else if (number == 4 | number == 6 | number == 9 | number == 11){
                System.out.println("일 월 화 수  목  금  토");
                System.out.println("1  2  3 4   5   6  7");
                System.out.println("8 9  10 11 12  13 14");
                System.out.println("15 16 17 18 19 20 21");
                System.out.println("22 23 24 25 26 27 28");
                System.out.println("29 30");

            }
            else if (number == 2){
                System.out.println("일 월 화 수  목  금  토");
                System.out.println("1  2  3 4   5   6  7");
                System.out.println("8 9  10 11 12  13 14");
                System.out.println("15 16 17 18 19 20 21");
                System.out.println("22 23 24 25 26 27 28");

            }

        }


        System.out.println("종료되었습니다.");
        scanner.close();
    }
}