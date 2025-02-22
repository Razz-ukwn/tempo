package q7;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import androidx.activity.g;
import z6.e;

public final class p2 implements Runnable {
    public final /* synthetic */ s2 B;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13266a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13267b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13268c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f13269d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f13270e;

    public p2(s2 s2Var, int i8, String str, Object obj, Object obj2, Object obj3) {
        this.B = s2Var;
        this.f13266a = i8;
        this.f13267b = str;
        this.f13268c = obj;
        this.f13269d = obj2;
        this.f13270e = obj3;
    }

    public final void run() {
        g3 g3Var = ((x3) this.B.f13121a).D;
        x3.j(g3Var);
        if (g3Var.f13137b) {
            s2 s2Var = this.B;
            if (s2Var.f13317c == 0) {
                f fVar = ((x3) s2Var.f13121a).C;
                if (fVar.f12984d == null) {
                    synchronized (fVar) {
                        if (fVar.f12984d == null) {
                            ApplicationInfo applicationInfo = ((x3) fVar.f13121a).f13419a.getApplicationInfo();
                            String a10 = e.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                fVar.f12984d = Boolean.valueOf(str != null && str.equals(a10));
                            }
                            if (fVar.f12984d == null) {
                                fVar.f12984d = Boolean.TRUE;
                                s2 s2Var2 = ((x3) fVar.f13121a).E;
                                x3.l(s2Var2);
                                s2Var2.B.b("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (fVar.f12984d.booleanValue()) {
                    s2 s2Var3 = this.B;
                    ((x3) s2Var3.f13121a).getClass();
                    s2Var3.f13317c = 'C';
                } else {
                    s2 s2Var4 = this.B;
                    ((x3) s2Var4.f13121a).getClass();
                    s2Var4.f13317c = 'c';
                }
            }
            s2 s2Var5 = this.B;
            if (s2Var5.f13318d < 0) {
                ((x3) s2Var5.f13121a).C.n();
                s2Var5.f13318d = 77000;
            }
            char charAt = "01VDIWEA?".charAt(this.f13266a);
            s2 s2Var6 = this.B;
            char c3 = s2Var6.f13317c;
            long j10 = s2Var6.f13318d;
            String s10 = s2.s(true, this.f13267b, this.f13268c, this.f13269d, this.f13270e);
            StringBuilder sb2 = new StringBuilder("2");
            sb2.append(charAt);
            sb2.append(c3);
            sb2.append(j10);
            String a11 = g.a(sb2, ":", s10);
            if (a11.length() > 1024) {
                a11 = this.f13267b.substring(0, 1024);
            }
            e3 e3Var = g3Var.f13073d;
            if (e3Var != null) {
                g3 g3Var2 = e3Var.f12976e;
                g3Var2.i();
                if (e3Var.f12976e.m().getLong(e3Var.f12972a, 0) == 0) {
                    e3Var.a();
                }
                if (a11 == null) {
                    a11 = "";
                }
                SharedPreferences m = g3Var2.m();
                String str2 = e3Var.f12973b;
                long j11 = m.getLong(str2, 0);
                int i8 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                String str3 = e3Var.f12974c;
                if (i8 <= 0) {
                    SharedPreferences.Editor edit = g3Var2.m().edit();
                    edit.putString(str3, a11);
                    edit.putLong(str2, 1);
                    edit.apply();
                    return;
                }
                a7 a7Var = ((x3) g3Var2.f13121a).H;
                x3.j(a7Var);
                long j12 = j11 + 1;
                SharedPreferences.Editor edit2 = g3Var2.m().edit();
                if ((a7Var.r().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12) {
                    edit2.putString(str3, a11);
                }
                edit2.putLong(str2, j12);
                edit2.apply();
                return;
            }
            return;
        }
        Log.println(6, this.B.v(), "Persisted config not initialized. Not logging error/warn");
    }
}
