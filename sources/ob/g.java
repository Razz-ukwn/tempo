package ob;

import android.database.Cursor;
import e9.c;
import i3.p;
import i3.r;
import java.util.concurrent.Callable;

public final class g implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f12280a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f12281b;

    public g(f fVar, r rVar) {
        this.f12281b = fVar;
        this.f12280a = rVar;
    }

    public final Object call() {
        p pVar = this.f12281b.f12268a;
        r rVar = this.f12280a;
        Cursor i8 = c.i(pVar, rVar);
        try {
            Boolean bool = null;
            if (i8.moveToFirst()) {
                boolean z10 = false;
                Integer valueOf = i8.isNull(0) ? null : Integer.valueOf(i8.getInt(0));
                if (valueOf != null) {
                    if (valueOf.intValue() != 0) {
                        z10 = true;
                    }
                    bool = Boolean.valueOf(z10);
                }
            }
            return bool;
        } finally {
            i8.close();
            rVar.j();
        }
    }
}
