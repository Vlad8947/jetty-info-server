package ru.vlad.evrica.jettyinfoserver;

public class ByteFormatter {

    public static String format(long bytes, boolean inSi) {
        int unit = inSi ? 1000 : 1024;
        if (bytes < unit) return bytes + " B";
        int exp = (int) (Math.log(bytes) / Math.log(unit));
        String pre = (inSi ? "kMGTPE" : "KMGTPE").charAt(exp-1) + (inSi ? "" : "i");
        return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
    }

}
