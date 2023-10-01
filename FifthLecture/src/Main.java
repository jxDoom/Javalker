import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Integer a = 123;
//        System.out.println(a.hashCode());
//        System.out.println("z".hashCode());

//HashMap
//        Map<Integer, String> db = new HashMap<>();
//        Map<Integer,String> map2 = new HashMap<>(15);   //Количество элементов
//        Map<Integer,String> map3 = new HashMap<>(15, 0.7f); //увеличить в тот момент, когда заполнится 70%(0.7f) map3

//        db.put(1, "один"); System.out.println(db);
//        db.put(2, "два"); System.out.println(db);
//        db.put(3, "три"); System.out.println(db);
//        db.put(31, "три один"); System.out.println(db);
//        db.put(13, "один три"); System.out.println(db);
//        db.put(null, "!null"); System.out.println(db);
////        db.put(null, null); System.out.println(db);
//        db.putIfAbsent(555, "пятьсот пятьдесят пять");
//        System.out.println(db); //{null=!null, 1=один, 2=два, 3=три, 555=пятьсот пятьдесят пять, 13=один три, 31=три один}
//        System.out.println(db.get(31)); //три один
//        db.remove(13);
//        System.out.println(db.containsValue("три"));    //true
//        System.out.println(db.containsValue("Три"));    //false
//        System.out.println(db.containsKey(3));  //true
//        System.out.println(db.keySet());    //[null, 1, 2, 3, 555, 31]
//        System.out.println(db.values());    //[!null, один, два, три, пятьсот пятьдесят пять, три один]
//
//        for (var item : db.entrySet()){
//            System.out.printf("%d: %s\n", item.getKey(), item.getValue());

//TreeMap
//        TreeMap<Integer,String> tMap = new TreeMap<>();
//        tMap.put(1,"один"); System.out.println(tMap);
//        // {1=один}
//        tMap.put(6,"шесть"); System.out.println(tMap);
//        // {1=один, 6=шесть}
//        tMap.put(4,"четыре"); System.out.println(tMap);
//        // {1=один, 4=четыре, 6=шесть}
//        tMap.put(3,"три"); System.out.println(tMap);
//        // {1=один, 3=три, 4=четыре, 6=шесть}
//        tMap.put(2,"два"); System.out.println(tMap);
//        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}

//LinkedHashMap
//        Map<Integer,String> linkmap = new LinkedHashMap<>();
//        linkmap.put(11, "один один");
//        linkmap.put(1, "два");
//        linkmap.put(2, "один");
//        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
//        Map<Integer,String> map = new HashMap<>();
//        map.put(11, "один один");
//        map.put(2, "два");
//        map.put(1, "один");
//        System.out.println(map); // {1=один, 2=два, 11=один один}

//HashTable
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); // java.lang.NullPointerException

    }
}
