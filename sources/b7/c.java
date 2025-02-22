package b7;

import android.content.Context;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f3273b = new c();

    /* renamed from: a  reason: collision with root package name */
    public b f3274a = null;

    public static b a(Context context) {
        b bVar;
        c cVar = f3273b;
        synchronized (cVar) {
            if (cVar.f3274a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                cVar.f3274a = new b(context);
            }
            bVar = cVar.f3274a;
        }
        return bVar;
    }
}
