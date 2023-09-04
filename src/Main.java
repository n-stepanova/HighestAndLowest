public class Main {
    public static String highAndLow(String numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String[] numbersArray = numbers.split(" ");

        for (int i=0; i<numbersArray.length; i++){
            int num = Integer.parseInt(numbersArray[i]);
            if (num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }
        }

        return max + " " + min;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println(highAndLow("1 2 3"));
    }
}
