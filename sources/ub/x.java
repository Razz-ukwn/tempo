package ub;

public final class x implements Comparable<x> {

    /* renamed from: a  reason: collision with root package name */
    public final int f15991a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15992b;

    public x(int i8, int i10) {
        this.f15991a = i8;
        this.f15992b = i10;
    }

    public final x a() {
        return new x(this.f15992b, this.f15991a);
    }

    public final int compareTo(Object obj) {
        x xVar = (x) obj;
        return (this.f15991a * this.f15992b) - (xVar.f15991a * xVar.f15992b);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f15991a == xVar.f15991a && this.f15992b == xVar.f15992b;
    }

    public final int hashCode() {
        int i8 = this.f15991a;
        return ((i8 >>> 16) | (i8 << 16)) ^ this.f15992b;
    }

    public final String toString() {
        return this.f15991a + "x" + this.f15992b;
    }
}
