package ff;

import sf.j;
import wf.f;

public final class c implements Comparable<c> {

    /* renamed from: e  reason: collision with root package name */
    public static final c f8701e = new c();

    /* renamed from: a  reason: collision with root package name */
    public final int f8702a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final int f8703b = 8;

    /* renamed from: c  reason: collision with root package name */
    public final int f8704c = 10;

    /* renamed from: d  reason: collision with root package name */
    public final int f8705d;

    public c() {
        boolean z10 = true;
        if ((!new f(0, 255).e(1) || !new f(0, 255).e(8) || !new f(0, 255).e(10)) ? false : z10) {
            this.f8705d = 67594;
            return;
        }
        throw new IllegalArgumentException("Version components are out of range: 1.8.10".toString());
    }

    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        j.f(cVar, "other");
        return this.f8705d - cVar.f8705d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c cVar = obj instanceof c ? (c) obj : null;
        if (cVar == null) {
            return false;
        }
        return this.f8705d == cVar.f8705d;
    }

    public final int hashCode() {
        return this.f8705d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8702a);
        sb2.append('.');
        sb2.append(this.f8703b);
        sb2.append('.');
        sb2.append(this.f8704c);
        return sb2.toString();
    }
}
