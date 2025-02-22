package l1;

import androidx.activity.g;
import b3.x;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import h0.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import l1.c;
import m1.c;
import m1.f;
import m1.l;
import m1.n;

public class d {
    public float A;
    public int B;
    public float C;
    public final int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final c K;
    public final c L;
    public final c M;
    public final c N;
    public final c O;
    public final c P;
    public final c Q;
    public final c R;
    public final c[] S;
    public final ArrayList<c> T;
    public final boolean[] U;
    public final int[] V;
    public d W;
    public int X;
    public int Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10840a = false;

    /* renamed from: a0  reason: collision with root package name */
    public int f10841a0;

    /* renamed from: b  reason: collision with root package name */
    public c f10842b;

    /* renamed from: b0  reason: collision with root package name */
    public int f10843b0;

    /* renamed from: c  reason: collision with root package name */
    public c f10844c;

    /* renamed from: c0  reason: collision with root package name */
    public int f10845c0;

    /* renamed from: d  reason: collision with root package name */
    public l f10846d = null;

    /* renamed from: d0  reason: collision with root package name */
    public int f10847d0;

    /* renamed from: e  reason: collision with root package name */
    public n f10848e = null;

    /* renamed from: e0  reason: collision with root package name */
    public int f10849e0;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f10850f = {true, true};

    /* renamed from: f0  reason: collision with root package name */
    public int f10851f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10852g = true;

    /* renamed from: g0  reason: collision with root package name */
    public float f10853g0;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10854h = true;

    /* renamed from: h0  reason: collision with root package name */
    public float f10855h0;

    /* renamed from: i  reason: collision with root package name */
    public int f10856i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public Object f10857i0;

    /* renamed from: j  reason: collision with root package name */
    public int f10858j = -1;

    /* renamed from: j0  reason: collision with root package name */
    public int f10859j0;

    /* renamed from: k  reason: collision with root package name */
    public String f10860k;

    /* renamed from: k0  reason: collision with root package name */
    public String f10861k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10862l;

    /* renamed from: l0  reason: collision with root package name */
    public int f10863l0;
    public boolean m;

    /* renamed from: m0  reason: collision with root package name */
    public int f10864m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f10865n;

    /* renamed from: n0  reason: collision with root package name */
    public final float[] f10866n0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10867o;

    /* renamed from: o0  reason: collision with root package name */
    public final d[] f10868o0;

    /* renamed from: p  reason: collision with root package name */
    public int f10869p;

    /* renamed from: p0  reason: collision with root package name */
    public final d[] f10870p0;

    /* renamed from: q  reason: collision with root package name */
    public int f10871q;

    /* renamed from: q0  reason: collision with root package name */
    public int f10872q0;

    /* renamed from: r  reason: collision with root package name */
    public int f10873r;

    /* renamed from: r0  reason: collision with root package name */
    public int f10874r0;

    /* renamed from: s  reason: collision with root package name */
    public int f10875s;

    /* renamed from: t  reason: collision with root package name */
    public int f10876t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f10877u;

    /* renamed from: v  reason: collision with root package name */
    public int f10878v;

    /* renamed from: w  reason: collision with root package name */
    public int f10879w;

    /* renamed from: x  reason: collision with root package name */
    public float f10880x;

    /* renamed from: y  reason: collision with root package name */
    public int f10881y;

    /* renamed from: z  reason: collision with root package name */
    public int f10882z;

    public d() {
        new HashMap();
        this.f10862l = false;
        this.m = false;
        this.f10865n = false;
        this.f10867o = false;
        this.f10869p = -1;
        this.f10871q = -1;
        this.f10873r = 0;
        this.f10875s = 0;
        this.f10876t = 0;
        this.f10877u = new int[2];
        this.f10878v = 0;
        this.f10879w = 0;
        this.f10880x = 1.0f;
        this.f10881y = 0;
        this.f10882z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = 0.0f;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        c cVar = new c(this, c.a.f10835a);
        this.K = cVar;
        c cVar2 = new c(this, c.a.f10836b);
        this.L = cVar2;
        c cVar3 = new c(this, c.a.f10837c);
        this.M = cVar3;
        c cVar4 = new c(this, c.a.f10838d);
        this.N = cVar4;
        c cVar5 = new c(this, c.a.f10839e);
        this.O = cVar5;
        c cVar6 = new c(this, c.a.C);
        this.P = cVar6;
        c cVar7 = new c(this, c.a.D);
        this.Q = cVar7;
        c cVar8 = new c(this, c.a.B);
        this.R = cVar8;
        this.S = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList<c> arrayList = new ArrayList<>();
        this.T = arrayList;
        this.U = new boolean[2];
        this.V = new int[]{1, 1};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f10841a0 = -1;
        this.f10843b0 = 0;
        this.f10845c0 = 0;
        this.f10847d0 = 0;
        this.f10853g0 = 0.5f;
        this.f10855h0 = 0.5f;
        this.f10859j0 = 0;
        this.f10861k0 = null;
        this.f10863l0 = 0;
        this.f10864m0 = 0;
        this.f10866n0 = new float[]{-1.0f, -1.0f};
        this.f10868o0 = new d[]{null, null};
        this.f10870p0 = new d[]{null, null};
        this.f10872q0 = -1;
        this.f10874r0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void H(int i8, int i10, String str, StringBuilder sb2) {
        if (i8 != i10) {
            sb2.append(str);
            sb2.append(" :   ");
            sb2.append(i8);
            sb2.append(",\n");
        }
    }

    public static void I(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 != f11) {
            sb2.append(str);
            sb2.append(" :   ");
            sb2.append(f10);
            sb2.append(",\n");
        }
    }

    public static void p(StringBuilder sb2, String str, int i8, int i10, int i11, int i12, int i13, float f10) {
        sb2.append(str);
        sb2.append(" :  {\n");
        H(i8, 0, "      size", sb2);
        H(i10, 0, "      min", sb2);
        H(i11, Integer.MAX_VALUE, "      max", sb2);
        H(i12, 0, "      matchMin", sb2);
        H(i13, 0, "      matchDef", sb2);
        I(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public static void q(StringBuilder sb2, String str, c cVar) {
        if (cVar.f10831f != null) {
            sb2.append("    ");
            sb2.append(str);
            sb2.append(" : [ '");
            sb2.append(cVar.f10831f);
            sb2.append("'");
            if (!(cVar.f10833h == Integer.MIN_VALUE && cVar.f10832g == 0)) {
                sb2.append(",");
                sb2.append(cVar.f10832g);
                if (cVar.f10833h != Integer.MIN_VALUE) {
                    sb2.append(",");
                    sb2.append(cVar.f10833h);
                    sb2.append(",");
                }
            }
            sb2.append(" ] ,\n");
        }
    }

    public final boolean A() {
        return this.f10852g && this.f10859j0 != 8;
    }

    public boolean B() {
        return this.f10862l || (this.K.f10828c && this.M.f10828c);
    }

    public boolean C() {
        return this.m || (this.L.f10828c && this.N.f10828c);
    }

    public void D() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = 0.0f;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.f10841a0 = -1;
        this.f10843b0 = 0;
        this.f10845c0 = 0;
        this.f10847d0 = 0;
        this.f10849e0 = 0;
        this.f10851f0 = 0;
        this.f10853g0 = 0.5f;
        this.f10855h0 = 0.5f;
        int[] iArr = this.V;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f10857i0 = null;
        this.f10859j0 = 0;
        this.f10863l0 = 0;
        this.f10864m0 = 0;
        float[] fArr = this.f10866n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f10869p = -1;
        this.f10871q = -1;
        int[] iArr2 = this.D;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f10875s = 0;
        this.f10876t = 0;
        this.f10880x = 1.0f;
        this.A = 1.0f;
        this.f10879w = Integer.MAX_VALUE;
        this.f10882z = Integer.MAX_VALUE;
        this.f10878v = 0;
        this.f10881y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f10850f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f10852g = true;
        int[] iArr3 = this.f10877u;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f10856i = -1;
        this.f10858j = -1;
    }

    public final void E() {
        d dVar = this.W;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList<c> arrayList = this.T;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.get(i8).j();
        }
    }

    public final void F() {
        this.f10862l = false;
        this.m = false;
        this.f10865n = false;
        this.f10867o = false;
        ArrayList<c> arrayList = this.T;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            c cVar = arrayList.get(i8);
            cVar.f10828c = false;
            cVar.f10827b = 0;
        }
    }

    public void G(j1.c cVar) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void J(int i8, int i10) {
        if (!this.f10862l) {
            this.K.l(i8);
            this.M.l(i10);
            this.f10843b0 = i8;
            this.X = i10 - i8;
            this.f10862l = true;
        }
    }

    public final void K(int i8, int i10) {
        if (!this.m) {
            this.L.l(i8);
            this.N.l(i10);
            this.f10845c0 = i8;
            this.Y = i10 - i8;
            if (this.F) {
                this.O.l(i8 + this.f10847d0);
            }
            this.m = true;
        }
    }

    public final void L(int i8) {
        this.Y = i8;
        int i10 = this.f10851f0;
        if (i8 < i10) {
            this.Y = i10;
        }
    }

    public final void M(int i8) {
        this.V[0] = i8;
    }

    public final void N(int i8) {
        this.V[1] = i8;
    }

    public final void O(int i8) {
        this.X = i8;
        int i10 = this.f10849e0;
        if (i8 < i10) {
            this.X = i10;
        }
    }

    public void P(boolean z10, boolean z11) {
        int i8;
        int i10;
        l lVar = this.f10846d;
        boolean z12 = z10 & lVar.f11172g;
        n nVar = this.f10848e;
        boolean z13 = z11 & nVar.f11172g;
        int i11 = lVar.f11173h.f11148g;
        int i12 = nVar.f11173h.f11148g;
        int i13 = lVar.f11174i.f11148g;
        int i14 = nVar.f11174i.f11148g;
        int i15 = i14 - i12;
        if (i13 - i11 < 0 || i15 < 0 || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE) {
            i13 = 0;
            i14 = 0;
            i11 = 0;
            i12 = 0;
        }
        int i16 = i13 - i11;
        int i17 = i14 - i12;
        if (z12) {
            this.f10843b0 = i11;
        }
        if (z13) {
            this.f10845c0 = i12;
        }
        if (this.f10859j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        int[] iArr = this.V;
        if (z12) {
            if (iArr[0] == 1 && i16 < (i10 = this.X)) {
                i16 = i10;
            }
            this.X = i16;
            int i18 = this.f10849e0;
            if (i16 < i18) {
                this.X = i18;
            }
        }
        if (z13) {
            if (iArr[1] == 1 && i17 < (i8 = this.Y)) {
                i17 = i8;
            }
            this.Y = i17;
            int i19 = this.f10851f0;
            if (i17 < i19) {
                this.Y = i19;
            }
        }
    }

    public void Q(j1.d dVar, boolean z10) {
        int i8;
        int i10;
        n nVar;
        l lVar;
        dVar.getClass();
        int n2 = j1.d.n(this.K);
        int n10 = j1.d.n(this.L);
        int n11 = j1.d.n(this.M);
        int n12 = j1.d.n(this.N);
        if (z10 && (lVar = this.f10846d) != null) {
            f fVar = lVar.f11173h;
            if (fVar.f11151j) {
                f fVar2 = lVar.f11174i;
                if (fVar2.f11151j) {
                    n2 = fVar.f11148g;
                    n11 = fVar2.f11148g;
                }
            }
        }
        if (z10 && (nVar = this.f10848e) != null) {
            f fVar3 = nVar.f11173h;
            if (fVar3.f11151j) {
                f fVar4 = nVar.f11174i;
                if (fVar4.f11151j) {
                    n10 = fVar3.f11148g;
                    n12 = fVar4.f11148g;
                }
            }
        }
        int i11 = n12 - n10;
        if (n11 - n2 < 0 || i11 < 0 || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n10 == Integer.MIN_VALUE || n10 == Integer.MAX_VALUE || n11 == Integer.MIN_VALUE || n11 == Integer.MAX_VALUE || n12 == Integer.MIN_VALUE || n12 == Integer.MAX_VALUE) {
            n2 = 0;
            n10 = 0;
            n11 = 0;
            n12 = 0;
        }
        int i12 = n11 - n2;
        int i13 = n12 - n10;
        this.f10843b0 = n2;
        this.f10845c0 = n10;
        if (this.f10859j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        int[] iArr = this.V;
        int i14 = iArr[0];
        if (i14 == 1 && i12 < (i10 = this.X)) {
            i12 = i10;
        }
        if (iArr[1] == 1 && i13 < (i8 = this.Y)) {
            i13 = i8;
        }
        this.X = i12;
        this.Y = i13;
        int i15 = this.f10851f0;
        if (i13 < i15) {
            this.Y = i15;
        }
        int i16 = this.f10849e0;
        if (i12 < i16) {
            this.X = i16;
        }
        int i17 = this.f10879w;
        if (i17 > 0 && i14 == 3) {
            this.X = Math.min(this.X, i17);
        }
        int i18 = this.f10882z;
        if (i18 > 0 && iArr[1] == 3) {
            this.Y = Math.min(this.Y, i18);
        }
        int i19 = this.X;
        if (i12 != i19) {
            this.f10856i = i19;
        }
        int i20 = this.Y;
        if (i13 != i20) {
            this.f10858j = i20;
        }
    }

    public final void b(e eVar, j1.d dVar, HashSet<d> hashSet, int i8, boolean z10) {
        if (z10) {
            if (hashSet.contains(this)) {
                gf.e(eVar, dVar, this);
                hashSet.remove(this);
                c(dVar, eVar.W(64));
            } else {
                return;
            }
        }
        if (i8 == 0) {
            HashSet<c> hashSet2 = this.K.f10826a;
            if (hashSet2 != null) {
                Iterator<c> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f10829d.b(eVar, dVar, hashSet, i8, true);
                }
            }
            HashSet<c> hashSet3 = this.M.f10826a;
            if (hashSet3 != null) {
                Iterator<c> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f10829d.b(eVar, dVar, hashSet, i8, true);
                }
                return;
            }
            return;
        }
        HashSet<c> hashSet4 = this.L.f10826a;
        if (hashSet4 != null) {
            Iterator<c> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f10829d.b(eVar, dVar, hashSet, i8, true);
            }
        }
        HashSet<c> hashSet5 = this.N.f10826a;
        if (hashSet5 != null) {
            Iterator<c> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f10829d.b(eVar, dVar, hashSet, i8, true);
            }
        }
        HashSet<c> hashSet6 = this.O.f10826a;
        if (hashSet6 != null) {
            Iterator<c> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f10829d.b(eVar, dVar, hashSet, i8, true);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d9, code lost:
        if (r0.d() > r3.J0.get().d()) goto L_0x00de;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0594  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x060a  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x060c  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0613  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0691  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0694  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06da  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0739  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0743  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(j1.d r63, boolean r64) {
        /*
            r62 = this;
            r15 = r62
            r14 = r63
            l1.c r0 = r15.K
            j1.g r13 = r14.k(r0)
            l1.c r1 = r15.M
            j1.g r12 = r14.k(r1)
            l1.c r2 = r15.L
            j1.g r11 = r14.k(r2)
            l1.c r10 = r15.N
            j1.g r9 = r14.k(r10)
            l1.c r8 = r15.O
            j1.g r7 = r14.k(r8)
            l1.d r3 = r15.W
            r4 = 2
            r6 = 0
            if (r3 == 0) goto L_0x004e
            int[] r3 = r3.V
            r5 = r3[r6]
            if (r5 != r4) goto L_0x0030
            r5 = 1
            goto L_0x0031
        L_0x0030:
            r5 = r6
        L_0x0031:
            r6 = 1
            r3 = r3[r6]
            if (r3 != r4) goto L_0x0039
            r19 = r6
            goto L_0x003b
        L_0x0039:
            r19 = 0
        L_0x003b:
            int r3 = r15.f10873r
            if (r3 == r6) goto L_0x0049
            if (r3 == r4) goto L_0x0050
            r6 = 3
            if (r3 == r6) goto L_0x004e
            r29 = r5
            r28 = r19
            goto L_0x0054
        L_0x0049:
            r29 = r5
            r28 = 0
            goto L_0x0054
        L_0x004e:
            r19 = 0
        L_0x0050:
            r28 = r19
            r29 = 0
        L_0x0054:
            int r3 = r15.f10859j0
            r6 = 8
            boolean[] r5 = r15.U
            if (r3 != r6) goto L_0x0094
            java.util.ArrayList<l1.c> r3 = r15.T
            int r4 = r3.size()
            r6 = 0
        L_0x0063:
            if (r6 >= r4) goto L_0x0086
            java.lang.Object r21 = r3.get(r6)
            r22 = r3
            r3 = r21
            l1.c r3 = (l1.c) r3
            java.util.HashSet<l1.c> r3 = r3.f10826a
            if (r3 != 0) goto L_0x0074
            goto L_0x007c
        L_0x0074:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x007c
            r3 = 1
            goto L_0x007d
        L_0x007c:
            r3 = 0
        L_0x007d:
            if (r3 == 0) goto L_0x0081
            r3 = 1
            goto L_0x0087
        L_0x0081:
            int r6 = r6 + 1
            r3 = r22
            goto L_0x0063
        L_0x0086:
            r3 = 0
        L_0x0087:
            if (r3 != 0) goto L_0x0094
            r3 = 0
            boolean r4 = r5[r3]
            if (r4 != 0) goto L_0x0094
            r3 = 1
            boolean r4 = r5[r3]
            if (r4 != 0) goto L_0x0094
            return
        L_0x0094:
            boolean r3 = r15.f10862l
            if (r3 != 0) goto L_0x00a2
            boolean r4 = r15.m
            if (r4 == 0) goto L_0x009d
            goto L_0x00a2
        L_0x009d:
            r22 = r5
            r6 = 5
            goto L_0x01ae
        L_0x00a2:
            boolean r4 = r15.f10854h
            if (r3 == 0) goto L_0x0117
            int r3 = r15.f10843b0
            r14.d(r13, r3)
            int r3 = r15.f10843b0
            int r6 = r15.X
            int r3 = r3 + r6
            r14.d(r12, r3)
            if (r29 == 0) goto L_0x0117
            l1.d r3 = r15.W
            if (r3 == 0) goto L_0x0117
            if (r4 == 0) goto L_0x0109
            l1.e r3 = (l1.e) r3
            java.lang.ref.WeakReference<l1.c> r6 = r3.J0
            if (r6 == 0) goto L_0x00dc
            java.lang.Object r6 = r6.get()
            if (r6 == 0) goto L_0x00dc
            int r6 = r0.d()
            r22 = r5
            java.lang.ref.WeakReference<l1.c> r5 = r3.J0
            java.lang.Object r5 = r5.get()
            l1.c r5 = (l1.c) r5
            int r5 = r5.d()
            if (r6 <= r5) goto L_0x00e5
            goto L_0x00de
        L_0x00dc:
            r22 = r5
        L_0x00de:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r0)
            r3.J0 = r5
        L_0x00e5:
            java.lang.ref.WeakReference<l1.c> r5 = r3.L0
            if (r5 == 0) goto L_0x0101
            java.lang.Object r5 = r5.get()
            if (r5 == 0) goto L_0x0101
            int r5 = r1.d()
            java.lang.ref.WeakReference<l1.c> r6 = r3.L0
            java.lang.Object r6 = r6.get()
            l1.c r6 = (l1.c) r6
            int r6 = r6.d()
            if (r5 <= r6) goto L_0x0119
        L_0x0101:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r1)
            r3.L0 = r5
            goto L_0x0119
        L_0x0109:
            r22 = r5
            l1.c r3 = r3.M
            j1.g r3 = r14.k(r3)
            r5 = 5
            r6 = 0
            r14.f(r3, r12, r6, r5)
            goto L_0x0119
        L_0x0117:
            r22 = r5
        L_0x0119:
            boolean r3 = r15.m
            if (r3 == 0) goto L_0x019f
            int r3 = r15.f10845c0
            r14.d(r11, r3)
            int r3 = r15.f10845c0
            int r5 = r15.Y
            int r3 = r3 + r5
            r14.d(r9, r3)
            java.util.HashSet<l1.c> r3 = r8.f10826a
            if (r3 != 0) goto L_0x012f
            goto L_0x0137
        L_0x012f:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0137
            r3 = 1
            goto L_0x0138
        L_0x0137:
            r3 = 0
        L_0x0138:
            if (r3 == 0) goto L_0x0142
            int r3 = r15.f10845c0
            int r5 = r15.f10847d0
            int r3 = r3 + r5
            r14.d(r7, r3)
        L_0x0142:
            if (r28 == 0) goto L_0x019f
            l1.d r3 = r15.W
            if (r3 == 0) goto L_0x019f
            if (r4 == 0) goto L_0x0193
            l1.e r3 = (l1.e) r3
            java.lang.ref.WeakReference<l1.c> r4 = r3.I0
            if (r4 == 0) goto L_0x0168
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x0168
            int r4 = r2.d()
            java.lang.ref.WeakReference<l1.c> r5 = r3.I0
            java.lang.Object r5 = r5.get()
            l1.c r5 = (l1.c) r5
            int r5 = r5.d()
            if (r4 <= r5) goto L_0x016f
        L_0x0168:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            r3.I0 = r4
        L_0x016f:
            java.lang.ref.WeakReference<l1.c> r4 = r3.K0
            if (r4 == 0) goto L_0x018b
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x018b
            int r4 = r10.d()
            java.lang.ref.WeakReference<l1.c> r5 = r3.K0
            java.lang.Object r5 = r5.get()
            l1.c r5 = (l1.c) r5
            int r5 = r5.d()
            if (r4 <= r5) goto L_0x019f
        L_0x018b:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r10)
            r3.K0 = r4
            goto L_0x019f
        L_0x0193:
            l1.c r3 = r3.N
            j1.g r3 = r14.k(r3)
            r4 = 0
            r6 = 5
            r14.f(r3, r9, r4, r6)
            goto L_0x01a1
        L_0x019f:
            r4 = 0
            r6 = 5
        L_0x01a1:
            boolean r3 = r15.f10862l
            if (r3 == 0) goto L_0x01ae
            boolean r3 = r15.m
            if (r3 == 0) goto L_0x01ae
            r15.f10862l = r4
            r15.m = r4
            return
        L_0x01ae:
            boolean[] r5 = r15.f10850f
            if (r64 == 0) goto L_0x023d
            m1.l r3 = r15.f10846d
            if (r3 == 0) goto L_0x023d
            m1.n r4 = r15.f10848e
            if (r4 == 0) goto L_0x023d
            m1.f r6 = r3.f11173h
            r23 = r8
            boolean r8 = r6.f11151j
            if (r8 == 0) goto L_0x023f
            m1.f r3 = r3.f11174i
            boolean r3 = r3.f11151j
            if (r3 == 0) goto L_0x023f
            m1.f r3 = r4.f11173h
            boolean r3 = r3.f11151j
            if (r3 == 0) goto L_0x023f
            m1.f r3 = r4.f11174i
            boolean r3 = r3.f11151j
            if (r3 == 0) goto L_0x023f
            int r0 = r6.f11148g
            r14.d(r13, r0)
            m1.l r0 = r15.f10846d
            m1.f r0 = r0.f11174i
            int r0 = r0.f11148g
            r14.d(r12, r0)
            m1.n r0 = r15.f10848e
            m1.f r0 = r0.f11173h
            int r0 = r0.f11148g
            r14.d(r11, r0)
            m1.n r0 = r15.f10848e
            m1.f r0 = r0.f11174i
            int r0 = r0.f11148g
            r14.d(r9, r0)
            m1.n r0 = r15.f10848e
            m1.f r0 = r0.f11158k
            int r0 = r0.f11148g
            r14.d(r7, r0)
            l1.d r0 = r15.W
            if (r0 == 0) goto L_0x0237
            if (r29 == 0) goto L_0x021b
            r0 = 0
            boolean r1 = r5[r0]
            if (r1 == 0) goto L_0x021b
            boolean r1 = r62.y()
            if (r1 != 0) goto L_0x021b
            l1.d r1 = r15.W
            l1.c r1 = r1.M
            j1.g r1 = r14.k(r1)
            r2 = 8
            r14.f(r1, r12, r0, r2)
        L_0x021b:
            if (r28 == 0) goto L_0x0237
            r0 = 1
            boolean r0 = r5[r0]
            if (r0 == 0) goto L_0x0237
            boolean r0 = r62.z()
            if (r0 != 0) goto L_0x0237
            l1.d r0 = r15.W
            l1.c r0 = r0.N
            j1.g r0 = r14.k(r0)
            r1 = 8
            r2 = 0
            r14.f(r0, r9, r2, r1)
            goto L_0x0238
        L_0x0237:
            r2 = 0
        L_0x0238:
            r15.f10862l = r2
            r15.m = r2
            return
        L_0x023d:
            r23 = r8
        L_0x023f:
            l1.d r3 = r15.W
            if (r3 == 0) goto L_0x02b5
            r3 = 0
            boolean r4 = r15.x(r3)
            if (r4 == 0) goto L_0x0253
            l1.d r4 = r15.W
            l1.e r4 = (l1.e) r4
            r4.S(r3, r15)
            r3 = 1
            goto L_0x0257
        L_0x0253:
            boolean r3 = r62.y()
        L_0x0257:
            r4 = 1
            boolean r6 = r15.x(r4)
            if (r6 == 0) goto L_0x0267
            l1.d r6 = r15.W
            l1.e r6 = (l1.e) r6
            r6.S(r4, r15)
            r4 = 1
            goto L_0x026b
        L_0x0267:
            boolean r4 = r62.z()
        L_0x026b:
            if (r3 != 0) goto L_0x028d
            if (r29 == 0) goto L_0x028d
            int r6 = r15.f10859j0
            r8 = 8
            if (r6 == r8) goto L_0x028d
            l1.c r6 = r0.f10831f
            if (r6 != 0) goto L_0x028d
            l1.c r6 = r1.f10831f
            if (r6 != 0) goto L_0x028d
            l1.d r6 = r15.W
            l1.c r6 = r6.M
            j1.g r6 = r14.k(r6)
            r24 = r3
            r3 = 0
            r8 = 1
            r14.f(r6, r12, r3, r8)
            goto L_0x028f
        L_0x028d:
            r24 = r3
        L_0x028f:
            if (r4 != 0) goto L_0x02b0
            if (r28 == 0) goto L_0x02b0
            int r3 = r15.f10859j0
            r6 = 8
            if (r3 == r6) goto L_0x02b0
            l1.c r3 = r2.f10831f
            if (r3 != 0) goto L_0x02b0
            l1.c r3 = r10.f10831f
            if (r3 != 0) goto L_0x02b0
            if (r23 != 0) goto L_0x02b0
            l1.d r3 = r15.W
            l1.c r3 = r3.N
            j1.g r3 = r14.k(r3)
            r6 = 1
            r8 = 0
            r14.f(r3, r9, r8, r6)
        L_0x02b0:
            r30 = r4
            r31 = r24
            goto L_0x02b9
        L_0x02b5:
            r30 = 0
            r31 = 0
        L_0x02b9:
            int r3 = r15.X
            int r4 = r15.f10849e0
            if (r3 >= r4) goto L_0x02c0
            goto L_0x02c1
        L_0x02c0:
            r4 = r3
        L_0x02c1:
            int r6 = r15.Y
            int r8 = r15.f10851f0
            if (r6 >= r8) goto L_0x02c8
            goto L_0x02c9
        L_0x02c8:
            r8 = r6
        L_0x02c9:
            r27 = r11
            int[] r11 = r15.V
            r24 = r4
            r18 = 0
            r4 = r11[r18]
            r32 = r7
            r7 = 3
            r26 = r8
            r16 = 1
            if (r4 == r7) goto L_0x02df
            r25 = 1
            goto L_0x02e1
        L_0x02df:
            r25 = 0
        L_0x02e1:
            r8 = r11[r16]
            r33 = r9
            if (r8 == r7) goto L_0x02e9
            r7 = 1
            goto L_0x02ea
        L_0x02e9:
            r7 = 0
        L_0x02ea:
            int r9 = r15.f10841a0
            r15.B = r9
            r34 = r5
            float r5 = r15.Z
            r15.C = r5
            r35 = r12
            int r12 = r15.f10875s
            r36 = r13
            int r13 = r15.f10876t
            r37 = 0
            int r37 = (r5 > r37 ? 1 : (r5 == r37 ? 0 : -1))
            if (r37 <= 0) goto L_0x040a
            int r14 = r15.f10859j0
            r39 = r11
            r11 = 8
            if (r14 == r11) goto L_0x040c
            r11 = 3
            if (r4 != r11) goto L_0x0310
            if (r12 != 0) goto L_0x0310
            r12 = r11
        L_0x0310:
            if (r8 != r11) goto L_0x0315
            if (r13 != 0) goto L_0x0315
            r13 = r11
        L_0x0315:
            if (r4 != r11) goto L_0x03c6
            if (r8 != r11) goto L_0x03c6
            if (r12 != r11) goto L_0x03c6
            if (r13 != r11) goto L_0x03c6
            r11 = -1
            if (r9 != r11) goto L_0x0337
            if (r25 == 0) goto L_0x0328
            if (r7 != 0) goto L_0x0328
            r3 = 0
            r15.B = r3
            goto L_0x0337
        L_0x0328:
            if (r25 != 0) goto L_0x0337
            if (r7 == 0) goto L_0x0337
            r3 = 1
            r15.B = r3
            if (r9 != r11) goto L_0x0337
            r3 = 1065353216(0x3f800000, float:1.0)
            float r14 = r3 / r5
            r15.C = r14
        L_0x0337:
            int r3 = r15.B
            if (r3 != 0) goto L_0x034b
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x0347
            boolean r3 = r10.h()
            if (r3 != 0) goto L_0x034b
        L_0x0347:
            r3 = 1
            r15.B = r3
            goto L_0x035f
        L_0x034b:
            r3 = 1
            int r4 = r15.B
            if (r4 != r3) goto L_0x035f
            boolean r3 = r0.h()
            if (r3 == 0) goto L_0x035c
            boolean r3 = r1.h()
            if (r3 != 0) goto L_0x035f
        L_0x035c:
            r3 = 0
            r15.B = r3
        L_0x035f:
            int r3 = r15.B
            r4 = -1
            if (r3 != r4) goto L_0x03a3
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x037c
            boolean r3 = r10.h()
            if (r3 == 0) goto L_0x037c
            boolean r3 = r0.h()
            if (r3 == 0) goto L_0x037c
            boolean r3 = r1.h()
            if (r3 != 0) goto L_0x03a3
        L_0x037c:
            boolean r2 = r2.h()
            if (r2 == 0) goto L_0x038c
            boolean r2 = r10.h()
            if (r2 == 0) goto L_0x038c
            r2 = 0
            r15.B = r2
            goto L_0x03a3
        L_0x038c:
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x03a3
            boolean r0 = r1.h()
            if (r0 == 0) goto L_0x03a3
            float r0 = r15.C
            r1 = 1065353216(0x3f800000, float:1.0)
            float r14 = r1 / r0
            r15.C = r14
            r0 = 1
            r15.B = r0
        L_0x03a3:
            int r0 = r15.B
            r1 = -1
            if (r0 != r1) goto L_0x03fb
            int r0 = r15.f10878v
            if (r0 <= 0) goto L_0x03b4
            int r1 = r15.f10881y
            if (r1 != 0) goto L_0x03b4
            r1 = 0
            r15.B = r1
            goto L_0x03fb
        L_0x03b4:
            if (r0 != 0) goto L_0x03fb
            int r0 = r15.f10881y
            if (r0 <= 0) goto L_0x03fb
            float r0 = r15.C
            r1 = 1065353216(0x3f800000, float:1.0)
            float r14 = r1 / r0
            r15.C = r14
            r0 = 1
            r15.B = r0
            goto L_0x03fb
        L_0x03c6:
            r0 = 4
            r1 = 3
            if (r4 != r1) goto L_0x03db
            if (r12 != r1) goto L_0x03db
            r2 = 0
            r15.B = r2
            float r2 = (float) r6
            float r5 = r5 * r2
            int r4 = (int) r5
            if (r8 == r1) goto L_0x03d8
            r12 = r0
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0410
        L_0x03d8:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03ff
        L_0x03db:
            if (r8 != r1) goto L_0x03fb
            if (r13 != r1) goto L_0x03fb
            r2 = 1
            r15.B = r2
            r2 = -1
            if (r9 != r2) goto L_0x03ec
            r2 = 1065353216(0x3f800000, float:1.0)
            float r14 = r2 / r5
            r15.C = r14
            goto L_0x03ee
        L_0x03ec:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x03ee:
            float r5 = r15.C
            float r3 = (float) r3
            float r5 = r5 * r3
            int r8 = (int) r5
            if (r4 == r1) goto L_0x03f8
            r4 = r24
            goto L_0x0413
        L_0x03f8:
            r4 = r24
            goto L_0x0401
        L_0x03fb:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = r24
        L_0x03ff:
            r8 = r26
        L_0x0401:
            r40 = r8
            r42 = r12
            r41 = r13
            r38 = 1
            goto L_0x041b
        L_0x040a:
            r39 = r11
        L_0x040c:
            r2 = 1065353216(0x3f800000, float:1.0)
            r4 = r24
        L_0x0410:
            r0 = r13
            r8 = r26
        L_0x0413:
            r41 = r0
            r40 = r8
            r42 = r12
            r38 = 0
        L_0x041b:
            int[] r0 = r15.f10877u
            r1 = 0
            r0[r1] = r42
            r1 = 1
            r0[r1] = r41
            if (r38 == 0) goto L_0x042f
            int r0 = r15.B
            r1 = -1
            if (r0 == 0) goto L_0x042c
            if (r0 != r1) goto L_0x0430
        L_0x042c:
            r37 = 1
            goto L_0x0432
        L_0x042f:
            r1 = -1
        L_0x0430:
            r37 = 0
        L_0x0432:
            if (r38 == 0) goto L_0x043f
            int r0 = r15.B
            r3 = 1
            if (r0 == r3) goto L_0x043b
            if (r0 != r1) goto L_0x043f
        L_0x043b:
            r0 = 0
            r43 = 1
            goto L_0x0442
        L_0x043f:
            r0 = 0
            r43 = 0
        L_0x0442:
            r1 = r39[r0]
            r0 = 2
            if (r1 != r0) goto L_0x044d
            boolean r0 = r15 instanceof l1.e
            if (r0 == 0) goto L_0x044d
            r9 = 1
            goto L_0x044e
        L_0x044d:
            r9 = 0
        L_0x044e:
            if (r9 == 0) goto L_0x0452
            r13 = 0
            goto L_0x0453
        L_0x0452:
            r13 = r4
        L_0x0453:
            l1.c r14 = r15.R
            boolean r0 = r14.h()
            r1 = 1
            r44 = r0 ^ 1
            r0 = 0
            boolean r45 = r22[r0]
            boolean r46 = r22[r1]
            int r0 = r15.f10869p
            int[] r12 = r15.D
            r47 = 0
            r4 = 2
            if (r0 == r4) goto L_0x057e
            boolean r0 = r15.f10862l
            if (r0 != 0) goto L_0x057e
            if (r64 == 0) goto L_0x04d3
            m1.l r0 = r15.f10846d
            if (r0 == 0) goto L_0x04d3
            m1.f r1 = r0.f11173h
            boolean r3 = r1.f11151j
            if (r3 == 0) goto L_0x04d3
            m1.f r0 = r0.f11174i
            boolean r0 = r0.f11151j
            if (r0 != 0) goto L_0x0481
            goto L_0x04d3
        L_0x0481:
            if (r64 == 0) goto L_0x04cf
            int r0 = r1.f11148g
            r11 = r63
            r7 = r2
            r8 = r36
            r11.d(r8, r0)
            m1.l r0 = r15.f10846d
            m1.f r0 = r0.f11174i
            int r0 = r0.f11148g
            r6 = r35
            r11.d(r6, r0)
            l1.d r0 = r15.W
            if (r0 == 0) goto L_0x04b7
            if (r29 == 0) goto L_0x04b7
            r0 = 0
            boolean r1 = r34[r0]
            if (r1 == 0) goto L_0x04b7
            boolean r1 = r62.y()
            if (r1 != 0) goto L_0x04b7
            l1.d r1 = r15.W
            l1.c r1 = r1.M
            j1.g r1 = r11.k(r1)
            r5 = 8
            r11.f(r1, r6, r0, r5)
            goto L_0x04b9
        L_0x04b7:
            r5 = 8
        L_0x04b9:
            r58 = r6
            r59 = r8
            r56 = r10
            r35 = r14
            r54 = r23
            r57 = r27
            r53 = r32
            r55 = r33
            r32 = r39
            r33 = r12
            goto L_0x0592
        L_0x04cf:
            r11 = r63
            goto L_0x057e
        L_0x04d3:
            r11 = r63
            r7 = r2
            r6 = r35
            r8 = r36
            r5 = 8
            l1.d r0 = r15.W
            if (r0 == 0) goto L_0x04e9
            l1.c r0 = r0.M
            j1.g r0 = r11.k(r0)
            r19 = r0
            goto L_0x04eb
        L_0x04e9:
            r19 = r47
        L_0x04eb:
            l1.d r0 = r15.W
            if (r0 == 0) goto L_0x04f8
            l1.c r0 = r0.K
            j1.g r0 = r11.k(r0)
            r18 = r0
            goto L_0x04fa
        L_0x04f8:
            r18 = r47
        L_0x04fa:
            r20 = 0
            boolean r22 = r34[r20]
            r35 = r39[r20]
            l1.c r3 = r15.K
            l1.c r1 = r15.M
            int r0 = r15.f10843b0
            int r2 = r15.f10849e0
            r36 = r12[r20]
            r48 = r2
            float r2 = r15.f10853g0
            r17 = 1
            r4 = r39[r17]
            r7 = 3
            if (r4 != r7) goto L_0x0518
            r49 = r17
            goto L_0x051a
        L_0x0518:
            r49 = r20
        L_0x051a:
            int r4 = r15.f10878v
            r24 = r4
            int r4 = r15.f10879w
            r25 = r4
            float r4 = r15.f10880x
            r26 = r4
            r4 = 1
            r16 = r48
            r48 = r2
            r2 = r4
            r50 = r0
            r0 = r62
            r51 = r1
            r1 = r63
            r52 = r3
            r3 = r29
            r4 = r28
            r17 = r5
            r5 = r22
            r17 = r6
            r7 = r20
            r6 = r18
            r53 = r32
            r7 = r19
            r18 = r8
            r54 = r23
            r8 = r35
            r55 = r33
            r56 = r10
            r10 = r52
            r57 = r27
            r32 = r39
            r11 = r51
            r33 = r12
            r58 = r17
            r12 = r50
            r59 = r18
            r35 = r14
            r14 = r16
            r15 = r36
            r16 = r48
            r17 = r37
            r18 = r49
            r19 = r31
            r20 = r30
            r21 = r45
            r22 = r42
            r23 = r41
            r27 = r44
            r0.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0592
        L_0x057e:
            r56 = r10
            r54 = r23
            r57 = r27
            r53 = r32
            r55 = r33
            r58 = r35
            r59 = r36
            r32 = r39
            r33 = r12
            r35 = r14
        L_0x0592:
            if (r64 == 0) goto L_0x05f6
            r15 = r62
            m1.n r0 = r15.f10848e
            if (r0 == 0) goto L_0x05e9
            m1.f r1 = r0.f11173h
            boolean r2 = r1.f11151j
            if (r2 == 0) goto L_0x05e9
            m1.f r0 = r0.f11174i
            boolean r0 = r0.f11151j
            if (r0 == 0) goto L_0x05e9
            int r0 = r1.f11148g
            r14 = r63
            r13 = r57
            r14.d(r13, r0)
            m1.n r0 = r15.f10848e
            m1.f r0 = r0.f11174i
            int r0 = r0.f11148g
            r12 = r55
            r14.d(r12, r0)
            m1.n r0 = r15.f10848e
            m1.f r0 = r0.f11158k
            int r0 = r0.f11148g
            r1 = r53
            r14.d(r1, r0)
            l1.d r0 = r15.W
            if (r0 == 0) goto L_0x05e3
            if (r30 != 0) goto L_0x05e3
            if (r28 == 0) goto L_0x05e3
            r11 = 1
            boolean r2 = r34[r11]
            if (r2 == 0) goto L_0x05df
            l1.c r0 = r0.N
            j1.g r0 = r14.k(r0)
            r2 = 8
            r10 = 0
            r14.f(r0, r12, r10, r2)
            goto L_0x05e7
        L_0x05df:
            r2 = 8
            r10 = 0
            goto L_0x05e7
        L_0x05e3:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x05e7:
            r5 = r10
            goto L_0x0605
        L_0x05e9:
            r14 = r63
            r1 = r53
            r12 = r55
            r13 = r57
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x0604
        L_0x05f6:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r62
            r14 = r63
            r1 = r53
            r12 = r55
            r13 = r57
        L_0x0604:
            r5 = r11
        L_0x0605:
            int r0 = r15.f10871q
            r3 = 2
            if (r0 != r3) goto L_0x060c
            r6 = r10
            goto L_0x060d
        L_0x060c:
            r6 = r5
        L_0x060d:
            if (r6 == 0) goto L_0x06d4
            boolean r0 = r15.m
            if (r0 != 0) goto L_0x06d4
            r0 = r32[r11]
            if (r0 != r3) goto L_0x061d
            boolean r0 = r15 instanceof l1.e
            if (r0 == 0) goto L_0x061d
            r9 = r11
            goto L_0x061e
        L_0x061d:
            r9 = r10
        L_0x061e:
            if (r9 == 0) goto L_0x0622
            r40 = r10
        L_0x0622:
            l1.d r0 = r15.W
            if (r0 == 0) goto L_0x062e
            l1.c r0 = r0.N
            j1.g r0 = r14.k(r0)
            r7 = r0
            goto L_0x0630
        L_0x062e:
            r7 = r47
        L_0x0630:
            l1.d r0 = r15.W
            if (r0 == 0) goto L_0x063c
            l1.c r0 = r0.L
            j1.g r0 = r14.k(r0)
            r6 = r0
            goto L_0x063e
        L_0x063c:
            r6 = r47
        L_0x063e:
            int r0 = r15.f10847d0
            if (r0 > 0) goto L_0x0646
            int r3 = r15.f10859j0
            if (r3 != r2) goto L_0x067a
        L_0x0646:
            r3 = r54
            l1.c r4 = r3.f10831f
            if (r4 == 0) goto L_0x066b
            r14.e(r1, r13, r0, r2)
            l1.c r0 = r3.f10831f
            j1.g r0 = r14.k(r0)
            int r3 = r3.e()
            r14.e(r1, r0, r3, r2)
            if (r28 == 0) goto L_0x0668
            r0 = r56
            j1.g r0 = r14.k(r0)
            r1 = 5
            r14.f(r7, r0, r10, r1)
        L_0x0668:
            r27 = r10
            goto L_0x067c
        L_0x066b:
            int r4 = r15.f10859j0
            if (r4 != r2) goto L_0x0677
            int r0 = r3.e()
            r14.e(r1, r13, r0, r2)
            goto L_0x067a
        L_0x0677:
            r14.e(r1, r13, r0, r2)
        L_0x067a:
            r27 = r44
        L_0x067c:
            boolean r5 = r34[r11]
            r8 = r32[r11]
            l1.c r4 = r15.L
            l1.c r3 = r15.N
            int r1 = r15.f10845c0
            int r0 = r15.f10851f0
            r16 = r33[r11]
            float r2 = r15.f10855h0
            r11 = r32[r10]
            r10 = 3
            if (r11 != r10) goto L_0x0694
            r19 = 1
            goto L_0x0696
        L_0x0694:
            r19 = 0
        L_0x0696:
            int r10 = r15.f10881y
            r24 = r10
            int r10 = r15.f10882z
            r25 = r10
            float r10 = r15.A
            r26 = r10
            r10 = 0
            r17 = r2
            r2 = r10
            r20 = r0
            r0 = r62
            r21 = r1
            r1 = r63
            r11 = r3
            r3 = r28
            r10 = r4
            r4 = r29
            r60 = r12
            r12 = r21
            r61 = r13
            r13 = r40
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r43
            r18 = r19
            r19 = r30
            r20 = r31
            r21 = r46
            r22 = r41
            r23 = r42
            r0.e(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x06d8
        L_0x06d4:
            r60 = r12
            r61 = r13
        L_0x06d8:
            if (r38 == 0) goto L_0x0739
            r0 = r62
            int r1 = r0.B
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1
            if (r1 != r3) goto L_0x070e
            float r1 = r0.C
            j1.b r3 = r63.l()
            j1.b$a r4 = r3.f9753d
            r5 = r60
            r4.e(r5, r2)
            j1.b$a r2 = r3.f9753d
            r4 = r61
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.e(r4, r6)
            j1.b$a r2 = r3.f9753d
            r7 = r58
            r2.e(r7, r1)
            j1.b$a r2 = r3.f9753d
            float r1 = -r1
            r8 = r59
            r2.e(r8, r1)
            r1 = r63
            r1.c(r3)
            goto L_0x073d
        L_0x070e:
            r1 = r63
            r7 = r58
            r8 = r59
            r5 = r60
            r4 = r61
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0.C
            j1.b r9 = r63.l()
            j1.b$a r10 = r9.f9753d
            r10.e(r7, r2)
            j1.b$a r2 = r9.f9753d
            r2.e(r8, r6)
            j1.b$a r2 = r9.f9753d
            r2.e(r5, r3)
            j1.b$a r2 = r9.f9753d
            float r3 = -r3
            r2.e(r4, r3)
            r1.c(r9)
            goto L_0x073d
        L_0x0739:
            r0 = r62
            r1 = r63
        L_0x073d:
            boolean r2 = r35.h()
            if (r2 == 0) goto L_0x07f9
            r2 = r35
            l1.c r3 = r2.f10831f
            l1.d r3 = r3.f10829d
            float r4 = r0.E
            r5 = 1119092736(0x42b40000, float:90.0)
            float r4 = r4 + r5
            double r4 = (double) r4
            double r4 = java.lang.Math.toRadians(r4)
            float r4 = (float) r4
            int r2 = r2.e()
            l1.c$a r5 = l1.c.a.f10835a
            l1.c r6 = r0.j(r5)
            j1.g r6 = r1.k(r6)
            l1.c$a r7 = l1.c.a.f10836b
            l1.c r8 = r0.j(r7)
            j1.g r8 = r1.k(r8)
            l1.c$a r9 = l1.c.a.f10837c
            l1.c r10 = r0.j(r9)
            j1.g r10 = r1.k(r10)
            l1.c$a r11 = l1.c.a.f10838d
            l1.c r12 = r0.j(r11)
            j1.g r12 = r1.k(r12)
            l1.c r5 = r3.j(r5)
            j1.g r5 = r1.k(r5)
            l1.c r7 = r3.j(r7)
            j1.g r7 = r1.k(r7)
            l1.c r9 = r3.j(r9)
            j1.g r9 = r1.k(r9)
            l1.c r3 = r3.j(r11)
            j1.g r3 = r1.k(r3)
            j1.b r11 = r63.l()
            double r13 = (double) r4
            double r15 = java.lang.Math.sin(r13)
            r4 = r9
            r64 = r10
            double r9 = (double) r2
            r17 = r4
            r2 = r5
            double r4 = r15 * r9
            float r4 = (float) r4
            j1.b$a r5 = r11.f9753d
            r15 = 1056964608(0x3f000000, float:0.5)
            r5.e(r7, r15)
            j1.b$a r5 = r11.f9753d
            r5.e(r3, r15)
            j1.b$a r3 = r11.f9753d
            r5 = -1090519040(0xffffffffbf000000, float:-0.5)
            r3.e(r8, r5)
            j1.b$a r3 = r11.f9753d
            r3.e(r12, r5)
            float r3 = -r4
            r11.f9751b = r3
            r1.c(r11)
            j1.b r3 = r63.l()
            double r7 = java.lang.Math.cos(r13)
            double r7 = r7 * r9
            float r4 = (float) r7
            j1.b$a r7 = r3.f9753d
            r7.e(r2, r15)
            j1.b$a r2 = r3.f9753d
            r7 = r17
            r2.e(r7, r15)
            j1.b$a r2 = r3.f9753d
            r2.e(r6, r5)
            j1.b$a r2 = r3.f9753d
            r6 = r64
            r2.e(r6, r5)
            float r2 = -r4
            r3.f9751b = r2
            r1.c(r3)
        L_0x07f9:
            r1 = 0
            r0.f10862l = r1
            r0.m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.d.c(j1.d, boolean):void");
    }

    public boolean d() {
        return this.f10859j0 != 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0373 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03cd  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0425 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0441 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x04b0  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:353:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:357:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(j1.d r29, boolean r30, boolean r31, boolean r32, boolean r33, j1.g r34, j1.g r35, int r36, boolean r37, l1.c r38, l1.c r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            r28 = this;
            r0 = r28
            r10 = r29
            r11 = r34
            r12 = r35
            r13 = r38
            r14 = r39
            r15 = r42
            r1 = r43
            r2 = r51
            r3 = r52
            r4 = r53
            r5 = r54
            j1.g r9 = r10.k(r13)
            j1.g r8 = r10.k(r14)
            l1.c r6 = r13.f10831f
            j1.g r7 = r10.k(r6)
            l1.c r6 = r14.f10831f
            j1.g r6 = r10.k(r6)
            boolean r16 = r38.h()
            boolean r17 = r39.h()
            l1.c r12 = r0.R
            boolean r12 = r12.h()
            if (r17 == 0) goto L_0x003f
            int r18 = r16 + 1
            goto L_0x0041
        L_0x003f:
            r18 = r16
        L_0x0041:
            if (r12 == 0) goto L_0x0045
            int r18 = r18 + 1
        L_0x0045:
            r2 = r18
            if (r45 == 0) goto L_0x004b
            r14 = 3
            goto L_0x004d
        L_0x004b:
            r14 = r50
        L_0x004d:
            if (r36 == 0) goto L_0x052d
            r11 = -1
            r19 = r6
            int r6 = r36 + -1
            r11 = 1
            if (r6 == 0) goto L_0x0062
            if (r6 == r11) goto L_0x0062
            r11 = 2
            if (r6 == r11) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            r11 = 4
            if (r14 == r11) goto L_0x0062
            r6 = 1
            goto L_0x0063
        L_0x0062:
            r6 = 0
        L_0x0063:
            int r11 = r0.f10856i
            r21 = r6
            r6 = -1
            if (r11 == r6) goto L_0x0072
            if (r30 == 0) goto L_0x0072
            r0.f10856i = r6
            r41 = r11
            r21 = 0
        L_0x0072:
            int r11 = r0.f10858j
            if (r11 == r6) goto L_0x007d
            if (r30 != 0) goto L_0x007d
            r0.f10858j = r6
            r21 = 0
            goto L_0x007f
        L_0x007d:
            r11 = r41
        L_0x007f:
            int r6 = r0.f10859j0
            r41 = r11
            r11 = 8
            if (r6 != r11) goto L_0x008b
            r6 = 0
            r21 = 0
            goto L_0x008d
        L_0x008b:
            r6 = r41
        L_0x008d:
            if (r55 == 0) goto L_0x00b0
            if (r16 != 0) goto L_0x009b
            if (r17 != 0) goto L_0x009b
            if (r12 != 0) goto L_0x009b
            r11 = r40
            r10.d(r9, r11)
            goto L_0x00ab
        L_0x009b:
            if (r16 == 0) goto L_0x00ab
            if (r17 != 0) goto L_0x00ab
            int r11 = r38.e()
            r22 = r12
            r12 = 8
            r10.e(r9, r7, r11, r12)
            goto L_0x00b3
        L_0x00ab:
            r22 = r12
            r12 = 8
            goto L_0x00b3
        L_0x00b0:
            r22 = r12
            r12 = r11
        L_0x00b3:
            if (r21 != 0) goto L_0x00d5
            if (r37 == 0) goto L_0x00ca
            r5 = 3
            r11 = 0
            r10.e(r8, r9, r11, r5)
            if (r15 <= 0) goto L_0x00c1
            r10.f(r8, r9, r15, r12)
        L_0x00c1:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00ce
            r10.g(r8, r9, r1, r12)
            goto L_0x00ce
        L_0x00ca:
            r5 = 3
            r10.e(r8, r9, r6, r12)
        L_0x00ce:
            r11 = r33
            r23 = r2
        L_0x00d2:
            r12 = r3
            goto L_0x01af
        L_0x00d5:
            r1 = 3
            r11 = 2
            if (r2 == r11) goto L_0x00f8
            if (r45 != 0) goto L_0x00f8
            r11 = 1
            if (r14 == r11) goto L_0x00e0
            if (r14 != 0) goto L_0x00f8
        L_0x00e0:
            int r5 = java.lang.Math.max(r3, r6)
            if (r4 <= 0) goto L_0x00ea
            int r5 = java.lang.Math.min(r4, r5)
        L_0x00ea:
            r6 = 8
            r10.e(r8, r9, r5, r6)
            r11 = r33
            r23 = r2
            r12 = r3
            r21 = 0
            goto L_0x01af
        L_0x00f8:
            r11 = -2
            if (r3 != r11) goto L_0x00fc
            r3 = r6
        L_0x00fc:
            if (r4 != r11) goto L_0x00ff
            r4 = r6
        L_0x00ff:
            if (r6 <= 0) goto L_0x0105
            r11 = 1
            if (r14 == r11) goto L_0x0105
            r6 = 0
        L_0x0105:
            if (r3 <= 0) goto L_0x0110
            r11 = 8
            r10.f(r8, r9, r3, r11)
            int r6 = java.lang.Math.max(r6, r3)
        L_0x0110:
            if (r4 <= 0) goto L_0x0129
            if (r31 == 0) goto L_0x0119
            r11 = 1
            if (r14 != r11) goto L_0x0119
            r11 = 0
            goto L_0x011a
        L_0x0119:
            r11 = 1
        L_0x011a:
            if (r11 == 0) goto L_0x0122
            r11 = 8
            r10.g(r8, r9, r4, r11)
            goto L_0x0124
        L_0x0122:
            r11 = 8
        L_0x0124:
            int r6 = java.lang.Math.min(r6, r4)
            goto L_0x012b
        L_0x0129:
            r11 = 8
        L_0x012b:
            r12 = 1
            if (r14 != r12) goto L_0x0146
            if (r31 == 0) goto L_0x0134
            r10.e(r8, r9, r6, r11)
            goto L_0x00ce
        L_0x0134:
            if (r47 == 0) goto L_0x013e
            r5 = 5
            r10.e(r8, r9, r6, r5)
            r10.g(r8, r9, r6, r11)
            goto L_0x00ce
        L_0x013e:
            r5 = 5
            r10.e(r8, r9, r6, r5)
            r10.g(r8, r9, r6, r11)
            goto L_0x00ce
        L_0x0146:
            r6 = 2
            if (r14 != r6) goto L_0x01ab
            l1.c$a r6 = l1.c.a.f10836b
            l1.c$a r11 = l1.c.a.f10838d
            l1.c$a r12 = r13.f10830e
            if (r12 == r6) goto L_0x016d
            if (r12 != r11) goto L_0x0154
            goto L_0x016d
        L_0x0154:
            l1.d r6 = r0.W
            l1.c$a r11 = l1.c.a.f10835a
            l1.c r6 = r6.j(r11)
            j1.g r6 = r10.k(r6)
            l1.d r11 = r0.W
            l1.c$a r12 = l1.c.a.f10837c
            l1.c r11 = r11.j(r12)
            j1.g r11 = r10.k(r11)
            goto L_0x0181
        L_0x016d:
            l1.d r12 = r0.W
            l1.c r6 = r12.j(r6)
            j1.g r6 = r10.k(r6)
            l1.d r12 = r0.W
            l1.c r11 = r12.j(r11)
            j1.g r11 = r10.k(r11)
        L_0x0181:
            j1.b r12 = r29.l()
            j1.b$a r1 = r12.f9753d
            r23 = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.e(r8, r2)
            j1.b$a r1 = r12.f9753d
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.e(r9, r2)
            j1.b$a r1 = r12.f9753d
            r1.e(r11, r5)
            j1.b$a r1 = r12.f9753d
            float r2 = -r5
            r1.e(r6, r2)
            r10.c(r12)
            if (r31 == 0) goto L_0x01a7
            r21 = 0
        L_0x01a7:
            r11 = r33
            goto L_0x00d2
        L_0x01ab:
            r23 = r2
            r12 = r3
            r11 = 1
        L_0x01af:
            if (r55 == 0) goto L_0x04e2
            if (r47 == 0) goto L_0x01b5
            goto L_0x04e2
        L_0x01b5:
            if (r16 != 0) goto L_0x01c5
            if (r17 != 0) goto L_0x01c5
            if (r22 != 0) goto L_0x01c5
            r14 = r39
            r5 = r8
            r33 = r11
            r2 = r19
        L_0x01c2:
            r3 = 5
            goto L_0x04c7
        L_0x01c5:
            if (r16 == 0) goto L_0x01e3
            if (r17 != 0) goto L_0x01e3
            l1.c r1 = r13.f10831f
            l1.d r1 = r1.f10829d
            if (r31 == 0) goto L_0x01d6
            boolean r1 = r1 instanceof l1.a
            if (r1 == 0) goto L_0x01d6
            r1 = 8
            goto L_0x01d7
        L_0x01d6:
            r1 = 5
        L_0x01d7:
            r14 = r39
            r5 = r8
            r33 = r11
            r2 = r19
            r11 = r1
            r1 = r31
            goto L_0x04ca
        L_0x01e3:
            if (r16 != 0) goto L_0x0205
            if (r17 == 0) goto L_0x0205
            int r1 = r39.e()
            int r1 = -r1
            r6 = r19
            r2 = 8
            r10.e(r8, r6, r1, r2)
            if (r31 == 0) goto L_0x04bf
            r5 = r34
            r1 = 5
            r2 = 0
            r10.f(r9, r5, r2, r1)
            r14 = r39
            r3 = r1
            r2 = r6
            r5 = r8
            r33 = r11
            goto L_0x04c7
        L_0x0205:
            r5 = r34
            r6 = r19
            r1 = -1
            if (r16 == 0) goto L_0x04bf
            if (r17 == 0) goto L_0x04bf
            l1.c r2 = r13.f10831f
            l1.d r3 = r2.f10829d
            r2 = r39
            l1.c r1 = r2.f10831f
            l1.d r1 = r1.f10829d
            l1.d r13 = r0.W
            r16 = 6
            if (r21 == 0) goto L_0x0322
            if (r14 != 0) goto L_0x0276
            if (r4 != 0) goto L_0x0249
            if (r12 != 0) goto L_0x0249
            boolean r4 = r7.B
            if (r4 == 0) goto L_0x023e
            boolean r4 = r6.B
            if (r4 == 0) goto L_0x023e
            int r1 = r38.e()
            r3 = 8
            r10.e(r9, r7, r1, r3)
            int r1 = r39.e()
            int r1 = -r1
            r10.e(r8, r6, r1, r3)
            return
        L_0x023e:
            r30 = 8
            r17 = 8
            r19 = 0
            r22 = 1
            r23 = 0
            goto L_0x0253
        L_0x0249:
            r30 = 5
            r17 = 5
            r19 = 1
            r22 = 0
            r23 = 1
        L_0x0253:
            boolean r4 = r3 instanceof l1.a
            if (r4 != 0) goto L_0x0269
            boolean r4 = r1 instanceof l1.a
            if (r4 == 0) goto L_0x025c
            goto L_0x0269
        L_0x025c:
            r4 = r16
            r15 = r17
            r24 = r22
            r17 = r14
            r22 = r19
            r19 = r30
            goto L_0x02a1
        L_0x0269:
            r4 = r16
            r15 = r17
            r24 = r22
            r17 = r14
            r22 = r19
            r19 = 4
            goto L_0x02a1
        L_0x0276:
            r15 = 2
            if (r14 != r15) goto L_0x0290
            boolean r4 = r3 instanceof l1.a
            if (r4 != 0) goto L_0x028a
            boolean r4 = r1 instanceof l1.a
            if (r4 == 0) goto L_0x0282
            goto L_0x028a
        L_0x0282:
            r17 = r14
            r4 = r16
            r15 = 5
            r19 = 5
            goto L_0x029b
        L_0x028a:
            r17 = r14
            r4 = r16
            r15 = 5
            goto L_0x0299
        L_0x0290:
            r15 = 1
            if (r14 != r15) goto L_0x02a5
            r17 = r14
            r4 = r16
            r15 = 8
        L_0x0299:
            r19 = 4
        L_0x029b:
            r22 = 1
            r23 = 1
            r24 = 0
        L_0x02a1:
            r14 = r35
            goto L_0x0371
        L_0x02a5:
            r15 = 3
            if (r14 != r15) goto L_0x0314
            int r15 = r0.B
            r17 = r14
            r14 = -1
            if (r15 != r14) goto L_0x02c7
            r14 = r35
            if (r48 == 0) goto L_0x02b9
            if (r31 == 0) goto L_0x02b7
            r4 = 5
            goto L_0x02bb
        L_0x02b7:
            r4 = 4
            goto L_0x02bb
        L_0x02b9:
            r4 = 8
        L_0x02bb:
            r15 = 8
        L_0x02bd:
            r19 = 5
        L_0x02bf:
            r22 = 1
            r23 = 1
            r24 = 1
            goto L_0x0371
        L_0x02c7:
            if (r45 == 0) goto L_0x02e9
            r14 = r51
            r15 = 2
            if (r14 == r15) goto L_0x02d4
            r4 = 1
            if (r14 != r4) goto L_0x02d2
            goto L_0x02d4
        L_0x02d2:
            r4 = 0
            goto L_0x02d5
        L_0x02d4:
            r4 = 1
        L_0x02d5:
            if (r4 != 0) goto L_0x02db
            r4 = 8
            r14 = 5
            goto L_0x02dd
        L_0x02db:
            r4 = 5
            r14 = 4
        L_0x02dd:
            r15 = r4
            r19 = r14
            r4 = r16
            r22 = 1
            r23 = 1
            r24 = 1
            goto L_0x02a1
        L_0x02e9:
            if (r4 <= 0) goto L_0x02f1
            r14 = r35
            r4 = r16
            r15 = 5
            goto L_0x02bd
        L_0x02f1:
            if (r4 != 0) goto L_0x030c
            if (r12 != 0) goto L_0x030c
            if (r48 != 0) goto L_0x02ff
            r14 = r35
            r4 = r16
            r15 = 5
            r19 = 8
            goto L_0x02bf
        L_0x02ff:
            if (r3 == r13) goto L_0x0305
            if (r1 == r13) goto L_0x0305
            r4 = 4
            goto L_0x0306
        L_0x0305:
            r4 = 5
        L_0x0306:
            r14 = r35
            r15 = r4
            r4 = r16
            goto L_0x0311
        L_0x030c:
            r14 = r35
            r4 = r16
            r15 = 5
        L_0x0311:
            r19 = 4
            goto L_0x02bf
        L_0x0314:
            r17 = r14
            r14 = r35
            r4 = r16
            r15 = 5
            r19 = 4
            r22 = 0
            r23 = 0
            goto L_0x036f
        L_0x0322:
            r17 = r14
            boolean r4 = r7.B
            if (r4 == 0) goto L_0x0364
            boolean r4 = r6.B
            if (r4 == 0) goto L_0x0364
            int r1 = r38.e()
            int r3 = r39.e()
            r4 = 8
            r45 = r29
            r46 = r9
            r47 = r7
            r48 = r1
            r49 = r44
            r50 = r6
            r51 = r8
            r52 = r3
            r53 = r4
            r45.b(r46, r47, r48, r49, r50, r51, r52, r53)
            if (r31 == 0) goto L_0x0363
            if (r11 == 0) goto L_0x0363
            l1.c r1 = r2.f10831f
            if (r1 == 0) goto L_0x035a
            int r11 = r39.e()
            r14 = r35
            goto L_0x035d
        L_0x035a:
            r14 = r35
            r11 = 0
        L_0x035d:
            if (r6 == r14) goto L_0x0363
            r1 = 5
            r10.f(r14, r8, r11, r1)
        L_0x0363:
            return
        L_0x0364:
            r14 = r35
            r4 = r16
            r15 = 5
            r19 = 4
            r22 = 1
            r23 = 1
        L_0x036f:
            r24 = 0
        L_0x0371:
            if (r23 == 0) goto L_0x037c
            if (r7 != r6) goto L_0x037c
            if (r3 == r13) goto L_0x037c
            r23 = 0
            r25 = 0
            goto L_0x0380
        L_0x037c:
            r25 = r23
            r23 = 1
        L_0x0380:
            if (r22 == 0) goto L_0x03cd
            if (r21 != 0) goto L_0x0394
            if (r46 != 0) goto L_0x0394
            if (r48 != 0) goto L_0x0394
            if (r7 != r5) goto L_0x0394
            if (r6 != r14) goto L_0x0394
            r15 = 0
            r22 = 8
            r23 = 8
            r26 = 0
            goto L_0x039c
        L_0x0394:
            r22 = r15
            r26 = r23
            r15 = r31
            r23 = r4
        L_0x039c:
            int r4 = r38.e()
            int r27 = r39.e()
            r30 = r15
            r14 = 3
            r15 = r1
            r1 = r29
            r14 = r2
            r2 = r9
            r33 = r11
            r11 = r3
            r3 = r7
            r36 = r12
            r12 = r5
            r5 = r44
            r37 = r6
            r12 = r7
            r7 = r8
            r43 = r13
            r13 = r8
            r8 = r27
            r27 = r13
            r13 = r9
            r9 = r23
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r30
            r4 = r22
            r23 = r26
            goto L_0x03df
        L_0x03cd:
            r14 = r2
            r37 = r6
            r27 = r8
            r33 = r11
            r36 = r12
            r43 = r13
            r4 = r15
            r15 = r1
            r11 = r3
            r12 = r7
            r13 = r9
            r1 = r31
        L_0x03df:
            int r2 = r0.f10859j0
            r3 = 8
            if (r2 != r3) goto L_0x03f6
            java.util.HashSet<l1.c> r2 = r14.f10826a
            if (r2 != 0) goto L_0x03ea
            goto L_0x03f2
        L_0x03ea:
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x03f2
            r2 = 1
            goto L_0x03f3
        L_0x03f2:
            r2 = 0
        L_0x03f3:
            if (r2 != 0) goto L_0x03f6
            return
        L_0x03f6:
            if (r25 == 0) goto L_0x041f
            if (r1 == 0) goto L_0x040b
            r2 = r37
            if (r12 == r2) goto L_0x040d
            if (r21 != 0) goto L_0x040d
            boolean r3 = r11 instanceof l1.a
            if (r3 != 0) goto L_0x0408
            boolean r3 = r15 instanceof l1.a
            if (r3 == 0) goto L_0x040d
        L_0x0408:
            r4 = r16
            goto L_0x040d
        L_0x040b:
            r2 = r37
        L_0x040d:
            int r3 = r38.e()
            r10.f(r13, r12, r3, r4)
            int r3 = r39.e()
            int r3 = -r3
            r5 = r27
            r10.g(r5, r2, r3, r4)
            goto L_0x0423
        L_0x041f:
            r2 = r37
            r5 = r27
        L_0x0423:
            if (r1 == 0) goto L_0x0439
            if (r49 == 0) goto L_0x0439
            boolean r3 = r11 instanceof l1.a
            if (r3 != 0) goto L_0x0439
            boolean r3 = r15 instanceof l1.a
            if (r3 != 0) goto L_0x0439
            r3 = r43
            if (r15 == r3) goto L_0x043b
            r4 = r16
            r6 = r4
            r20 = 1
            goto L_0x043f
        L_0x0439:
            r3 = r43
        L_0x043b:
            r6 = r19
            r20 = r23
        L_0x043f:
            if (r20 == 0) goto L_0x048e
            if (r24 == 0) goto L_0x046c
            if (r48 == 0) goto L_0x0447
            if (r32 == 0) goto L_0x046c
        L_0x0447:
            if (r11 == r3) goto L_0x044e
            if (r15 != r3) goto L_0x044c
            goto L_0x044e
        L_0x044c:
            r16 = r6
        L_0x044e:
            boolean r7 = r11 instanceof l1.g
            if (r7 != 0) goto L_0x0456
            boolean r7 = r15 instanceof l1.g
            if (r7 == 0) goto L_0x0458
        L_0x0456:
            r16 = 5
        L_0x0458:
            boolean r7 = r11 instanceof l1.a
            if (r7 != 0) goto L_0x0460
            boolean r7 = r15 instanceof l1.a
            if (r7 == 0) goto L_0x0462
        L_0x0460:
            r16 = 5
        L_0x0462:
            if (r48 == 0) goto L_0x0466
            r7 = 5
            goto L_0x0468
        L_0x0466:
            r7 = r16
        L_0x0468:
            int r6 = java.lang.Math.max(r7, r6)
        L_0x046c:
            if (r1 == 0) goto L_0x047e
            int r4 = java.lang.Math.min(r4, r6)
            if (r45 == 0) goto L_0x047c
            if (r48 != 0) goto L_0x047c
            if (r11 == r3) goto L_0x047a
            if (r15 != r3) goto L_0x047c
        L_0x047a:
            r11 = 4
            goto L_0x047f
        L_0x047c:
            r11 = r4
            goto L_0x047f
        L_0x047e:
            r11 = r6
        L_0x047f:
            int r3 = r38.e()
            r10.e(r13, r12, r3, r11)
            int r3 = r39.e()
            int r3 = -r3
            r10.e(r5, r2, r3, r11)
        L_0x048e:
            if (r1 == 0) goto L_0x04a1
            r3 = r34
            r4 = r12
            if (r3 != r4) goto L_0x049a
            int r6 = r38.e()
            goto L_0x049b
        L_0x049a:
            r6 = 0
        L_0x049b:
            if (r4 == r3) goto L_0x04a1
            r4 = 5
            r10.f(r13, r3, r6, r4)
        L_0x04a1:
            if (r1 == 0) goto L_0x04bd
            if (r21 == 0) goto L_0x04bd
            if (r42 != 0) goto L_0x04bd
            if (r36 != 0) goto L_0x04bd
            if (r21 == 0) goto L_0x04b7
            r3 = r17
            r4 = 3
            if (r3 != r4) goto L_0x04b7
            r3 = 8
            r4 = 0
            r10.f(r5, r13, r4, r3)
            goto L_0x04bd
        L_0x04b7:
            r4 = 0
            r3 = 5
            r10.f(r5, r13, r4, r3)
            goto L_0x04c9
        L_0x04bd:
            r3 = 5
            goto L_0x04c9
        L_0x04bf:
            r14 = r39
            r2 = r6
            r5 = r8
            r33 = r11
            goto L_0x01c2
        L_0x04c7:
            r1 = r31
        L_0x04c9:
            r11 = r3
        L_0x04ca:
            if (r1 == 0) goto L_0x04e1
            if (r33 == 0) goto L_0x04e1
            l1.c r1 = r14.f10831f
            if (r1 == 0) goto L_0x04d9
            int r1 = r39.e()
            r4 = r35
            goto L_0x04dc
        L_0x04d9:
            r4 = r35
            r1 = 0
        L_0x04dc:
            if (r2 == r4) goto L_0x04e1
            r10.f(r4, r5, r1, r11)
        L_0x04e1:
            return
        L_0x04e2:
            r3 = r34
            r4 = r35
            r5 = r8
            r13 = r9
            r33 = r11
            r1 = r23
            r2 = 3
            r6 = 2
            if (r1 >= r6) goto L_0x052c
            if (r31 == 0) goto L_0x052c
            if (r33 == 0) goto L_0x052c
            r1 = 8
            r6 = 0
            r10.f(r13, r3, r6, r1)
            l1.c r1 = r0.O
            if (r30 != 0) goto L_0x0505
            l1.c r3 = r1.f10831f
            if (r3 != 0) goto L_0x0503
            goto L_0x0505
        L_0x0503:
            r11 = 0
            goto L_0x0506
        L_0x0505:
            r11 = 1
        L_0x0506:
            if (r30 != 0) goto L_0x0524
            l1.c r1 = r1.f10831f
            if (r1 == 0) goto L_0x0524
            l1.d r1 = r1.f10829d
            float r3 = r1.Z
            r6 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0523
            int[] r1 = r1.V
            r3 = 0
            r6 = r1[r3]
            if (r6 != r2) goto L_0x0523
            r3 = 1
            r1 = r1[r3]
            if (r1 != r2) goto L_0x0523
            r11 = r3
            goto L_0x0524
        L_0x0523:
            r11 = 0
        L_0x0524:
            if (r11 == 0) goto L_0x052c
            r1 = 8
            r2 = 0
            r10.f(r4, r5, r2, r1)
        L_0x052c:
            return
        L_0x052d:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.d.e(j1.d, boolean, boolean, boolean, boolean, j1.g, j1.g, int, boolean, l1.c, l1.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void f(c.a aVar, d dVar, c.a aVar2, int i8) {
        boolean z10;
        c.a aVar3 = c.a.B;
        c.a aVar4 = c.a.D;
        c.a aVar5 = c.a.C;
        c.a aVar6 = c.a.f10835a;
        c.a aVar7 = c.a.f10836b;
        c.a aVar8 = c.a.f10837c;
        c.a aVar9 = c.a.f10838d;
        if (aVar == aVar3) {
            if (aVar2 == aVar3) {
                c j10 = j(aVar6);
                c j11 = j(aVar8);
                c j12 = j(aVar7);
                c j13 = j(aVar9);
                boolean z11 = true;
                if ((j10 == null || !j10.h()) && (j11 == null || !j11.h())) {
                    f(aVar6, dVar, aVar6, 0);
                    f(aVar8, dVar, aVar8, 0);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((j12 == null || !j12.h()) && (j13 == null || !j13.h())) {
                    f(aVar7, dVar, aVar7, 0);
                    f(aVar9, dVar, aVar9, 0);
                } else {
                    z11 = false;
                }
                if (z10 && z11) {
                    j(aVar3).a(dVar.j(aVar3), 0);
                } else if (z10) {
                    j(aVar5).a(dVar.j(aVar5), 0);
                } else if (z11) {
                    j(aVar4).a(dVar.j(aVar4), 0);
                }
            } else if (aVar2 == aVar6 || aVar2 == aVar8) {
                f(aVar6, dVar, aVar2, 0);
                f(aVar8, dVar, aVar2, 0);
                j(aVar3).a(dVar.j(aVar2), 0);
            } else if (aVar2 == aVar7 || aVar2 == aVar9) {
                f(aVar7, dVar, aVar2, 0);
                f(aVar9, dVar, aVar2, 0);
                j(aVar3).a(dVar.j(aVar2), 0);
            }
        } else if (aVar == aVar5 && (aVar2 == aVar6 || aVar2 == aVar8)) {
            c j14 = j(aVar6);
            c j15 = dVar.j(aVar2);
            c j16 = j(aVar8);
            j14.a(j15, 0);
            j16.a(j15, 0);
            j(aVar5).a(j15, 0);
        } else if (aVar == aVar4 && (aVar2 == aVar7 || aVar2 == aVar9)) {
            c j17 = dVar.j(aVar2);
            j(aVar7).a(j17, 0);
            j(aVar9).a(j17, 0);
            j(aVar4).a(j17, 0);
        } else if (aVar == aVar5 && aVar2 == aVar5) {
            j(aVar6).a(dVar.j(aVar6), 0);
            j(aVar8).a(dVar.j(aVar8), 0);
            j(aVar5).a(dVar.j(aVar2), 0);
        } else if (aVar == aVar4 && aVar2 == aVar4) {
            j(aVar7).a(dVar.j(aVar7), 0);
            j(aVar9).a(dVar.j(aVar9), 0);
            j(aVar4).a(dVar.j(aVar2), 0);
        } else {
            c j18 = j(aVar);
            c j19 = dVar.j(aVar2);
            if (j18.i(j19)) {
                c.a aVar10 = c.a.f10839e;
                if (aVar == aVar10) {
                    c j20 = j(aVar7);
                    c j21 = j(aVar9);
                    if (j20 != null) {
                        j20.j();
                    }
                    if (j21 != null) {
                        j21.j();
                    }
                } else if (aVar == aVar7 || aVar == aVar9) {
                    c j22 = j(aVar10);
                    if (j22 != null) {
                        j22.j();
                    }
                    c j23 = j(aVar3);
                    if (j23.f10831f != j19) {
                        j23.j();
                    }
                    c f10 = j(aVar).f();
                    c j24 = j(aVar4);
                    if (j24.h()) {
                        f10.j();
                        j24.j();
                    }
                } else if (aVar == aVar6 || aVar == aVar8) {
                    c j25 = j(aVar3);
                    if (j25.f10831f != j19) {
                        j25.j();
                    }
                    c f11 = j(aVar).f();
                    c j26 = j(aVar5);
                    if (j26.h()) {
                        f11.j();
                        j26.j();
                    }
                }
                j18.a(j19, i8);
            }
        }
    }

    public final void g(c cVar, c cVar2, int i8) {
        if (cVar.f10829d == this) {
            f(cVar.f10830e, cVar2.f10829d, cVar2.f10830e, i8);
        }
    }

    public final void h(j1.d dVar) {
        dVar.k(this.K);
        dVar.k(this.L);
        dVar.k(this.M);
        dVar.k(this.N);
        if (this.f10847d0 > 0) {
            dVar.k(this.O);
        }
    }

    public final void i() {
        if (this.f10846d == null) {
            this.f10846d = new l(this);
        }
        if (this.f10848e == null) {
            this.f10848e = new n(this);
        }
    }

    public c j(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final int k(int i8) {
        int[] iArr = this.V;
        if (i8 == 0) {
            return iArr[0];
        }
        if (i8 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int l() {
        if (this.f10859j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.N;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final l1.d m(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            l1.c r3 = r2.M
            l1.c r0 = r3.f10831f
            if (r0 == 0) goto L_0x001f
            l1.c r1 = r0.f10831f
            if (r1 != r3) goto L_0x001f
            l1.d r3 = r0.f10829d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            l1.c r3 = r2.N
            l1.c r0 = r3.f10831f
            if (r0 == 0) goto L_0x001f
            l1.c r1 = r0.f10831f
            if (r1 != r3) goto L_0x001f
            l1.d r3 = r0.f10829d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.d.m(int):l1.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final l1.d n(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            l1.c r3 = r2.K
            l1.c r0 = r3.f10831f
            if (r0 == 0) goto L_0x001f
            l1.c r1 = r0.f10831f
            if (r1 != r3) goto L_0x001f
            l1.d r3 = r0.f10829d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            l1.c r3 = r2.L
            l1.c r0 = r3.f10831f
            if (r0 == 0) goto L_0x001f
            l1.c r1 = r0.f10831f
            if (r1 != r3) goto L_0x001f
            l1.d r3 = r0.f10829d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.d.n(int):l1.d");
    }

    public void o(StringBuilder sb2) {
        sb2.append("  " + this.f10860k + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.Y);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f10843b0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f10845c0);
        sb2.append("\n");
        q(sb2, "left", this.K);
        q(sb2, "top", this.L);
        q(sb2, "right", this.M);
        q(sb2, "bottom", this.N);
        q(sb2, "baseline", this.O);
        q(sb2, "centerX", this.P);
        q(sb2, "centerY", this.Q);
        int i8 = this.X;
        int i10 = this.f10849e0;
        int[] iArr = this.D;
        int i11 = iArr[0];
        int i12 = this.f10878v;
        int i13 = this.f10875s;
        float f10 = this.f10880x;
        float[] fArr = this.f10866n0;
        float f11 = fArr[0];
        p(sb2, "    width", i8, i10, i11, i12, i13, f10);
        int i14 = this.Y;
        int i15 = this.f10851f0;
        int i16 = iArr[1];
        int i17 = this.f10881y;
        int i18 = this.f10876t;
        float f12 = this.A;
        float f13 = fArr[1];
        p(sb2, "    height", i14, i15, i16, i17, i18, f12);
        float f14 = this.Z;
        int i19 = this.f10841a0;
        if (f14 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f14);
            sb2.append(",");
            sb2.append(i19);
            sb2.append("");
            sb2.append("],\n");
        }
        I(sb2, "    horizontalBias", this.f10853g0, 0.5f);
        I(sb2, "    verticalBias", this.f10855h0, 0.5f);
        H(this.f10863l0, 0, "    horizontalChainStyle", sb2);
        H(this.f10864m0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final int r() {
        if (this.f10859j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int s() {
        d dVar = this.W;
        return (dVar == null || !(dVar instanceof e)) ? this.f10843b0 : ((e) dVar).f10889z0 + this.f10843b0;
    }

    public final int t() {
        d dVar = this.W;
        return (dVar == null || !(dVar instanceof e)) ? this.f10845c0 : ((e) dVar).A0 + this.f10845c0;
    }

    public String toString() {
        String str = "";
        StringBuilder c3 = e.c(str);
        if (this.f10861k0 != null) {
            str = g.a(new StringBuilder("id: "), this.f10861k0, " ");
        }
        c3.append(str);
        c3.append("(");
        c3.append(this.f10843b0);
        c3.append(", ");
        c3.append(this.f10845c0);
        c3.append(") - (");
        c3.append(this.X);
        c3.append(" x ");
        return x.b(c3, this.Y, ")");
    }

    public final boolean u(int i8) {
        if (i8 == 0) {
            return (this.K.f10831f != null ? 1 : 0) + (this.M.f10831f != null ? 1 : 0) < 2;
        }
        return ((this.L.f10831f != null ? 1 : 0) + (this.N.f10831f != null ? 1 : 0)) + (this.O.f10831f != null ? 1 : 0) < 2;
    }

    public final boolean v(int i8, int i10) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i8 == 0) {
            c cVar5 = this.K;
            c cVar6 = cVar5.f10831f;
            if (cVar6 != null && cVar6.f10828c && (cVar4 = cVar3.f10831f) != null && cVar4.f10828c) {
                return (cVar4.d() - (cVar3 = this.M).e()) - (cVar5.e() + cVar5.f10831f.d()) >= i10;
            }
        } else {
            c cVar7 = this.L;
            c cVar8 = cVar7.f10831f;
            if (cVar8 != null && cVar8.f10828c && (cVar2 = (cVar = this.N).f10831f) != null && cVar2.f10828c) {
                return (cVar2.d() - cVar.e()) - (cVar7.e() + cVar7.f10831f.d()) >= i10;
            }
        }
        return false;
    }

    public final void w(c.a aVar, d dVar, c.a aVar2, int i8, int i10) {
        j(aVar).b(dVar.j(aVar2), i8, i10, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r4 = r0[r4 + 1];
        r0 = r4.f10831f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(int r4) {
        /*
            r3 = this;
            int r4 = r4 * 2
            l1.c[] r0 = r3.S
            r1 = r0[r4]
            l1.c r2 = r1.f10831f
            if (r2 == 0) goto L_0x001b
            l1.c r2 = r2.f10831f
            if (r2 == r1) goto L_0x001b
            r1 = 1
            int r4 = r4 + r1
            r4 = r0[r4]
            l1.c r0 = r4.f10831f
            if (r0 == 0) goto L_0x001b
            l1.c r0 = r0.f10831f
            if (r0 != r4) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.d.x(int):boolean");
    }

    public final boolean y() {
        c cVar = this.K;
        c cVar2 = cVar.f10831f;
        if (cVar2 != null && cVar2.f10831f == cVar) {
            return true;
        }
        c cVar3 = this.M;
        c cVar4 = cVar3.f10831f;
        return cVar4 != null && cVar4.f10831f == cVar3;
    }

    public final boolean z() {
        c cVar = this.L;
        c cVar2 = cVar.f10831f;
        if (cVar2 != null && cVar2.f10831f == cVar) {
            return true;
        }
        c cVar3 = this.N;
        c cVar4 = cVar3.f10831f;
        return cVar4 != null && cVar4.f10831f == cVar3;
    }
}
