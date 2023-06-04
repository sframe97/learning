package Liste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Maps {
    public static void main(String[] args) {
//        List<String> data = new ArrayList<>();
//        data.add("ana");
//        data.add("20");
//        data.add("str automationului nr 10");
//        data.add("098546358");
//      //  System.out.println(data);
//
        HashMap<String, String> contact = new HashMap<String, String>();
        //contact.put (key, value);
        contact.put("name", "ana");
        contact.put("age", "20");
        contact.put("address", "str automationului nr 10");
        contact.put("phone", "098546358");
       // System.out.println(contact);
      //  System.out.println(contact.size());
      //  System.out.println(contact.get("name"));
        System.out.println(contact.get("phone"));
     //   System.out.println(contact.keySet());
 //       System.out.println(contact.values());
 //       contact.remove("age");
 //       System.out.println(contact);
        //for la nivel de values
//        for (String value: contact.values()){
//            System.out.println(value);
//        }
//        //for la nivel de keys
//        for (String keys: contact.keySet()){
//            System.out.println(keys+ " " + contact.get(keys));
//        }

        //am un map care contine notele de la bacalaureat
        //key romana, mate, info
        //printeaza map-ul
        //calculatia media generala de la bac
        //printati doar cheia care are nota > 8

//        HashMap <String, Integer> note = new HashMap<String, Integer>();
//        note.put("romana", 9);
//        note.put("mate", 7);
//        note.put("info", 6);
//
//        System.out.println(note);
//        int suma = 0;
//        for (Integer nota : note.values()){
//            suma= suma + nota;
//        }
//        int media = suma/note.size();
//        System.out.println(media);
//
//        for (String k : note.keySet()){
//            if (note.get(k)>8){
//                System.out.println(k + "=" + note.get(k));
//            }
//        }
    }
}
