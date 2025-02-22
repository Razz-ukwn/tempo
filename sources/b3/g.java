package b3;

import android.os.Bundle;
import b3.f;
import ff.d;
import java.lang.reflect.Method;
import java.util.Arrays;
import rf.a;
import sf.j;
import xf.b;

public final class g<Args extends f> implements d<Args> {

    /* renamed from: a  reason: collision with root package name */
    public final b<Args> f3057a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Bundle> f3058b;

    /* renamed from: c  reason: collision with root package name */
    public Args f3059c;

    public g(sf.d dVar, a aVar) {
        this.f3057a = dVar;
        this.f3058b = aVar;
    }

    public final Object getValue() {
        Args args = this.f3059c;
        if (args != null) {
            return args;
        }
        Bundle d10 = this.f3058b.d();
        o.a<b<? extends f>, Method> aVar = h.f3065b;
        b<Args> bVar = this.f3057a;
        Method orDefault = aVar.getOrDefault(bVar, null);
        if (orDefault == null) {
            orDefault = cb.b.y(bVar).getMethod("fromBundle", (Class[]) Arrays.copyOf(h.f3064a, 1));
            aVar.put(bVar, orDefault);
            j.e(orDefault, "navArgsClass.java.getMet…hod\n                    }");
        }
        Args invoke = orDefault.invoke((Object) null, new Object[]{d10});
        if (invoke != null) {
            Args args2 = (f) invoke;
            this.f3059c = args2;
            return args2;
        }
        throw new NullPointerException("null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
    }
}
