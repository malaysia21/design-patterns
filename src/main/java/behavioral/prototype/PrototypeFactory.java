package behavioral.prototype;

import java.util.HashMap;

public class PrototypeFactory {

    private static final HashMap<CultureEnum, PrototypeCulture>  cultureMap = new HashMap<>();
    static
    {
        cultureMap.put(CultureEnum.MOVIE, new Movie());
        cultureMap.put(CultureEnum.BOOK, new Book());
    }

    public static PrototypeCulture getInstance(final CultureEnum cultureEnum) throws CloneNotSupportedException {
        return cultureMap.get(cultureEnum).clone();
    }
}
