package wb;

import android.content.Context;
import android.view.OrientationEventListener;

public final class c extends OrientationEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f16664a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, Context context) {
        super(context, 3);
        this.f16664a = dVar;
    }

    public final void onOrientationChanged(int i8) {
        d dVar = this.f16664a;
        int i10 = 0;
        if (i8 == -1) {
            int i11 = dVar.f16667c;
            if (i11 != -1) {
                i10 = i11;
            }
        } else if (i8 < 315 && i8 >= 45) {
            if (i8 >= 45 && i8 < 135) {
                i10 = 90;
            } else if (i8 >= 135 && i8 < 225) {
                i10 = 180;
            } else if (i8 >= 225 && i8 < 315) {
                i10 = 270;
            }
        }
        if (i10 != dVar.f16667c) {
            dVar.f16667c = i10;
            dVar.f16666b.i(i10);
        }
    }
}
