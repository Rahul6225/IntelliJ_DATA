package DSA.HashMaps;

import java.util.*;

public class Hash_Map {
    static void HashMapMethods(){
        //Syntax
        Map<String,Integer> mp = new HashMap<>(); //We can write Hashmaps->Map
        //Adding Elements
        mp.put("Akash",21);
        mp.put("Yash",21);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);
        //getting  Value of a key from the hashmap

//        System.out.println(mp.remove("rahul")) if key is not presnt  ,it wil  return null;
        System.out.println(mp.get("Lav"));  //16
//        System.out.println(mp.get("Rahul")); //null becox Rahul is not present in the hashmap

        //Chnaging/Updating  value of key in hashmap;

        mp.put("Akash",24); //to correct or reassign the value
        //Removing of pair of key in a hashmap;

        System.out.println(mp.remove("Yash"));
        //Checking if a key is in hashmap;

        System.out.println(mp.containsKey("Yash"));
        System.out.println(mp.containsKey("Harry"));

        //Adding  a new entry  only if  the new key is doesn't exist already
        mp.putIfAbsent("Rahul",18); //will enter if not present ,if present then it will not print the value ofn the key
        System.out.println(mp.get("Rahul"));
        //Get All keys in Hashmap;

        System.out.println(mp.keySet());
        //Get All values in hashmap

        System.out.println(mp.values());
        //Get ALl Entries in hahsmap

        System.out.println(mp.entrySet());
        //Traversing All enytries of hahsmap--multiple methods

        for(String key:mp.keySet()){
            System.out.printf("Age of %S is %d\n", key, mp.get(key));
        }
        System.out.println();

        for(Map.Entry<String,Integer> e:mp.entrySet()){
            System.out.printf("Age is %S is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();

        for(var e:mp.entrySet()){
            System.out.printf("Age is %S is %d\n",e.getKey(),e.getValue());

        }
    }
    public static void main(String[] args) {
        HashMapMethods();
    }
}
