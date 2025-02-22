package ma;

import ja.b;
import ja.c;
import ja.g;

public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11367a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11368b = false;

    /* renamed from: c  reason: collision with root package name */
    public c f11369c;

    /* renamed from: d  reason: collision with root package name */
    public final f f11370d;

    public h(f fVar) {
        this.f11370d = fVar;
    }

    public final g b(String str) {
        if (!this.f11367a) {
            this.f11367a = true;
            this.f11370d.b(this.f11369c, str, this.f11368b);
            return this;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }

    public final g c(boolean z10) {
        if (!this.f11367a) {
            this.f11367a = true;
            this.f11370d.c(this.f11369c, z10 ? 1 : 0, this.f11368b);
            return this;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }
}
