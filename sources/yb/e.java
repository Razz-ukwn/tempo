package yb;

import android.os.Bundle;
import ff.j;
import java.util.LinkedHashMap;
import sf.k;
import yb.c;

public abstract class e<T extends c> extends b {

    /* renamed from: w0  reason: collision with root package name */
    public final j f17331w0 = b7.a.x(new a(this));

    /* renamed from: x0  reason: collision with root package name */
    public final LinkedHashMap f17332x0 = new LinkedHashMap();

    public static final class a extends k implements rf.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e<T> f17333a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e<T> eVar) {
            super(0);
            this.f17333a = eVar;
        }

        public final Object d() {
            return this.f17333a.r0();
        }
    }

    public final void F(Bundle bundle) {
        super.F(bundle);
        t0();
        s0().getClass();
    }

    public /* synthetic */ void N() {
        super.N();
        n0();
    }

    public void n0() {
        this.f17332x0.clear();
    }

    public abstract T r0();

    public final T s0() {
        return (c) this.f17331w0.getValue();
    }

    public void t0() {
    }
}
