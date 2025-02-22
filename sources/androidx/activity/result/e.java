package androidx.activity.result;

import c.a;
import java.util.HashMap;

public final class e extends c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f611a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f612b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f613c;

    public e(g gVar, String str, a aVar) {
        this.f613c = gVar;
        this.f611a = str;
        this.f612b = aVar;
    }

    public final void a(Object obj) {
        g gVar = this.f613c;
        HashMap hashMap = gVar.f619c;
        String str = this.f611a;
        Integer num = (Integer) hashMap.get(str);
        a aVar = this.f612b;
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
}
