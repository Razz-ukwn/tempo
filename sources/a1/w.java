package a1;

import rb.b;
import sf.j;
import x0.a;

public final class w implements e {

    /* renamed from: a  reason: collision with root package name */
    public final a f63a;

    /* renamed from: b  reason: collision with root package name */
    public final int f64b;

    public w(int i8, String str) {
        this.f63a = new a(str);
        this.f64b = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return j.a(this.f63a.f16819a, wVar.f63a.f16819a) && this.f64b == wVar.f64b;
    }

    public final int hashCode() {
        return (this.f63a.f16819a.hashCode() * 31) + this.f64b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f63a.f16819a);
        sb2.append("', newCursorPosition=");
        return b.a(sb2, this.f64b, ')');
    }
}
