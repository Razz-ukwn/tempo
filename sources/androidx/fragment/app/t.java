package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.b0;
import androidx.lifecycle.j;
import androidx.savedstate.a;

public final /* synthetic */ class t implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2139a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2140b;

    public /* synthetic */ t(Object obj, int i8) {
        this.f2139a = i8;
        this.f2140b = obj;
    }

    public final Bundle a() {
        int i8 = this.f2139a;
        Object obj = this.f2140b;
        switch (i8) {
            case 0:
                x xVar = (x) obj;
                do {
                } while (x.J(xVar.I()));
                xVar.Q.f(j.a.ON_STOP);
                return new Bundle();
            default:
                return b0.a((b0) obj);
        }
    }
}
