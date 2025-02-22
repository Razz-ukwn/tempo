package og;

import java.net.ProtocolException;
import jg.w;
import sf.j;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final w f12378a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12379b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12380c;

    public static final class a {
        public static i a(String str) {
            int i8;
            String str2;
            j.f(str, "statusLine");
            boolean x02 = zf.j.x0(str, "HTTP/1.", false);
            w wVar = w.f10214b;
            if (x02) {
                i8 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException(j.k(str, "Unexpected status line: "));
                }
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        wVar = w.f10215c;
                    } else {
                        throw new ProtocolException(j.k(str, "Unexpected status line: "));
                    }
                }
            } else if (zf.j.x0(str, "ICY ", false)) {
                i8 = 4;
            } else {
                throw new ProtocolException(j.k(str, "Unexpected status line: "));
            }
            int i10 = i8 + 3;
            if (str.length() >= i10) {
                try {
                    String substring = str.substring(i8, i10);
                    j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i10) {
                        str2 = "";
                    } else if (str.charAt(i10) == ' ') {
                        str2 = str.substring(i8 + 4);
                        j.e(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException(j.k(str, "Unexpected status line: "));
                    }
                    return new i(wVar, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(j.k(str, "Unexpected status line: "));
                }
            } else {
                throw new ProtocolException(j.k(str, "Unexpected status line: "));
            }
        }
    }

    public i(w wVar, int i8, String str) {
        this.f12378a = wVar;
        this.f12379b = i8;
        this.f12380c = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f12378a == w.f10214b) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f12379b);
        sb2.append(' ');
        sb2.append(this.f12380c);
        String sb3 = sb2.toString();
        j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
