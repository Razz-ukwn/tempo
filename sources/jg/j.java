package jg;

import b3.x;
import h0.e;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kg.b;
import og.c;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import zf.n;

public final class j {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f10119j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f10120k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f10121l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f10122a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10123b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10124c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10125d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10126e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10127f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10128g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10129h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10130i;

    public static final class a {
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x003f, code lost:
            if (r1 != ':') goto L_0x0042;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int a(int r5, int r6, java.lang.String r7, boolean r8) {
            /*
            L_0x0000:
                if (r5 >= r6) goto L_0x0049
                int r0 = r5 + 1
                char r1 = r7.charAt(r5)
                r2 = 32
                r3 = 1
                if (r1 >= r2) goto L_0x0011
                r2 = 9
                if (r1 != r2) goto L_0x0041
            L_0x0011:
                r2 = 127(0x7f, float:1.78E-43)
                if (r1 >= r2) goto L_0x0041
                r2 = 57
                r4 = 0
                if (r1 > r2) goto L_0x0020
                r2 = 48
                if (r2 > r1) goto L_0x0020
                r2 = r3
                goto L_0x0021
            L_0x0020:
                r2 = r4
            L_0x0021:
                if (r2 != 0) goto L_0x0041
                r2 = 122(0x7a, float:1.71E-43)
                if (r1 > r2) goto L_0x002d
                r2 = 97
                if (r2 > r1) goto L_0x002d
                r2 = r3
                goto L_0x002e
            L_0x002d:
                r2 = r4
            L_0x002e:
                if (r2 != 0) goto L_0x0041
                r2 = 90
                if (r1 > r2) goto L_0x003a
                r2 = 65
                if (r2 > r1) goto L_0x003a
                r2 = r3
                goto L_0x003b
            L_0x003a:
                r2 = r4
            L_0x003b:
                if (r2 != 0) goto L_0x0041
                r2 = 58
                if (r1 != r2) goto L_0x0042
            L_0x0041:
                r4 = r3
            L_0x0042:
                r1 = r8 ^ 1
                if (r4 != r1) goto L_0x0047
                return r5
            L_0x0047:
                r5 = r0
                goto L_0x0000
            L_0x0049:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jg.j.a.a(int, int, java.lang.String, boolean):int");
        }

        public static long b(int i8, String str) {
            int a10 = a(0, i8, str, false);
            Matcher matcher = j.m.matcher(str);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (a10 < i8) {
                int a11 = a(a10 + 1, i8, str, true);
                matcher.region(a10, a11);
                if (i11 == -1 && matcher.usePattern(j.m).matches()) {
                    String group = matcher.group(1);
                    sf.j.e(group, "matcher.group(1)");
                    i11 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    sf.j.e(group2, "matcher.group(2)");
                    i14 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    sf.j.e(group3, "matcher.group(3)");
                    i15 = Integer.parseInt(group3);
                } else if (i12 != -1 || !matcher.usePattern(j.f10121l).matches()) {
                    if (i13 == -1) {
                        Pattern pattern = j.f10120k;
                        if (matcher.usePattern(pattern).matches()) {
                            String group4 = matcher.group(1);
                            sf.j.e(group4, "matcher.group(1)");
                            Locale locale = Locale.US;
                            sf.j.e(locale, "US");
                            String lowerCase = group4.toLowerCase(locale);
                            sf.j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            String pattern2 = pattern.pattern();
                            sf.j.e(pattern2, "MONTH_PATTERN.pattern()");
                            i13 = n.G0(pattern2, lowerCase, 0, false, 6) / 4;
                        }
                    }
                    if (i10 == -1 && matcher.usePattern(j.f10119j).matches()) {
                        String group5 = matcher.group(1);
                        sf.j.e(group5, "matcher.group(1)");
                        i10 = Integer.parseInt(group5);
                    }
                } else {
                    String group6 = matcher.group(1);
                    sf.j.e(group6, "matcher.group(1)");
                    i12 = Integer.parseInt(group6);
                }
                a10 = a(a11 + 1, i8, str, false);
            }
            if (70 <= i10 && i10 < 100) {
                i10 += 1900;
            }
            if (i10 >= 0 && i10 < 70) {
                i10 += 2000;
            }
            if (i10 >= 1601) {
                if (i13 != -1) {
                    if (1 <= i12 && i12 < 32) {
                        if (i11 >= 0 && i11 < 24) {
                            if (i14 >= 0 && i14 < 60) {
                                if (i15 >= 0 && i15 < 60) {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(b.f10478e);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i10);
                                    gregorianCalendar.set(2, i13 - 1);
                                    gregorianCalendar.set(5, i12);
                                    gregorianCalendar.set(11, i11);
                                    gregorianCalendar.set(12, i14);
                                    gregorianCalendar.set(13, i15);
                                    gregorianCalendar.set(14, 0);
                                    return gregorianCalendar.getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public j(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f10122a = str;
        this.f10123b = str2;
        this.f10124c = j10;
        this.f10125d = str3;
        this.f10126e = str4;
        this.f10127f = z10;
        this.f10128g = z11;
        this.f10129h = z12;
        this.f10130i = z13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            return sf.j.a(jVar.f10122a, this.f10122a) && sf.j.a(jVar.f10123b, this.f10123b) && jVar.f10124c == this.f10124c && sf.j.a(jVar.f10125d, this.f10125d) && sf.j.a(jVar.f10126e, this.f10126e) && jVar.f10127f == this.f10127f && jVar.f10128g == this.f10128g && jVar.f10129h == this.f10129h && jVar.f10130i == this.f10130i;
        }
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        int a10 = x.a(this.f10126e, x.a(this.f10125d, e.a(this.f10124c, x.a(this.f10123b, x.a(this.f10122a, 527, 31), 31), 31), 31), 31);
        int hashCode = Boolean.hashCode(this.f10128g);
        int hashCode2 = Boolean.hashCode(this.f10129h);
        return Boolean.hashCode(this.f10130i) + ((hashCode2 + ((hashCode + ((Boolean.hashCode(this.f10127f) + a10) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10122a);
        sb2.append('=');
        sb2.append(this.f10123b);
        if (this.f10129h) {
            long j10 = this.f10124c;
            if (j10 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String format = ((DateFormat) c.f12362a.get()).format(new Date(j10));
                sf.j.e(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(format);
            }
        }
        if (!this.f10130i) {
            sb2.append("; domain=");
            sb2.append(this.f10125d);
        }
        sb2.append("; path=");
        sb2.append(this.f10126e);
        if (this.f10127f) {
            sb2.append("; secure");
        }
        if (this.f10128g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        sf.j.e(sb3, "toString()");
        return sb3;
    }
}
