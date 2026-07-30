// Flyweight pattern

import java.util.HashMap;
import java.util.Map;

public class TagFactory {

    private static Map<String, Tag> tags = new HashMap<>();

    public static Tag getTag(String name) {

        String key = name.toLowerCase();

        if (!tags.containsKey(key)) {
            tags.put(key, new Tag(name));
        }

        return tags.get(key);
    }
}