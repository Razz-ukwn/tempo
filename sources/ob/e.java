package ob;

import android.database.Cursor;
import e9.c;
import i3.p;
import i3.r;
import java.util.concurrent.Callable;

public final class e implements Callable<Long> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f12266a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f12267b;

    public e(f fVar, r rVar) {
        this.f12267b = fVar;
        this.f12266a = rVar;
    }

    public final Object call() {
        Long l10;
        p pVar = this.f12267b.f12268a;
        r rVar = this.f12266a;
        Cursor i8 = c.i(pVar, rVar);
        try {
            if (i8.moveToFirst()) {
                if (!i8.isNull(0)) {
                    l10 = Long.valueOf(i8.getLong(0));
                    return l10;
                }
            }
            l10 = null;
            return l10;
        } finally {
            i8.close();
            rVar.j();
        }
    }
}
