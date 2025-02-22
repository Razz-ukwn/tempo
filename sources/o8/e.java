package o8;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;
import m8.l;
import r3.o;
import x7.b;

public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public d f12231a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12232b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f12233c;

    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0233a();

        /* renamed from: a  reason: collision with root package name */
        public int f12234a;

        /* renamed from: b  reason: collision with root package name */
        public l f12235b;

        /* renamed from: o8.e$a$a  reason: collision with other inner class name */
        public class C0233a implements Parcelable.Creator<a> {
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final Object[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a() {
        }

        public a(Parcel parcel) {
            this.f12234a = parcel.readInt();
            this.f12235b = (l) parcel.readParcelable(a.class.getClassLoader());
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f12234a);
            parcel.writeParcelable(this.f12235b, 0);
        }
    }

    public final void c(f fVar, boolean z10) {
    }

    public final void d(boolean z10) {
        r3.a aVar;
        if (!this.f12232b) {
            if (z10) {
                this.f12231a.a();
                return;
            }
            d dVar = this.f12231a;
            f fVar = dVar.f12226b0;
            if (fVar != null && dVar.B != null) {
                int size = fVar.size();
                if (size != dVar.B.length) {
                    dVar.a();
                    return;
                }
                int i8 = dVar.C;
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItem item = dVar.f12226b0.getItem(i10);
                    if (item.isChecked()) {
                        dVar.C = item.getItemId();
                        dVar.D = i10;
                    }
                }
                if (!(i8 == dVar.C || (aVar = dVar.f12223a) == null)) {
                    o.a(dVar, aVar);
                }
                int i11 = dVar.f12229e;
                boolean z11 = i11 != -1 ? i11 == 0 : dVar.f12226b0.l().size() > 3;
                for (int i12 = 0; i12 < size; i12++) {
                    dVar.f12224a0.f12232b = true;
                    dVar.B[i12].setLabelVisibilityMode(dVar.f12229e);
                    dVar.B[i12].setShifting(z11);
                    dVar.B[i12].c((h) dVar.f12226b0.getItem(i12));
                    dVar.f12224a0.f12232b = false;
                }
            }
        }
    }

    public final boolean e() {
        return false;
    }

    public final boolean g(h hVar) {
        return false;
    }

    public final int getId() {
        return this.f12233c;
    }

    public final void h(Context context, f fVar) {
        this.f12231a.f12226b0 = fVar;
    }

    public final void i(Parcelable parcelable) {
        SparseArray<x7.a> sparseArray;
        if (parcelable instanceof a) {
            d dVar = this.f12231a;
            a aVar = (a) parcelable;
            int i8 = aVar.f12234a;
            int size = dVar.f12226b0.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                MenuItem item = dVar.f12226b0.getItem(i10);
                if (i8 == item.getItemId()) {
                    dVar.C = i8;
                    dVar.D = i10;
                    item.setChecked(true);
                    break;
                }
                i10++;
            }
            Context context = this.f12231a.getContext();
            l lVar = aVar.f12235b;
            SparseArray sparseArray2 = new SparseArray(lVar.size());
            int i11 = 0;
            while (i11 < lVar.size()) {
                int keyAt = lVar.keyAt(i11);
                b.a aVar2 = (b.a) lVar.valueAt(i11);
                if (aVar2 != null) {
                    sparseArray2.put(keyAt, new x7.a(context, aVar2));
                    i11++;
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            d dVar2 = this.f12231a;
            dVar2.getClass();
            int i12 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = dVar2.N;
                if (i12 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i12);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (x7.a) sparseArray2.get(keyAt2));
                }
                i12++;
            }
            a[] aVarArr = dVar2.B;
            if (aVarArr != null) {
                for (a aVar3 : aVarArr) {
                    aVar3.setBadge(sparseArray.get(aVar3.getId()));
                }
            }
        }
    }

    public final boolean k(m mVar) {
        return false;
    }

    public final Parcelable l() {
        a aVar = new a();
        aVar.f12234a = this.f12231a.getSelectedItemId();
        SparseArray<x7.a> badgeDrawables = this.f12231a.getBadgeDrawables();
        l lVar = new l();
        int i8 = 0;
        while (i8 < badgeDrawables.size()) {
            int keyAt = badgeDrawables.keyAt(i8);
            x7.a valueAt = badgeDrawables.valueAt(i8);
            if (valueAt != null) {
                lVar.put(keyAt, valueAt.f16975e.f16976a);
                i8++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        aVar.f12235b = lVar;
        return aVar;
    }

    public final boolean m(h hVar) {
        return false;
    }
}
