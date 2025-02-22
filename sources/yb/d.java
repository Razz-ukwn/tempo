package yb;

import android.os.Bundle;
import ff.j;
import java.util.LinkedHashMap;
import sf.k;
import yb.c;

public abstract class d<T extends c> extends a {
    public final j V = b7.a.x(new a(this));

    public static final class a extends k implements rf.a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d<T> f17330a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d<T> dVar) {
            super(0);
            this.f17330a = dVar;
        }

        public final Object d() {
            return this.f17330a.O();
        }
    }

    public d() {
        new LinkedHashMap();
    }

    public abstract T O();

    public final T P() {
        return (c) this.V.getValue();
    }

    public void Q() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q();
        P().getClass();
    }
}
