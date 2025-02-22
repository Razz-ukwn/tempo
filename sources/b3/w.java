package b3;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import d5.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4.h;
import s4.c;
import sf.j;
import y4.d;

public final class w implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3196a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3197b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3198c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3199d;

    public /* synthetic */ w(int i8, Object obj, Object obj2, Object obj3) {
        this.f3196a = i8;
        this.f3197b = obj;
        this.f3198c = obj2;
        this.f3199d = obj3;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        switch (this.f3196a) {
            case 2:
                w wVar = new w(((com.google.android.gms.internal.measurement.b) this.f3197b).clone());
                for (com.google.android.gms.internal.measurement.b a10 : (List) this.f3199d) {
                    ((List) wVar.f3199d).add(a10.clone());
                }
                return wVar;
            default:
                return super.clone();
        }
    }

    public final r4.w d(r4.w wVar, h hVar) {
        Drawable drawable = (Drawable) wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((b) this.f3198c).d(d.e(((BitmapDrawable) drawable).getBitmap(), (c) this.f3197b), hVar);
        }
        if (drawable instanceof c5.c) {
            return ((b) this.f3199d).d(wVar, hVar);
        }
        return null;
    }

    public final String toString() {
        switch (this.f3196a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                if (((Uri) this.f3197b) != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf((Uri) this.f3197b));
                }
                if (((String) this.f3198c) != null) {
                    sb2.append(" action=");
                    sb2.append((String) this.f3198c);
                }
                String str = (String) this.f3199d;
                if (str != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str);
                }
                sb2.append(" }");
                String sb3 = sb2.toString();
                j.e(sb3, "sb.toString()");
                return sb3;
            default:
                return super.toString();
        }
    }

    public w() {
        this.f3196a = 2;
        this.f3197b = new com.google.android.gms.internal.measurement.b("", 0, (HashMap) null);
        this.f3198c = new com.google.android.gms.internal.measurement.b("", 0, (HashMap) null);
        this.f3199d = new ArrayList();
    }

    public w(com.google.android.gms.internal.measurement.b bVar) {
        this.f3196a = 2;
        this.f3197b = bVar;
        this.f3198c = bVar.clone();
        this.f3199d = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public w(Intent intent) {
        this(0, intent.getData(), intent.getAction(), intent.getType());
        this.f3196a = 0;
    }
}
