package java07;

public class java_a9 {

    public static void main(String[] args) {
        int n = 11;
        int count = 0;
        for(int i=2;i<=n;i++) {
            for(int j=2;j<=i;j++) {
                if(i % j == 0 ) {
                    count++;
                }

            } if(count==1) {
                System.out.println(i);
            }
            count=0;
        }
    }

}
