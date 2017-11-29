public class Utils {
    public static String trimStringToBytesSize(String s, int length) {
        if (s == null || length < 0) return null;
        int trimLength = Math.min(length, s.length());
        String trimmedString = s;
        while (trimmedString.getBytes().length > length && trimLength >= 0) {
            trimmedString = s.substring(0, trimLength);
            trimLength--;
        }
        return trimmedString;
    }
}
