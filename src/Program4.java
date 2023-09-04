import java.util.Arrays;

public class Program4 {
    //Selectoin sort
    public static void main(String[] args) {
        int numbers[] = {23, 10, 55, 12, 45, 8, 1, 20};

        System.out.println(Arrays.toString(numbers));

        int min;
        int indexOfMin;
        int temp;

        for (int i = 0; i < numbers.length; i++){
            min = numbers[i];
            indexOfMin = i;

            for (  int j = i ;j  < numbers.length; j++){
                if(numbers [j] < min){
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            temp = numbers[i];
            numbers [i] = min;
            numbers[indexOfMin] = temp;
        }

        System.out.println(Arrays.toString(numbers));


    }
}
