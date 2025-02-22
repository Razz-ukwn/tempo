package ke;

import androidx.fragment.app.i0;
import androidx.fragment.app.p;
import androidx.fragment.app.p0;
import java.util.ArrayList;
import le.a;
import sf.j;

public final class m extends p0 {

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<p> f10460i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<String> f10461j = new ArrayList<>();

    public m(i0 i0Var) {
        super(i0Var);
    }

    public final int c() {
        return this.f10460i.size();
    }

    public final CharSequence d(int i8) {
        return this.f10461j.get(i8);
    }

    public final void k(a aVar, String str) {
        j.f(str, "title");
        this.f10460i.add(aVar);
        this.f10461j.add(str);
    }
}
