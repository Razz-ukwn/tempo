package h5;

import y4.h;
import y4.k;

public final class g extends a<g> {
    public static g W;

    public static g x() {
        if (W == null) {
            g gVar = (g) new g().v(k.f17194c, new h());
            if (!gVar.P || gVar.R) {
                gVar.R = true;
                gVar.P = true;
                W = gVar;
            } else {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
        }
        return W;
    }
}
