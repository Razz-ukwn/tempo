package g0;

import androidx.compose.ui.platform.AndroidComposeView;
import ff.m;
import java.util.LinkedHashSet;
import rf.a;
import rf.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final l<a<m>, m> f8751a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f8752b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet f8753c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f8754d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public final f f8755e = new f(this);

    public g(AndroidComposeView.e eVar) {
        this.f8751a = eVar;
    }

    public final void a(LinkedHashSet linkedHashSet, Object obj) {
        if (!linkedHashSet.contains(obj)) {
            linkedHashSet.add(obj);
            if (this.f8754d.size() + this.f8753c.size() + this.f8752b.size() == 1) {
                this.f8751a.invoke(this.f8755e);
            }
        }
    }
}
