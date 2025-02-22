package u6;

import android.os.Bundle;
import t6.b;

public abstract class l0 extends v0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f15836d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f15837e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f15838f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l0(b bVar, int i8, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f15838f = bVar;
        this.f15836d = i8;
        this.f15837e = bundle;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a() {
        /*
            r4 = this;
            r0 = 1
            u6.b r1 = r4.f15838f
            r2 = 0
            int r3 = r4.f15836d
            if (r3 != 0) goto L_0x001c
            boolean r3 = r4.d()
            if (r3 != 0) goto L_0x001b
            r1.E(r0, r2)
            t6.b r0 = new t6.b
            r1 = 8
            r0.<init>(r1, r2)
            r4.c(r0)
        L_0x001b:
            return
        L_0x001c:
            r1.E(r0, r2)
            android.os.Bundle r0 = r4.f15837e
            if (r0 == 0) goto L_0x002c
            java.lang.String r1 = "pendingIntent"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r2 = r0
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
        L_0x002c:
            t6.b r0 = new t6.b
            r0.<init>(r3, r2)
            r4.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.l0.a():void");
    }

    public final void b() {
    }

    public abstract void c(b bVar);

    public abstract boolean d();
}
