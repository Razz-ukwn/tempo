package q7;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import b7.c;
import java.lang.reflect.InvocationTargetException;
import u6.q;

public final class f extends i4 {

    /* renamed from: b  reason: collision with root package name */
    public Boolean f12982b;

    /* renamed from: c  reason: collision with root package name */
    public e f12983c = cb.f.f3901b;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f12984d;

    public f(x3 x3Var) {
        super(x3Var);
    }

    public final String j(String str) {
        Class<String> cls = String.class;
        k4 k4Var = this.f13121a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, ""});
            q.i(str2);
            return str2;
        } catch (ClassNotFoundException e10) {
            s2 s2Var = ((x3) k4Var).E;
            x3.l(s2Var);
            s2Var.B.c(e10, "Could not find SystemProperties class");
            return "";
        } catch (NoSuchMethodException e11) {
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.B.c(e11, "Could not find SystemProperties.get() method");
            return "";
        } catch (IllegalAccessException e12) {
            s2 s2Var3 = ((x3) k4Var).E;
            x3.l(s2Var3);
            s2Var3.B.c(e12, "Could not access SystemProperties.get()");
            return "";
        } catch (InvocationTargetException e13) {
            s2 s2Var4 = ((x3) k4Var).E;
            x3.l(s2Var4);
            s2Var4.B.c(e13, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final double k(String str, f2 f2Var) {
        if (str == null) {
            return ((Double) f2Var.a((Object) null)).doubleValue();
        }
        String f10 = this.f12983c.f(str, f2Var.f12988a);
        if (TextUtils.isEmpty(f10)) {
            return ((Double) f2Var.a((Object) null)).doubleValue();
        }
        try {
            return ((Double) f2Var.a(Double.valueOf(Double.parseDouble(f10)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) f2Var.a((Object) null)).doubleValue();
        }
    }

    public final int l(String str, f2 f2Var) {
        if (str == null) {
            return ((Integer) f2Var.a((Object) null)).intValue();
        }
        String f10 = this.f12983c.f(str, f2Var.f12988a);
        if (TextUtils.isEmpty(f10)) {
            return ((Integer) f2Var.a((Object) null)).intValue();
        }
        try {
            return ((Integer) f2Var.a(Integer.valueOf(Integer.parseInt(f10)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) f2Var.a((Object) null)).intValue();
        }
    }

    public final int m(String str, f2 f2Var, int i8, int i10) {
        return Math.max(Math.min(l(str, f2Var), i10), i8);
    }

    public final void n() {
        ((x3) this.f13121a).getClass();
    }

    public final long o(String str, f2 f2Var) {
        if (str == null) {
            return ((Long) f2Var.a((Object) null)).longValue();
        }
        String f10 = this.f12983c.f(str, f2Var.f12988a);
        if (TextUtils.isEmpty(f10)) {
            return ((Long) f2Var.a((Object) null)).longValue();
        }
        try {
            return ((Long) f2Var.a(Long.valueOf(Long.parseLong(f10)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) f2Var.a((Object) null)).longValue();
        }
    }

    public final Bundle p() {
        k4 k4Var = this.f13121a;
        try {
            if (((x3) k4Var).f13419a.getPackageManager() == null) {
                s2 s2Var = ((x3) k4Var).E;
                x3.l(s2Var);
                s2Var.B.b("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a10 = c.a(((x3) k4Var).f13419a).a(128, ((x3) k4Var).f13419a.getPackageName());
            if (a10 != null) {
                return a10.metaData;
            }
            s2 s2Var2 = ((x3) k4Var).E;
            x3.l(s2Var2);
            s2Var2.B.b("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            s2 s2Var3 = ((x3) k4Var).E;
            x3.l(s2Var3);
            s2Var3.B.c(e10, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean q(String str) {
        q.f(str);
        Bundle p10 = p();
        if (p10 == null) {
            s2 s2Var = ((x3) this.f13121a).E;
            x3.l(s2Var);
            s2Var.B.b("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!p10.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(p10.getBoolean(str));
        }
    }

    public final boolean r(String str, f2 f2Var) {
        if (str == null) {
            return ((Boolean) f2Var.a((Object) null)).booleanValue();
        }
        String f10 = this.f12983c.f(str, f2Var.f12988a);
        return TextUtils.isEmpty(f10) ? ((Boolean) f2Var.a((Object) null)).booleanValue() : ((Boolean) f2Var.a(Boolean.valueOf("1".equals(f10)))).booleanValue();
    }

    public final boolean s() {
        Boolean q10 = q("google_analytics_automatic_screen_reporting_enabled");
        return q10 == null || q10.booleanValue();
    }

    public final boolean t() {
        ((x3) this.f13121a).getClass();
        Boolean q10 = q("firebase_analytics_collection_deactivated");
        return q10 != null && q10.booleanValue();
    }

    public final boolean u(String str) {
        return "1".equals(this.f12983c.f(str, "measurement.event_sampling_enabled"));
    }

    public final boolean v() {
        if (this.f12982b == null) {
            Boolean q10 = q("app_measurement_lite");
            this.f12982b = q10;
            if (q10 == null) {
                this.f12982b = Boolean.FALSE;
            }
        }
        return this.f12982b.booleanValue() || !((x3) this.f13121a).f13426e;
    }
}
