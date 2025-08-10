import LearnAndBasics.LEC1.BasicsClass;
import LearnAndBasics.LEC1.TrieOperations;
import org.w3c.dom.Node;

import java.math.BigInteger;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static void main(String[] args) {
//        BasicsClass basicsClass = new BasicsClass();
//        TrieOperations trieOperations = new TrieOperations();
////        trieOperations.insertWords("apple");
////        trieOperations.insertWords("apps");
////        System.out.println(trieOperations.search("apple"));
////        System.out.println(trieOperations.startWith("apps"));
//
////        String[] values = {"dog","racecar","car"};
//////        System.out.println(trieOperations.distinctSubStrings(values));
////        System.out.println(trieOperations.longestCommonSubstring(values));
////        int[] nums = {0,0,1,1,1,2,2,3,3,4};
////        System.out.println(basicsClass.removeDuplicatedValueFromSortedArray(nums));
////        String s = "my name is lokesh";
////        System.out.println( s.trim().split(" ")[s.trim().split(" ").length-1].length());
//        int [] number = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
////        System.out.println(Arrays.toString(basicsClass.plusOne1(number)));
//
//    }
//    public static void main(String args[]) throws InterruptedException {
//
//        Map<Integer, String > map = new HashMap<>();
//
//        Runnable task = () ->{
//            for(int i = 0 ;i < 101 ; i++){
//                map.put(i, "value "+i);
//            }
//        };
//
//        Thread t1 = new Thread(task);
//        Thread t2 = new Thread(task);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();
//
//        System.out.println("Hashtable size (safe): " + map.size());
//
//    }
    /*public static void main(String[] args){
        String num1 = "11";
        String num2 = "123";
        String big = findingBiggerNumber(num1,num2);
        System.out.println("bigger value "+big);

        String result = "";
        int remainder = 0;
        int value = 0;
        int quotient = 0;
        int i = big.length() -1;
        for( ; i>=0;i--){
            char charNum1;
            char charNum2;
            try{
                charNum1 = num1.charAt(i);
            }catch (StringIndexOutOfBoundsException e){
                charNum1 = '0';
            }
            try{
                charNum2 = num2.charAt(i);
            }catch (StringIndexOutOfBoundsException e1){
                charNum2 = '0';
            }
            value = (charNum1 - '0') + (charNum2 - '0')+ quotient;
            System.out.println("n1 "+charNum1+" n2   "+charNum2);
            remainder = value % 10;
            quotient = value / 10;
            result = remainder + result;
            System.out.println("bits values "+result);
        }
        System.out.println("final value "+result);
    }*/
    public static void main(String[] args){
        int num = 5;
        System.out.println(climbingStaris(num));
    }
    private static int climbingStaris(int num) {
        if(num == 1) return 1;
        else if (num ==2 ) return 2;
        return climbingStaris(num-1)+climbingStaris(num-2);
    }

    private static String findingBiggerNumber(String num1, String num2) {
        if(num1.length() > num2.length()){
            return num1;
        }else if(num2.length() > num1.length()){
            return num2;
        }
        return num1;
    }


}