package jg;

import cb.b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sf.j;

public final class t {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f10171d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f10172e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    public final String f10173a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10174b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f10175c;

    public static final class a {
        public static t a(String str) {
            j.f(str, "<this>");
            Matcher matcher = t.f10171d.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                j.e(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                j.e(locale, "US");
                String lowerCase = group.toLowerCase(locale);
                j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                j.e(group2, "typeSubtype.group(2)");
                j.e(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = t.f10172e.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (zf.j.x0(group4, "'", false) && zf.j.r0(group4, "'", false) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                j.e(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        j.e(substring, "this as java.lang.String).substring(startIndex)");
                        sb2.append(substring);
                        sb2.append("\" for: \"");
                        sb2.append(str);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return new t(str, lowerCase, (String[]) array);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
    }

    public t(String str, String str2, String[] strArr) {
        this.f10173a = str;
        this.f10174b = str2;
        this.f10175c = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f10175c;
        int i8 = 0;
        int A = b.A(0, strArr.length - 1, 2);
        if (A >= 0) {
            while (true) {
                int i10 = i8 + 2;
                if (zf.j.s0(strArr[i8], "charset", true)) {
                    str = strArr[i8 + 1];
                    break;
                } else if (i8 == A) {
                    break;
                } else {
                    i8 = i10;
                }
            }
        }
        str = null;
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && j.a(((t) obj).f10173a, this.f10173a);
    }

    public final int hashCode() {
        return this.f10173a.hashCode();
    }

    public final String toString() {
        return this.f10173a;
    }
}
