package b3;

import sf.j;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final h0<Object> f3079a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3080b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3081c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3082d;

    public i(h0<Object> h0Var, boolean z10, Object obj, boolean z11) {
        boolean z12 = false;
        if (h0Var.f3077a || !z10) {
            if ((z10 || !z11 || obj != null) ? true : z12) {
                this.f3079a = h0Var;
                this.f3080b = z10;
                this.f3082d = obj;
                this.f3081c = z11;
                return;
            }
            throw new IllegalArgumentException(("Argument with type " + h0Var.b() + " has null value but is not nullable.").toString());
        }
        throw new IllegalArgumentException((h0Var.b() + " does not allow nullable values").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j.a(i.class, obj.getClass())) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f3080b != iVar.f3080b || this.f3081c != iVar.f3081c || !j.a(this.f3079a, iVar.f3079a)) {
            return false;
        }
        Object obj2 = iVar.f3082d;
        Object obj3 = this.f3082d;
        return obj3 != null ? j.a(obj3, obj2) : obj2 == null;
    }

    public final int hashCode() {
        int hashCode = ((((this.f3079a.hashCode() * 31) + (this.f3080b ? 1 : 0)) * 31) + (this.f3081c ? 1 : 0)) * 31;
        Object obj = this.f3082d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i.class.getSimpleName());
        sb2.append(" Type: " + this.f3079a);
        sb2.append(" Nullable: " + this.f3080b);
        if (this.f3081c) {
            sb2.append(" DefaultValue: " + this.f3082d);
        }
        String sb3 = sb2.toString();
        j.e(sb3, "sb.toString()");
        return sb3;
    }
}
