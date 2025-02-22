package q7;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import u6.q;

public final class u5 implements Runnable {
    public final /* synthetic */ x5 B;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13364a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13365b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13366c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c7 f13367d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f13368e;

    public u5(x5 x5Var, AtomicReference atomicReference, String str, String str2, c7 c7Var, boolean z10) {
        this.B = x5Var;
        this.f13364a = atomicReference;
        this.f13365b = str;
        this.f13366c = str2;
        this.f13367d = c7Var;
        this.f13368e = z10;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f13364a) {
            try {
                x5 x5Var = this.B;
                j2 j2Var = x5Var.f13433d;
                if (j2Var == null) {
                    s2 s2Var = ((x3) x5Var.f13121a).E;
                    x3.l(s2Var);
                    s2Var.B.e("(legacy) Failed to get user properties; not connected to service", (Object) null, this.f13365b, this.f13366c);
                    this.f13364a.set(Collections.emptyList());
                    this.f13364a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    q.i(this.f13367d);
                    this.f13364a.set(j2Var.m(this.f13365b, this.f13366c, this.f13368e, this.f13367d));
                } else {
                    this.f13364a.set(j2Var.d((String) null, this.f13365b, this.f13366c, this.f13368e));
                }
                this.B.t();
                atomicReference = this.f13364a;
                atomicReference.notify();
            } catch (RemoteException e10) {
                try {
                    s2 s2Var2 = ((x3) this.B.f13121a).E;
                    x3.l(s2Var2);
                    s2Var2.B.e("(legacy) Failed to get user properties; remote exception", (Object) null, this.f13365b, e10);
                    this.f13364a.set(Collections.emptyList());
                    atomicReference = this.f13364a;
                } catch (Throwable th) {
                    this.f13364a.notify();
                    throw th;
                }
            }
        }
    }
}
