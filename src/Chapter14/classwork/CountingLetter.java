package Chapter14.classwork;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.IntStream;

public class CountingLetter {
    public static void main(String[] args) {
//        Map<String,Integer> myMap = new HashMap<>();
//       createMap(myMap);
//       displayMap(myMap);
//       System.out.println();

        SecureRandom random = new SecureRandom();
        System.out.println(random.ints(100,1,25)
                .sum());

    }

    //    methods
    private static void createMap(Map<String, Integer> map) {
        Scanner count = new Scanner(System.in);
        System.out.println("Enter a String");

        String input = count.nextLine().toLowerCase();
        String[] tokens = input.split("");

        for(String token : tokens){
            if (map.containsKey(token)){
                int counter = map.get(token);
                map.put(token,counter +1);
            }
            else
                map.put(token,1);
        }
    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (String key: sortedKeys)
            System.out.printf("%-10s%2s%n",key,map.get(key));
    }

    }


