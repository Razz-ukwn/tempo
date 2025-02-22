package ab;

import java.lang.reflect.Field;
import java.util.Locale;

public enum b implements c {
    ;

    /* 'enum' modifier removed */
    public final class a extends b {
        public a() {
            super("IDENTITY", 0);
        }

        public final String a(Field field) {
            return field.getName();
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: ab.b$b  reason: collision with other inner class name */
    public final class C0006b extends b {
        public C0006b() {
            super("UPPER_CAMEL_CASE", 1);
        }

        public final String a(Field field) {
            return b.c(field.getName());
        }
    }

    /* 'enum' modifier removed */
    public final class c extends b {
        public c() {
            super("UPPER_CAMEL_CASE_WITH_SPACES", 2);
        }

        public final String a(Field field) {
            return b.c(b.b(field.getName(), ' '));
        }
    }

    /* 'enum' modifier removed */
    public final class d extends b {
        public d() {
            super("UPPER_CASE_WITH_UNDERSCORES", 3);
        }

        public final String a(Field field) {
            return b.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    }

    /* 'enum' modifier removed */
    public final class e extends b {
        public e() {
            super("LOWER_CASE_WITH_UNDERSCORES", 4);
        }

        public final String a(Field field) {
            return b.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    }

    /* 'enum' modifier removed */
    public final class f extends b {
        public f() {
            super("LOWER_CASE_WITH_DASHES", 5);
        }

        public final String a(Field field) {
            return b.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    }

    /* 'enum' modifier removed */
    public final class g extends b {
        public g() {
            super("LOWER_CASE_WITH_DOTS", 6);
        }

        public final String a(Field field) {
            return b.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    }

    public static String b(String str, char c3) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c3);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String c(String str) {
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            char charAt = str.charAt(i8);
            if (!Character.isLetter(charAt)) {
                i8++;
            } else if (Character.isUpperCase(charAt)) {
                return str;
            } else {
                char upperCase = Character.toUpperCase(charAt);
                if (i8 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i8) + upperCase + str.substring(i8 + 1);
            }
        }
        return str;
    }
}
