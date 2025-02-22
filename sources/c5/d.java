package c5;

import ag.b1;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import com.bumptech.glide.h;
import java.security.MessageDigest;
import p4.l;
import r4.w;

public final class d implements l<c> {

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f3732b;

    public d(l<Bitmap> lVar) {
        b1.b(lVar);
        this.f3732b = lVar;
    }

    public final void a(MessageDigest messageDigest) {
        this.f3732b.a(messageDigest);
    }

    public final w b(h hVar, w wVar, int i8, int i10) {
        c cVar = (c) wVar.get();
        y4.d dVar = new y4.d(cVar.f3726a.f3731a.f3744l, b.b(hVar).f4054a);
        l<Bitmap> lVar = this.f3732b;
        w b10 = lVar.b(hVar, dVar, i8, i10);
        if (!dVar.equals(b10)) {
            dVar.c();
        }
        cVar.f3726a.f3731a.c(lVar, (Bitmap) b10.get());
        return wVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f3732b.equals(((d) obj).f3732b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3732b.hashCode();
    }
}
