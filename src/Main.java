package prac;

import java.util.Scanner;

public class Java_if_prac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("첫번째 숫자를 입력하세요");
        int num_1 = scan.nextInt();

        System.out.println("두번째 숫자를 입력하세요");
        int num_2 = scan.nextInt();

        System.out.println("세번째 숫자를 입력하세요");
        int num_3 = scan.nextInt();


        if(num_1>num_2) {
            if(num_1>num_3) {
                System.out.println("가장 큰 수는 : " + num_1+"입니다");
            }
        }
        if(num_2>num_1) {
            if(num_2 > num_3) {
                System.out.println("가장 큰 수는:" +num_2 +"입니다" );
            }
        }

        if(num_3 > num_1 ) {
            if(num_3 > num_2 ) {
                System.out.println("가장 큰 수는:" +num_3 +"입니다" );
            }
        }
        scan.close();
    }

}

