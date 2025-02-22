package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.y1;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m9.f;
import na.d;
import o9.a;
import o9.e;
import t9.b;
import t9.c;
import t9.l;
import u6.q;

@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(c cVar) {
        f fVar = (f) cVar.a(f.class);
        Context context = (Context) cVar.a(Context.class);
        d dVar = (d) cVar.a(d.class);
        q.i(fVar);
        q.i(context);
        q.i(dVar);
        q.i(context.getApplicationContext());
        if (o9.c.f12244c == null) {
            synchronized (o9.c.class) {
                if (o9.c.f12244c == null) {
                    Bundle bundle = new Bundle(1);
                    fVar.a();
                    if ("[DEFAULT]".equals(fVar.f11332b)) {
                        dVar.a(o9.d.f12247a, e.f12248a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", fVar.j());
                    }
                    o9.c.f12244c = new o9.c(y1.c(context, bundle).f5596d);
                }
            }
        }
        return o9.c.f12244c;
    }

    @SuppressLint({"MissingPermission"})
    @Keep
    public List<b<?>> getComponents() {
        b.a<a> a10 = b.a(a.class);
        a10.a(l.a(f.class));
        a10.a(l.a(Context.class));
        a10.a(l.a(d.class));
        a10.f15460f = ag.d.f407b;
        a10.c(2);
        return Arrays.asList(new b[]{a10.b(), ya.f.a("fire-analytics", "21.2.2")});
    }
}
