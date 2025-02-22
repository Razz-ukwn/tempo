package g2;

import android.view.inputmethod.InputContentInfo;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final b f8800a;

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f8801a;

        public a(Object obj) {
            this.f8801a = (InputContentInfo) obj;
        }

        public final Object a() {
            return this.f8801a;
        }

        public final void b() {
            this.f8801a.requestPermission();
        }
    }

    public interface b {
    }

    public d(a aVar) {
        this.f8800a = aVar;
    }
}
