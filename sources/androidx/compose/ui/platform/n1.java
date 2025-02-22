package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import b0.t;
import ff.a;
import java.io.Serializable;
import t.b3;
import t.h2;
import t.k1;

public final class n1 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<? extends Object>[] f1357a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (tVar.a() != k1.f15133a && tVar.a() != b3.f14997a && tVar.a() != h2.f15064a) {
                return false;
            }
            Object value = tVar.getValue();
            if (value == null) {
                return true;
            }
            return a(value);
        } else if ((obj instanceof a) && (obj instanceof Serializable)) {
            return false;
        } else {
            Class<? extends Object>[] clsArr = f1357a;
            for (int i8 = 0; i8 < 7; i8++) {
                if (clsArr[i8].isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }
}
