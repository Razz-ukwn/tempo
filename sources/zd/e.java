package zd;

import android.view.View;
import ff.m;
import rf.l;
import sf.j;
import sf.k;

public final class e {

    public static final class a extends k implements l<View, m> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l<View, m> f17946a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l<? super View, m> lVar) {
            super(1);
            this.f17946a = lVar;
        }

        public final Object invoke(Object obj) {
            View view = (View) obj;
            j.f(view, "v");
            this.f17946a.invoke(view);
            return m.f8717a;
        }
    }

    public static final void a(View view, l<? super View, m> lVar) {
        view.setOnClickListener(new i(1000, new a(lVar)));
    }
}
