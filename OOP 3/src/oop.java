import java.util.*;

public class oop {

    public static boolean isSqrt(int number){
        double sq = Math.sqrt(number);
        return ((sq - Math.floor(sq)) == 0);
    }

    public static Integer[] transformArrays(String[] strArr){
        Integer[] newArr = new Integer[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            newArr[i] = Integer.parseInt(strArr[i]);
        }

        return newArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers with 1 space between them: ");
        String[] input = scanner.nextLine().split(" ");
        Integer[] numberArray = transformArrays(input);
        Arrays.sort(numberArray , Collections.reverseOrder());

        for (int i = 0; i < numberArray.length; i++) {
            boolean isSqrt = isSqrt(numberArray[i]);
            if(isSqrt){
                System.out.println(numberArray[i]);
            }
        }


    }
}