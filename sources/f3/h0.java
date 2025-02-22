package f3;

import androidx.compose.ui.platform.b3;
import cg.e;
import f3.v2;
import ff.m;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.p0;
import rf.p;
import sf.j;

public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f8259a = new b(this);

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public v2 f8260a;

        /* renamed from: b  reason: collision with root package name */
        public final p0 f8261b = b3.a(1, 0, e.f4021b);

        public a(h0 h0Var) {
            j.f(h0Var, "this$0");
        }
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a f8262a;

        /* renamed from: b  reason: collision with root package name */
        public final a f8263b;

        /* renamed from: c  reason: collision with root package name */
        public v2.a f8264c;

        /* renamed from: d  reason: collision with root package name */
        public final ReentrantLock f8265d = new ReentrantLock();

        public b(h0 h0Var) {
            j.f(h0Var, "this$0");
            this.f8262a = new a(h0Var);
            this.f8263b = new a(h0Var);
        }

        public final void a(v2.a aVar, p<? super a, ? super a, m> pVar) {
            ReentrantLock reentrantLock = this.f8265d;
            reentrantLock.lock();
            if (aVar != null) {
                try {
                    this.f8264c = aVar;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            pVar.invoke(this.f8262a, this.f8263b);
            m mVar = m.f8717a;
            reentrantLock.unlock();
        }
    }

    public final p0 a(o0 o0Var) {
        j.f(o0Var, "loadType");
        int ordinal = o0Var.ordinal();
        b bVar = this.f8259a;
        if (ordinal == 1) {
            return bVar.f8262a.f8261b;
        }
        if (ordinal == 2) {
            return bVar.f8263b.f8261b;
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }
}
