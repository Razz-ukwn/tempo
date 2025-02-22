package s1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import com.quickkonnect.silencio.R;
import java.util.ArrayList;
import s1.u;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14511a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<m> f14512b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<z> f14513c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<m> f14514d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f14515e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f14516f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f14517g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f14518h;

    /* renamed from: i  reason: collision with root package name */
    public int f14519i;

    /* renamed from: j  reason: collision with root package name */
    public int f14520j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14521k = true;

    /* renamed from: l  reason: collision with root package name */
    public t f14522l;
    public boolean m = false;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f14523n;

    /* renamed from: o  reason: collision with root package name */
    public int f14524o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f14525p = 0;

    /* renamed from: q  reason: collision with root package name */
    public String f14526q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f14527r;

    /* renamed from: s  reason: collision with root package name */
    public final Notification f14528s;
    @Deprecated

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList<String> f14529t;

    public static class a {
        public static AudioAttributes a(AudioAttributes.Builder builder) {
            return builder.build();
        }

        public static AudioAttributes.Builder b() {
            return new AudioAttributes.Builder();
        }

        public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i8) {
            return builder.setContentType(i8);
        }

        public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i8) {
            return builder.setLegacyStreamType(i8);
        }

        public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i8) {
            return builder.setUsage(i8);
        }
    }

    public s(Context context, String str) {
        Notification notification = new Notification();
        this.f14528s = notification;
        this.f14511a = context;
        this.f14526q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f14520j = 0;
        this.f14529t = new ArrayList<>();
        this.f14527r = true;
    }

    public static CharSequence b(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final Notification a() {
        Bundle bundle;
        u uVar = new u(this);
        s sVar = uVar.f14533c;
        t tVar = sVar.f14522l;
        if (tVar != null) {
            tVar.b(uVar);
        }
        Notification a10 = u.a.a(uVar.f14532b);
        if (tVar != null) {
            sVar.f14522l.getClass();
        }
        if (!(tVar == null || (bundle = a10.extras) == null)) {
            tVar.a(bundle);
        }
        return a10;
    }

    public final void c(boolean z10) {
        Notification notification = this.f14528s;
        if (z10) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f14511a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
        }
        this.f14518h = bitmap;
    }

    public final void e(t tVar) {
        if (this.f14522l != tVar) {
            this.f14522l = tVar;
            if (tVar.f14530a != this) {
                tVar.f14530a = this;
                e(tVar);
            }
        }
    }
}
