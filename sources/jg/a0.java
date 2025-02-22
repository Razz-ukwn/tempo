package jg;

import wg.g;

public final class a0 extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f10026a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10027b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ byte[] f10028c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f10029d;

    public a0(t tVar, byte[] bArr, int i8, int i10) {
        this.f10026a = tVar;
        this.f10027b = i8;
        this.f10028c = bArr;
        this.f10029d = i10;
    }

    public final long a() {
        return (long) this.f10027b;
    }

    public final t b() {
        return this.f10026a;
    }

    public final void c(g gVar) {
        gVar.write(this.f10028c, this.f10029d, this.f10027b);
    }
}
