import java.util.HashMap;

/**
 * This class is used for inputting a Hebrew letter and getting back the
 * corresponding Phoenician letter.
 */
public class HebrewToPhoenicianMap {

  /**
   * Default constructor
   */
  public HebrewToPhoenicianMap() {
  }

  /**
   * Constructor with parameter for passing hebrewLetter to obtain equivalent
   * phoenician letter
   *
   * @param hebrewLetter hebrew letter to pass to obtain the equivalent phoenician
   *                     letter
   */
  public HebrewToPhoenicianMap(String hebrewLetter) {
    hebrewToPhoenicianMap(hebrewLetter);
  }

  /**
   * This method takes a Hebrew letter which is used as the key for searching a
   * HashMap that returns the corresponding value that is the equivalent
   * Phoenician letter.
   *
   * @param hebrewLetter Hebrew letter as a String to pass as the key for
   *                     searching HashMap for corresponding Phoenician letter
   * @return the corresponding Phoenician letter that matches the Hebrew letter
   *         parameter
   */
  public static String hebrewToPhoenicianMap(String hebrewLetter) {
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
    hebrewToPhoenicianMap.put(" ", "𐤟");


    // return the corresponding Phoenician letter for the given Hebrew letter
    return hebrewToPhoenicianMap.get(hebrewLetter);
  }
}
