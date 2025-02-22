package fg;

import a2.b;
import android.graphics.Rect;
import androidx.fragment.app.z;
import eg.e;
import java.util.Random;
import sf.j;

public final class d extends z {
    public float B;

    /* renamed from: b  reason: collision with root package name */
    public final c f8744b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8745c;

    /* renamed from: d  reason: collision with root package name */
    public final Random f8746d;

    /* renamed from: e  reason: collision with root package name */
    public float f8747e;

    public d(c cVar, float f10) {
        Random random = new Random();
        j.f(cVar, "emitterConfig");
        this.f8744b = cVar;
        this.f8745c = f10;
        this.f8746d = random;
    }

    public final e.a F(e eVar, Rect rect) {
        if (eVar instanceof e.a) {
            e.a aVar = (e.a) eVar;
            return new e.a(aVar.f8013a, aVar.f8014b);
        } else if (eVar instanceof e.b) {
            e.b bVar = (e.b) eVar;
            return new e.a(((float) rect.width()) * ((float) bVar.f8015a), ((float) rect.height()) * ((float) bVar.f8016b));
        } else if (eVar instanceof e.c) {
            ((e.c) eVar).getClass();
            e.a F = F((e) null, rect);
            e.a F2 = F((e) null, rect);
            Random random = this.f8746d;
            float nextFloat = random.nextFloat();
            float f10 = F2.f8013a;
            float f11 = F.f8013a;
            float b10 = b.b(f10, f11, nextFloat, f11);
            float nextFloat2 = random.nextFloat();
            float f12 = F2.f8014b;
            float f13 = F.f8014b;
            return new e.a(b10, b.b(f12, f13, nextFloat2, f13));
        } else {
            throw new ff.e();
        }
    }
}
