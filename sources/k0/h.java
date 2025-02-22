package k0;

import androidx.fragment.app.f1;
import androidx.fragment.app.z;
import q.n;
import sf.j;

public final class h extends z {

    /* renamed from: b  reason: collision with root package name */
    public final float f10260b = 51.0f;

    /* renamed from: c  reason: collision with root package name */
    public final float f10261c = 4.0f;

    /* renamed from: d  reason: collision with root package name */
    public final int f10262d = 2;

    /* renamed from: e  reason: collision with root package name */
    public final int f10263e = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!(this.f10260b == hVar.f10260b)) {
            return false;
        }
        if (!(this.f10261c == hVar.f10261c)) {
            return false;
        }
        if (!(this.f10262d == hVar.f10262d)) {
            return false;
        }
        if (!(this.f10263e == hVar.f10263e)) {
            return false;
        }
        hVar.getClass();
        return j.a((Object) null, (Object) null);
    }

    public final int hashCode() {
        return f1.c(this.f10263e, f1.c(this.f10262d, n.a(this.f10261c, Float.hashCode(this.f10260b) * 31, 31), 31), 31) + 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f10260b);
        sb2.append(", miter=");
        sb2.append(this.f10261c);
        sb2.append(", cap=");
        boolean z10 = true;
        int i8 = this.f10262d;
        String str2 = "Unknown";
        if (i8 == 0) {
            str = "Butt";
        } else {
            if (i8 == 1) {
                str = "Round";
            } else {
                str = i8 == 2 ? "Square" : str2;
            }
        }
        sb2.append(str);
        sb2.append(", join=");
        int i10 = this.f10263e;
        if (i10 == 0) {
            str2 = "Miter";
        } else {
            if (i10 == 1) {
                str2 = "Round";
            } else {
                if (i10 != 2) {
                    z10 = false;
                }
                if (z10) {
                    str2 = "Bevel";
                }
            }
        }
        sb2.append(str2);
        sb2.append(", pathEffect=");
        sb2.append((Object) null);
        sb2.append(')');
        return sb2.toString();
    }
}
