package f3;

import f3.f2;
import ff.m;
import gf.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import rf.a;
import rf.l;
import sf.j;

public final class k0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final l<T, m> f8296a;

    /* renamed from: b  reason: collision with root package name */
    public final a<Boolean> f8297b = null;

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantLock f8298c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f8299d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f8300e;

    public k0(f2.c cVar) {
        j.f(cVar, "callbackInvoker");
        this.f8296a = cVar;
    }

    public final void a() {
        if (!this.f8300e) {
            ReentrantLock reentrantLock = this.f8298c;
            reentrantLock.lock();
            try {
                if (!this.f8300e) {
                    this.f8300e = true;
                    ArrayList arrayList = this.f8299d;
                    List<Object> O0 = q.O0(arrayList);
                    arrayList.clear();
                    m mVar = m.f8717a;
                    reentrantLock.unlock();
                    for (Object invoke : O0) {
                        this.f8296a.invoke(invoke);
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
