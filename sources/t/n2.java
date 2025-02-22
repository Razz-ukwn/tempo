package t;

import java.util.ArrayList;
import java.util.Iterator;
import sf.j;
import tf.a;

public final class n2 implements Iterable<Object>, a {
    public boolean B;
    public int C;
    public ArrayList<b> D = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    public int[] f15167a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public int f15168b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f15169c = new Object[0];

    /* renamed from: d  reason: collision with root package name */
    public int f15170d;

    /* renamed from: e  reason: collision with root package name */
    public int f15171e;

    public final b a() {
        if (!this.B) {
            int i8 = this.f15168b;
            if (i8 > 0) {
                ArrayList<b> arrayList = this.D;
                int A = b7.a.A(arrayList, 0, i8);
                if (A < 0) {
                    b bVar = new b(0);
                    arrayList.add(-(A + 1), bVar);
                    return bVar;
                }
                b bVar2 = arrayList.get(A);
                j.e(bVar2, "get(location)");
                return bVar2;
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        e0.c("use active SlotWriter to create an anchor location instead ".toString());
        throw null;
    }

    public final int b(b bVar) {
        j.f(bVar, "anchor");
        if (!(!this.B)) {
            e0.c("Use active SlotWriter to determine anchor location instead".toString());
            throw null;
        } else if (bVar.a()) {
            return bVar.f14988a;
        } else {
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
    }

    public final boolean c(int i8, b bVar) {
        if (!this.B) {
            if (i8 >= 0 && i8 < this.f15168b) {
                if (g(bVar)) {
                    int e10 = b7.a.e(this.f15167a, i8) + i8;
                    int i10 = bVar.f14988a;
                    if (i8 <= i10 && i10 < e10) {
                        return true;
                    }
                }
                return false;
            }
            e0.c("Invalid group index".toString());
            throw null;
        }
        e0.c("Writer is active".toString());
        throw null;
    }

    public final m2 d() {
        if (!this.B) {
            this.f15171e++;
            return new m2(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    public final p2 e() {
        if (!this.B) {
            if (this.f15171e <= 0) {
                this.B = true;
                this.C++;
                return new p2(this);
            }
            e0.c("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        e0.c("Cannot start a writer when another writer is pending".toString());
        throw null;
    }

    public final boolean g(b bVar) {
        if (!bVar.a()) {
            return false;
        }
        int A = b7.a.A(this.D, bVar.f14988a, this.f15168b);
        return A >= 0 && j.a(this.D.get(A), bVar);
    }

    public final Iterator<Object> iterator() {
        return new v0(0, this.f15168b, this);
    }
}
