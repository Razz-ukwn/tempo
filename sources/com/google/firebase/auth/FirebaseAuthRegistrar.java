package com.google.firebase.auth;

import ag.v1;
import androidx.annotation.Keep;
import androidx.lifecycle.s0;
import com.google.android.gms.internal.p000firebaseauthapi.nh;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m9.f;
import oa.g;
import s9.o0;
import t9.a;
import t9.b;
import t9.c;
import t9.l;

@Keep
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(c cVar) {
        return new o0((f) cVar.a(f.class), cVar.e(nh.class), cVar.e(g.class));
    }

    @Keep
    public List<b<?>> getComponents() {
        b.a aVar = new b.a(FirebaseAuth.class, new Class[]{s9.b.class});
        aVar.a(l.a(f.class));
        aVar.a(new l(1, 1, g.class));
        aVar.a(new l(0, 1, nh.class));
        aVar.f15460f = v1.I;
        s0 s0Var = new s0();
        b.a<oa.f> a10 = b.a(oa.f.class);
        a10.f15459e = 1;
        a10.f15460f = new a(s0Var);
        return Arrays.asList(new b[]{aVar.b(), a10.b(), ya.f.a("fire-auth", "21.3.0")});
    }
}
