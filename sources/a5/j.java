package a5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c5.c;
import c5.e;
import com.bumptech.glide.m;

public final class j extends h {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f112b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Drawable drawable, int i8) {
        super(drawable);
        this.f112b = i8;
    }

    public final int a() {
        int i8 = this.f112b;
        T t2 = this.f111a;
        switch (i8) {
            case 0:
                return Math.max(1, t2.getIntrinsicHeight() * t2.getIntrinsicWidth() * 4);
            default:
                e eVar = ((c) t2).f3726a.f3731a;
                return eVar.f3733a.f() + eVar.f3746o;
        }
    }

    public final void b() {
        int i8 = this.f112b;
        T t2 = this.f111a;
        switch (i8) {
            case 1:
                ((c) t2).f3726a.f3731a.f3744l.prepareToDraw();
                return;
            default:
                if (t2 instanceof BitmapDrawable) {
                    ((BitmapDrawable) t2).getBitmap().prepareToDraw();
                    return;
                } else if (t2 instanceof c) {
                    ((c) t2).f3726a.f3731a.f3744l.prepareToDraw();
                    return;
                } else {
                    return;
                }
        }
    }

    public final void c() {
        switch (this.f112b) {
            case 0:
                return;
            default:
                c cVar = (c) this.f111a;
                cVar.stop();
                cVar.f3729d = true;
                e eVar = cVar.f3726a.f3731a;
                eVar.f3735c.clear();
                Bitmap bitmap = eVar.f3744l;
                if (bitmap != null) {
                    eVar.f3737e.d(bitmap);
                    eVar.f3744l = null;
                }
                eVar.f3738f = false;
                e.a aVar = eVar.f3741i;
                m mVar = eVar.f3736d;
                if (aVar != null) {
                    mVar.l(aVar);
                    eVar.f3741i = null;
                }
                e.a aVar2 = eVar.f3743k;
                if (aVar2 != null) {
                    mVar.l(aVar2);
                    eVar.f3743k = null;
                }
                e.a aVar3 = eVar.f3745n;
                if (aVar3 != null) {
                    mVar.l(aVar3);
                    eVar.f3745n = null;
                }
                eVar.f3733a.clear();
                eVar.f3742j = true;
                return;
        }
    }

    public final Class d() {
        switch (this.f112b) {
            case 0:
                return this.f111a.getClass();
            default:
                return c.class;
        }
    }
}
