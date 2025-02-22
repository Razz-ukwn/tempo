package i3;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.f;
import sf.j;

public abstract class h extends v {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(p pVar, int i8) {
        super(pVar);
        if (i8 != 1) {
            j.f(pVar, "database");
            return;
        }
        j.f(pVar, "database");
        super(pVar);
    }

    public abstract void c(f fVar, Parcelable parcelable);

    public final void d(Parcelable parcelable) {
        this.f9557a.a();
        AtomicBoolean atomicBoolean = this.f9558b;
        boolean compareAndSet = atomicBoolean.compareAndSet(false, true);
        ff.j jVar = this.f9559c;
        f a10 = compareAndSet ? (f) jVar.getValue() : a();
        try {
            c(a10, parcelable);
            a10.B0();
            if (a10 == ((f) jVar.getValue())) {
                atomicBoolean.set(false);
            }
        } catch (Throwable th) {
            j.f(a10, "statement");
            if (a10 == ((f) jVar.getValue())) {
                atomicBoolean.set(false);
            }
            throw th;
        }
    }
}
