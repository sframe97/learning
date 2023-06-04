package Arrays;

public class ExercitiiArrays {
    public static void main(String[] args) {
//        // i= index - pozitie
//        // numbers[i] - valoarea de la pozitia i
//        int[] numbers = {5, 3, 9, 1};
//        // elementul din array
//        System.out.println(numbers[0]);
//        //lungimea unui array
//        System.out.println(numbers.length);
//        //parcurgere array
////        for (int i = 0; i < numbers.length ; i++) {
////            System.out.println(numbers[i]);
////        }
//        for (int number : numbers){
//            System.out.println(number);
//        }
       String[] colors = {"red", "green", "blue", "pink"};
//        for (String color: colors){
//            System.out.println(color);
//        }
        //identify maximum from an array of numbers
//        public static int getMax(int[] numbers){
//            int max = 0;
//            for (int i = 0; i< numbers.length; i++){
//                if (max<numbers[i]){
//                    max=numbers[i];
//                }
//
//            }
//        }
        // int[] numbers={5, 3, 9 , 1, 7, 6, 2};
//        System.out.println(getMax(numbers));
//        System.out.println(suma(numbers));
//        int[] numberReplaced =replaceEvenValues(numbers, 100);
//        for (int n:numberReplaced){
//            System.out.println(n);
//        }
//        int [] numbers = {5, 3, 9 , 1, 7, 6, 2, 10, 8, 4};
//        System.out.println(getIndex(numbers));
        System.out.println(getLongestColor(colors));
    }

//    public static int getMax(int[] numbers) {
//        int max = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (max < numbers[i]) {
//                max = numbers[i];
//            }
//            System.out.println("index: " + i + "max " + max + "valoare de la index " + numbers[i]);
//        }
//        return max;
//    }
    //calculati suma tuturor elementelor dintr-un array
//    public static int suma (int [] numbers){
//        int s = 0;
//        for (int number : numbers){
//            s=s+number;
//        }
//        return s;
//    }

    //avem un array, daca nr din array e par, inlocuieste-l cu un nr dat
//    public static int[] replaceEvenValues (int[] numbers, int nr){
//        for (int i = 0; i < numbers.length ; i++) {
//            if (numbers[i] % 2 == 0){
//                numbers[i]=nr;
//            }
//        }
//        return numbers;
//    }

    //returneaza indexul primului nr par din array
//    public static int getIndex (int[] numbers){
//        int index = 0;
//        for (int i = 0; i < numbers.length ; i++) {
//            if (numbers[i]%2==0){
//                index = i;
//                break;
//            }
//        }
//        return index;
//    }

    //avand un array de culori returneaza culoarea cea mai lunga
   // String[] colors = {"red", "green", "blue", "pink"};
    public static String getLongestColor(String[] colors){
        String longest = colors[0];
        for (int i = 0; i < colors.length ; i++) {
            if (longest.length()<colors[i].length()){
                longest=colors[i];
            }
        }return longest;
    }
}
