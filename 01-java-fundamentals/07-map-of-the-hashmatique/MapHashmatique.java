import java.util.HashMap;

public class MapHashmatique {
    public static void main(String[] args){
    
                HashMap<String, String> map = new HashMap<String, String>();
                map.put("Bohemian Rhapsody", "Mama, just killed a man...");
                map.put("Sweet Child O'Mine", "She's got a smile that it seems to me...");
                map.put("Thunderstruck", "Thunder, thunder, thunder,thunder...");
                map.put("Prince Ali", "Make way for Prince Ali...");

                String val = map.get("Sweet child O'Mine");

                for (String key : map.keySet()) {
                    System.out.println(String.format("Track: %s: Lyrics: %s", key, map.get(key)));
                }
     



    }
        
}