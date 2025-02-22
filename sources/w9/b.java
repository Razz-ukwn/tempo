package w9;

import android.util.Log;
import ba.d0;
import j0.q;
import java.util.concurrent.atomic.AtomicReference;
import t9.t;
import u9.c;

public final class b implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f16530c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final qa.a<a> f16531a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<a> f16532b = new AtomicReference<>((Object) null);

    public static final class a implements d {
    }

    public b(qa.a<a> aVar) {
        this.f16531a = aVar;
        ((t) aVar).a(new q(this));
    }

    public final d a(String str) {
        a aVar = this.f16532b.get();
        return aVar == null ? f16530c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = this.f16532b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = this.f16532b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, String str2, long j10, d0 d0Var) {
        String a10 = j0.t.a("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", a10, (Throwable) null);
        }
        ((t) this.f16531a).a(new c(str, str2, j10, d0Var));
    }
}
