package g4;

import android.graphics.Bitmap;
import b7.a;
import ff.d;
import jg.q;
import sf.j;
import wg.b0;
import wg.c0;
import zf.n;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f8833a = a.w(new a(this));

    /* renamed from: b  reason: collision with root package name */
    public final d f8834b = a.w(new b(this));

    /* renamed from: c  reason: collision with root package name */
    public final long f8835c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8836d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8837e;

    /* renamed from: f  reason: collision with root package name */
    public final q f8838f;

    public c(c0 c0Var) {
        this.f8835c = Long.parseLong(c0Var.j0());
        this.f8836d = Long.parseLong(c0Var.j0());
        this.f8837e = Integer.parseInt(c0Var.j0()) > 0;
        int parseInt = Integer.parseInt(c0Var.j0());
        q.a aVar = new q.a();
        int i8 = 0;
        while (i8 < parseInt) {
            String j02 = c0Var.j0();
            Bitmap.Config[] configArr = m4.c.f11189a;
            int F0 = n.F0(j02, ':', 0, false, 6);
            if (F0 != -1) {
                String substring = j02.substring(0, F0);
                j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String obj = n.Z0(substring).toString();
                String substring2 = j02.substring(F0 + 1);
                j.e(substring2, "this as java.lang.String).substring(startIndex)");
                j.f(obj, "name");
                q.b.a(obj);
                aVar.b(obj, substring2);
                i8++;
            } else {
                throw new IllegalArgumentException("Unexpected header: ".concat(j02).toString());
            }
        }
        this.f8838f = aVar.c();
    }

    public final void a(b0 b0Var) {
        b0Var.A0(this.f8835c);
        b0Var.writeByte(10);
        b0Var.A0(this.f8836d);
        b0Var.writeByte(10);
        b0Var.A0(this.f8837e ? 1 : 0);
        b0Var.writeByte(10);
        q qVar = this.f8838f;
        b0Var.A0((long) (qVar.f10150a.length / 2));
        b0Var.writeByte(10);
        int length = qVar.f10150a.length / 2;
        for (int i8 = 0; i8 < length; i8++) {
            b0Var.M(qVar.c(i8));
            b0Var.M(": ");
            b0Var.M(qVar.e(i8));
            b0Var.writeByte(10);
        }
    }

    public c(jg.c0 c0Var) {
        this.f8835c = c0Var.G;
        this.f8836d = c0Var.H;
        this.f8837e = c0Var.f10055e != null;
        this.f8838f = c0Var.B;
    }
}
