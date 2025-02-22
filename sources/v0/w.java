package v0;

import rf.p;
import sf.j;

public final class w<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f16115a;

    /* renamed from: b  reason: collision with root package name */
    public final p<T, T, T> f16116b;

    public w(String str, p<? super T, ? super T, ? extends T> pVar) {
        j.f(pVar, "mergePolicy");
        this.f16115a = str;
        this.f16116b = pVar;
    }

    public final String toString() {
        return "SemanticsPropertyKey: " + this.f16115a;
    }
}
