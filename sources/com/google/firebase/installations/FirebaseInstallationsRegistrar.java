package com.google.firebase.installations;

import androidx.annotation.Keep;
import androidx.lifecycle.s0;
import b3.x;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import oa.g;
import q9.a;
import q9.b;
import ra.e;
import ra.f;
import t9.b;
import t9.c;
import t9.l;
import t9.u;
import u9.o;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static f lambda$getComponents$0(c cVar) {
        return new e((m9.f) cVar.a(m9.f.class), cVar.e(g.class), (ExecutorService) cVar.g(new u(a.class, ExecutorService.class)), new o((Executor) cVar.g(new u(b.class, Executor.class))));
    }

    public List<t9.b<?>> getComponents() {
        b.a<f> a10 = t9.b.a(f.class);
        a10.f15455a = LIBRARY_NAME;
        a10.a(l.a(m9.f.class));
        a10.a(new l(0, 1, g.class));
        a10.a(new l((u<?>) new u(a.class, ExecutorService.class), 1, 0));
        a10.a(new l((u<?>) new u(q9.b.class, Executor.class), 1, 0));
        a10.f15460f = new x();
        s0 s0Var = new s0();
        b.a<oa.f> a11 = t9.b.a(oa.f.class);
        a11.f15459e = 1;
        a11.f15460f = new t9.a(s0Var);
        return Arrays.asList(new t9.b[]{a10.b(), a11.b(), ya.f.a(LIBRARY_NAME, "17.1.3")});
    }
}
