package yg;

import java.lang.reflect.Array;

public final class w extends x<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f17517a;

    public w(x xVar) {
        this.f17517a = xVar;
    }

    public final void a(z zVar, Object obj) {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i8 = 0; i8 < length; i8++) {
                this.f17517a.a(zVar, Array.get(obj, i8));
            }
        }
    }
}
