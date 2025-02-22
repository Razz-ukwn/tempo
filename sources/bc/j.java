package bc;

import android.content.Context;
import androidx.lifecycle.j0;
import androidx.lifecycle.m0;
import cc.d;
import pb.h;
import rb.c;

public final class j implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3626a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3627b;

    public j(Context context, int i8) {
        this.f3626a = i8;
        if (i8 != 1) {
            sf.j.f(context, "context");
            this.f3627b = new h(context);
            return;
        }
        sf.j.f(context, "context");
        this.f3627b = new pb.j(context);
    }

    public final j0 a(Class cls) {
        int i8 = this.f3626a;
        Object obj = this.f3627b;
        switch (i8) {
            case 0:
                return new i((c) obj);
            default:
                return new d((rb.d) obj);
        }
    }
}
