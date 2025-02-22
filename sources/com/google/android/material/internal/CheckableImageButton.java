package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.n;
import com.quickkonnect.silencio.R;
import d2.i0;

public class CheckableImageButton extends n implements Checkable {
    public static final int[] C = {16842912};
    public boolean B = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6002d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6003e = true;

    public static class a extends k2.a {
        public static final Parcelable.Creator<a> CREATOR = new C0075a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f6004c;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a  reason: collision with other inner class name */
        public class C0075a implements Parcelable.ClassLoaderCreator<a> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new a[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeInt(this.f6004c ? 1 : 0);
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6004c = parcel.readInt() != 1 ? false : true;
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        i0.n(this, new m8.a(this));
    }

    public final boolean isChecked() {
        return this.f6002d;
    }

    public final int[] onCreateDrawableState(int i8) {
        return this.f6002d ? View.mergeDrawableStates(super.onCreateDrawableState(i8 + 1), C) : super.onCreateDrawableState(i8);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f10267a);
        setChecked(aVar.f6004c);
    }

    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f6004c = this.f6002d;
        return aVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f6003e != z10) {
            this.f6003e = z10;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z10) {
        if (this.f6003e && this.f6002d != z10) {
            this.f6002d = z10;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z10) {
        this.B = z10;
    }

    public void setPressed(boolean z10) {
        if (this.B) {
            super.setPressed(z10);
        }
    }

    public final void toggle() {
        setChecked(!this.f6002d);
    }
}
