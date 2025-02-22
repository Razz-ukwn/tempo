package cb;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final int f3931a;

    static {
        int i8;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]");
            i8 = Integer.parseInt(split[0]);
            if (i8 == 1 && split.length > 1) {
                i8 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i8 = -1;
        }
        if (i8 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < property.length(); i10++) {
                    char charAt = property.charAt(i10);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb2.append(charAt);
                }
                i8 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i8 = -1;
            }
        }
        if (i8 == -1) {
            i8 = 6;
        }
        f3931a = i8;
    }
}
