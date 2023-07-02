import java.util.HashMap;

/**
 * This class is used for inputting a Hebrew letter and getting back the
 * corresponding Phoenician letter.
 */
public class HebrewToPhoenicianMap {

    /**
     * HashMap with Hebrew letter String as the keys and Phoenician letter String as values.
     */
    private HashMap<String, String> hebrewToPhoenicianMap = new HashMap<>();

    /**
     * Default constructor
     */
    public HebrewToPhoenicianMap() {
        setHebrewToPhoenicianMap();
    }

    /**
     * Constructor with parameter for passing hebrewLetter to obtain equivalent
     * phoenician letter
     *
     * @param hebrewLetter hebrew letter to pass to obtain the equivalent phoenician
     *                     letter
     */
    public HebrewToPhoenicianMap(String hebrewLetter) {
        setHebrewToPhoenicianMap();
        getHebrewToPhoenicianMap(hebrewLetter);
    }


    /**
     * This method sets the HashMap hebrewToPhoenicianMap so that each hebrew letter key matches its corresponding Phoenician letter value.
     */
    public void setHebrewToPhoenicianMap() {
        hebrewToPhoenicianMap.put("א", "𐤀");
        hebrewToPhoenicianMap.put("ב", "𐤁");
        hebrewToPhoenicianMap.put("ג", "𐤂");
        hebrewToPhoenicianMap.put("ד", "𐤃");
        hebrewToPhoenicianMap.put("ה", "𐤄");
        hebrewToPhoenicianMap.put("ו", "𐤅");
        hebrewToPhoenicianMap.put("װ", "𐤅𐤅");
        hebrewToPhoenicianMap.put("ױ", "𐤅𐤉");
        hebrewToPhoenicianMap.put("ז", "𐤆");
        hebrewToPhoenicianMap.put("ח", "𐤇");
        hebrewToPhoenicianMap.put("ט", "𐤈");
        hebrewToPhoenicianMap.put("י", "𐤉");
        hebrewToPhoenicianMap.put("ײ", "𐤉𐤉");
        hebrewToPhoenicianMap.put("כ", "𐤊");
        hebrewToPhoenicianMap.put("ך", "𐤊");
        hebrewToPhoenicianMap.put("ל", "𐤋");
        hebrewToPhoenicianMap.put("מ", "𐤌");
        hebrewToPhoenicianMap.put("ם", "𐤌");
        hebrewToPhoenicianMap.put("נ", "𐤍");
        hebrewToPhoenicianMap.put("׆", "𐤍");
        hebrewToPhoenicianMap.put("ן", "𐤍");
        hebrewToPhoenicianMap.put("ס", "𐤎");
        hebrewToPhoenicianMap.put("ע", "𐤏");
        hebrewToPhoenicianMap.put("פ", "𐤐");
        hebrewToPhoenicianMap.put("ף", "𐤐");
        hebrewToPhoenicianMap.put("צ", "𐤑");
        hebrewToPhoenicianMap.put("ץ", "𐤑");
        hebrewToPhoenicianMap.put("ק", "𐤒");
        hebrewToPhoenicianMap.put("ר", "𐤓");
        hebrewToPhoenicianMap.put("ש", "𐤔");
        hebrewToPhoenicianMap.put("ת", "𐤕");
        hebrewToPhoenicianMap.put("ׯ", "\uD802\uDD09\uD802\uDD04\uD802\uDD05\uD802\uDD04");
    }

    /**
     * This getter returns the Phoenician letter String that matches the hebrewLetter String parameter.
     *
     * @param hebrewLetter String key to find the corresponding HashMap value for
     * @return Phoenician letter(s) that correspond to the hebrewLetter String
     */
    public String getHebrewToPhoenicianMap(String hebrewLetter) {
        return hebrewToPhoenicianMap.get(hebrewLetter);
    }

    public String getPhoenicianWordSeparator() {
        return "𐤟";
    }
}
