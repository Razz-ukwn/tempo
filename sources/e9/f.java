package e9;

import android.content.Context;
import androidx.lifecycle.u;
import f9.c;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public final u f7882a;

    public f(u uVar) {
        this.f7882a = uVar;
    }

    public final Object zza() {
        Context context = (Context) this.f7882a.f2324b;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
