package j0;

import androidx.fragment.app.z0;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f9686a;

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f9687b;

    /* renamed from: c  reason: collision with root package name */
    public static final u f9688c;

    /* renamed from: d  reason: collision with root package name */
    public static final x f9689d;

    /* renamed from: e  reason: collision with root package name */
    public static final u f9690e;

    /* renamed from: f  reason: collision with root package name */
    public static final l f9691f;

    /* renamed from: g  reason: collision with root package name */
    public static final c[] f9692g;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f9686a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f9687b = fArr2;
        v vVar = new v(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        v vVar2 = new v(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        w wVar = z0.f2179e;
        float[] fArr3 = fArr;
        w wVar2 = wVar;
        u uVar = new u("sRGB IEC61966-2.1", fArr3, wVar2, vVar, 0);
        f9688c = uVar;
        u uVar2 = new u("sRGB IEC61966-2.1 (Linear)", fArr3, wVar2, 1.0d, 0.0f, 1.0f, 1);
        u uVar3 = new u("scRGB-nl IEC 61966-2-2:2003", fArr3, wVar2, (float[]) null, new e(), new f(0), -0.799f, 2.399f, vVar, 2);
        u uVar4 = new u("scRGB IEC 61966-2-2:2003", fArr3, wVar2, 1.0d, -0.5f, 7.499f, 3);
        w wVar3 = wVar;
        u uVar5 = new u("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, wVar3, new v(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        u uVar6 = new u("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, wVar3, new v(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        u uVar7 = new u("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new w(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        u uVar8 = new u("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, wVar, vVar, 7);
        u uVar9 = new u("NTSC (1953)", fArr2, z0.f2176b, new v(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        w wVar4 = wVar;
        u uVar10 = new u("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, wVar4, new v(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        u uVar11 = new u("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, wVar4, 2.2d, 0.0f, 1.0f, 10);
        u uVar12 = new u("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, z0.f2177c, new v(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        w wVar5 = z0.f2178d;
        u uVar13 = new u("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, wVar5, 1.0d, -65504.0f, 65504.0f, 12);
        u uVar14 = new u("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, wVar5, 1.0d, -65504.0f, 65504.0f, 13);
        x xVar = new x();
        f9689d = xVar;
        k kVar = new k();
        u uVar15 = new u("None", fArr, wVar, vVar2, 16);
        f9690e = uVar15;
        l lVar = new l();
        f9691f = lVar;
        f9692g = new c[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, xVar, kVar, uVar15, lVar};
    }
}
