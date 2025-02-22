package ob;

import android.database.Cursor;
import e9.c;
import i3.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class h implements Callable<List<String>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f12282a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f12283b;

    public h(f fVar, r rVar) {
        this.f12283b = fVar;
        this.f12282a = rVar;
    }

    public final Object call() {
        Cursor i8 = c.i(this.f12283b.f12268a, this.f12282a);
        try {
            ArrayList arrayList = new ArrayList(i8.getCount());
            while (i8.moveToNext()) {
                arrayList.add(i8.isNull(0) ? null : i8.getString(0));
            }
            return arrayList;
        } finally {
            i8.close();
        }
    }

    public final void finalize() {
        this.f12282a.j();
    }
}
