package i3;

import ff.m;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import m3.d;
import m3.e;
import sf.j;

public final class r implements e, d {
    public static final TreeMap<Integer, r> E = new TreeMap<>();
    public final byte[][] B;
    public final int[] C;
    public int D;

    /* renamed from: a  reason: collision with root package name */
    public final int f9541a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f9542b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f9543c;

    /* renamed from: d  reason: collision with root package name */
    public final double[] f9544d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f9545e;

    public r(int i8) {
        this.f9541a = i8;
        int i10 = i8 + 1;
        this.C = new int[i10];
        this.f9543c = new long[i10];
        this.f9544d = new double[i10];
        this.f9545e = new String[i10];
        this.B = new byte[i10][];
    }

    public static final r e(int i8, String str) {
        TreeMap<Integer, r> treeMap = E;
        synchronized (treeMap) {
            Map.Entry<Integer, r> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i8));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                r value = ceilingEntry.getValue();
                value.f9542b = str;
                value.D = i8;
                return value;
            }
            m mVar = m.f8717a;
            r rVar = new r(i8);
            rVar.f9542b = str;
            rVar.D = i8;
            return rVar;
        }
    }

    public final void H(int i8, long j10) {
        this.C[i8] = 2;
        this.f9543c[i8] = j10;
    }

    public final void S(byte[] bArr, int i8) {
        this.C[i8] = 5;
        this.B[i8] = bArr;
    }

    public final void c(d dVar) {
        int i8 = this.D;
        if (1 <= i8) {
            int i10 = 1;
            while (true) {
                int i11 = this.C[i10];
                if (i11 == 1) {
                    dVar.h0(i10);
                } else if (i11 == 2) {
                    dVar.H(i10, this.f9543c[i10]);
                } else if (i11 == 3) {
                    dVar.t(i10, this.f9544d[i10]);
                } else if (i11 == 4) {
                    String str = this.f9545e[i10];
                    if (str != null) {
                        dVar.m(i10, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (i11 == 5) {
                    byte[] bArr = this.B[i10];
                    if (bArr != null) {
                        dVar.S(bArr, i10);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                if (i10 != i8) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void close() {
    }

    public final String d() {
        String str = this.f9542b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void h0(int i8) {
        this.C[i8] = 1;
    }

    public final void j() {
        TreeMap<Integer, r> treeMap = E;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f9541a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                j.e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i8 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i8;
                }
            }
            m mVar = m.f8717a;
        }
    }

    public final void m(int i8, String str) {
        j.f(str, "value");
        this.C[i8] = 4;
        this.f9545e[i8] = str;
    }

    public final void t(int i8, double d10) {
        this.C[i8] = 3;
        this.f9544d[i8] = d10;
    }
}
