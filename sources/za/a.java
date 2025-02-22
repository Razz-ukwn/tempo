package za;

import android.os.Trace;
import t9.b;
import t9.e;
import t9.v;

public final /* synthetic */ class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17917a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f17918b;

    public /* synthetic */ a(String str, b bVar) {
        this.f17917a = str;
        this.f17918b = bVar;
    }

    public final Object e(v vVar) {
        String str = this.f17917a;
        b bVar = this.f17918b;
        try {
            Trace.beginSection(str);
            return bVar.f15453f.e(vVar);
        } finally {
            Trace.endSection();
        }
    }
}
