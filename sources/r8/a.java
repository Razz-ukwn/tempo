package r8;

import android.graphics.Typeface;
import androidx.fragment.app.z;
import m8.b;
import m8.c;

public final class a extends z {

    /* renamed from: b  reason: collision with root package name */
    public final Typeface f14088b;

    /* renamed from: c  reason: collision with root package name */
    public final C0263a f14089c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14090d;

    /* renamed from: r8.a$a  reason: collision with other inner class name */
    public interface C0263a {
    }

    public a(b bVar, Typeface typeface) {
        this.f14088b = typeface;
        this.f14089c = bVar;
    }

    public final void t(int i8) {
        if (!this.f14090d) {
            c cVar = ((b) this.f14089c).f11222a;
            if (cVar.j(this.f14088b)) {
                cVar.h(false);
            }
        }
    }

    public final void y(Typeface typeface, boolean z10) {
        if (!this.f14090d) {
            c cVar = ((b) this.f14089c).f11222a;
            if (cVar.j(typeface)) {
                cVar.h(false);
            }
        }
    }
}
