package q7;

import java.io.IOException;
import java.util.Map;
import u6.q;

public final class v2 implements Runnable {
    public final Map B;

    /* renamed from: a  reason: collision with root package name */
    public final u2 f13375a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13376b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f13377c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f13378d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13379e;

    public /* synthetic */ v2(String str, u2 u2Var, int i8, IOException iOException, byte[] bArr, Map map) {
        q.i(u2Var);
        this.f13375a = u2Var;
        this.f13376b = i8;
        this.f13377c = iOException;
        this.f13378d = bArr;
        this.f13379e = str;
        this.B = map;
    }

    public final void run() {
        this.f13375a.g(this.f13379e, this.f13376b, this.f13377c, this.f13378d, this.B);
    }
}
