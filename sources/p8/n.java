package p8;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import i.b;
import p8.c;

public final class n<S extends c> extends l {
    public m<S> H;
    public b I;

    public n(Context context, h hVar, d dVar, g gVar) {
        super(context, hVar);
        this.H = dVar;
        dVar.f12519b = this;
        this.I = gVar;
        gVar.f9343a = this;
    }

    public final boolean d(boolean z10, boolean z11, boolean z12) {
        boolean d10 = super.d(z10, z11, z12);
        if (!isRunning()) {
            this.I.c();
        }
        a aVar = this.f12515c;
        ContentResolver contentResolver = this.f12513a.getContentResolver();
        aVar.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z10 && z12) {
            this.I.i();
        }
        return d10;
    }

    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.H.c(canvas, getBounds(), b());
            m<S> mVar = this.H;
            Paint paint = this.E;
            mVar.b(canvas, paint);
            int i8 = 0;
            while (true) {
                b bVar = this.I;
                Object obj = bVar.f9345c;
                if (i8 < ((int[]) obj).length) {
                    m<S> mVar2 = this.H;
                    Object obj2 = bVar.f9344b;
                    int i10 = i8 * 2;
                    mVar2.a(canvas, paint, ((float[]) obj2)[i10], ((float[]) obj2)[i10 + 1], ((int[]) obj)[i8]);
                    i8++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public final int getIntrinsicHeight() {
        return ((d) this.H).d();
    }

    public final int getIntrinsicWidth() {
        return ((d) this.H).d();
    }
}
