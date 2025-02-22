package h0;

public final /* synthetic */ class e {
    public static int a(long j10, int i8, int i10) {
        return (Long.hashCode(j10) + i8) * i10;
    }

    public static String b(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static StringBuilder c(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static /* synthetic */ String d(int i8) {
        return i8 == 1 ? "BEGIN_ARRAY" : i8 == 2 ? "END_ARRAY" : i8 == 3 ? "BEGIN_OBJECT" : i8 == 4 ? "END_OBJECT" : i8 == 5 ? "NAME" : i8 == 6 ? "STRING" : i8 == 7 ? "NUMBER" : i8 == 8 ? "BOOLEAN" : i8 == 9 ? "NULL" : i8 == 10 ? "END_DOCUMENT" : "null";
    }

    public static /* synthetic */ String e(int i8) {
        return i8 == 1 ? "UNKNOWN" : i8 == 2 ? "HORIZONTAL_DIMENSION" : i8 == 3 ? "VERTICAL_DIMENSION" : i8 == 4 ? "LEFT" : i8 == 5 ? "RIGHT" : i8 == 6 ? "TOP" : i8 == 7 ? "BOTTOM" : i8 == 8 ? "BASELINE" : "null";
    }
}
