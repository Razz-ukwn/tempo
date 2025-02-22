package m8;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.fragment.app.z;
import java.lang.ref.WeakReference;
import r8.d;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f11298a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final a f11299b = new a();

    /* renamed from: c  reason: collision with root package name */
    public float f11300c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11301d = true;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f11302e = new WeakReference<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public d f11303f;

    public class a extends z {
        public a() {
        }

        public final void t(int i8) {
            p pVar = p.this;
            pVar.f11301d = true;
            b bVar = pVar.f11302e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public final void y(Typeface typeface, boolean z10) {
            if (!z10) {
                p pVar = p.this;
                pVar.f11301d = true;
                b bVar = pVar.f11302e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public p(b bVar) {
        this.f11302e = new WeakReference<>(bVar);
    }

    public final float a(String str) {
        if (!this.f11301d) {
            return this.f11300c;
        }
        float measureText = str == null ? 0.0f : this.f11298a.measureText(str, 0, str.length());
        this.f11300c = measureText;
        this.f11301d = false;
        return measureText;
    }

    public final void b(d dVar, Context context) {
        if (this.f11303f != dVar) {
            this.f11303f = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f11298a;
                a aVar = this.f11299b;
                dVar.f(context, textPaint, aVar);
                b bVar = this.f11302e.get();
                if (bVar != null) {
                    textPaint.drawableState = bVar.getState();
                }
                dVar.e(context, textPaint, aVar);
                this.f11301d = true;
            }
            b bVar2 = this.f11302e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
