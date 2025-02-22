package e5;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.i0;
import androidx.fragment.app.p;
import com.bumptech.glide.b;
import com.bumptech.glide.m;
import java.util.HashSet;

public class q extends p {
    public p A0;

    /* renamed from: v0  reason: collision with root package name */
    public final a f7839v0;

    /* renamed from: w0  reason: collision with root package name */
    public final a f7840w0 = new a();

    /* renamed from: x0  reason: collision with root package name */
    public final HashSet f7841x0 = new HashSet();

    /* renamed from: y0  reason: collision with root package name */
    public q f7842y0;

    /* renamed from: z0  reason: collision with root package name */
    public m f7843z0;

    public class a implements m {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + q.this + "}";
        }
    }

    public q() {
        a aVar = new a();
        this.f7839v0 = aVar;
    }

    public final void I(Context context) {
        super.I(context);
        p pVar = this;
        while (true) {
            p pVar2 = pVar.S;
            if (pVar2 == null) {
                break;
            }
            pVar = pVar2;
        }
        i0 i0Var = pVar.P;
        if (i0Var != null) {
            try {
                n0(q(), i0Var);
            } catch (IllegalStateException e10) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public final void M() {
        this.f2062b0 = true;
        this.f7839v0.c();
        q qVar = this.f7842y0;
        if (qVar != null) {
            qVar.f7841x0.remove(this);
            this.f7842y0 = null;
        }
    }

    public final void O() {
        this.f2062b0 = true;
        this.A0 = null;
        q qVar = this.f7842y0;
        if (qVar != null) {
            qVar.f7841x0.remove(this);
            this.f7842y0 = null;
        }
    }

    public final void X() {
        this.f2062b0 = true;
        this.f7839v0.d();
    }

    public final void Y() {
        this.f2062b0 = true;
        this.f7839v0.e();
    }

    public final void n0(Context context, i0 i0Var) {
        q qVar = this.f7842y0;
        if (qVar != null) {
            qVar.f7841x0.remove(this);
            this.f7842y0 = null;
        }
        q e10 = b.b(context).B.e(i0Var, (p) null);
        this.f7842y0 = e10;
        if (!equals(e10)) {
            this.f7842y0.f7841x0.add(this);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        p pVar = this.S;
        if (pVar == null) {
            pVar = this.A0;
        }
        sb2.append(pVar);
        sb2.append("}");
        return sb2.toString();
    }
}
