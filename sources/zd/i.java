package zd;

import android.os.SystemClock;
import android.view.View;
import ff.m;
import rf.l;
import sf.j;

public final class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final int f17952a;

    /* renamed from: b  reason: collision with root package name */
    public final l<View, m> f17953b;

    /* renamed from: c  reason: collision with root package name */
    public long f17954c;

    public i(int i8, l<? super View, m> lVar) {
        this.f17952a = i8;
        this.f17953b = lVar;
    }

    public final void onClick(View view) {
        j.f(view, "v");
        if (SystemClock.elapsedRealtime() - this.f17954c >= ((long) this.f17952a)) {
            this.f17954c = SystemClock.elapsedRealtime();
            this.f17953b.invoke(view);
        }
    }
}
