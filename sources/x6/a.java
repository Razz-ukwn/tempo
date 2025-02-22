package x6;

import android.util.Log;
import java.util.Locale;
import u6.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f16968a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16969b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16970c;

    public a(String str, String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str3 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
            sb2.append("] ");
            str2 = sb2.toString();
        }
        this.f16969b = str2;
        this.f16968a = str;
        new i(str, (String) null);
        int i8 = 2;
        while (i8 <= 7 && !Log.isLoggable(this.f16968a, i8)) {
            i8++;
        }
        this.f16970c = i8;
    }

    public final void a(String str, Object... objArr) {
        if (this.f16970c <= 3) {
            Log.d(this.f16968a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f16968a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f16968a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f16969b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f16970c <= 2) {
            Log.v(this.f16968a, d(str, objArr));
        }
    }
}
