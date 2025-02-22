package r4;

import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import p4.a;
import p4.f;
import r4.h;
import r4.n;
import v4.n;

public final class e implements h, d.a<Object> {
    public List<n<File, ?>> B;
    public int C;
    public volatile n.a<?> D;
    public File E;

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f13883a;

    /* renamed from: b  reason: collision with root package name */
    public final i<?> f13884b;

    /* renamed from: c  reason: collision with root package name */
    public final h.a f13885c;

    /* renamed from: d  reason: collision with root package name */
    public int f13886d = -1;

    /* renamed from: e  reason: collision with root package name */
    public f f13887e;

    public e(List<f> list, i<?> iVar, h.a aVar) {
        this.f13883a = list;
        this.f13884b = iVar;
        this.f13885c = aVar;
    }

    public final boolean b() {
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
                        i<?> iVar = this.f13884b;
                        this.D = list2.get(i8).a(file, iVar.f13897e, iVar.f13898f, iVar.f13901i);
                        if (this.D != null) {
                            if (this.f13884b.c(this.D.f16190c.a()) != null) {
                                this.D.f16190c.e(this.f13884b.f13906o, this);
                                z10 = true;
                            }
                        }
                    }
                    return z10;
                }
            }
            int i10 = this.f13886d + 1;
            this.f13886d = i10;
            if (i10 >= this.f13883a.size()) {
                return false;
            }
            f fVar = this.f13883a.get(this.f13886d);
            i<?> iVar2 = this.f13884b;
            File d10 = ((n.c) iVar2.f13900h).a().d(new f(fVar, iVar2.f13905n));
            this.E = d10;
            if (d10 != null) {
                this.f13887e = fVar;
                this.B = this.f13884b.f13895c.f4061b.e(d10);
                this.C = 0;
            }
        }
    }

    public final void c(Exception exc) {
        this.f13885c.d(this.f13887e, exc, this.D.f16190c, a.f12448c);
    }

    public final void cancel() {
        n.a<?> aVar = this.D;
        if (aVar != null) {
            aVar.f16190c.cancel();
        }
    }

    public final void f(Object obj) {
        this.f13885c.a(this.f13887e, obj, this.D.f16190c, a.f12448c, this.f13887e);
    }
}
