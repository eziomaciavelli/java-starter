package javastarter.homework.tasks.task01;

import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;

public class Convert {

    public static void convertNumToWords(int num) {

        //https://icu.unicode.org (link для использования RuleBasedNumberFormat)...
        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("en"),
                RuleBasedNumberFormat.SPELLOUT);
        System.out.println(nf.format(num));
    }
}
