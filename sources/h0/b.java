package h0;

import e9.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public float f9064a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f9065b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public float f9066c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f9067d = 0.0f;

    public final void a(float f10, float f11, float f12, float f13) {
        this.f9064a = Math.max(f10, this.f9064a);
        this.f9065b = Math.max(f11, this.f9065b);
        this.f9066c = Math.min(f12, this.f9066c);
        this.f9067d = Math.min(f13, this.f9067d);
    }

    public final boolean b() {
        return this.f9064a >= this.f9066c || this.f9065b >= this.f9067d;
    }

    public final String toString() {
        return "MutableRect(" + c.p(this.f9064a) + ", " + c.p(this.f9065b) + ", " + c.p(this.f9066c) + ", " + c.p(this.f9067d) + ')';
    }
}
