package LearnAndBasics.LEC1;

import java.util.*;
import java.util.stream.IntStream;

public class BasicsClass {

    public void inputAndOutput(Scanner sc) {
        Long value = sc.nextLong();
        System.out.println(value);
    }

    public void lengthOfTheTriangle() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breath = sc.nextInt();
        System.out.println(length * breath);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i =0;i<nums.length;i++){
            int remainder = target - nums[i];
            int index = IntStream.range(0, nums.length)
                    .filter(x -> x == remainder)
                    .findFirst()
                    .orElse(-1);
            if(index != -1 && index != i){
                result[0] = i;
                result[1] = index;
                return result;
            }
        }
        return nums;
    }

    public boolean palindrome(int value) {
        if(value < 0){
            return false;
        }else{
            for(int i =0, j = String.valueOf(value).length() -1  ;
                i <(String.valueOf(value).length()/2) ;
                i++,j--
            ) {
                if(String.valueOf(value).charAt(i) != String.valueOf(value).charAt(j)){
                    return false;
                }
            }
            return true;
        }
    }

    /*
    *   I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000*/

//   MCMXCIV

    public int romanValueCalculator(String romanValue) {
        int result = 0;

        if(romanValue.length() == 1){
            result = returnRomanValue(romanValue.charAt(0));
        }else{
            for(int i = romanValue.length() -1 ; i != -1 ; i --){
                if( i == 0){
                    result = result + returnRomanValue(romanValue.charAt(i));
                } else{
                    if(romanValue.charAt(i) == 'X' || romanValue.charAt(i) == 'V' ){
                        if(romanValue.charAt(i -1) == 'I'){
                            result += (returnRomanValue(romanValue.charAt(i)) - 1);
                            i--;
                        }else{
                            result += returnRomanValue(romanValue.charAt(i));
                        }
                    }else if(romanValue.charAt(i) == 'L' || romanValue.charAt(i) == 'C' ){
                        if(romanValue.charAt(i -1) == 'X'){
                            result += (returnRomanValue(romanValue.charAt(i)) - 10);
                            i--;
                        }else{
                            result += returnRomanValue(romanValue.charAt(i));
                        }
                    }else if(romanValue.charAt(i) == 'D' || romanValue.charAt(i) == 'M' ){
                        if(romanValue.charAt(i -1) == 'C'){
                            result += (returnRomanValue(romanValue.charAt(i)) - 100);
                            i--;
                        }else{
                            result += returnRomanValue(romanValue.charAt(i));
                        }
                    }else{
                        result += 1;
                    }
                }
                System.out.println(result);
            }
        }

        return result;
    }
    int returnRomanValue (char value){
        switch (value){
            case 'I' : return 1;

            case 'V' : return  5;
            case 'X' : return  10;
            case 'L' : return  50;
            case 'C': return 100;
            case 'D' : return  500;
            case 'M' : return  1000;
        }
        return 0;
    }

    public boolean validParanthesis(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i =0;i< s.length()  ; i++) {
            if (s.charAt(i) == '{')
                stack.add('}');
            else if (s.charAt(i) == '[')
                stack.add(']');
            else if (s.charAt(i) == '(')
                stack.add(')');
            else {
                if(stack.size()== 0)
                    return false;
                if (stack.peek() == s.charAt(i)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.size()==0)
            return true;
        else
            return false;
    }

    public int removeDuplicatedValueFromSortedArray(int[] nums) {
        int result = 0;
        int size = nums.length;
        int i =0;
        int j = i+1;
        while(i < size){
            while(j <size){
                if(nums[i] == nums[j]){
                    
                }else{

                }
            }
        }


        return result;
    }


    class Solution {
        public boolean isValid(String s) {
            ArrayList<Character> list = new ArrayList<Character>();
            int j = 0;
            for (int i = 0; i < s.length() ; i++) {
                switch (s.charAt(i)) {
                    case '{':
                        list.add('}');
                        j++;
                        break;
                    case '[':
                        list.add(']');
                        j++;
                        break;
                    case '(':
                        list.add(')');
                        j++;
                        break;
                    default:
                        if (list.isEmpty() || list.get(j) == s.charAt(i)) {
                            return false;
                        }
                }
            }
            return list.isEmpty();
        }
    }

    private static Trie root;

    public BasicsClass() {
        root = new Trie();
    }


}
