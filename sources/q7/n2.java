package q7;

import ag.d;
import android.os.Bundle;
import b2.c;
import gc.b;
import h0.e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import r3.s;
import u6.q;

public final class n2 {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f13214b = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference f13215c = new AtomicReference();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReference f13216d = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    public final s f13217a;

    public n2(s sVar) {
        this.f13217a = sVar;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        q.i(atomicReference);
        q.a(strArr.length == strArr2.length);
        for (int i8 = 0; i8 < strArr.length; i8++) {
            String str3 = strArr[i8];
            if (str == str3 || str.equals(str3)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i8];
                    if (str2 == null) {
                        str2 = strArr2[i8] + "(" + strArr[i8] + ")";
                        strArr3[i8] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder c3 = e.c("[");
        for (Bundle bundle : objArr) {
            String b10 = bundle instanceof Bundle ? b(bundle) : String.valueOf(bundle);
            if (b10 != null) {
                if (c3.length() != 1) {
                    c3.append(", ");
                }
                c3.append(b10);
            }
        }
        c3.append("]");
        return c3.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f13217a.h()) {
            return bundle.toString();
        }
        StringBuilder c3 = e.c("Bundle[{");
        for (String next : bundle.keySet()) {
            if (c3.length() != 8) {
                c3.append(", ");
            }
            c3.append(e(next));
            c3.append("=");
            Object obj = bundle.get(next);
            c3.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        c3.append("}]");
        return c3.toString();
    }

    public final String c(s sVar) {
        s sVar2 = this.f13217a;
        if (!sVar2.h()) {
            return sVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(sVar.f13313c);
        sb2.append(",name=");
        sb2.append(d(sVar.f13311a));
        sb2.append(",params=");
        q qVar = sVar.f13312b;
        sb2.append(qVar == null ? null : !sVar2.h() ? qVar.toString() : b(qVar.w()));
        return sb2.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f13217a.h() ? str : g(str, cb.e.f3894a0, cb.e.Y, f13214b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f13217a.h() ? str : g(str, d.f410e, d.f409d, f13215c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f13217a.h() ? str : str.startsWith("_exp_") ? c.a("experiment_id(", str, ")") : g(str, b.K, b.J, f13216d);
    }
}
