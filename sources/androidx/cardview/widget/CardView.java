package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import b1.b;
import com.quickkonnect.silencio.R;

public class CardView extends FrameLayout {
    public static final int[] B = {16842801};
    public static final b C = new b();

    /* renamed from: a  reason: collision with root package name */
    public boolean f1170a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1171b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1172c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f1173d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1174e;

    public class a implements n.a {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f1175a;

        public a() {
        }

        public final void a(int i8, int i10, int i11, int i12) {
            CardView cardView = CardView.this;
            cardView.f1173d.set(i8, i10, i11, i12);
            Rect rect = cardView.f1172c;
            CardView.super.setPadding(i8 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((n.b) this.f1174e.f1175a).f11510h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1172c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1172c.left;
    }

    public int getContentPaddingRight() {
        return this.f1172c.right;
    }

    public int getContentPaddingTop() {
        return this.f1172c.top;
    }

    public float getMaxCardElevation() {
        return ((n.b) this.f1174e.f1175a).f11507e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1171b;
    }

    public float getRadius() {
        return ((n.b) this.f1174e.f1175a).f11503a;
    }

    public boolean getUseCompatPadding() {
        return this.f1170a;
    }

    public void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i10);
    }

    public void setCardBackgroundColor(int i8) {
        ColorStateList valueOf = ColorStateList.valueOf(i8);
        n.b bVar = (n.b) this.f1174e.f1175a;
        bVar.b(valueOf);
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        CardView.this.setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        C.j(this.f1174e, f10);
    }

    public void setMinimumHeight(int i8) {
        super.setMinimumHeight(i8);
    }

    public void setMinimumWidth(int i8) {
        super.setMinimumWidth(i8);
    }

    public final void setPadding(int i8, int i10, int i11, int i12) {
    }

    public final void setPaddingRelative(int i8, int i10, int i11, int i12) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1171b) {
            this.f1171b = z10;
            b bVar = C;
            a aVar = this.f1174e;
            bVar.j(aVar, ((n.b) aVar.f1175a).f11507e);
        }
    }

    public void setRadius(float f10) {
        n.b bVar = (n.b) this.f1174e.f1175a;
        if (f10 != bVar.f11503a) {
            bVar.f11503a = f10;
            bVar.c((Rect) null);
            bVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1170a != z10) {
            this.f1170a = z10;
            b bVar = C;
            a aVar = this.f1174e;
            bVar.j(aVar, ((n.b) aVar.f1175a).f11507e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        ColorStateList colorStateList;
        int i10;
        Rect rect = new Rect();
        this.f1172c = rect;
        this.f1173d = new Rect();
        a aVar = new a();
        this.f1174e = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b7.a.f3270d, i8, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            colorStateList = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(B);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i10 = getResources().getColor(R.color.cardview_light_background);
            } else {
                i10 = getResources().getColor(R.color.cardview_dark_background);
            }
            colorStateList = ColorStateList.valueOf(i10);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1170a = obtainStyledAttributes.getBoolean(7, false);
        this.f1171b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b bVar = C;
        n.b bVar2 = new n.b(dimension, colorStateList);
        aVar.f1175a = bVar2;
        setBackgroundDrawable(bVar2);
        setClipToOutline(true);
        setElevation(dimension2);
        bVar.j(aVar, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        n.b bVar = (n.b) this.f1174e.f1175a;
        bVar.b(colorStateList);
        bVar.invalidateSelf();
    }
}
