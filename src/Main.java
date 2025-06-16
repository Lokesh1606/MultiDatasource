import LearnAndBasics.LEC1.BasicsClass;
import LearnAndBasics.LEC1.TrieOperations;
import org.w3c.dom.Node;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BasicsClass basicsClass = new BasicsClass();
        TrieOperations trieOperations = new TrieOperations();
//        trieOperations.insertWords("apple");
//        trieOperations.insertWords("apps");
//        System.out.println(trieOperations.search("apple"));
//        System.out.println(trieOperations.startWith("apps"));

//        String[] values = {"dog","racecar","car"};
////        System.out.println(trieOperations.distinctSubStrings(values));
//        System.out.println(trieOperations.longestCommonSubstring(values));
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(basicsClass.removeDuplicatedValueFromSortedArray(nums));

    }
}