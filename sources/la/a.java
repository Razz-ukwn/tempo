package la;

import ja.b;
import ja.d;
import ja.e;

public final /* synthetic */ class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11040a;

    public /* synthetic */ a(int i8) {
        this.f11040a = i8;
    }

    public final void a(Object obj, Object obj2) {
        switch (this.f11040a) {
            case 0:
                e eVar = (e) obj2;
                throw new b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            default:
                e eVar2 = (e) obj2;
                throw new b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
