package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p000firebaseauthapi.gf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1604d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f1605e;

    /* renamed from: f  reason: collision with root package name */
    public static final SparseIntArray f1606f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, o1.a> f1607a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1608b = true;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<Integer, a> f1609c = new HashMap<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1610a;

        /* renamed from: b  reason: collision with root package name */
        public final d f1611b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final c f1612c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final C0019b f1613d = new C0019b();

        /* renamed from: e  reason: collision with root package name */
        public final e f1614e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, o1.a> f1615f = new HashMap<>();

        /* renamed from: androidx.constraintlayout.widget.b$a$a  reason: collision with other inner class name */
        public static class C0018a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f1616a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f1617b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f1618c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f1619d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f1620e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f1621f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f1622g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f1623h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f1624i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f1625j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f1626k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f1627l = 0;

            public final void a(int i8, float f10) {
                int i10 = this.f1621f;
                int[] iArr = this.f1619d;
                if (i10 >= iArr.length) {
                    this.f1619d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1620e;
                    this.f1620e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1619d;
                int i11 = this.f1621f;
                iArr2[i11] = i8;
                float[] fArr2 = this.f1620e;
                this.f1621f = i11 + 1;
                fArr2[i11] = f10;
            }

            public final void b(int i8, int i10) {
                int i11 = this.f1618c;
                int[] iArr = this.f1616a;
                if (i11 >= iArr.length) {
                    this.f1616a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1617b;
                    this.f1617b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1616a;
                int i12 = this.f1618c;
                iArr3[i12] = i8;
                int[] iArr4 = this.f1617b;
                this.f1618c = i12 + 1;
                iArr4[i12] = i10;
            }

            public final void c(int i8, String str) {
                int i10 = this.f1624i;
                int[] iArr = this.f1622g;
                if (i10 >= iArr.length) {
                    this.f1622g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1623h;
                    this.f1623h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1622g;
                int i11 = this.f1624i;
                iArr2[i11] = i8;
                String[] strArr2 = this.f1623h;
                this.f1624i = i11 + 1;
                strArr2[i11] = str;
            }

            public final void d(int i8, boolean z10) {
                int i10 = this.f1627l;
                int[] iArr = this.f1625j;
                if (i10 >= iArr.length) {
                    this.f1625j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1626k;
                    this.f1626k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1625j;
                int i11 = this.f1627l;
                iArr2[i11] = i8;
                boolean[] zArr2 = this.f1626k;
                this.f1627l = i11 + 1;
                zArr2[i11] = z10;
            }
        }

        public final void a(ConstraintLayout.a aVar) {
            C0019b bVar = this.f1613d;
            aVar.f1555e = bVar.f1643h;
            aVar.f1557f = bVar.f1645i;
            aVar.f1559g = bVar.f1647j;
            aVar.f1561h = bVar.f1649k;
            aVar.f1563i = bVar.f1651l;
            aVar.f1565j = bVar.m;
            aVar.f1567k = bVar.f1654n;
            aVar.f1569l = bVar.f1656o;
            aVar.m = bVar.f1658p;
            aVar.f1572n = bVar.f1659q;
            aVar.f1574o = bVar.f1660r;
            aVar.f1581s = bVar.f1661s;
            aVar.f1582t = bVar.f1662t;
            aVar.f1583u = bVar.f1663u;
            aVar.f1584v = bVar.f1664v;
            aVar.leftMargin = bVar.F;
            aVar.rightMargin = bVar.G;
            aVar.topMargin = bVar.H;
            aVar.bottomMargin = bVar.I;
            aVar.A = bVar.R;
            aVar.B = bVar.Q;
            aVar.f1586x = bVar.N;
            aVar.f1588z = bVar.P;
            aVar.E = bVar.f1665w;
            aVar.F = bVar.f1666x;
            aVar.f1576p = bVar.f1668z;
            aVar.f1578q = bVar.A;
            aVar.f1580r = bVar.B;
            aVar.G = bVar.f1667y;
            aVar.T = bVar.C;
            aVar.U = bVar.D;
            aVar.I = bVar.T;
            aVar.H = bVar.U;
            aVar.K = bVar.W;
            aVar.J = bVar.V;
            aVar.W = bVar.f1652l0;
            aVar.X = bVar.f1653m0;
            aVar.L = bVar.X;
            aVar.M = bVar.Y;
            aVar.P = bVar.Z;
            aVar.Q = bVar.f1630a0;
            aVar.N = bVar.f1632b0;
            aVar.O = bVar.f1634c0;
            aVar.R = bVar.f1636d0;
            aVar.S = bVar.f1638e0;
            aVar.V = bVar.E;
            aVar.f1551c = bVar.f1639f;
            aVar.f1547a = bVar.f1635d;
            aVar.f1549b = bVar.f1637e;
            aVar.width = bVar.f1631b;
            aVar.height = bVar.f1633c;
            String str = bVar.f1650k0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar.f1657o0;
            aVar.setMarginStart(bVar.K);
            aVar.setMarginEnd(bVar.J);
            aVar.a();
        }

        public final void b(int i8, ConstraintLayout.a aVar) {
            this.f1610a = i8;
            int i10 = aVar.f1555e;
            C0019b bVar = this.f1613d;
            bVar.f1643h = i10;
            bVar.f1645i = aVar.f1557f;
            bVar.f1647j = aVar.f1559g;
            bVar.f1649k = aVar.f1561h;
            bVar.f1651l = aVar.f1563i;
            bVar.m = aVar.f1565j;
            bVar.f1654n = aVar.f1567k;
            bVar.f1656o = aVar.f1569l;
            bVar.f1658p = aVar.m;
            bVar.f1659q = aVar.f1572n;
            bVar.f1660r = aVar.f1574o;
            bVar.f1661s = aVar.f1581s;
            bVar.f1662t = aVar.f1582t;
            bVar.f1663u = aVar.f1583u;
            bVar.f1664v = aVar.f1584v;
            bVar.f1665w = aVar.E;
            bVar.f1666x = aVar.F;
            bVar.f1667y = aVar.G;
            bVar.f1668z = aVar.f1576p;
            bVar.A = aVar.f1578q;
            bVar.B = aVar.f1580r;
            bVar.C = aVar.T;
            bVar.D = aVar.U;
            bVar.E = aVar.V;
            bVar.f1639f = aVar.f1551c;
            bVar.f1635d = aVar.f1547a;
            bVar.f1637e = aVar.f1549b;
            bVar.f1631b = aVar.width;
            bVar.f1633c = aVar.height;
            bVar.F = aVar.leftMargin;
            bVar.G = aVar.rightMargin;
            bVar.H = aVar.topMargin;
            bVar.I = aVar.bottomMargin;
            bVar.L = aVar.D;
            bVar.T = aVar.I;
            bVar.U = aVar.H;
            bVar.W = aVar.K;
            bVar.V = aVar.J;
            bVar.f1652l0 = aVar.W;
            bVar.f1653m0 = aVar.X;
            bVar.X = aVar.L;
            bVar.Y = aVar.M;
            bVar.Z = aVar.P;
            bVar.f1630a0 = aVar.Q;
            bVar.f1632b0 = aVar.N;
            bVar.f1634c0 = aVar.O;
            bVar.f1636d0 = aVar.R;
            bVar.f1638e0 = aVar.S;
            bVar.f1650k0 = aVar.Y;
            bVar.N = aVar.f1586x;
            bVar.P = aVar.f1588z;
            bVar.M = aVar.f1585w;
            bVar.O = aVar.f1587y;
            bVar.R = aVar.A;
            bVar.Q = aVar.B;
            bVar.S = aVar.C;
            bVar.f1657o0 = aVar.Z;
            bVar.J = aVar.getMarginEnd();
            bVar.K = aVar.getMarginStart();
        }

        public final void c(int i8, c.a aVar) {
            b(i8, aVar);
            this.f1611b.f1681c = aVar.f1697r0;
            float f10 = aVar.f1700u0;
            e eVar = this.f1614e;
            eVar.f1684a = f10;
            eVar.f1685b = aVar.f1701v0;
            eVar.f1686c = aVar.f1702w0;
            eVar.f1687d = aVar.f1703x0;
            eVar.f1688e = aVar.f1704y0;
            eVar.f1689f = aVar.f1705z0;
            eVar.f1690g = aVar.A0;
            eVar.f1692i = aVar.B0;
            eVar.f1693j = aVar.C0;
            eVar.f1694k = aVar.D0;
            eVar.m = aVar.f1699t0;
            eVar.f1695l = aVar.f1698s0;
        }

        public final Object clone() {
            a aVar = new a();
            C0019b bVar = aVar.f1613d;
            bVar.getClass();
            C0019b bVar2 = this.f1613d;
            bVar.f1629a = bVar2.f1629a;
            bVar.f1631b = bVar2.f1631b;
            bVar.f1633c = bVar2.f1633c;
            bVar.f1635d = bVar2.f1635d;
            bVar.f1637e = bVar2.f1637e;
            bVar.f1639f = bVar2.f1639f;
            bVar.f1641g = bVar2.f1641g;
            bVar.f1643h = bVar2.f1643h;
            bVar.f1645i = bVar2.f1645i;
            bVar.f1647j = bVar2.f1647j;
            bVar.f1649k = bVar2.f1649k;
            bVar.f1651l = bVar2.f1651l;
            bVar.m = bVar2.m;
            bVar.f1654n = bVar2.f1654n;
            bVar.f1656o = bVar2.f1656o;
            bVar.f1658p = bVar2.f1658p;
            bVar.f1659q = bVar2.f1659q;
            bVar.f1660r = bVar2.f1660r;
            bVar.f1661s = bVar2.f1661s;
            bVar.f1662t = bVar2.f1662t;
            bVar.f1663u = bVar2.f1663u;
            bVar.f1664v = bVar2.f1664v;
            bVar.f1665w = bVar2.f1665w;
            bVar.f1666x = bVar2.f1666x;
            bVar.f1667y = bVar2.f1667y;
            bVar.f1668z = bVar2.f1668z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.f1630a0 = bVar2.f1630a0;
            bVar.f1632b0 = bVar2.f1632b0;
            bVar.f1634c0 = bVar2.f1634c0;
            bVar.f1636d0 = bVar2.f1636d0;
            bVar.f1638e0 = bVar2.f1638e0;
            bVar.f1640f0 = bVar2.f1640f0;
            bVar.f1642g0 = bVar2.f1642g0;
            bVar.f1644h0 = bVar2.f1644h0;
            bVar.f1650k0 = bVar2.f1650k0;
            int[] iArr = bVar2.f1646i0;
            if (iArr == null || bVar2.f1648j0 != null) {
                bVar.f1646i0 = null;
            } else {
                bVar.f1646i0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f1648j0 = bVar2.f1648j0;
            bVar.f1652l0 = bVar2.f1652l0;
            bVar.f1653m0 = bVar2.f1653m0;
            bVar.f1655n0 = bVar2.f1655n0;
            bVar.f1657o0 = bVar2.f1657o0;
            c cVar = aVar.f1612c;
            cVar.getClass();
            c cVar2 = this.f1612c;
            cVar2.getClass();
            cVar.f1670a = cVar2.f1670a;
            cVar.f1672c = cVar2.f1672c;
            cVar.f1674e = cVar2.f1674e;
            cVar.f1673d = cVar2.f1673d;
            d dVar = aVar.f1611b;
            dVar.getClass();
            d dVar2 = this.f1611b;
            dVar2.getClass();
            dVar.f1679a = dVar2.f1679a;
            dVar.f1681c = dVar2.f1681c;
            dVar.f1682d = dVar2.f1682d;
            dVar.f1680b = dVar2.f1680b;
            e eVar = aVar.f1614e;
            eVar.getClass();
            e eVar2 = this.f1614e;
            eVar2.getClass();
            eVar.f1684a = eVar2.f1684a;
            eVar.f1685b = eVar2.f1685b;
            eVar.f1686c = eVar2.f1686c;
            eVar.f1687d = eVar2.f1687d;
            eVar.f1688e = eVar2.f1688e;
            eVar.f1689f = eVar2.f1689f;
            eVar.f1690g = eVar2.f1690g;
            eVar.f1691h = eVar2.f1691h;
            eVar.f1692i = eVar2.f1692i;
            eVar.f1693j = eVar2.f1693j;
            eVar.f1694k = eVar2.f1694k;
            eVar.f1695l = eVar2.f1695l;
            eVar.m = eVar2.m;
            aVar.f1610a = this.f1610a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    public static class C0019b {

        /* renamed from: p0  reason: collision with root package name */
        public static final SparseIntArray f1628p0;
        public int A = 0;
        public float B = 0.0f;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = Integer.MIN_VALUE;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public float T = -1.0f;
        public float U = -1.0f;
        public int V = 0;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1629a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f1630a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1631b;

        /* renamed from: b0  reason: collision with root package name */
        public int f1632b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1633c;

        /* renamed from: c0  reason: collision with root package name */
        public int f1634c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1635d = -1;

        /* renamed from: d0  reason: collision with root package name */
        public float f1636d0 = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public int f1637e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public float f1638e0 = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1639f = -1.0f;

        /* renamed from: f0  reason: collision with root package name */
        public int f1640f0 = -1;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1641g = true;

        /* renamed from: g0  reason: collision with root package name */
        public int f1642g0 = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1643h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f1644h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f1645i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int[] f1646i0;

        /* renamed from: j  reason: collision with root package name */
        public int f1647j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public String f1648j0;

        /* renamed from: k  reason: collision with root package name */
        public int f1649k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public String f1650k0;

        /* renamed from: l  reason: collision with root package name */
        public int f1651l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public boolean f1652l0 = false;
        public int m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f1653m0 = false;

        /* renamed from: n  reason: collision with root package name */
        public int f1654n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f1655n0 = true;

        /* renamed from: o  reason: collision with root package name */
        public int f1656o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public int f1657o0 = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f1658p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f1659q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f1660r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f1661s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f1662t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f1663u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f1664v = -1;

        /* renamed from: w  reason: collision with root package name */
        public float f1665w = 0.5f;

        /* renamed from: x  reason: collision with root package name */
        public float f1666x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public String f1667y = null;

        /* renamed from: z  reason: collision with root package name */
        public int f1668z = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1628p0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gf.C);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                SparseIntArray sparseIntArray = f1628p0;
                int i10 = sparseIntArray.get(index);
                switch (i10) {
                    case 1:
                        this.f1658p = b.f(obtainStyledAttributes, index, this.f1658p);
                        break;
                    case 2:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 3:
                        this.f1656o = b.f(obtainStyledAttributes, index, this.f1656o);
                        break;
                    case 4:
                        this.f1654n = b.f(obtainStyledAttributes, index, this.f1654n);
                        break;
                    case 5:
                        this.f1667y = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case 7:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 8:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 9:
                        this.f1664v = b.f(obtainStyledAttributes, index, this.f1664v);
                        break;
                    case 10:
                        this.f1663u = b.f(obtainStyledAttributes, index, this.f1663u);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /*11*/:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 12:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 13:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 14:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 15:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 16:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 17:
                        this.f1635d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1635d);
                        break;
                    case 18:
                        this.f1637e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1637e);
                        break;
                    case 19:
                        this.f1639f = obtainStyledAttributes.getFloat(index, this.f1639f);
                        break;
                    case 20:
                        this.f1665w = obtainStyledAttributes.getFloat(index, this.f1665w);
                        break;
                    case 21:
                        this.f1633c = obtainStyledAttributes.getLayoutDimension(index, this.f1633c);
                        break;
                    case 22:
                        this.f1631b = obtainStyledAttributes.getLayoutDimension(index, this.f1631b);
                        break;
                    case 23:
                        this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 24:
                        this.f1643h = b.f(obtainStyledAttributes, index, this.f1643h);
                        break;
                    case 25:
                        this.f1645i = b.f(obtainStyledAttributes, index, this.f1645i);
                        break;
                    case 26:
                        this.E = obtainStyledAttributes.getInt(index, this.E);
                        break;
                    case 27:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 28:
                        this.f1647j = b.f(obtainStyledAttributes, index, this.f1647j);
                        break;
                    case 29:
                        this.f1649k = b.f(obtainStyledAttributes, index, this.f1649k);
                        break;
                    case 30:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 31:
                        this.f1661s = b.f(obtainStyledAttributes, index, this.f1661s);
                        break;
                    case 32:
                        this.f1662t = b.f(obtainStyledAttributes, index, this.f1662t);
                        break;
                    case 33:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 34:
                        this.m = b.f(obtainStyledAttributes, index, this.m);
                        break;
                    case 35:
                        this.f1651l = b.f(obtainStyledAttributes, index, this.f1651l);
                        break;
                    case 36:
                        this.f1666x = obtainStyledAttributes.getFloat(index, this.f1666x);
                        break;
                    case 37:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 38:
                        this.T = obtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 39:
                        this.V = obtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 40:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 41:
                        b.g(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        b.g(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i10) {
                            case 61:
                                this.f1668z = b.f(obtainStyledAttributes, index, this.f1668z);
                                break;
                            case 62:
                                this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                break;
                            case 63:
                                this.B = obtainStyledAttributes.getFloat(index, this.B);
                                break;
                            default:
                                switch (i10) {
                                    case 69:
                                        this.f1636d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1638e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f1640f0 = obtainStyledAttributes.getInt(index, this.f1640f0);
                                        break;
                                    case 73:
                                        this.f1642g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1642g0);
                                        break;
                                    case 74:
                                        this.f1648j0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1655n0 = obtainStyledAttributes.getBoolean(index, this.f1655n0);
                                        break;
                                    case 76:
                                        this.f1657o0 = obtainStyledAttributes.getInt(index, this.f1657o0);
                                        break;
                                    case 77:
                                        this.f1659q = b.f(obtainStyledAttributes, index, this.f1659q);
                                        break;
                                    case 78:
                                        this.f1660r = b.f(obtainStyledAttributes, index, this.f1660r);
                                        break;
                                    case 79:
                                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                        break;
                                    case 80:
                                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                        break;
                                    case 81:
                                        this.X = obtainStyledAttributes.getInt(index, this.X);
                                        break;
                                    case 82:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        break;
                                    case 83:
                                        this.f1630a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1630a0);
                                        break;
                                    case 84:
                                        this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                        break;
                                    case 85:
                                        this.f1634c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1634c0);
                                        break;
                                    case 86:
                                        this.f1632b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1632b0);
                                        break;
                                    case 87:
                                        this.f1652l0 = obtainStyledAttributes.getBoolean(index, this.f1652l0);
                                        break;
                                    case 88:
                                        this.f1653m0 = obtainStyledAttributes.getBoolean(index, this.f1653m0);
                                        break;
                                    case com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION /*89*/:
                                        this.f1650k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1641g = obtainStyledAttributes.getBoolean(index, this.f1641g);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: j  reason: collision with root package name */
        public static final SparseIntArray f1669j;

        /* renamed from: a  reason: collision with root package name */
        public int f1670a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f1671b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1672c = -1;

        /* renamed from: d  reason: collision with root package name */
        public float f1673d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public float f1674e = Float.NaN;

        /* renamed from: f  reason: collision with root package name */
        public float f1675f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public int f1676g = -1;

        /* renamed from: h  reason: collision with root package name */
        public String f1677h = null;

        /* renamed from: i  reason: collision with root package name */
        public int f1678i = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1669j = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gf.D);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                switch (f1669j.get(index)) {
                    case 1:
                        this.f1674e = obtainStyledAttributes.getFloat(index, this.f1674e);
                        break;
                    case 2:
                        this.f1672c = obtainStyledAttributes.getInt(index, this.f1672c);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            String str = k1.a.f10264b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1670a = b.f(obtainStyledAttributes, index, this.f1670a);
                        break;
                    case 6:
                        this.f1671b = obtainStyledAttributes.getInteger(index, this.f1671b);
                        break;
                    case 7:
                        this.f1673d = obtainStyledAttributes.getFloat(index, this.f1673d);
                        break;
                    case 8:
                        this.f1676g = obtainStyledAttributes.getInteger(index, this.f1676g);
                        break;
                    case 9:
                        this.f1675f = obtainStyledAttributes.getFloat(index, this.f1675f);
                        break;
                    case 10:
                        int i10 = obtainStyledAttributes.peekValue(index).type;
                        if (i10 != 1) {
                            if (i10 != 3) {
                                obtainStyledAttributes.getInteger(index, this.f1678i);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f1677h = string;
                                if (string.indexOf("/") <= 0) {
                                    break;
                                } else {
                                    this.f1678i = obtainStyledAttributes.getResourceId(index, -1);
                                    break;
                                }
                            }
                        } else {
                            this.f1678i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f1679a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1680b = 0;

        /* renamed from: c  reason: collision with root package name */
        public float f1681c = 1.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1682d = Float.NaN;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gf.F);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 1) {
                    this.f1681c = obtainStyledAttributes.getFloat(index, this.f1681c);
                } else if (index == 0) {
                    int i10 = obtainStyledAttributes.getInt(index, this.f1679a);
                    this.f1679a = i10;
                    this.f1679a = b.f1604d[i10];
                } else if (index == 4) {
                    this.f1680b = obtainStyledAttributes.getInt(index, this.f1680b);
                } else if (index == 3) {
                    this.f1682d = obtainStyledAttributes.getFloat(index, this.f1682d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: n  reason: collision with root package name */
        public static final SparseIntArray f1683n;

        /* renamed from: a  reason: collision with root package name */
        public float f1684a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f1685b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1686c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1687d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1688e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1689f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public float f1690g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f1691h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f1692i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f1693j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f1694k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1695l = false;
        public float m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1683n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gf.H);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                switch (f1683n.get(index)) {
                    case 1:
                        this.f1684a = obtainStyledAttributes.getFloat(index, this.f1684a);
                        break;
                    case 2:
                        this.f1685b = obtainStyledAttributes.getFloat(index, this.f1685b);
                        break;
                    case 3:
                        this.f1686c = obtainStyledAttributes.getFloat(index, this.f1686c);
                        break;
                    case 4:
                        this.f1687d = obtainStyledAttributes.getFloat(index, this.f1687d);
                        break;
                    case 5:
                        this.f1688e = obtainStyledAttributes.getFloat(index, this.f1688e);
                        break;
                    case 6:
                        this.f1689f = obtainStyledAttributes.getDimension(index, this.f1689f);
                        break;
                    case 7:
                        this.f1690g = obtainStyledAttributes.getDimension(index, this.f1690g);
                        break;
                    case 8:
                        this.f1692i = obtainStyledAttributes.getDimension(index, this.f1692i);
                        break;
                    case 9:
                        this.f1693j = obtainStyledAttributes.getDimension(index, this.f1693j);
                        break;
                    case 10:
                        this.f1694k = obtainStyledAttributes.getDimension(index, this.f1694k);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /*11*/:
                        this.f1695l = true;
                        this.m = obtainStyledAttributes.getDimension(index, this.m);
                        break;
                    case 12:
                        this.f1691h = b.f(obtainStyledAttributes, index, this.f1691h);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1605e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f1606f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int i8;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length) {
            String trim = split[i10].trim();
            Integer num = null;
            try {
                i8 = o1.d.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i8 = 0;
            }
            if (i8 == 0) {
                i8 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i8 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.I) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.I.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i8 = num.intValue();
                }
            }
            iArr[i11] = i8;
            i10++;
            i11++;
        }
        return i11 != split.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0634, code lost:
        r16 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0adc, code lost:
        r8 = r8 + 1;
        r2 = r22;
        r5 = r16;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.constraintlayout.widget.b.a d(android.content.Context r20, android.util.AttributeSet r21, boolean r22) {
        /*
            androidx.constraintlayout.widget.b$a r0 = new androidx.constraintlayout.widget.b$a
            r0.<init>()
            if (r22 == 0) goto L_0x000a
            int[] r1 = com.google.android.gms.internal.p000firebaseauthapi.gf.f4585d
            goto L_0x000c
        L_0x000a:
            int[] r1 = com.google.android.gms.internal.p000firebaseauthapi.gf.f4583b
        L_0x000c:
            r2 = r20
            r3 = r21
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r3, r1)
            java.lang.String[] r2 = k1.a.f10264b
            int[] r3 = f1604d
            android.util.SparseIntArray r4 = f1605e
            androidx.constraintlayout.widget.b$d r12 = r0.f1611b
            androidx.constraintlayout.widget.b$e r13 = r0.f1614e
            androidx.constraintlayout.widget.b$c r14 = r0.f1612c
            androidx.constraintlayout.widget.b$b r15 = r0.f1613d
            java.lang.String r6 = "/"
            java.lang.String r5 = "unused attribute 0x"
            java.lang.String r7 = "CURRENTLY UNSUPPORTED"
            java.lang.String r8 = "Unknown attribute 0x"
            java.lang.String r11 = "   "
            java.lang.String r10 = "ConstraintSet"
            if (r22 == 0) goto L_0x05a9
            int r9 = r1.getIndexCount()
            r16 = r8
            androidx.constraintlayout.widget.b$a$a r8 = new androidx.constraintlayout.widget.b$a$a
            r8.<init>()
            r14.getClass()
            r15.getClass()
            r12.getClass()
            r13.getClass()
            r17 = r3
            r3 = 0
        L_0x004a:
            if (r3 >= r9) goto L_0x0aeb
            r22 = r9
            int r9 = r1.getIndex(r3)
            r18 = r3
            android.util.SparseIntArray r3 = f1606f
            int r3 = r3.get(r9)
            switch(r3) {
                case 2: goto L_0x058c;
                case 3: goto L_0x005d;
                case 4: goto L_0x005d;
                case 5: goto L_0x0581;
                case 6: goto L_0x0574;
                case 7: goto L_0x0567;
                case 8: goto L_0x0559;
                case 9: goto L_0x005d;
                case 10: goto L_0x005d;
                case 11: goto L_0x054b;
                case 12: goto L_0x053d;
                case 13: goto L_0x052f;
                case 14: goto L_0x0520;
                case 15: goto L_0x0511;
                case 16: goto L_0x0502;
                case 17: goto L_0x04f3;
                case 18: goto L_0x04e4;
                case 19: goto L_0x04d5;
                case 20: goto L_0x04c6;
                case 21: goto L_0x04b7;
                case 22: goto L_0x04a6;
                case 23: goto L_0x0497;
                case 24: goto L_0x0488;
                case 25: goto L_0x005d;
                case 26: goto L_0x005d;
                case 27: goto L_0x0479;
                case 28: goto L_0x046a;
                case 29: goto L_0x005d;
                case 30: goto L_0x005d;
                case 31: goto L_0x045b;
                case 32: goto L_0x005d;
                case 33: goto L_0x005d;
                case 34: goto L_0x044c;
                case 35: goto L_0x005d;
                case 36: goto L_0x005d;
                case 37: goto L_0x043d;
                case 38: goto L_0x042c;
                case 39: goto L_0x041d;
                case 40: goto L_0x040e;
                case 41: goto L_0x03ff;
                case 42: goto L_0x03f0;
                case 43: goto L_0x03e1;
                case 44: goto L_0x03ce;
                case 45: goto L_0x03bf;
                case 46: goto L_0x03b0;
                case 47: goto L_0x03a1;
                case 48: goto L_0x0392;
                case 49: goto L_0x0383;
                case 50: goto L_0x0374;
                case 51: goto L_0x0365;
                case 52: goto L_0x0356;
                case 53: goto L_0x0347;
                case 54: goto L_0x0338;
                case 55: goto L_0x0329;
                case 56: goto L_0x031a;
                case 57: goto L_0x030b;
                case 58: goto L_0x02fc;
                case 59: goto L_0x02ed;
                case 60: goto L_0x02de;
                case 61: goto L_0x005d;
                case 62: goto L_0x02cf;
                case 63: goto L_0x02c0;
                case 64: goto L_0x02b1;
                case 65: goto L_0x028c;
                case 66: goto L_0x027e;
                case 67: goto L_0x026f;
                case 68: goto L_0x0260;
                case 69: goto L_0x0251;
                case 70: goto L_0x0242;
                case 71: goto L_0x023b;
                case 72: goto L_0x022c;
                case 73: goto L_0x021d;
                case 74: goto L_0x0210;
                case 75: goto L_0x0201;
                case 76: goto L_0x01f2;
                case 77: goto L_0x01e5;
                case 78: goto L_0x01d6;
                case 79: goto L_0x01c7;
                case 80: goto L_0x01b8;
                case 81: goto L_0x01a9;
                case 82: goto L_0x019a;
                case 83: goto L_0x018b;
                case 84: goto L_0x017c;
                case 85: goto L_0x016d;
                case 86: goto L_0x010b;
                case 87: goto L_0x00ea;
                case 88: goto L_0x005d;
                case 89: goto L_0x005d;
                case 90: goto L_0x005d;
                case 91: goto L_0x005d;
                case 92: goto L_0x005d;
                case 93: goto L_0x00db;
                case 94: goto L_0x00cc;
                case 95: goto L_0x00c4;
                case 96: goto L_0x00bc;
                case 97: goto L_0x00ad;
                case 98: goto L_0x0091;
                case 99: goto L_0x0082;
                default: goto L_0x005d;
            }
        L_0x005d:
            r19 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r16
            r2.<init>(r3)
            r16 = r8
            java.lang.String r8 = java.lang.Integer.toHexString(r9)
            r2.append(r8)
            r2.append(r11)
            int r8 = r4.get(r9)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r10, r2)
            goto L_0x059c
        L_0x0082:
            boolean r3 = r15.f1641g
            boolean r3 = r1.getBoolean(r9, r3)
            r9 = 99
            r8.d(r9, r3)
            r19 = r2
            goto L_0x0598
        L_0x0091:
            int r3 = n1.d.f11528j0
            android.util.TypedValue r3 = r1.peekValue(r9)
            int r3 = r3.type
            r19 = r2
            r2 = 3
            if (r3 != r2) goto L_0x00a3
            r1.getString(r9)
            goto L_0x0598
        L_0x00a3:
            int r2 = r0.f1610a
            int r2 = r1.getResourceId(r9, r2)
            r0.f1610a = r2
            goto L_0x0598
        L_0x00ad:
            r19 = r2
            int r2 = r15.f1657o0
            int r2 = r1.getInt(r9, r2)
            r3 = 97
            r8.b(r3, r2)
            goto L_0x0598
        L_0x00bc:
            r19 = r2
            r2 = 1
            g(r8, r1, r9, r2)
            goto L_0x0598
        L_0x00c4:
            r19 = r2
            r2 = 0
            g(r8, r1, r9, r2)
            goto L_0x0598
        L_0x00cc:
            r19 = r2
            int r2 = r15.S
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 94
            r8.b(r3, r2)
            goto L_0x0598
        L_0x00db:
            r19 = r2
            int r2 = r15.L
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 93
            r8.b(r3, r2)
            goto L_0x0598
        L_0x00ea:
            r19 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            java.lang.String r3 = java.lang.Integer.toHexString(r9)
            r2.append(r3)
            r2.append(r11)
            int r3 = r4.get(r9)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r10, r2)
            goto L_0x0598
        L_0x010b:
            r19 = r2
            android.util.TypedValue r2 = r1.peekValue(r9)
            int r2 = r2.type
            r3 = 1
            if (r2 != r3) goto L_0x012e
            r3 = -1
            int r2 = r1.getResourceId(r9, r3)
            r14.f1678i = r2
            r9 = 89
            r8.b(r9, r2)
            int r2 = r14.f1678i
            if (r2 == r3) goto L_0x0598
            r2 = -2
            r3 = 88
            r8.b(r3, r2)
            goto L_0x0598
        L_0x012e:
            r3 = 3
            if (r2 != r3) goto L_0x0160
            java.lang.String r2 = r1.getString(r9)
            r14.f1677h = r2
            r3 = 90
            r8.c(r3, r2)
            java.lang.String r2 = r14.f1677h
            int r2 = r2.indexOf(r6)
            if (r2 <= 0) goto L_0x0158
            r2 = -1
            int r3 = r1.getResourceId(r9, r2)
            r14.f1678i = r3
            r9 = 89
            r8.b(r9, r3)
            r3 = -2
            r9 = 88
            r8.b(r9, r3)
            goto L_0x0598
        L_0x0158:
            r2 = -1
            r9 = 88
            r8.b(r9, r2)
            goto L_0x0598
        L_0x0160:
            r2 = 88
            int r3 = r14.f1678i
            int r3 = r1.getInteger(r9, r3)
            r8.b(r2, r3)
            goto L_0x0598
        L_0x016d:
            r19 = r2
            float r2 = r14.f1675f
            float r2 = r1.getFloat(r9, r2)
            r3 = 85
            r8.a(r3, r2)
            goto L_0x0598
        L_0x017c:
            r19 = r2
            int r2 = r14.f1676g
            int r2 = r1.getInteger(r9, r2)
            r3 = 84
            r8.b(r3, r2)
            goto L_0x0598
        L_0x018b:
            r19 = r2
            int r2 = r13.f1691h
            int r2 = f(r1, r9, r2)
            r3 = 83
            r8.b(r3, r2)
            goto L_0x0598
        L_0x019a:
            r19 = r2
            int r2 = r14.f1671b
            int r2 = r1.getInteger(r9, r2)
            r3 = 82
            r8.b(r3, r2)
            goto L_0x0598
        L_0x01a9:
            r19 = r2
            boolean r2 = r15.f1653m0
            boolean r2 = r1.getBoolean(r9, r2)
            r3 = 81
            r8.d(r3, r2)
            goto L_0x0598
        L_0x01b8:
            r19 = r2
            boolean r2 = r15.f1652l0
            boolean r2 = r1.getBoolean(r9, r2)
            r3 = 80
            r8.d(r3, r2)
            goto L_0x0598
        L_0x01c7:
            r19 = r2
            float r2 = r14.f1673d
            float r2 = r1.getFloat(r9, r2)
            r3 = 79
            r8.a(r3, r2)
            goto L_0x0598
        L_0x01d6:
            r19 = r2
            int r2 = r12.f1680b
            int r2 = r1.getInt(r9, r2)
            r3 = 78
            r8.b(r3, r2)
            goto L_0x0598
        L_0x01e5:
            r19 = r2
            r2 = 77
            java.lang.String r3 = r1.getString(r9)
            r8.c(r2, r3)
            goto L_0x0598
        L_0x01f2:
            r19 = r2
            int r2 = r14.f1672c
            int r2 = r1.getInt(r9, r2)
            r3 = 76
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0201:
            r19 = r2
            boolean r2 = r15.f1655n0
            boolean r2 = r1.getBoolean(r9, r2)
            r3 = 75
            r8.d(r3, r2)
            goto L_0x0598
        L_0x0210:
            r19 = r2
            r2 = 74
            java.lang.String r3 = r1.getString(r9)
            r8.c(r2, r3)
            goto L_0x0598
        L_0x021d:
            r19 = r2
            int r2 = r15.f1642g0
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 73
            r8.b(r3, r2)
            goto L_0x0598
        L_0x022c:
            r19 = r2
            int r2 = r15.f1640f0
            int r2 = r1.getInt(r9, r2)
            r3 = 72
            r8.b(r3, r2)
            goto L_0x0598
        L_0x023b:
            r19 = r2
            android.util.Log.e(r10, r7)
            goto L_0x0598
        L_0x0242:
            r19 = r2
            r2 = 70
            r3 = 1065353216(0x3f800000, float:1.0)
            float r9 = r1.getFloat(r9, r3)
            r8.a(r2, r9)
            goto L_0x0598
        L_0x0251:
            r19 = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r2 = 69
            float r9 = r1.getFloat(r9, r3)
            r8.a(r2, r9)
            goto L_0x0598
        L_0x0260:
            r19 = r2
            float r2 = r12.f1682d
            float r2 = r1.getFloat(r9, r2)
            r3 = 68
            r8.a(r3, r2)
            goto L_0x0598
        L_0x026f:
            r19 = r2
            float r2 = r14.f1674e
            float r2 = r1.getFloat(r9, r2)
            r3 = 67
            r8.a(r3, r2)
            goto L_0x0598
        L_0x027e:
            r19 = r2
            r2 = 66
            r3 = 0
            int r9 = r1.getInt(r9, r3)
            r8.b(r2, r9)
            goto L_0x0598
        L_0x028c:
            r19 = r2
            r3 = 0
            android.util.TypedValue r2 = r1.peekValue(r9)
            int r2 = r2.type
            r3 = 3
            if (r2 != r3) goto L_0x02a3
            java.lang.String r2 = r1.getString(r9)
            r3 = 65
            r8.c(r3, r2)
            goto L_0x0598
        L_0x02a3:
            r2 = 0
            r3 = 65
            int r9 = r1.getInteger(r9, r2)
            r2 = r19[r9]
            r8.c(r3, r2)
            goto L_0x0598
        L_0x02b1:
            r19 = r2
            int r2 = r14.f1670a
            int r2 = f(r1, r9, r2)
            r3 = 64
            r8.b(r3, r2)
            goto L_0x0598
        L_0x02c0:
            r19 = r2
            float r2 = r15.B
            float r2 = r1.getFloat(r9, r2)
            r3 = 63
            r8.a(r3, r2)
            goto L_0x0598
        L_0x02cf:
            r19 = r2
            int r2 = r15.A
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 62
            r8.b(r3, r2)
            goto L_0x0598
        L_0x02de:
            r19 = r2
            float r2 = r13.f1684a
            float r2 = r1.getFloat(r9, r2)
            r3 = 60
            r8.a(r3, r2)
            goto L_0x0598
        L_0x02ed:
            r19 = r2
            int r2 = r15.f1634c0
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 59
            r8.b(r3, r2)
            goto L_0x0598
        L_0x02fc:
            r19 = r2
            int r2 = r15.f1632b0
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 58
            r8.b(r3, r2)
            goto L_0x0598
        L_0x030b:
            r19 = r2
            int r2 = r15.f1630a0
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 57
            r8.b(r3, r2)
            goto L_0x0598
        L_0x031a:
            r19 = r2
            int r2 = r15.Z
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 56
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0329:
            r19 = r2
            int r2 = r15.Y
            int r2 = r1.getInt(r9, r2)
            r3 = 55
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0338:
            r19 = r2
            int r2 = r15.X
            int r2 = r1.getInt(r9, r2)
            r3 = 54
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0347:
            r19 = r2
            float r2 = r13.f1694k
            float r2 = r1.getDimension(r9, r2)
            r3 = 53
            r8.a(r3, r2)
            goto L_0x0598
        L_0x0356:
            r19 = r2
            float r2 = r13.f1693j
            float r2 = r1.getDimension(r9, r2)
            r3 = 52
            r8.a(r3, r2)
            goto L_0x0598
        L_0x0365:
            r19 = r2
            float r2 = r13.f1692i
            float r2 = r1.getDimension(r9, r2)
            r3 = 51
            r8.a(r3, r2)
            goto L_0x0598
        L_0x0374:
            r19 = r2
            float r2 = r13.f1690g
            float r2 = r1.getDimension(r9, r2)
            r3 = 50
            r8.a(r3, r2)
            goto L_0x0598
        L_0x0383:
            r19 = r2
            float r2 = r13.f1689f
            float r2 = r1.getDimension(r9, r2)
            r3 = 49
            r8.a(r3, r2)
            goto L_0x0598
        L_0x0392:
            r19 = r2
            float r2 = r13.f1688e
            float r2 = r1.getFloat(r9, r2)
            r3 = 48
            r8.a(r3, r2)
            goto L_0x0598
        L_0x03a1:
            r19 = r2
            float r2 = r13.f1687d
            float r2 = r1.getFloat(r9, r2)
            r3 = 47
            r8.a(r3, r2)
            goto L_0x0598
        L_0x03b0:
            r19 = r2
            float r2 = r13.f1686c
            float r2 = r1.getFloat(r9, r2)
            r3 = 46
            r8.a(r3, r2)
            goto L_0x0598
        L_0x03bf:
            r19 = r2
            float r2 = r13.f1685b
            float r2 = r1.getFloat(r9, r2)
            r3 = 45
            r8.a(r3, r2)
            goto L_0x0598
        L_0x03ce:
            r19 = r2
            r2 = 44
            r3 = 1
            r8.d(r2, r3)
            float r3 = r13.m
            float r3 = r1.getDimension(r9, r3)
            r8.a(r2, r3)
            goto L_0x0598
        L_0x03e1:
            r19 = r2
            float r2 = r12.f1681c
            float r2 = r1.getFloat(r9, r2)
            r3 = 43
            r8.a(r3, r2)
            goto L_0x0598
        L_0x03f0:
            r19 = r2
            int r2 = r15.W
            int r2 = r1.getInt(r9, r2)
            r3 = 42
            r8.b(r3, r2)
            goto L_0x0598
        L_0x03ff:
            r19 = r2
            int r2 = r15.V
            int r2 = r1.getInt(r9, r2)
            r3 = 41
            r8.b(r3, r2)
            goto L_0x0598
        L_0x040e:
            r19 = r2
            float r2 = r15.T
            float r2 = r1.getFloat(r9, r2)
            r3 = 40
            r8.a(r3, r2)
            goto L_0x0598
        L_0x041d:
            r19 = r2
            float r2 = r15.U
            float r2 = r1.getFloat(r9, r2)
            r3 = 39
            r8.a(r3, r2)
            goto L_0x0598
        L_0x042c:
            r19 = r2
            int r2 = r0.f1610a
            int r2 = r1.getResourceId(r9, r2)
            r0.f1610a = r2
            r3 = 38
            r8.b(r3, r2)
            goto L_0x0598
        L_0x043d:
            r19 = r2
            float r2 = r15.f1666x
            float r2 = r1.getFloat(r9, r2)
            r3 = 37
            r8.a(r3, r2)
            goto L_0x0598
        L_0x044c:
            r19 = r2
            int r2 = r15.H
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 34
            r8.b(r3, r2)
            goto L_0x0598
        L_0x045b:
            r19 = r2
            int r2 = r15.K
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 31
            r8.b(r3, r2)
            goto L_0x0598
        L_0x046a:
            r19 = r2
            int r2 = r15.G
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 28
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0479:
            r19 = r2
            int r2 = r15.E
            int r2 = r1.getInt(r9, r2)
            r3 = 27
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0488:
            r19 = r2
            int r2 = r15.F
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 24
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0497:
            r19 = r2
            int r2 = r15.f1631b
            int r2 = r1.getLayoutDimension(r9, r2)
            r3 = 23
            r8.b(r3, r2)
            goto L_0x0598
        L_0x04a6:
            r19 = r2
            int r2 = r12.f1679a
            int r2 = r1.getInt(r9, r2)
            r2 = r17[r2]
            r3 = 22
            r8.b(r3, r2)
            goto L_0x0598
        L_0x04b7:
            r19 = r2
            int r2 = r15.f1633c
            int r2 = r1.getLayoutDimension(r9, r2)
            r3 = 21
            r8.b(r3, r2)
            goto L_0x0598
        L_0x04c6:
            r19 = r2
            float r2 = r15.f1665w
            float r2 = r1.getFloat(r9, r2)
            r3 = 20
            r8.a(r3, r2)
            goto L_0x0598
        L_0x04d5:
            r19 = r2
            float r2 = r15.f1639f
            float r2 = r1.getFloat(r9, r2)
            r3 = 19
            r8.a(r3, r2)
            goto L_0x0598
        L_0x04e4:
            r19 = r2
            int r2 = r15.f1637e
            int r2 = r1.getDimensionPixelOffset(r9, r2)
            r3 = 18
            r8.b(r3, r2)
            goto L_0x0598
        L_0x04f3:
            r19 = r2
            int r2 = r15.f1635d
            int r2 = r1.getDimensionPixelOffset(r9, r2)
            r3 = 17
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0502:
            r19 = r2
            int r2 = r15.N
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 16
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0511:
            r19 = r2
            int r2 = r15.R
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 15
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0520:
            r19 = r2
            int r2 = r15.O
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 14
            r8.b(r3, r2)
            goto L_0x0598
        L_0x052f:
            r19 = r2
            int r2 = r15.M
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 13
            r8.b(r3, r2)
            goto L_0x0598
        L_0x053d:
            r19 = r2
            int r2 = r15.Q
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 12
            r8.b(r3, r2)
            goto L_0x0598
        L_0x054b:
            r19 = r2
            int r2 = r15.P
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 11
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0559:
            r19 = r2
            int r2 = r15.J
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 8
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0567:
            r19 = r2
            int r2 = r15.D
            int r2 = r1.getDimensionPixelOffset(r9, r2)
            r3 = 7
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0574:
            r19 = r2
            int r2 = r15.C
            int r2 = r1.getDimensionPixelOffset(r9, r2)
            r3 = 6
            r8.b(r3, r2)
            goto L_0x0598
        L_0x0581:
            r19 = r2
            r2 = 5
            java.lang.String r3 = r1.getString(r9)
            r8.c(r2, r3)
            goto L_0x0598
        L_0x058c:
            r19 = r2
            int r2 = r15.I
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r3 = 2
            r8.b(r3, r2)
        L_0x0598:
            r3 = r16
            r16 = r8
        L_0x059c:
            int r2 = r18 + 1
            r9 = r22
            r8 = r16
            r16 = r3
            r3 = r2
            r2 = r19
            goto L_0x004a
        L_0x05a9:
            r19 = r2
            r17 = r3
            r3 = r8
            int r2 = r1.getIndexCount()
            r8 = 0
        L_0x05b3:
            if (r8 >= r2) goto L_0x0ae4
            int r9 = r1.getIndex(r8)
            r22 = r2
            r2 = 1
            if (r9 == r2) goto L_0x05d3
            r2 = 23
            if (r2 == r9) goto L_0x05d3
            r2 = 24
            if (r2 == r9) goto L_0x05d5
            r14.getClass()
            r15.getClass()
            r12.getClass()
            r13.getClass()
            goto L_0x05d5
        L_0x05d3:
            r2 = 24
        L_0x05d5:
            int r16 = r4.get(r9)
            switch(r16) {
                case 1: goto L_0x0ad1;
                case 2: goto L_0x0ac5;
                case 3: goto L_0x0ab9;
                case 4: goto L_0x0aad;
                case 5: goto L_0x0aa3;
                case 6: goto L_0x0a97;
                case 7: goto L_0x0a8b;
                case 8: goto L_0x0a7f;
                case 9: goto L_0x0a73;
                case 10: goto L_0x0a66;
                case 11: goto L_0x0a59;
                case 12: goto L_0x0a4c;
                case 13: goto L_0x0a3f;
                case 14: goto L_0x0a32;
                case 15: goto L_0x0a25;
                case 16: goto L_0x0a18;
                case 17: goto L_0x0a0b;
                case 18: goto L_0x09fe;
                case 19: goto L_0x09f1;
                case 20: goto L_0x09e4;
                case 21: goto L_0x09d7;
                case 22: goto L_0x09c8;
                case 23: goto L_0x09bb;
                case 24: goto L_0x09ae;
                case 25: goto L_0x09a1;
                case 26: goto L_0x0994;
                case 27: goto L_0x0987;
                case 28: goto L_0x097a;
                case 29: goto L_0x096d;
                case 30: goto L_0x0960;
                case 31: goto L_0x0953;
                case 32: goto L_0x0946;
                case 33: goto L_0x0939;
                case 34: goto L_0x092c;
                case 35: goto L_0x091f;
                case 36: goto L_0x0912;
                case 37: goto L_0x0905;
                case 38: goto L_0x08f8;
                case 39: goto L_0x08eb;
                case 40: goto L_0x08de;
                case 41: goto L_0x08d1;
                case 42: goto L_0x08c4;
                case 43: goto L_0x08b7;
                case 44: goto L_0x08a7;
                case 45: goto L_0x089a;
                case 46: goto L_0x088d;
                case 47: goto L_0x0880;
                case 48: goto L_0x0873;
                case 49: goto L_0x0866;
                case 50: goto L_0x0859;
                case 51: goto L_0x084c;
                case 52: goto L_0x083f;
                case 53: goto L_0x0832;
                case 54: goto L_0x0825;
                case 55: goto L_0x0818;
                case 56: goto L_0x080b;
                case 57: goto L_0x07fe;
                case 58: goto L_0x07f1;
                case 59: goto L_0x07e4;
                case 60: goto L_0x07d7;
                case 61: goto L_0x07ca;
                case 62: goto L_0x07bd;
                case 63: goto L_0x07b0;
                case 64: goto L_0x07a3;
                case 65: goto L_0x0783;
                case 66: goto L_0x0776;
                case 67: goto L_0x0768;
                case 68: goto L_0x075a;
                case 69: goto L_0x074d;
                case 70: goto L_0x0740;
                case 71: goto L_0x0736;
                case 72: goto L_0x072a;
                case 73: goto L_0x071e;
                case 74: goto L_0x0714;
                case 75: goto L_0x0708;
                case 76: goto L_0x06fc;
                case 77: goto L_0x06f2;
                case 78: goto L_0x06e6;
                case 79: goto L_0x06da;
                case 80: goto L_0x06ce;
                case 81: goto L_0x06c1;
                case 82: goto L_0x06b4;
                case 83: goto L_0x06a7;
                case 84: goto L_0x069a;
                case 85: goto L_0x068d;
                case 86: goto L_0x0659;
                case 87: goto L_0x0638;
                case 88: goto L_0x05dc;
                case 89: goto L_0x05dc;
                case 90: goto L_0x05dc;
                case 91: goto L_0x062c;
                case 92: goto L_0x0623;
                case 93: goto L_0x061a;
                case 94: goto L_0x0611;
                case 95: goto L_0x060c;
                case 96: goto L_0x0607;
                case 97: goto L_0x05fe;
                default: goto L_0x05dc;
            }
        L_0x05dc:
            r16 = r5
            r5 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.String r5 = java.lang.Integer.toHexString(r9)
            r2.append(r5)
            r2.append(r11)
            int r5 = r4.get(r9)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r10, r2)
            goto L_0x0adc
        L_0x05fe:
            int r2 = r15.f1657o0
            int r2 = r1.getInt(r9, r2)
            r15.f1657o0 = r2
            goto L_0x0634
        L_0x0607:
            r2 = 1
            g(r15, r1, r9, r2)
            goto L_0x0634
        L_0x060c:
            r2 = 0
            g(r15, r1, r9, r2)
            goto L_0x0634
        L_0x0611:
            int r2 = r15.S
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.S = r2
            goto L_0x0634
        L_0x061a:
            int r2 = r15.L
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.L = r2
            goto L_0x0634
        L_0x0623:
            int r2 = r15.f1660r
            int r2 = f(r1, r9, r2)
            r15.f1660r = r2
            goto L_0x0634
        L_0x062c:
            int r2 = r15.f1659q
            int r2 = f(r1, r9, r2)
            r15.f1659q = r2
        L_0x0634:
            r16 = r5
            goto L_0x0adc
        L_0x0638:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r16 = r5
            java.lang.String r5 = java.lang.Integer.toHexString(r9)
            r2.append(r5)
            r2.append(r11)
            int r5 = r4.get(r9)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r10, r2)
            goto L_0x0adc
        L_0x0659:
            r16 = r5
            android.util.TypedValue r2 = r1.peekValue(r9)
            int r2 = r2.type
            r5 = 1
            if (r2 != r5) goto L_0x066d
            r5 = -1
            int r2 = r1.getResourceId(r9, r5)
            r14.f1678i = r2
            goto L_0x0adc
        L_0x066d:
            r5 = 3
            if (r2 != r5) goto L_0x0685
            java.lang.String r2 = r1.getString(r9)
            r14.f1677h = r2
            int r2 = r2.indexOf(r6)
            if (r2 <= 0) goto L_0x073c
            r2 = -1
            int r5 = r1.getResourceId(r9, r2)
            r14.f1678i = r5
            goto L_0x073c
        L_0x0685:
            r2 = -1
            int r5 = r14.f1678i
            r1.getInteger(r9, r5)
            goto L_0x073c
        L_0x068d:
            r16 = r5
            r2 = -1
            float r5 = r14.f1675f
            float r5 = r1.getFloat(r9, r5)
            r14.f1675f = r5
            goto L_0x073c
        L_0x069a:
            r16 = r5
            r2 = -1
            int r5 = r14.f1676g
            int r5 = r1.getInteger(r9, r5)
            r14.f1676g = r5
            goto L_0x073c
        L_0x06a7:
            r16 = r5
            r2 = -1
            int r5 = r13.f1691h
            int r5 = f(r1, r9, r5)
            r13.f1691h = r5
            goto L_0x073c
        L_0x06b4:
            r16 = r5
            r2 = -1
            int r5 = r14.f1671b
            int r5 = r1.getInteger(r9, r5)
            r14.f1671b = r5
            goto L_0x073c
        L_0x06c1:
            r16 = r5
            r2 = -1
            boolean r5 = r15.f1653m0
            boolean r5 = r1.getBoolean(r9, r5)
            r15.f1653m0 = r5
            goto L_0x073c
        L_0x06ce:
            r16 = r5
            r2 = -1
            boolean r5 = r15.f1652l0
            boolean r5 = r1.getBoolean(r9, r5)
            r15.f1652l0 = r5
            goto L_0x073c
        L_0x06da:
            r16 = r5
            r2 = -1
            float r5 = r14.f1673d
            float r5 = r1.getFloat(r9, r5)
            r14.f1673d = r5
            goto L_0x073c
        L_0x06e6:
            r16 = r5
            r2 = -1
            int r5 = r12.f1680b
            int r5 = r1.getInt(r9, r5)
            r12.f1680b = r5
            goto L_0x073c
        L_0x06f2:
            r16 = r5
            r2 = -1
            java.lang.String r5 = r1.getString(r9)
            r15.f1650k0 = r5
            goto L_0x073c
        L_0x06fc:
            r16 = r5
            r2 = -1
            int r5 = r14.f1672c
            int r5 = r1.getInt(r9, r5)
            r14.f1672c = r5
            goto L_0x073c
        L_0x0708:
            r16 = r5
            r2 = -1
            boolean r5 = r15.f1655n0
            boolean r5 = r1.getBoolean(r9, r5)
            r15.f1655n0 = r5
            goto L_0x073c
        L_0x0714:
            r16 = r5
            r2 = -1
            java.lang.String r5 = r1.getString(r9)
            r15.f1648j0 = r5
            goto L_0x073c
        L_0x071e:
            r16 = r5
            r2 = -1
            int r5 = r15.f1642g0
            int r5 = r1.getDimensionPixelSize(r9, r5)
            r15.f1642g0 = r5
            goto L_0x073c
        L_0x072a:
            r16 = r5
            r2 = -1
            int r5 = r15.f1640f0
            int r5 = r1.getInt(r9, r5)
            r15.f1640f0 = r5
            goto L_0x073c
        L_0x0736:
            r16 = r5
            r2 = -1
            android.util.Log.e(r10, r7)
        L_0x073c:
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0adc
        L_0x0740:
            r16 = r5
            r2 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            float r9 = r1.getFloat(r9, r5)
            r15.f1638e0 = r9
            goto L_0x0adc
        L_0x074d:
            r16 = r5
            r2 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            float r9 = r1.getFloat(r9, r5)
            r15.f1636d0 = r9
            goto L_0x0adc
        L_0x075a:
            r16 = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r2 = r12.f1682d
            float r2 = r1.getFloat(r9, r2)
            r12.f1682d = r2
            goto L_0x0adc
        L_0x0768:
            r16 = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r2 = r14.f1674e
            float r2 = r1.getFloat(r9, r2)
            r14.f1674e = r2
            goto L_0x0adc
        L_0x0776:
            r16 = r5
            r2 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r1.getInt(r9, r2)
            r14.getClass()
            goto L_0x0adc
        L_0x0783:
            r16 = r5
            r2 = 0
            android.util.TypedValue r5 = r1.peekValue(r9)
            int r5 = r5.type
            r2 = 3
            if (r5 != r2) goto L_0x0797
            r1.getString(r9)
            r14.getClass()
            goto L_0x0adc
        L_0x0797:
            r5 = 0
            int r9 = r1.getInteger(r9, r5)
            r9 = r19[r9]
            r14.getClass()
            goto L_0x0adc
        L_0x07a3:
            r16 = r5
            r5 = 0
            int r2 = r14.f1670a
            int r2 = f(r1, r9, r2)
            r14.f1670a = r2
            goto L_0x0adc
        L_0x07b0:
            r16 = r5
            r5 = 0
            float r2 = r15.B
            float r2 = r1.getFloat(r9, r2)
            r15.B = r2
            goto L_0x0adc
        L_0x07bd:
            r16 = r5
            r5 = 0
            int r2 = r15.A
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.A = r2
            goto L_0x0adc
        L_0x07ca:
            r16 = r5
            r5 = 0
            int r2 = r15.f1668z
            int r2 = f(r1, r9, r2)
            r15.f1668z = r2
            goto L_0x0adc
        L_0x07d7:
            r16 = r5
            r5 = 0
            float r2 = r13.f1684a
            float r2 = r1.getFloat(r9, r2)
            r13.f1684a = r2
            goto L_0x0adc
        L_0x07e4:
            r16 = r5
            r5 = 0
            int r2 = r15.f1634c0
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.f1634c0 = r2
            goto L_0x0adc
        L_0x07f1:
            r16 = r5
            r5 = 0
            int r2 = r15.f1632b0
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.f1632b0 = r2
            goto L_0x0adc
        L_0x07fe:
            r16 = r5
            r5 = 0
            int r2 = r15.f1630a0
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.f1630a0 = r2
            goto L_0x0adc
        L_0x080b:
            r16 = r5
            r5 = 0
            int r2 = r15.Z
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.Z = r2
            goto L_0x0adc
        L_0x0818:
            r16 = r5
            r5 = 0
            int r2 = r15.Y
            int r2 = r1.getInt(r9, r2)
            r15.Y = r2
            goto L_0x0adc
        L_0x0825:
            r16 = r5
            r5 = 0
            int r2 = r15.X
            int r2 = r1.getInt(r9, r2)
            r15.X = r2
            goto L_0x0adc
        L_0x0832:
            r16 = r5
            r5 = 0
            float r2 = r13.f1694k
            float r2 = r1.getDimension(r9, r2)
            r13.f1694k = r2
            goto L_0x0adc
        L_0x083f:
            r16 = r5
            r5 = 0
            float r2 = r13.f1693j
            float r2 = r1.getDimension(r9, r2)
            r13.f1693j = r2
            goto L_0x0adc
        L_0x084c:
            r16 = r5
            r5 = 0
            float r2 = r13.f1692i
            float r2 = r1.getDimension(r9, r2)
            r13.f1692i = r2
            goto L_0x0adc
        L_0x0859:
            r16 = r5
            r5 = 0
            float r2 = r13.f1690g
            float r2 = r1.getDimension(r9, r2)
            r13.f1690g = r2
            goto L_0x0adc
        L_0x0866:
            r16 = r5
            r5 = 0
            float r2 = r13.f1689f
            float r2 = r1.getDimension(r9, r2)
            r13.f1689f = r2
            goto L_0x0adc
        L_0x0873:
            r16 = r5
            r5 = 0
            float r2 = r13.f1688e
            float r2 = r1.getFloat(r9, r2)
            r13.f1688e = r2
            goto L_0x0adc
        L_0x0880:
            r16 = r5
            r5 = 0
            float r2 = r13.f1687d
            float r2 = r1.getFloat(r9, r2)
            r13.f1687d = r2
            goto L_0x0adc
        L_0x088d:
            r16 = r5
            r5 = 0
            float r2 = r13.f1686c
            float r2 = r1.getFloat(r9, r2)
            r13.f1686c = r2
            goto L_0x0adc
        L_0x089a:
            r16 = r5
            r5 = 0
            float r2 = r13.f1685b
            float r2 = r1.getFloat(r9, r2)
            r13.f1685b = r2
            goto L_0x0adc
        L_0x08a7:
            r16 = r5
            r2 = 1
            r5 = 0
            r13.f1695l = r2
            float r2 = r13.m
            float r2 = r1.getDimension(r9, r2)
            r13.m = r2
            goto L_0x0adc
        L_0x08b7:
            r16 = r5
            r5 = 0
            float r2 = r12.f1681c
            float r2 = r1.getFloat(r9, r2)
            r12.f1681c = r2
            goto L_0x0adc
        L_0x08c4:
            r16 = r5
            r5 = 0
            int r2 = r15.W
            int r2 = r1.getInt(r9, r2)
            r15.W = r2
            goto L_0x0adc
        L_0x08d1:
            r16 = r5
            r5 = 0
            int r2 = r15.V
            int r2 = r1.getInt(r9, r2)
            r15.V = r2
            goto L_0x0adc
        L_0x08de:
            r16 = r5
            r5 = 0
            float r2 = r15.T
            float r2 = r1.getFloat(r9, r2)
            r15.T = r2
            goto L_0x0adc
        L_0x08eb:
            r16 = r5
            r5 = 0
            float r2 = r15.U
            float r2 = r1.getFloat(r9, r2)
            r15.U = r2
            goto L_0x0adc
        L_0x08f8:
            r16 = r5
            r5 = 0
            int r2 = r0.f1610a
            int r2 = r1.getResourceId(r9, r2)
            r0.f1610a = r2
            goto L_0x0adc
        L_0x0905:
            r16 = r5
            r5 = 0
            float r2 = r15.f1666x
            float r2 = r1.getFloat(r9, r2)
            r15.f1666x = r2
            goto L_0x0adc
        L_0x0912:
            r16 = r5
            r5 = 0
            int r2 = r15.f1651l
            int r2 = f(r1, r9, r2)
            r15.f1651l = r2
            goto L_0x0adc
        L_0x091f:
            r16 = r5
            r5 = 0
            int r2 = r15.m
            int r2 = f(r1, r9, r2)
            r15.m = r2
            goto L_0x0adc
        L_0x092c:
            r16 = r5
            r5 = 0
            int r2 = r15.H
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.H = r2
            goto L_0x0adc
        L_0x0939:
            r16 = r5
            r5 = 0
            int r2 = r15.f1662t
            int r2 = f(r1, r9, r2)
            r15.f1662t = r2
            goto L_0x0adc
        L_0x0946:
            r16 = r5
            r5 = 0
            int r2 = r15.f1661s
            int r2 = f(r1, r9, r2)
            r15.f1661s = r2
            goto L_0x0adc
        L_0x0953:
            r16 = r5
            r5 = 0
            int r2 = r15.K
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.K = r2
            goto L_0x0adc
        L_0x0960:
            r16 = r5
            r5 = 0
            int r2 = r15.f1649k
            int r2 = f(r1, r9, r2)
            r15.f1649k = r2
            goto L_0x0adc
        L_0x096d:
            r16 = r5
            r5 = 0
            int r2 = r15.f1647j
            int r2 = f(r1, r9, r2)
            r15.f1647j = r2
            goto L_0x0adc
        L_0x097a:
            r16 = r5
            r5 = 0
            int r2 = r15.G
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.G = r2
            goto L_0x0adc
        L_0x0987:
            r16 = r5
            r5 = 0
            int r2 = r15.E
            int r2 = r1.getInt(r9, r2)
            r15.E = r2
            goto L_0x0adc
        L_0x0994:
            r16 = r5
            r5 = 0
            int r2 = r15.f1645i
            int r2 = f(r1, r9, r2)
            r15.f1645i = r2
            goto L_0x0adc
        L_0x09a1:
            r16 = r5
            r5 = 0
            int r2 = r15.f1643h
            int r2 = f(r1, r9, r2)
            r15.f1643h = r2
            goto L_0x0adc
        L_0x09ae:
            r16 = r5
            r5 = 0
            int r2 = r15.F
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.F = r2
            goto L_0x0adc
        L_0x09bb:
            r16 = r5
            r5 = 0
            int r2 = r15.f1631b
            int r2 = r1.getLayoutDimension(r9, r2)
            r15.f1631b = r2
            goto L_0x0adc
        L_0x09c8:
            r16 = r5
            r5 = 0
            int r2 = r12.f1679a
            int r2 = r1.getInt(r9, r2)
            r2 = r17[r2]
            r12.f1679a = r2
            goto L_0x0adc
        L_0x09d7:
            r16 = r5
            r5 = 0
            int r2 = r15.f1633c
            int r2 = r1.getLayoutDimension(r9, r2)
            r15.f1633c = r2
            goto L_0x0adc
        L_0x09e4:
            r16 = r5
            r5 = 0
            float r2 = r15.f1665w
            float r2 = r1.getFloat(r9, r2)
            r15.f1665w = r2
            goto L_0x0adc
        L_0x09f1:
            r16 = r5
            r5 = 0
            float r2 = r15.f1639f
            float r2 = r1.getFloat(r9, r2)
            r15.f1639f = r2
            goto L_0x0adc
        L_0x09fe:
            r16 = r5
            r5 = 0
            int r2 = r15.f1637e
            int r2 = r1.getDimensionPixelOffset(r9, r2)
            r15.f1637e = r2
            goto L_0x0adc
        L_0x0a0b:
            r16 = r5
            r5 = 0
            int r2 = r15.f1635d
            int r2 = r1.getDimensionPixelOffset(r9, r2)
            r15.f1635d = r2
            goto L_0x0adc
        L_0x0a18:
            r16 = r5
            r5 = 0
            int r2 = r15.N
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.N = r2
            goto L_0x0adc
        L_0x0a25:
            r16 = r5
            r5 = 0
            int r2 = r15.R
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.R = r2
            goto L_0x0adc
        L_0x0a32:
            r16 = r5
            r5 = 0
            int r2 = r15.O
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.O = r2
            goto L_0x0adc
        L_0x0a3f:
            r16 = r5
            r5 = 0
            int r2 = r15.M
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.M = r2
            goto L_0x0adc
        L_0x0a4c:
            r16 = r5
            r5 = 0
            int r2 = r15.Q
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.Q = r2
            goto L_0x0adc
        L_0x0a59:
            r16 = r5
            r5 = 0
            int r2 = r15.P
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.P = r2
            goto L_0x0adc
        L_0x0a66:
            r16 = r5
            r5 = 0
            int r2 = r15.f1663u
            int r2 = f(r1, r9, r2)
            r15.f1663u = r2
            goto L_0x0adc
        L_0x0a73:
            r16 = r5
            r5 = 0
            int r2 = r15.f1664v
            int r2 = f(r1, r9, r2)
            r15.f1664v = r2
            goto L_0x0adc
        L_0x0a7f:
            r16 = r5
            r5 = 0
            int r2 = r15.J
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.J = r2
            goto L_0x0adc
        L_0x0a8b:
            r16 = r5
            r5 = 0
            int r2 = r15.D
            int r2 = r1.getDimensionPixelOffset(r9, r2)
            r15.D = r2
            goto L_0x0adc
        L_0x0a97:
            r16 = r5
            r5 = 0
            int r2 = r15.C
            int r2 = r1.getDimensionPixelOffset(r9, r2)
            r15.C = r2
            goto L_0x0adc
        L_0x0aa3:
            r16 = r5
            r5 = 0
            java.lang.String r2 = r1.getString(r9)
            r15.f1667y = r2
            goto L_0x0adc
        L_0x0aad:
            r16 = r5
            r5 = 0
            int r2 = r15.f1654n
            int r2 = f(r1, r9, r2)
            r15.f1654n = r2
            goto L_0x0adc
        L_0x0ab9:
            r16 = r5
            r5 = 0
            int r2 = r15.f1656o
            int r2 = f(r1, r9, r2)
            r15.f1656o = r2
            goto L_0x0adc
        L_0x0ac5:
            r16 = r5
            r5 = 0
            int r2 = r15.I
            int r2 = r1.getDimensionPixelSize(r9, r2)
            r15.I = r2
            goto L_0x0adc
        L_0x0ad1:
            r16 = r5
            r5 = 0
            int r2 = r15.f1658p
            int r2 = f(r1, r9, r2)
            r15.f1658p = r2
        L_0x0adc:
            int r8 = r8 + 1
            r2 = r22
            r5 = r16
            goto L_0x05b3
        L_0x0ae4:
            java.lang.String r2 = r15.f1648j0
            if (r2 == 0) goto L_0x0aeb
            r2 = 0
            r15.f1646i0 = r2
        L_0x0aeb:
            r1.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.d(android.content.Context, android.util.AttributeSet, boolean):androidx.constraintlayout.widget.b$a");
    }

    public static int f(TypedArray typedArray, int i8, int i10) {
        int resourceId = typedArray.getResourceId(i8, i10);
        return resourceId == -1 ? typedArray.getInt(i8, -1) : resourceId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r9.peekValue(r10)
            int r0 = r0.type
            r1 = 3
            r2 = 21
            r3 = 23
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 0
            if (r0 == r1) goto L_0x006d
            if (r0 == r6) goto L_0x0029
            int r9 = r9.getInt(r10, r7)
            r10 = -4
            r0 = -2
            if (r9 == r10) goto L_0x0027
            r10 = -3
            if (r9 == r10) goto L_0x0025
            if (r9 == r0) goto L_0x002d
            if (r9 == r5) goto L_0x002d
        L_0x0025:
            r4 = r7
            goto L_0x002f
        L_0x0027:
            r7 = r0
            goto L_0x002f
        L_0x0029:
            int r9 = r9.getDimensionPixelSize(r10, r7)
        L_0x002d:
            r4 = r7
            r7 = r9
        L_0x002f:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r9 == 0) goto L_0x0041
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            if (r11 != 0) goto L_0x003c
            r8.width = r7
            r8.W = r4
            goto L_0x006c
        L_0x003c:
            r8.height = r7
            r8.X = r4
            goto L_0x006c
        L_0x0041:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.b.C0019b
            if (r9 == 0) goto L_0x0053
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0019b) r8
            if (r11 != 0) goto L_0x004e
            r8.f1631b = r7
            r8.f1652l0 = r4
            goto L_0x006c
        L_0x004e:
            r8.f1633c = r7
            r8.f1653m0 = r4
            goto L_0x006c
        L_0x0053:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.b.a.C0018a
            if (r9 == 0) goto L_0x006c
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0018a) r8
            if (r11 != 0) goto L_0x0064
            r8.b(r3, r7)
            r9 = 80
            r8.d(r9, r4)
            goto L_0x006c
        L_0x0064:
            r8.b(r2, r7)
            r9 = 81
            r8.d(r9, r4)
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r9 = r9.getString(r10)
            if (r9 != 0) goto L_0x0075
            goto L_0x0175
        L_0x0075:
            r10 = 61
            int r10 = r9.indexOf(r10)
            int r0 = r9.length()
            if (r10 <= 0) goto L_0x0175
            int r0 = r0 + r5
            if (r10 >= r0) goto L_0x0175
            java.lang.String r0 = r9.substring(r7, r10)
            int r10 = r10 + r4
            java.lang.String r9 = r9.substring(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L_0x0175
            java.lang.String r10 = r0.trim()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x00ca
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r10 == 0) goto L_0x00b5
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            if (r11 != 0) goto L_0x00ae
            r8.width = r7
            goto L_0x00b0
        L_0x00ae:
            r8.height = r7
        L_0x00b0:
            h(r8, r9)
            goto L_0x0175
        L_0x00b5:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.C0019b
            if (r10 == 0) goto L_0x00bf
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0019b) r8
            r8.f1667y = r9
            goto L_0x0175
        L_0x00bf:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.a.C0018a
            if (r10 == 0) goto L_0x0175
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0018a) r8
            r8.c(r6, r9)
            goto L_0x0175
        L_0x00ca:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0118
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0175 }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x00ea
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x00e4
            r8.width = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.H = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00e4:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.I = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00ea:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.C0019b     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x00fe
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0019b) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x00f8
            r8.f1631b = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.U = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00f8:
            r8.f1633c = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.T = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00fe:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.a.C0018a     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x0175
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0018a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x010f
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 39
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x010f:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 40
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0118:
            java.lang.String r0 = "parent"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0175
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Math.min(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a     // Catch:{ NumberFormatException -> 0x0175 }
            r0 = 2
            if (r10 == 0) goto L_0x0146
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x013f
            r8.width = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.R = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.L = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x013f:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.S = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.M = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0146:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.C0019b     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x015c
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0019b) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x0155
            r8.f1631b = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f1636d0 = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.X = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0155:
            r8.f1633c = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f1638e0 = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.Y = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x015c:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.b.a.C0018a     // Catch:{ NumberFormatException -> 0x0175 }
            if (r9 == 0) goto L_0x0175
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0018a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x016d
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r9 = 54
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x016d:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r9 = 55
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x0175 }
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i8 = 0;
            int i10 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i8 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i10 = i8;
                i8 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i8);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i8, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        aVar.G = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = this.f1609c;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            int id2 = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + n1.a.b(childAt));
            } else if (this.f1608b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id2 != -1) {
                if (hashMap.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = hashMap.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            C0019b bVar = aVar.f1613d;
                            bVar.f1644h0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(bVar.f1640f0);
                            barrier.setMargin(bVar.f1642g0);
                            barrier.setAllowsGoneWidget(bVar.f1655n0);
                            int[] iArr = bVar.f1646i0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f1648j0;
                                if (str != null) {
                                    int[] c3 = c(barrier, str);
                                    bVar.f1646i0 = c3;
                                    barrier.setReferencedIds(c3);
                                }
                            }
                        }
                        ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                        aVar2.a();
                        aVar.a(aVar2);
                        o1.a.b(childAt, aVar.f1615f);
                        childAt.setLayoutParams(aVar2);
                        d dVar = aVar.f1611b;
                        if (dVar.f1680b == 0) {
                            childAt.setVisibility(dVar.f1679a);
                        }
                        childAt.setAlpha(dVar.f1681c);
                        e eVar = aVar.f1614e;
                        childAt.setRotation(eVar.f1684a);
                        childAt.setRotationX(eVar.f1685b);
                        childAt.setRotationY(eVar.f1686c);
                        childAt.setScaleX(eVar.f1687d);
                        childAt.setScaleY(eVar.f1688e);
                        if (eVar.f1691h != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(eVar.f1691h);
                            if (findViewById != null) {
                                float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                                float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - ((float) childAt.getLeft()));
                                    childAt.setPivotY(bottom - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f1689f)) {
                                childAt.setPivotX(eVar.f1689f);
                            }
                            if (!Float.isNaN(eVar.f1690g)) {
                                childAt.setPivotY(eVar.f1690g);
                            }
                        }
                        childAt.setTranslationX(eVar.f1692i);
                        childAt.setTranslationY(eVar.f1693j);
                        childAt.setTranslationZ(eVar.f1694k);
                        if (eVar.f1695l) {
                            childAt.setElevation(eVar.m);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = hashMap.get(num);
            if (aVar3 != null) {
                C0019b bVar2 = aVar3.f1613d;
                if (bVar2.f1644h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar2.f1646i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f1648j0;
                        if (str2 != null) {
                            int[] c10 = c(barrier2, str2);
                            bVar2.f1646i0 = c10;
                            barrier2.setReferencedIds(c10);
                        }
                    }
                    barrier2.setType(bVar2.f1640f0);
                    barrier2.setMargin(bVar2.f1642g0);
                    o1.e eVar2 = ConstraintLayout.L;
                    ConstraintLayout.a aVar4 = new ConstraintLayout.a();
                    barrier2.k();
                    aVar3.a(aVar4);
                    constraintLayout.addView(barrier2, aVar4);
                }
                if (bVar2.f1629a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    o1.e eVar3 = ConstraintLayout.L;
                    ConstraintLayout.a aVar5 = new ConstraintLayout.a();
                    aVar3.a(aVar5);
                    constraintLayout.addView(guideline, aVar5);
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = constraintLayout.getChildAt(i10);
            if (childAt2 instanceof a) {
                ((a) childAt2).g(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i8;
        int i10;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> hashMap = bVar.f1609c;
        hashMap.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!bVar.f1608b || id2 != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id2))) {
                    hashMap.put(Integer.valueOf(id2), new a());
                }
                a aVar2 = hashMap.get(Integer.valueOf(id2));
                if (aVar2 == null) {
                    i8 = childCount;
                } else {
                    HashMap<String, o1.a> hashMap2 = bVar.f1607a;
                    HashMap<String, o1.a> hashMap3 = new HashMap<>();
                    Class<?> cls = childAt.getClass();
                    for (String next : hashMap2.keySet()) {
                        o1.a aVar3 = hashMap2.get(next);
                        try {
                            if (next.equals("BackgroundColor")) {
                                hashMap3.put(next, new o1.a(aVar3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } else {
                                i10 = childCount;
                                try {
                                    hashMap3.put(next, new o1.a(aVar3, cls.getMethod("getMap" + next, new Class[0]).invoke(childAt, new Object[0])));
                                } catch (NoSuchMethodException e10) {
                                    e = e10;
                                } catch (IllegalAccessException e11) {
                                    e = e11;
                                    e.printStackTrace();
                                    childCount = i10;
                                } catch (InvocationTargetException e12) {
                                    e = e12;
                                    e.printStackTrace();
                                    childCount = i10;
                                }
                                childCount = i10;
                            }
                        } catch (NoSuchMethodException e13) {
                            e = e13;
                            i10 = childCount;
                            e.printStackTrace();
                            childCount = i10;
                        } catch (IllegalAccessException e14) {
                            e = e14;
                            i10 = childCount;
                            e.printStackTrace();
                            childCount = i10;
                        } catch (InvocationTargetException e15) {
                            e = e15;
                            i10 = childCount;
                            e.printStackTrace();
                            childCount = i10;
                        }
                    }
                    i8 = childCount;
                    aVar2.f1615f = hashMap3;
                    aVar2.b(id2, aVar);
                    int visibility = childAt.getVisibility();
                    d dVar = aVar2.f1611b;
                    dVar.f1679a = visibility;
                    dVar.f1681c = childAt.getAlpha();
                    float rotation = childAt.getRotation();
                    e eVar = aVar2.f1614e;
                    eVar.f1684a = rotation;
                    eVar.f1685b = childAt.getRotationX();
                    eVar.f1686c = childAt.getRotationY();
                    eVar.f1687d = childAt.getScaleX();
                    eVar.f1688e = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        eVar.f1689f = pivotX;
                        eVar.f1690g = pivotY;
                    }
                    eVar.f1692i = childAt.getTranslationX();
                    eVar.f1693j = childAt.getTranslationY();
                    eVar.f1694k = childAt.getTranslationZ();
                    if (eVar.f1695l) {
                        eVar.m = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                        C0019b bVar2 = aVar2.f1613d;
                        bVar2.f1655n0 = allowsGoneWidget;
                        bVar2.f1646i0 = barrier.getReferencedIds();
                        bVar2.f1640f0 = barrier.getType();
                        bVar2.f1642g0 = barrier.getMargin();
                    }
                }
                i11++;
                bVar = this;
                childCount = i8;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void e(Context context, int i8) {
        XmlResourceParser xml = context.getResources().getXml(i8);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a d10 = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        d10.f1613d.f1629a = true;
                    }
                    this.f1609c.put(Integer.valueOf(d10.f1610a), d10);
                }
            }
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }
}
