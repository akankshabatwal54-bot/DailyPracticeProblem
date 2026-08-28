public class CommanElement26{
    static void comman(int[] a, int[] b){
       for(int i = 0; i < a.length; i++){
        for(int j = 0; j < b.length; j++){
            if(a[i] == b[j]){
                System.out.println(a[i]);
            }
        }
       }
    }
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int[] b = {10, 60, 40, 50};
         comman(a, b);
        

    }
}