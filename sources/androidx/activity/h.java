package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.b;
import androidx.activity.result.g;
import c.a;

public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f584a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.C0054a f585b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f586c;

    public h(ComponentActivity.b bVar, int i8, a.C0054a aVar) {
        this.f586c = bVar;
        this.f584a = i8;
        this.f585b = aVar;
    }

    public final void run() {
        b<O> bVar;
        T t2 = this.f585b.f3656a;
        ComponentActivity.b bVar2 = this.f586c;
        String str = (String) bVar2.f618b.get(Integer.valueOf(this.f584a));
        if (str != null) {
            g.a aVar = (g.a) bVar2.f622f.get(str);
            if (aVar == null || (bVar = aVar.f625a) == null) {
                bVar2.f624h.remove(str);
                bVar2.f623g.put(str, t2);
            } else if (bVar2.f621e.remove(str)) {
                bVar.a(t2);
            }
        }
    }
}
