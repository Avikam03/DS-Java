package practice;

public class Prime1to100 {
    public static void main(String[] args) {
        int flag;
        for(int i=2;i<100;i++){
            flag = 0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                //System.out.println("a");
                System.out.print(i + " ");
            }
        }
    }
}
