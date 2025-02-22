package androidx.compose.ui.platform;

import d2.f1;
import java.util.Comparator;
import v0.p;

public final class v<T> implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Comparator f1480a;

    public v(u uVar) {
        this.f1480a = uVar;
    }

    public final int compare(T t2, T t10) {
        int compare = this.f1480a.compare(t2, t10);
        return compare != 0 ? compare : f1.t(Integer.valueOf(((p) t2).f16075g), Integer.valueOf(((p) t10).f16075g));
    }
}
