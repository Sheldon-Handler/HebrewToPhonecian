import java.util.HashMap;

public class HebrewToPhoenicianMap {

  public HebrewToPhoenicianMap() {
  }

  public HebrewToPhoenicianMap(String hebrewLetter) {
    hebrewToPhoenicianMap(hebrewLetter);
  }

  public final static String hebrewToPhoenicianMap(String hebrewLetter) {
    // create the HashMap and populate it with mappings
    HashMap<String, String> hebrewToPhoenicianMap = new HashMap<>();
    hebrewToPhoenicianMap.put("א", "𐤀");
    hebrewToPhoenicianMap.put("ב", "𐤁");
    hebrewToPhoenicianMap.put("ג", "𐤂");
    hebrewToPhoenicianMap.put("ד", "𐤃");
    hebrewToPhoenicianMap.put("ה", "𐤄");
    hebrewToPhoenicianMap.put("ו", "𐤅");
    hebrewToPhoenicianMap.put("ז", "𐤆");
    hebrewToPhoenicianMap.put("ח", "𐤇");
    hebrewToPhoenicianMap.put("ט", "𐤈");
    hebrewToPhoenicianMap.put("י", "𐤉");
    hebrewToPhoenicianMap.put("כ", "𐤊");
    hebrewToPhoenicianMap.put("ך", "𐤊");
    hebrewToPhoenicianMap.put("ל", "𐤋");
    hebrewToPhoenicianMap.put("מ", "𐤌");
    hebrewToPhoenicianMap.put("ם", "𐤌");
    hebrewToPhoenicianMap.put("נ", "𐤍");
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

    // retrieve a Phoenician letter for a given Hebrew letter
    return hebrewToPhoenicianMap.get(hebrewLetter);
  }
}
