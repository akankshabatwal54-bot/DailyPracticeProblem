public class CommanCount26{
    static int count(int[] a, int[] b){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[]  a = {10, 20, 30, 40};
        int[] b = {20, 30, 80, 90};
        int result = count(a, b);
        System.out.println("Count" + result);
    }
}