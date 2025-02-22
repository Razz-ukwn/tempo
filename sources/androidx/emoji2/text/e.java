package androidx.emoji2.text;

import android.os.Build;
import androidx.emoji2.text.f;

public final class e extends f.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.a f1821a;

    public e(f.a aVar) {
        this.f1821a = aVar;
    }

    public final void a(Throwable th) {
        this.f1821a.f1835a.d(th);
    }

    public final void b(o oVar) {
        f.a aVar = this.f1821a;
        aVar.f1834c = oVar;
        o oVar2 = aVar.f1834c;
        f fVar = aVar.f1835a;
        aVar.f1833b = new k(oVar2, fVar.f1830g, fVar.f1832i, Build.VERSION.SDK_INT >= 34 ? i.a() : j.a());
        aVar.f1835a.e();
    }
}
