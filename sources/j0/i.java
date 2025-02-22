package j0;

import androidx.fragment.app.z0;
import java.util.Arrays;
import sf.j;

public class i {

    /* renamed from: e  reason: collision with root package name */
    public static final h f9693e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f9694f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f9695g;

    /* renamed from: a  reason: collision with root package name */
    public final c f9696a;

    /* renamed from: b  reason: collision with root package name */
    public final c f9697b;

    /* renamed from: c  reason: collision with root package name */
    public final c f9698c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f9699d;

    public static final class a {
    }

    public static final class b extends i {

        /* renamed from: h  reason: collision with root package name */
        public final u f9700h;

        /* renamed from: i  reason: collision with root package name */
        public final u f9701i;

        /* renamed from: j  reason: collision with root package name */
        public final float[] f9702j;

        public b(u uVar, u uVar2, int i8) {
            super(uVar2, uVar, uVar2, (float[]) null);
            float[] fArr;
            this.f9700h = uVar;
            this.f9701i = uVar2;
            w wVar = uVar2.f9718d;
            w wVar2 = uVar.f9718d;
            boolean c3 = d.c(wVar2, wVar);
            float[] fArr2 = uVar.f9723i;
            float[] fArr3 = uVar2.f9724j;
            if (c3) {
                fArr = d.e(fArr3, fArr2);
            } else {
                float[] a10 = wVar2.a();
                w wVar3 = uVar2.f9718d;
                float[] a11 = wVar3.a();
                w wVar4 = z0.f2177c;
                boolean c10 = d.c(wVar2, wVar4);
                float[] fArr4 = z0.B;
                float[] fArr5 = a.f9675b.f9676a;
                if (!c10) {
                    float[] copyOf = Arrays.copyOf(fArr4, 3);
                    j.e(copyOf, "copyOf(this, size)");
                    fArr2 = d.e(d.b(fArr5, a10, copyOf), fArr2);
                }
                if (!d.c(wVar3, wVar4)) {
                    float[] copyOf2 = Arrays.copyOf(fArr4, 3);
                    j.e(copyOf2, "copyOf(this, size)");
                    fArr3 = d.d(d.e(d.b(fArr5, a11, copyOf2), uVar2.f9723i));
                }
                fArr = d.e(fArr3, i8 == 3 ? d.f(new float[]{a10[0] / a11[0], a10[1] / a11[1], a10[2] / a11[2]}, fArr2) : fArr2);
            }
            this.f9702j = fArr;
        }

        public final long a(float f10, float f11, float f12, float f13) {
            u uVar = this.f9700h;
            float e10 = (float) uVar.f9727n.e((double) f10);
            double d10 = (double) f11;
            n nVar = uVar.f9727n;
            float e11 = (float) nVar.e(d10);
            float e12 = (float) nVar.e((double) f12);
            float[] fArr = this.f9702j;
            float h3 = d.h(fArr, e10, e11, e12);
            float i8 = d.i(fArr, e10, e11, e12);
            float j10 = d.j(fArr, e10, e11, e12);
            u uVar2 = this.f9701i;
            float e13 = (float) uVar2.f9726l.e((double) h3);
            double d11 = (double) i8;
            m mVar = uVar2.f9726l;
            return androidx.databinding.a.e(e13, (float) mVar.e(d11), (float) mVar.e((double) j10), f13, uVar2);
        }
    }

    static {
        new a();
        u uVar = g.f9688c;
        j.f(uVar, "source");
        f9693e = new h(uVar);
        l lVar = g.f9691f;
        f9694f = new i(uVar, lVar, 0);
        f9695g = new i(lVar, uVar, 0);
    }

    public i(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f9696a = cVar;
        this.f9697b = cVar2;
        this.f9698c = cVar3;
        this.f9699d = fArr;
    }

    public long a(float f10, float f11, float f12, float f13) {
        c cVar = this.f9697b;
        long e10 = cVar.e(f10, f11, f12);
        float intBitsToFloat = Float.intBitsToFloat((int) (e10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (e10 & 4294967295L));
        float g10 = cVar.g(f10, f11, f12);
        float[] fArr = this.f9699d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            g10 *= fArr[2];
        }
        float f14 = intBitsToFloat2;
        float f15 = intBitsToFloat;
        return this.f9698c.h(f15, f14, g10, f13, this.f9696a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(j0.c r10, j0.c r11, int r12) {
        /*
            r9 = this;
            long r0 = r10.f9683b
            long r2 = j0.b.f9677a
            boolean r0 = j0.b.a(r0, r2)
            if (r0 == 0) goto L_0x000f
            j0.c r0 = j0.d.a(r10)
            goto L_0x0010
        L_0x000f:
            r0 = r10
        L_0x0010:
            long r4 = r11.f9683b
            boolean r1 = j0.b.a(r4, r2)
            if (r1 == 0) goto L_0x001d
            j0.c r1 = j0.d.a(r11)
            goto L_0x001e
        L_0x001d:
            r1 = r11
        L_0x001e:
            r4 = 1
            r5 = 0
            r6 = 3
            if (r12 != r6) goto L_0x0025
            r12 = r4
            goto L_0x0026
        L_0x0025:
            r12 = r5
        L_0x0026:
            if (r12 != 0) goto L_0x0029
            goto L_0x003f
        L_0x0029:
            long r7 = r10.f9683b
            boolean r12 = j0.b.a(r7, r2)
            long r7 = r11.f9683b
            boolean r2 = j0.b.a(r7, r2)
            if (r12 == 0) goto L_0x003a
            if (r2 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            if (r12 != 0) goto L_0x0041
            if (r2 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r10 = 0
            goto L_0x0071
        L_0x0041:
            if (r12 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r10 = r11
        L_0x0045:
            j0.u r10 = (j0.u) r10
            float[] r3 = androidx.fragment.app.z0.B
            j0.w r10 = r10.f9718d
            if (r12 == 0) goto L_0x0052
            float[] r12 = r10.a()
            goto L_0x0053
        L_0x0052:
            r12 = r3
        L_0x0053:
            if (r2 == 0) goto L_0x0059
            float[] r3 = r10.a()
        L_0x0059:
            float[] r10 = new float[r6]
            r2 = r12[r5]
            r6 = r3[r5]
            float r2 = r2 / r6
            r10[r5] = r2
            r2 = r12[r4]
            r5 = r3[r4]
            float r2 = r2 / r5
            r10[r4] = r2
            r2 = 2
            r12 = r12[r2]
            r3 = r3[r2]
            float r12 = r12 / r3
            r10[r2] = r12
        L_0x0071:
            r9.<init>(r11, r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.i.<init>(j0.c, j0.c, int):void");
    }
}
