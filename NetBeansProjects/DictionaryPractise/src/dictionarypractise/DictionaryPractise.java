package dictionarypractise;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractise {

    public static void main(String[] args) {
        // TODO code application logic here
        // English to Spanish Dictionary
        // constructore for Dictionary
        Map<String, String> englSpanDict = new HashMap<String, String>();

        //insert to dictionary
        englSpanDict.put("Monday", "Lunes");
        englSpanDict.put("Tuesday", "Martes");
        englSpanDict.put("Wednesday", "Miercoles");
        englSpanDict.put("Thursday", "Jueves");
        englSpanDict.put("Friday", "Viernes");
        englSpanDict.put("Saturday", "Sabado");
        englSpanDict.put("Sunday", "Domingo");

        //retrieve from dictionary
        System.out.println(englSpanDict.get("Tuesday"));
        System.out.println();

        //get Values from dictionary:
        System.out.println(englSpanDict.values());

        // get Keys for Dictionary:
        System.out.println(englSpanDict.keySet());

        // Shopping List
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        // Put in dict
        shoppingList.put("Ham", Boolean.TRUE);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", Boolean.FALSE);

        //Retrieve
        System.out.println(shoppingList.get("Ham"));

        // Key-Value print
        System.out.println(shoppingList.toString());

        //clear dictionary
       // shoppingList.clear();
       // System.out.println(shoppingList.toString());
       // System.out.println(shoppingList.isEmpty());
        
        //Remove pair
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());
        
        //contains?
        System.out.println(shoppingList.containsKey("Eggs"));
        System.out.println(shoppingList.containsValue(true));
        
        //Remove
        shoppingList.replace("Bread", false);
    }
}
