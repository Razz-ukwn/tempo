package cg;

import sf.j;

public final class i<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f4027b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Object f4028a;

    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f4029a;

        public a(Throwable th) {
            this.f4029a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (j.a(this.f4029a, ((a) obj).f4029a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.f4029a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Closed(" + this.f4029a + ')';
        }
    }

    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ i(Object obj) {
        this.f4028a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return j.a(this.f4028a, ((i) obj).f4028a);
    }

    public final int hashCode() {
        Object obj = this.f4028a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f4028a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
