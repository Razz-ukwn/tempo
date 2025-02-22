package r4;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p4.a;
import p4.f;
import p4.l;
import r4.h;
import r4.n;
import v4.n;

public final class x implements h, d.a<Object> {
    public List<n<File, ?>> B;
    public int C;
    public volatile n.a<?> D;
    public File E;
    public y F;

    /* renamed from: a  reason: collision with root package name */
    public final h.a f13999a;

    /* renamed from: b  reason: collision with root package name */
    public final i<?> f14000b;

    /* renamed from: c  reason: collision with root package name */
    public int f14001c;

    /* renamed from: d  reason: collision with root package name */
    public int f14002d = -1;

    /* renamed from: e  reason: collision with root package name */
    public f f14003e;

    public x(i<?> iVar, h.a aVar) {
        this.f14000b = iVar;
        this.f13999a = aVar;
    }

    public final boolean b() {
        ArrayList a10 = this.f14000b.a();
        if (a10.isEmpty()) {
            return false;
        }
        List<Class<?>> d10 = this.f14000b.d();
        if (!d10.isEmpty()) {
            while (true) {
                List<n<File, ?>> list = this.B;
                if (list != null) {
                    if (this.C < list.size()) {
                        this.D = null;
                        boolean z10 = false;
                        while (!z10) {
                            if (!(this.C < this.B.size())) {
                                break;
                            }
                            List<n<File, ?>> list2 = this.B;
                            int i8 = this.C;
                            this.C = i8 + 1;
                            File file = this.E;
                            i<?> iVar = this.f14000b;
                            this.D = list2.get(i8).a(file, iVar.f13897e, iVar.f13898f, iVar.f13901i);
                            if (this.D != null) {
                                if (this.f14000b.c(this.D.f16190c.a()) != null) {
                                    this.D.f16190c.e(this.f14000b.f13906o, this);
                                    z10 = true;
                                }
                            }
                        }
                        return z10;
                    }
                }
                int i10 = this.f14002d + 1;
                this.f14002d = i10;
                if (i10 >= d10.size()) {
                    int i11 = this.f14001c + 1;
                    this.f14001c = i11;
                    if (i11 >= a10.size()) {
                        return false;
                    }
                    this.f14002d = 0;
                }
                f fVar = (f) a10.get(this.f14001c);
                Class cls = d10.get(this.f14002d);
                l<Z> f10 = this.f14000b.f(cls);
                i<?> iVar2 = this.f14000b;
                this.F = new y(iVar2.f13895c.f4060a, fVar, iVar2.f13905n, iVar2.f13897e, iVar2.f13898f, f10, cls, iVar2.f13901i);
                File d11 = ((n.c) iVar2.f13900h).a().d(this.F);
                this.E = d11;
                if (d11 != null) {
                    this.f14003e = fVar;
                    this.B = this.f14000b.f13895c.f4061b.e(d11);
                    this.C = 0;
                }
            }
        } else if (File.class.equals(this.f14000b.f13903k)) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f14000b.f13896d.getClass() + " to " + this.f14000b.f13903k);
        }
    }

    public final void c(Exception exc) {
        this.f13999a.d(this.F, exc, this.D.f16190c, a.f12449d);
    }

    public final void cancel() {
        n.a<?> aVar = this.D;
        if (aVar != null) {
            aVar.f16190c.cancel();
        }
    }

    public final void f(Object obj) {
        this.f13999a.a(this.f14003e, obj, this.D.f16190c, a.f12449d, this.F);
    }
}
