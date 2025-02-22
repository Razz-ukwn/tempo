package e6;

import android.content.Context;
import androidx.activity.g;
import m6.a;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7850a;

    /* renamed from: b  reason: collision with root package name */
    public final a f7851b;

    /* renamed from: c  reason: collision with root package name */
    public final a f7852c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7853d;

    public c(Context context, a aVar, a aVar2, String str) {
        if (context != null) {
            this.f7850a = context;
            if (aVar != null) {
                this.f7851b = aVar;
                if (aVar2 != null) {
                    this.f7852c = aVar2;
                    if (str != null) {
                        this.f7853d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final Context a() {
        return this.f7850a;
    }

    public final String b() {
        return this.f7853d;
    }

    public final a c() {
        return this.f7852c;
    }

    public final a d() {
        return this.f7851b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f7850a.equals(hVar.a()) && this.f7851b.equals(hVar.d()) && this.f7852c.equals(hVar.c()) && this.f7853d.equals(hVar.b());
    }

    public final int hashCode() {
        return ((((((this.f7850a.hashCode() ^ 1000003) * 1000003) ^ this.f7851b.hashCode()) * 1000003) ^ this.f7852c.hashCode()) * 1000003) ^ this.f7853d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f7850a);
        sb2.append(", wallClock=");
        sb2.append(this.f7851b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f7852c);
        sb2.append(", backendName=");
        return g.a(sb2, this.f7853d, "}");
    }
}
