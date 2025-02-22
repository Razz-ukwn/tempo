package q7;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import u6.q;

public final class s5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f13323a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13324b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f13325c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c7 f13326d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x5 f13327e;

    public s5(x5 x5Var, AtomicReference atomicReference, String str, String str2, c7 c7Var) {
        this.f13327e = x5Var;
        this.f13323a = atomicReference;
        this.f13324b = str;
        this.f13325c = str2;
        this.f13326d = c7Var;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f13323a) {
            try {
                x5 x5Var = this.f13327e;
                j2 j2Var = x5Var.f13433d;
                if (j2Var == null) {
                    s2 s2Var = ((x3) x5Var.f13121a).E;
                    x3.l(s2Var);
                    s2Var.B.e("(legacy) Failed to get conditional properties; not connected to service", (Object) null, this.f13324b, this.f13325c);
                    this.f13323a.set(Collections.emptyList());
                    this.f13323a.notify();
                    return;
                }
                if (TextUtils.isEmpty((CharSequence) null)) {
                    q.i(this.f13326d);
                    this.f13323a.set(j2Var.t(this.f13324b, this.f13325c, this.f13326d));
                } else {
                    this.f13323a.set(j2Var.o((String) null, this.f13324b, this.f13325c));
                }
                this.f13327e.t();
                atomicReference = this.f13323a;
                atomicReference.notify();
            } catch (RemoteException e10) {
                try {
                    s2 s2Var2 = ((x3) this.f13327e.f13121a).E;
                    x3.l(s2Var2);
                    s2Var2.B.e("(legacy) Failed to get conditional properties; remote exception", (Object) null, this.f13324b, e10);
                    this.f13323a.set(Collections.emptyList());
                    atomicReference = this.f13323a;
                } catch (Throwable th) {
                    this.f13323a.notify();
                    throw th;
                }
            }
        }
    }
}
