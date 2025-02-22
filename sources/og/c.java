package og;

import ff.m;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kg.b;
import sf.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12362a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f12363b;

    /* renamed from: c  reason: collision with root package name */
    public static final DateFormat[] f12364c;

    public static final class a extends ThreadLocal<DateFormat> {
        public final Object initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(b.f10478e);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f12363b = strArr;
        f12364c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        j.f(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f12362a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f12363b;
        synchronized (strArr) {
            int length = strArr.length;
            int i8 = 0;
            while (i8 < length) {
                int i10 = i8 + 1;
                DateFormat[] dateFormatArr = f12364c;
                DateFormat dateFormat = dateFormatArr[i8];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f12363b[i8], Locale.US);
                    dateFormat.setTimeZone(b.f10478e);
                    dateFormatArr[i8] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
                i8 = i10;
            }
            m mVar = m.f8717a;
            return null;
        }
    }
}
