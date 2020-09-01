public class Main {
    public static void main(String[] args) {
      printnummbe(5);
    }
    public static void printnummbe(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
