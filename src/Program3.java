public class Program3 {
    public static void main(String[] args) {
        int numbers[] = {23, 10, 55, 12, 45, 67, 1, 20};

        int min = numbers [0];
        int max = numbers [0];


        for (  int i = 0 ; i < numbers.length; i++){
            if(numbers [i] < min){
                min = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++ ){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
