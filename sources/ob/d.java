package ob;

import android.database.Cursor;
import e9.c;
import i3.p;
import i3.r;
import java.util.concurrent.Callable;

public final class d implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f12264a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f12265b;

    public d(f fVar, r rVar) {
        this.f12265b = fVar;
        this.f12264a = rVar;
    }

    public final Object call() {
        String str;
        p pVar = this.f12265b.f12268a;
        r rVar = this.f12264a;
        Cursor i8 = c.i(pVar, rVar);
        try {
            if (i8.moveToFirst()) {
                if (!i8.isNull(0)) {
                    str = i8.getString(0);
                    return str;
                }
            }
            str = null;
            return str;
        } finally {
            i8.close();
            rVar.j();
        }
    }
}
