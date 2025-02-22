package s5;

import ag.i0;
import android.graphics.Color;
import java.util.ArrayList;
import w5.e;

public final class h extends i<f> implements e {
    public final int C = 1;
    public final ArrayList D = null;
    public final int E = -1;
    public final float F = 8.0f;
    public final float G = 4.0f;
    public final float H = 0.2f;
    public final i0 I = new i0();
    public boolean J = true;
    public final boolean K = true;

    public h(ArrayList arrayList) {
        super(arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.D = arrayList2;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    public final int T(int i8) {
        return ((Integer) this.D.get(i8)).intValue();
    }

    public final boolean Y() {
        return this.J;
    }

    public final int a() {
        return this.D.size();
    }

    public final float b0() {
        return this.G;
    }

    public final boolean e0() {
        return this.K;
    }

    public final i0 f() {
        return this.I;
    }

    public final void k() {
    }

    public final int m() {
        return this.E;
    }

    public final float q() {
        return this.H;
    }

    public final void r() {
    }

    public final int w() {
        return this.C;
    }

    public final float z() {
        return this.F;
    }
}
