import java.util.HashMap;

/**
 * This class is used for inputting a Hebrew letter and getting back the
 * corresponding Phoenician letter.
 */
public class HebrewToPhoenicianMap {

  public static final String phoenicianWordSeparator = "𐤟";

  public static final HashMap<String, String> hebrewToPhoenicianMap = new HashMap<String, String>() {{
    put("א", "𐤀");
    put("ב", "𐤁");
    put("ג", "𐤂");
    put("ד", "𐤃");
    put("ה", "𐤄");
    put("ו", "𐤅");
    put("װ", "𐤅𐤅");
    put("ױ", "𐤅𐤉");
    put("ז", "𐤆");
    put("ח", "𐤇");
    put("ט", "𐤈");
    put("י", "𐤉");
    put("ײ", "𐤉𐤉");
    put("כ", "𐤊");
    put("ך", "𐤊");
    put("ל", "𐤋");
    put("מ", "𐤌");
    put("ם", "𐤌");
    put("נ", "𐤍");
    put("׆", "𐤍");
    put("ן", "𐤍");
    put("ס", "𐤎");
    put("ע", "𐤏");
    put("פ", "𐤐");
    put("ף", "𐤐");
    put("צ", "𐤑");
    put("ץ", "𐤑");
    put("ק", "𐤒");
    put("ר", "𐤓");
    put("ש", "𐤔");
    put("ת", "𐤕");
    put("ׯ", "\uD802\uDD09\uD802\uDD04\uD802\uDD05\uD802\uDD04");
  }};
}
