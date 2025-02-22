package androidx.compose.ui.platform;

import java.util.Comparator;
import p001if.a;
import s0.z;
import v0.p;

public final class u<T> implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Comparator f1472a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Comparator f1473b;

    public u(a aVar, z zVar) {
        this.f1472a = aVar;
        this.f1473b = zVar;
    }

    public final int compare(T t2, T t10) {
        int compare = this.f1472a.compare(t2, t10);
        if (compare != 0) {
            return compare;
        }
        return this.f1473b.compare(((p) t2).f16071c, ((p) t10).f16071c);
    }
}
