package i2;

import android.content.Context;
import android.view.LayoutInflater;

public abstract class c extends a {
    public final int D;
    public final int E;
    public final LayoutInflater F;

    @Deprecated
    public c(Context context, int i8) {
        super(context);
        this.E = i8;
        this.D = i8;
        this.F = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
