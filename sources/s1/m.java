package s1;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.quickkonnect.silencio.R;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f14496a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f14497b;

    /* renamed from: c  reason: collision with root package name */
    public final b0[] f14498c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f14499d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14500e = true;

    /* renamed from: f  reason: collision with root package name */
    public final int f14501f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14502g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public final int f14503h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f14504i;

    /* renamed from: j  reason: collision with root package name */
    public final PendingIntent f14505j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f14506k;

    public m(String str, PendingIntent pendingIntent) {
        IconCompat a10 = IconCompat.a("", R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.f14497b = a10;
        int i8 = a10.f1741a;
        if ((i8 == -1 ? IconCompat.a.c(a10.f1742b) : i8) == 2) {
            this.f14503h = a10.b();
        }
        this.f14504i = s.b(str);
        this.f14505j = pendingIntent;
        this.f14496a = bundle;
        this.f14498c = null;
        this.f14499d = true;
        this.f14501f = 0;
        this.f14500e = true;
        this.f14502g = false;
        this.f14506k = false;
    }
}
