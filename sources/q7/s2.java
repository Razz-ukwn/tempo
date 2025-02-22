package q7;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.ta;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import u6.q;

public final class s2 extends j4 {
    public final q2 B = new q2(this, 6, false, false);
    public final q2 C = new q2(this, 6, true, false);
    public final q2 D = new q2(this, 6, false, true);
    public final q2 E = new q2(this, 5, false, false);
    public final q2 F = new q2(this, 5, true, false);
    public final q2 G = new q2(this, 5, false, true);
    public final q2 H = new q2(this, 4, false, false);
    public final q2 I = new q2(this, 3, false, false);
    public final q2 J = new q2(this, 2, false, false);

    /* renamed from: c  reason: collision with root package name */
    public char f13317c = 0;

    /* renamed from: d  reason: collision with root package name */
    public long f13318d = -1;

    /* renamed from: e  reason: collision with root package name */
    public String f13319e;

    public s2(x3 x3Var) {
        super(x3Var);
    }

    public static r2 r(String str) {
        if (str == null) {
            return null;
        }
        return new r2(str);
    }

    public static String s(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String t2 = t(z10, obj);
        String t10 = t(z10, obj2);
        String t11 = t(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(t2)) {
            sb2.append(str2);
            sb2.append(t2);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(t10)) {
            sb2.append(str2);
            sb2.append(t10);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(t11)) {
            sb2.append(str3);
            sb2.append(t11);
        }
        return sb2.toString();
    }

    public static String t(boolean z10, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i8 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return obj.toString();
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l10.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb2 = new StringBuilder();
            if (charAt == '-') {
                str = "-";
            }
            sb2.append(str);
            sb2.append(round);
            sb2.append("...");
            sb2.append(str);
            sb2.append(round2);
            return sb2.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof r2 ? ((r2) obj).f13297a : z10 ? "-" : obj.toString();
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb3 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
            String u7 = u(x3.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i8];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && u(className).equals(u7)) {
                    sb3.append(": ");
                    sb3.append(stackTraceElement);
                    break;
                }
                i8++;
            }
            return sb3.toString();
        }
    }

    public static String u(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        ta.f5537b.zza().zza();
        return ((Boolean) g2.f13058s0.a((Object) null)).booleanValue() ? "" : str;
    }

    public final boolean j() {
        return false;
    }

    public final q2 m() {
        return this.I;
    }

    public final q2 n() {
        return this.B;
    }

    public final q2 o() {
        return this.J;
    }

    public final q2 p() {
        return this.E;
    }

    public final q2 q() {
        return this.G;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String v() {
        String str;
        synchronized (this) {
            try {
                if (this.f13319e == null) {
                    k4 k4Var = this.f13121a;
                    if (((x3) k4Var).f13425d != null) {
                        this.f13319e = ((x3) k4Var).f13425d;
                    } else {
                        ((x3) ((x3) k4Var).C.f13121a).getClass();
                        this.f13319e = "FA";
                    }
                }
                q.i(this.f13319e);
                str = this.f13319e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void w(int i8, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && Log.isLoggable(v(), i8)) {
            Log.println(i8, v(), s(false, str, obj, obj2, obj3));
        }
        if (!z11 && i8 >= 5) {
            q.i(str);
            w3 w3Var = ((x3) this.f13121a).F;
            if (w3Var == null) {
                Log.println(6, v(), "Scheduler not set. Not logging error/warn");
            } else if (!w3Var.f13137b) {
                Log.println(6, v(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i8 >= 9) {
                    i8 = 8;
                }
                w3Var.q(new p2(this, i8, str, obj, obj2, obj3));
            }
        }
    }
}
