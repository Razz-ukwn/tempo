package qe;

import b3.x;
import java.io.Serializable;
import q.g;

public final class i implements Serializable {
    public boolean B = false;
    public boolean C;
    public int D = 1;
    public String E = "";
    public int F = 5;
    public String G = "";

    /* renamed from: a  reason: collision with root package name */
    public int f13607a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f13608b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13609c;

    /* renamed from: d  reason: collision with root package name */
    public String f13610d = "";

    /* renamed from: e  reason: collision with root package name */
    public boolean f13611e;

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar != null && (this == iVar || (this.f13607a == iVar.f13607a && (this.f13608b > iVar.f13608b ? 1 : (this.f13608b == iVar.f13608b ? 0 : -1)) == 0 && this.f13610d.equals(iVar.f13610d) && this.B == iVar.B && this.D == iVar.D && this.E.equals(iVar.E) && this.F == iVar.F && this.G.equals(iVar.G)));
    }

    public final int hashCode() {
        return ((this.G.hashCode() + ((g.c(this.F) + x.a(this.E, (((x.a(this.f13610d, (Long.valueOf(this.f13608b).hashCode() + ((this.f13607a + 2173) * 53)) * 53, 53) + (this.B ? 1231 : 1237)) * 53) + this.D) * 53, 53)) * 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Country Code: ");
        sb2.append(this.f13607a);
        sb2.append(" National Number: ");
        sb2.append(this.f13608b);
        if (this.f13611e && this.B) {
            sb2.append(" Leading Zero(s): true");
        }
        if (this.C) {
            sb2.append(" Number of leading zeros: ");
            sb2.append(this.D);
        }
        if (this.f13609c) {
            sb2.append(" Extension: ");
            sb2.append(this.f13610d);
        }
        return sb2.toString();
    }
}
