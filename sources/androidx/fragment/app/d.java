package androidx.fragment.app;

import androidx.fragment.app.d1;
import java.util.ArrayList;
import java.util.List;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f1920a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d1.b f1921b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f1922c;

    public d(m mVar, ArrayList arrayList, d1.b bVar) {
        this.f1922c = mVar;
        this.f1920a = arrayList;
        this.f1921b = bVar;
    }

    public final void run() {
        List list = this.f1920a;
        d1.b bVar = this.f1921b;
        if (list.contains(bVar)) {
            list.remove(bVar);
            this.f1922c.getClass();
            g1.a(bVar.f1932a, bVar.f1934c.f2066d0);
        }
    }
}
