package c7;

import android.os.IBinder;
import android.os.IInterface;
import h7.b;

public interface a extends IInterface {

    /* renamed from: c7.a$a  reason: collision with other inner class name */
    public static abstract class C0059a extends b implements a {
        public C0059a() {
            super(1, "com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder);
        }
    }
}
