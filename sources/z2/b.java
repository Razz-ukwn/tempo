package z2;

import android.content.Context;
import b3.x;

public class b<D> {

    /* renamed from: a  reason: collision with root package name */
    public int f17668a;

    /* renamed from: b  reason: collision with root package name */
    public a<D> f17669b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17670c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17671d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17672e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17673f = false;

    public interface a<D> {
    }

    public b(Context context) {
        context.getApplicationContext();
    }

    public final void a() {
        a aVar = (a) this;
        if (aVar.f17666h != null) {
            if (!aVar.f17670c) {
                aVar.f17673f = true;
            }
            if (aVar.f17667i != null) {
                aVar.f17666h.getClass();
                aVar.f17666h = null;
                return;
            }
            aVar.f17666h.getClass();
            a<D>.a aVar2 = aVar.f17666h;
            aVar2.f17677d.set(true);
            if (aVar2.f17675b.cancel(false)) {
                aVar.f17667i = aVar.f17666h;
            }
            aVar.f17666h = null;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        cb.b.p(this, sb2);
        sb2.append(" id=");
        return x.b(sb2, this.f17668a, "}");
    }
}
