package example;

import java.util.HashMap;

/**
 * This class is used for inputting a Hebrew letter and getting back the
 * corresponding Phoenician letter.
 */
public class HebrewToPhoenicianMap {

    /**
     * HashMap with Hebrew letter String as the keys and Phoenician letter String as values.
     */
    private final HashMap<String, String> hebrewToPhoenicianMap = new HashMap<>();

    /**
     * Default constructor
     */
    public HebrewToPhoenicianMap() {
        setHebrewToPhoenicianMap();
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

        //  map from Alphabetic Presentation Forms block
        hebrewToPhoenicianMap.put("ﬡ", "\uD802\uDD00");
        hebrewToPhoenicianMap.put("אַ", "\uD802\uDD00ַ");
        hebrewToPhoenicianMap.put("אָ", "\uD802\uDD00ָ");
        hebrewToPhoenicianMap.put("אּ", "\uD802\uDD00ִ");
        hebrewToPhoenicianMap.put("ﭏ", "𐤀𐤋");
        hebrewToPhoenicianMap.put("בּ", "\uD802\uDD01ּ");
        hebrewToPhoenicianMap.put("בֿ", "\uD802\uDD01ֿ");
        hebrewToPhoenicianMap.put("גּ", "\uD802\uDD02ּ");
        hebrewToPhoenicianMap.put("ﬢ", "𐤃");
        hebrewToPhoenicianMap.put("דּ", "\uD802\uDD03ּ");
        hebrewToPhoenicianMap.put("ﬣ", "𐤄");
        hebrewToPhoenicianMap.put("הּ", "\uD802\uDD04ּ");
        hebrewToPhoenicianMap.put("וּ", "\uD802\uDD05ּ");
        hebrewToPhoenicianMap.put("וֹ", "\uD802\uDD05ֹ");
        hebrewToPhoenicianMap.put("זּ", "\uD802\uDD06ּ");
        hebrewToPhoenicianMap.put("טּ", "\uD802\uDD07ּ");
        hebrewToPhoenicianMap.put("יִ", "\uD802\uDD08ִ");
        hebrewToPhoenicianMap.put("ײַ", "\uD802\uDD08ַ\uD802\uDD08ַ");
        hebrewToPhoenicianMap.put("יּ", "\uD802\uDD08ּ");
        hebrewToPhoenicianMap.put("ﬤ", "𐤊");
        hebrewToPhoenicianMap.put("כּ", "\uD802\uDD09ֹ");
        hebrewToPhoenicianMap.put("כֿ", "\uD802\uDD09ֿ");
        hebrewToPhoenicianMap.put("ךּ", "\uD802\uDD09ּ");
        hebrewToPhoenicianMap.put("ﬥ", "𐤋");
        hebrewToPhoenicianMap.put("לּ", "\uD802\uDD10ּ");
        hebrewToPhoenicianMap.put("מּ", "\uD802\uDD11ּ");
        hebrewToPhoenicianMap.put("ﬦ", "\uD802\uDD11");
        hebrewToPhoenicianMap.put("נּ", "\uD802\uDD12ּ");
        hebrewToPhoenicianMap.put("סּ", "\uD802\uDD13ּ");
        hebrewToPhoenicianMap.put("ﬠ", "𐤏");
        hebrewToPhoenicianMap.put("פּ", "\uD802\uDD15ּ");
        hebrewToPhoenicianMap.put("פֿ", "\uD802\uDD15ֿ");
        hebrewToPhoenicianMap.put("ףּ", "\uD802\uDD15ּ");
        hebrewToPhoenicianMap.put("צּ", "\uD802\uDD16ּ");
        hebrewToPhoenicianMap.put("קּ", "\uD802\uDD17ּ");
        hebrewToPhoenicianMap.put("רּ", "\uD802\uDD18ּ");
        hebrewToPhoenicianMap.put("שׁ", "\uD802\uDD19ׁׁ");
        hebrewToPhoenicianMap.put("שּׁ", "\uD802\uDD19ּׁ");
        hebrewToPhoenicianMap.put("שׂ", "\uD802\uDD19ׂ");
        hebrewToPhoenicianMap.put("שּׂ", "\uD802\uDD19ּׂ");
        hebrewToPhoenicianMap.put("שּ", "\uD802\uDD19ּ");
        hebrewToPhoenicianMap.put("ﬨ", "𐤕");
        hebrewToPhoenicianMap.put("תּ", "\uD802\uDD1Aּ");
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

    /**
     * This returns the Phoenician word separator.
     *
     * @return special character used as a word separator for Phoenician texts
     */
    public String getPhoenicianWordSeparator() {
        return "𐤟";
    }
}
