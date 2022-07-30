import java.util.Scanner;

public class Calender {

    private static final int[] Max_Days = {0, 31 ,28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};

    public int GetMaxDays(int month){
        return Max_Days[month];
    }
    public static void main(String[] args) {

        System.out.println("일  월  화  수  목 금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");

        //숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
        Calender cal = new Calender();

        Scanner scanner = new Scanner(System.in);
        System.out.println("횟수를 입력하세요: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("달을 입력하세요: ");
            int Month = scanner.nextInt();

            System.out.printf("%d일은 %d일까지 있습니다.\n", Month, cal.GetMaxDays(Month));
        }
        scanner.close();
    }
    }
