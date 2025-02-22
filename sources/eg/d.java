package eg;

import android.content.res.Resources;
import java.util.ArrayList;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final b f8008a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8009b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8010c = true;

    /* renamed from: d  reason: collision with root package name */
    public final fg.d f8011d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f8012e;

    public d(b bVar) {
        long currentTimeMillis = System.currentTimeMillis();
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        this.f8008a = bVar;
        this.f8009b = currentTimeMillis;
        this.f8011d = new fg.d(bVar.f8006n, f10);
        this.f8012e = new ArrayList();
    }
}
