package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

public final class e extends BaseAdapter {
    public final int B;

    /* renamed from: a  reason: collision with root package name */
    public final f f716a;

    /* renamed from: b  reason: collision with root package name */
    public int f717b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f718c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f719d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutInflater f720e;

    public e(f fVar, LayoutInflater layoutInflater, boolean z10, int i8) {
        this.f719d = z10;
        this.f720e = layoutInflater;
        this.f716a = fVar;
        this.B = i8;
        b();
    }

    public final void b() {
        f fVar = this.f716a;
        h hVar = fVar.f742v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.f731j;
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (arrayList.get(i8) == hVar) {
                    this.f717b = i8;
                    return;
                }
            }
        }
        this.f717b = -1;
    }

    /* renamed from: c */
    public final h getItem(int i8) {
        ArrayList<h> arrayList;
        boolean z10 = this.f719d;
        f fVar = this.f716a;
        if (z10) {
            fVar.i();
            arrayList = fVar.f731j;
        } else {
            arrayList = fVar.l();
        }
        int i10 = this.f717b;
        if (i10 >= 0 && i8 >= i10) {
            i8++;
        }
        return arrayList.get(i8);
    }

    public final int getCount() {
        ArrayList<h> arrayList;
        boolean z10 = this.f719d;
        f fVar = this.f716a;
        if (z10) {
            fVar.i();
            arrayList = fVar.f731j;
        } else {
            arrayList = fVar.l();
        }
        return this.f717b < 0 ? arrayList.size() : arrayList.size() - 1;
    }

    public final long getItemId(int i8) {
        return (long) i8;
    }

    public final View getView(int i8, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f720e.inflate(this.B, viewGroup, false);
        }
        int i10 = getItem(i8).f749b;
        int i11 = i8 - 1;
        int i12 = i11 >= 0 ? getItem(i11).f749b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f716a.m() && i10 != i12) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        k.a aVar = (k.a) view;
        if (this.f718c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i8));
        return view;
    }

    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
