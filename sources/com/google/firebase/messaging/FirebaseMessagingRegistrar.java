package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m9.f;
import na.d;
import oa.h;
import pa.a;
import t9.b;
import t9.c;
import t9.l;
import u9.n;
import ya.g;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(c cVar) {
        return new FirebaseMessaging((f) cVar.a(f.class), (a) cVar.a(a.class), cVar.e(g.class), cVar.e(h.class), (ra.f) cVar.a(ra.f.class), (a6.g) cVar.a(a6.g.class), (d) cVar.a(d.class));
    }

    @Keep
    public List<b<?>> getComponents() {
        b.a<FirebaseMessaging> a10 = b.a(FirebaseMessaging.class);
        a10.f15455a = LIBRARY_NAME;
        a10.a(l.a(f.class));
        a10.a(new l(0, 0, a.class));
        a10.a(new l(0, 1, g.class));
        a10.a(new l(0, 1, h.class));
        a10.a(new l(0, 0, a6.g.class));
        a10.a(l.a(ra.f.class));
        a10.a(l.a(d.class));
        a10.f15460f = new n(2);
        a10.c(1);
        return Arrays.asList(new b[]{a10.b(), ya.f.a(LIBRARY_NAME, "23.1.2")});
    }
}
