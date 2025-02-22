package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m9.f;
import t9.b;
import t9.l;
import v9.c;
import v9.e;
import w9.a;

public class CrashlyticsRegistrar implements ComponentRegistrar {
    public final List<b<?>> getComponents() {
        b.a<e> a10 = b.a(e.class);
        a10.f15455a = "fire-cls";
        a10.a(l.a(f.class));
        a10.a(l.a(ra.f.class));
        a10.a(new l(0, 2, a.class));
        a10.a(new l(0, 2, o9.a.class));
        a10.f15460f = new c(this);
        a10.c(2);
        return Arrays.asList(new b[]{a10.b(), ya.f.a("fire-cls", "18.3.6")});
    }
}
