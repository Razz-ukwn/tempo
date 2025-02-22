package t;

import sf.j;

public final class g extends IllegalStateException {

    /* renamed from: a  reason: collision with root package name */
    public final String f15058a;

    public g(String str) {
        j.f(str, "message");
        this.f15058a = str;
    }

    public final String getMessage() {
        return this.f15058a;
    }
}
