package y1;

import android.os.LocaleList;
import java.util.Locale;

public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final h f17118b = new h(new j(b.a(new Locale[0])));

    /* renamed from: a  reason: collision with root package name */
    public final i f17119a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Locale[] f17120a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale, Locale locale2) {
            boolean z10;
            boolean z11;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f17120a;
            int length = localeArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    z10 = false;
                    break;
                } else if (localeArr[i8].equals(locale)) {
                    z10 = true;
                    break;
                } else {
                    i8++;
                }
            }
            if (!z10) {
                int length2 = localeArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        z11 = false;
                        break;
                    } else if (localeArr[i10].equals(locale2)) {
                        z11 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
                if (!z11) {
                    String c3 = b2.b.c(b2.b.a(b2.b.b(locale)));
                    if (!c3.isEmpty()) {
                        return c3.equals(b2.b.c(b2.b.a(b2.b.b(locale2))));
                    }
                    String country = locale.getCountry();
                    return country.isEmpty() || country.equals(locale2.getCountry());
                }
            }
            return false;
        }
    }

    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public h(j jVar) {
        this.f17119a = jVar;
    }

    public static h a(String str) {
        if (str == null || str.isEmpty()) {
            return f17118b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i8 = 0; i8 < length; i8++) {
            localeArr[i8] = a.a(split[i8]);
        }
        return new h(new j(b.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.f17119a.equals(((h) obj).f17119a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17119a.hashCode();
    }

    public final String toString() {
        return this.f17119a.toString();
    }
}
