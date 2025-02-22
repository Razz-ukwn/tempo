package n9;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.p1;
import com.google.android.gms.internal.measurement.q1;
import com.google.android.gms.internal.measurement.y1;
import com.google.android.recaptcha.RecaptchaDefinitions;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import q7.b5;

public final class a implements b5 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y1 f11614a;

    public a(y1 y1Var) {
        this.f11614a = y1Var;
    }

    public final List a(String str, String str2) {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        n0 n0Var = new n0();
        y1Var.b(new e1(y1Var, str, str2, n0Var));
        List list = (List) n0.L(n0Var.b(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map b(String str, String str2, boolean z10) {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        n0 n0Var = new n0();
        y1Var.b(new m1(y1Var, str, str2, z10, n0Var));
        Bundle b10 = n0Var.b(5000);
        if (b10 == null || b10.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b10.size());
        for (String next : b10.keySet()) {
            Object obj = b10.get(next);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public final void c(Bundle bundle) {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        y1Var.b(new c1(y1Var, bundle, 0));
    }

    public final void d(String str, String str2, Bundle bundle) {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        y1Var.b(new q1(y1Var, str, str2, bundle));
    }

    public final void e(String str) {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        y1Var.b(new c1(y1Var, str, 1));
    }

    public final void f(String str, String str2, Bundle bundle) {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        y1Var.b(new d1(y1Var, str, str2, bundle));
    }

    public final void g(String str) {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        y1Var.b(new h1(y1Var, str, 0));
    }

    public final int zza(String str) {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        n0 n0Var = new n0();
        y1Var.b(new p1(y1Var, str, n0Var));
        Integer num = (Integer) n0.L(n0Var.b(RecaptchaDefinitions.DEFAULT_TIMEOUT_INIT), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        n0 n0Var = new n0();
        y1Var.b(new l1(y1Var, n0Var));
        Long l10 = (Long) n0.L(n0Var.b(500), Long.class);
        if (l10 != null) {
            return l10.longValue();
        }
        long nanoTime = System.nanoTime();
        y1Var.f5594b.getClass();
        long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
        int i8 = y1Var.f5598f + 1;
        y1Var.f5598f = i8;
        return nextLong + ((long) i8);
    }

    public final String zzh() {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        n0 n0Var = new n0();
        y1Var.b(new k1(y1Var, n0Var));
        return n0Var.c(50);
    }

    public final String zzi() {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        n0 n0Var = new n0();
        y1Var.b(new h1(y1Var, n0Var, 1));
        return n0Var.c(500);
    }

    public final String zzj() {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        n0 n0Var = new n0();
        y1Var.b(new c1(y1Var, n0Var, 2));
        return n0Var.c(500);
    }

    public final String zzk() {
        y1 y1Var = this.f11614a;
        y1Var.getClass();
        n0 n0Var = new n0();
        y1Var.b(new j1(y1Var, n0Var, 0));
        return n0Var.c(500);
    }
}
