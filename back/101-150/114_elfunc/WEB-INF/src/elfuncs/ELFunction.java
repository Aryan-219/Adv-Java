package elfuncs;

import java.util.HashMap;

public class ELFunction {
    public static String pro(String snm) {
        HashMap<String,String> map = new HashMap<>();

        map.put("Mohan", "JEC");
        map.put("Sohan", "GGITS");
        map.put("Rohan", "Global");
        map.put("Gohan", "GGCT");
        map.put("Tohan", "SRIT");

        return map.get(snm);
    }
}