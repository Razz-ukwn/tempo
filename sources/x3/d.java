package x3;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import m4.c;
import m4.i;
import rf.a;
import sf.k;
import wg.z;
import x3.f;
import z3.a;

public final class d extends k implements a<z3.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f.a f16928a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(f.a aVar) {
        super(0);
        this.f16928a = aVar;
    }

    public final Object d() {
        z3.f fVar;
        i iVar = i.f11206a;
        Context context = this.f16928a.f16930a;
        synchronized (iVar) {
            fVar = i.f11207b;
            if (fVar == null) {
                a.C0331a aVar = new a.C0331a();
                Bitmap.Config[] configArr = c.f11189a;
                File cacheDir = context.getCacheDir();
                cacheDir.mkdirs();
                File S = pf.a.S(cacheDir);
                String str = z.f16808b;
                aVar.f17685a = z.a.b(S);
                fVar = aVar.a();
                i.f11207b = fVar;
            }
        }
        return fVar;
    }
}
