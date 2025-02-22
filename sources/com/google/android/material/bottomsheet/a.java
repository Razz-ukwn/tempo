package com.google.android.material.bottomsheet;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import d2.j1;
import d2.z;
import java.util.ArrayList;

public final class a implements z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f5787a;

    public a(b bVar) {
        this.f5787a = bVar;
    }

    public final j1 a(View view, j1 j1Var) {
        b bVar = this.f5787a;
        b.C0071b bVar2 = bVar.I;
        if (bVar2 != null) {
            bVar.B.W.remove(bVar2);
        }
        b.C0071b bVar3 = new b.C0071b(bVar.E, j1Var);
        bVar.I = bVar3;
        bVar3.e(bVar.getWindow());
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = bVar.B;
        b.C0071b bVar4 = bVar.I;
        ArrayList<BottomSheetBehavior.c> arrayList = bottomSheetBehavior.W;
        if (!arrayList.contains(bVar4)) {
            arrayList.add(bVar4);
        }
        return j1Var;
    }
}
