package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import ff.c;
import j0.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k6.q;
import m9.f;
import oa.e;
import oa.h;
import q9.a;
import t9.b;
import t9.l;
import t9.u;
import ya.d;
import ya.g;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List<b<?>> getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        Class<g> cls = g.class;
        b.a<g> a10 = b.a(cls);
        a10.a(new l(2, 0, d.class));
        a10.f15460f = new q(1);
        arrayList.add(a10.b());
        u uVar = new u(a.class, Executor.class);
        b.a aVar = new b.a(e.class, new Class[]{oa.g.class, h.class});
        aVar.a(l.a(Context.class));
        aVar.a(l.a(f.class));
        aVar.a(new l(2, 0, oa.f.class));
        aVar.a(new l(1, 1, (Class) cls));
        aVar.a(new l((u<?>) uVar, 1, 0));
        aVar.f15460f = new oa.d(uVar);
        arrayList.add(aVar.b());
        arrayList.add(ya.f.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(ya.f.a("fire-core", "20.3.1"));
        arrayList.add(ya.f.a("device-name", a(Build.PRODUCT)));
        arrayList.add(ya.f.a("device-model", a(Build.DEVICE)));
        arrayList.add(ya.f.a("device-brand", a(Build.BRAND)));
        arrayList.add(ya.f.b("android-target-sdk", new o(4)));
        arrayList.add(ya.f.b("android-min-sdk", new j0.e()));
        arrayList.add(ya.f.b("android-platform", new j0.f(6)));
        arrayList.add(ya.f.b("android-installer", new q(1)));
        try {
            str = c.f8701e.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(ya.f.a("kotlin", str));
        }
        return arrayList;
    }
}
