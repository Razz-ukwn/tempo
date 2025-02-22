package q7;

import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.o3;
import java.util.ArrayList;

public final class r6 {

    /* renamed from: a  reason: collision with root package name */
    public o3 f13306a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f13307b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f13308c;

    /* renamed from: d  reason: collision with root package name */
    public long f13309d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t6 f13310e;

    public /* synthetic */ r6(t6 t6Var) {
        this.f13310e = t6Var;
    }

    public final boolean a(long j10, f3 f3Var) {
        if (this.f13308c == null) {
            this.f13308c = new ArrayList();
        }
        if (this.f13307b == null) {
            this.f13307b = new ArrayList();
        }
        if (!this.f13308c.isEmpty() && ((((f3) this.f13308c.get(0)).w() / 1000) / 60) / 60 != ((f3Var.w() / 1000) / 60) / 60) {
            return false;
        }
        long a10 = this.f13309d + ((long) f3Var.a());
        t6 t6Var = this.f13310e;
        t6Var.J();
        if (a10 >= ((long) Math.max(0, ((Integer) g2.f13042k.a((Object) null)).intValue()))) {
            return false;
        }
        this.f13309d = a10;
        this.f13308c.add(f3Var);
        this.f13307b.add(Long.valueOf(j10));
        int size = this.f13308c.size();
        t6Var.J();
        return size < Math.max(1, ((Integer) g2.f13044l.a((Object) null)).intValue());
    }
}
