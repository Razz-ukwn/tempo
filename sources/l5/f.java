package l5;

import ag.b1;
import e5.o;

public final class f implements g<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f10994a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f10995b;

    public f(o.a aVar) {
        this.f10995b = aVar;
    }

    public final Object get() {
        if (this.f10994a == null) {
            synchronized (this) {
                if (this.f10994a == null) {
                    Object obj = this.f10995b.get();
                    b1.b(obj);
                    this.f10994a = obj;
                }
            }
        }
        return this.f10994a;
    }
}
