package a8;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d2.j1;
import m8.v;
import v1.e;

public final class b implements v.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f126a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f127b;

    public b(BottomSheetBehavior bottomSheetBehavior, boolean z10) {
        this.f127b = bottomSheetBehavior;
        this.f126a = z10;
    }

    public final j1 a(View view, j1 j1Var, v.c cVar) {
        boolean z10;
        int i8;
        j1.k kVar = j1Var.f7237a;
        e f10 = kVar.f(7);
        e f11 = kVar.f(32);
        int i10 = f10.f16122b;
        BottomSheetBehavior bottomSheetBehavior = this.f127b;
        bottomSheetBehavior.f5771w = i10;
        boolean c3 = v.c(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z11 = bottomSheetBehavior.f5763o;
        if (z11) {
            int a10 = j1Var.a();
            bottomSheetBehavior.f5770v = a10;
            paddingBottom = a10 + cVar.f11315d;
        }
        boolean z12 = bottomSheetBehavior.f5764p;
        int i11 = f10.f16121a;
        if (z12) {
            paddingLeft = (c3 ? cVar.f11314c : cVar.f11312a) + i11;
        }
        boolean z13 = bottomSheetBehavior.f5765q;
        int i12 = f10.f16123c;
        if (z13) {
            paddingRight = (c3 ? cVar.f11312a : cVar.f11314c) + i12;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z14 = true;
        if (!bottomSheetBehavior.f5767s || marginLayoutParams.leftMargin == i11) {
            z10 = false;
        } else {
            marginLayoutParams.leftMargin = i11;
            z10 = true;
        }
        if (bottomSheetBehavior.f5768t && marginLayoutParams.rightMargin != i12) {
            marginLayoutParams.rightMargin = i12;
            z10 = true;
        }
        if (!bottomSheetBehavior.f5769u || marginLayoutParams.topMargin == (i8 = f10.f16122b)) {
            z14 = z10;
        } else {
            marginLayoutParams.topMargin = i8;
        }
        if (z14) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z15 = this.f126a;
        if (z15) {
            bottomSheetBehavior.m = f11.f16124d;
        }
        if (z11 || z15) {
            bottomSheetBehavior.J();
        }
        return j1Var;
    }
}
