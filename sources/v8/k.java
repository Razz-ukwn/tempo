package v8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import u8.a;
import v8.l;

public final class k extends l.f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f16314c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f16315d;

    public k(ArrayList arrayList, Matrix matrix) {
        this.f16314c = arrayList;
        this.f16315d = matrix;
    }

    public final void a(Matrix matrix, a aVar, int i8, Canvas canvas) {
        for (l.f a10 : this.f16314c) {
            a10.a(this.f16315d, aVar, i8, canvas);
        }
    }
}
