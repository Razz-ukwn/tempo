package i3;

import ff.j;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.f;
import sf.k;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public final p f9557a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f9558b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public final j f9559c = b7.a.x(new a(this));

    public static final class a extends k implements rf.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v f9560a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(v vVar) {
            super(0);
            this.f9560a = vVar;
        }

        public final Object d() {
            return this.f9560a.a();
        }
    }

    public v(p pVar) {
        sf.j.f(pVar, "database");
        this.f9557a = pVar;
    }

    public final f a() {
        String b10 = b();
        p pVar = this.f9557a;
        pVar.getClass();
        sf.j.f(b10, "sql");
        pVar.a();
        pVar.b();
        return pVar.f().N().o(b10);
    }

    public abstract String b();
}
