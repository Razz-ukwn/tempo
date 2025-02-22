package le;

import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.p;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;
import java.util.List;
import je.e;
import ke.m;
import me.b;
import me.c;
import sf.j;

public final class d<T> implements w<HashMap<c, List<? extends b>>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f11071a;

    public d(c cVar) {
        this.f11071a = cVar;
    }

    public final void b(Object obj) {
        List list;
        HashMap hashMap = (HashMap) obj;
        c cVar = this.f11071a;
        ProgressBar progressBar = cVar.f11070z0;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        j.e(hashMap, "files");
        ViewPager viewPager = cVar.f11069y0;
        if (viewPager != null) {
            m mVar = (m) viewPager.getAdapter();
            if (mVar != null) {
                int c3 = mVar.c();
                for (int i8 = 0; i8 < c3; i8++) {
                    p pVar = mVar.f10460i.get(i8);
                    j.e(pVar, "mFragmentList[position]");
                    p pVar2 = pVar;
                    if (pVar2 instanceof b) {
                        b bVar = (b) pVar2;
                        Bundle bundle = bVar.C;
                        c cVar2 = bundle != null ? (c) bundle.getParcelable("FILE_TYPE") : null;
                        if (!(cVar2 == null || (list = (List) hashMap.get(cVar2)) == null || bVar.f2066d0 == null)) {
                            if (!list.isEmpty()) {
                                RecyclerView recyclerView = bVar.f11062w0;
                                if (recyclerView != null) {
                                    recyclerView.setVisibility(0);
                                    TextView textView = bVar.f11063x0;
                                    if (textView != null) {
                                        textView.setVisibility(8);
                                        Context q10 = bVar.q();
                                        if (q10 == null) {
                                            continue;
                                        } else {
                                            RecyclerView recyclerView2 = bVar.f11062w0;
                                            if (recyclerView2 != null) {
                                                RecyclerView.e adapter = recyclerView2.getAdapter();
                                                if (!(adapter instanceof ke.b)) {
                                                    adapter = null;
                                                }
                                                ke.b bVar2 = (ke.b) adapter;
                                                bVar.A0 = bVar2;
                                                if (bVar2 == null) {
                                                    ke.b bVar3 = new ke.b(q10, list, e.f9995c, bVar);
                                                    bVar.A0 = bVar3;
                                                    RecyclerView recyclerView3 = bVar.f11062w0;
                                                    if (recyclerView3 != null) {
                                                        recyclerView3.setAdapter(bVar3);
                                                    } else {
                                                        j.l("recyclerView");
                                                        throw null;
                                                    }
                                                } else {
                                                    bVar2.r(list, e.f9995c);
                                                }
                                                bVar.a();
                                            } else {
                                                j.l("recyclerView");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        j.l("emptyView");
                                        throw null;
                                    }
                                } else {
                                    j.l("recyclerView");
                                    throw null;
                                }
                            } else {
                                RecyclerView recyclerView4 = bVar.f11062w0;
                                if (recyclerView4 != null) {
                                    recyclerView4.setVisibility(8);
                                    TextView textView2 = bVar.f11063x0;
                                    if (textView2 != null) {
                                        textView2.setVisibility(0);
                                    } else {
                                        j.l("emptyView");
                                        throw null;
                                    }
                                } else {
                                    j.l("recyclerView");
                                    throw null;
                                }
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        j.l("viewPager");
        throw null;
    }
}
