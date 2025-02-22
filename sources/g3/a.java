package g3;

import androidx.profileinstaller.b;
import java.io.Serializable;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f8802a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8803b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8804c;

    public /* synthetic */ a(b bVar, int i8, Serializable serializable) {
        this.f8802a = bVar;
        this.f8803b = i8;
        this.f8804c = serializable;
    }

    public final void run() {
        this.f8802a.f2346b.b(this.f8803b, this.f8804c);
    }
}
