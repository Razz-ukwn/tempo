package androidx.activity.result;

import c.a;
import java.util.HashMap;

public final class f extends c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f614a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f615b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f616c;

    public f(g gVar, String str, a aVar) {
        this.f616c = gVar;
        this.f614a = str;
        this.f615b = aVar;
    }

    public final void a(Object obj) {
        g gVar = this.f616c;
        HashMap hashMap = gVar.f619c;
        String str = this.f614a;
        Integer num = (Integer) hashMap.get(str);
        a aVar = this.f615b;
        if (num != null) {
            gVar.f621e.add(str);
            try {
                gVar.b(num.intValue(), aVar, obj);
            } catch (Exception e10) {
                gVar.f621e.remove(str);
                throw e10;
            }
        } else {
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    public final void b() {
        this.f616c.f(this.f614a);
    }
}
