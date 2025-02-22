package q7;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import org.checkerframework.dataflow.qual.Pure;
import q2.d;
import u6.q;
import z6.b;

public class i4 implements k4, z6, u2 {

    /* renamed from: a  reason: collision with root package name */
    public final k4 f13121a;

    public /* synthetic */ i4(k4 k4Var) {
        this.f13121a = k4Var;
    }

    @Pure
    public final b a() {
        throw null;
    }

    public final void b(String str, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        k4 k4Var = this.f13121a;
        if (isEmpty) {
            a5 a5Var = (a5) k4Var;
            ((x3) a5Var.f13121a).J.getClass();
            a5Var.o("auto", "_err", bundle, true, true, System.currentTimeMillis());
            return;
        }
        ((a5) k4Var).getClass();
        throw new IllegalStateException("Unexpected call on client side");
    }

    @Pure
    public final d c() {
        throw null;
    }

    @Pure
    public final Context d() {
        throw null;
    }

    @Pure
    public final s2 e() {
        throw null;
    }

    public final void g(String str, int i8, Throwable th, byte[] bArr, Map map) {
        ((t6) this.f13121a).l(str, i8, th, bArr, map);
    }

    @Pure
    public final w3 h() {
        throw null;
    }

    public void i() {
        w3 w3Var = ((x3) this.f13121a).F;
        x3.l(w3Var);
        w3Var.i();
    }

    public /* synthetic */ i4(x3 x3Var) {
        q.i(x3Var);
        this.f13121a = x3Var;
    }
}
