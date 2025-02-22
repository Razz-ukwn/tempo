package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;

public final class y extends Spinner {
    @SuppressLint({"ResourceType"})
    public static final int[] E = {16843505};
    public final i B;
    public int C;
    public final Rect D = new Rect();

    /* renamed from: a  reason: collision with root package name */
    public final e f1146a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1147b;

    /* renamed from: c  reason: collision with root package name */
    public final x f1148c;

    /* renamed from: d  reason: collision with root package name */
    public SpinnerAdapter f1149d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1150e;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public final void onGlobalLayout() {
            y yVar = y.this;
            if (!yVar.getInternalPopup().a()) {
                yVar.B.n(c.b(yVar), c.a(yVar));
            }
            ViewTreeObserver viewTreeObserver = yVar.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    public static final class b {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static final class c {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i8) {
            view.setTextAlignment(i8);
        }

        public static void d(View view, int i8) {
            view.setTextDirection(i8);
        }
    }

    public static final class d {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!c2.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    public class e implements i, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.app.b f1152a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f1153b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f1154c;

        public e() {
        }

        public final boolean a() {
            androidx.appcompat.app.b bVar = this.f1152a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        public final int c() {
            return 0;
        }

        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.f1152a;
            if (bVar != null) {
                bVar.dismiss();
                this.f1152a = null;
            }
        }

        public final void e(int i8) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public final CharSequence f() {
            return this.f1154c;
        }

        public final Drawable h() {
            return null;
        }

        public final void i(CharSequence charSequence) {
            this.f1154c = charSequence;
        }

        public final void k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public final void l(int i8) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public final void m(int i8) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public final void n(int i8, int i10) {
            if (this.f1153b != null) {
                y yVar = y.this;
                b.a aVar = new b.a(yVar.getPopupContext());
                CharSequence charSequence = this.f1154c;
                AlertController.b bVar = aVar.f681a;
                if (charSequence != null) {
                    bVar.f664d = charSequence;
                }
                ListAdapter listAdapter = this.f1153b;
                int selectedItemPosition = yVar.getSelectedItemPosition();
                bVar.m = listAdapter;
                bVar.f673n = this;
                bVar.f677r = selectedItemPosition;
                bVar.f676q = true;
                androidx.appcompat.app.b a10 = aVar.a();
                this.f1152a = a10;
                AlertController.RecycleListView recycleListView = a10.B.f639g;
                c.d(recycleListView, i8);
                c.c(recycleListView, i10);
                this.f1152a.show();
            }
        }

        public final int o() {
            return 0;
        }

        public final void onClick(DialogInterface dialogInterface, int i8) {
            y yVar = y.this;
            yVar.setSelection(i8);
            if (yVar.getOnItemClickListener() != null) {
                yVar.performItemClick((View) null, i8, this.f1153b.getItemId(i8));
            }
            dismiss();
        }

        public final void p(ListAdapter listAdapter) {
            this.f1153b = listAdapter;
        }
    }

    public static class f implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final SpinnerAdapter f1156a;

        /* renamed from: b  reason: collision with root package name */
        public final ListAdapter f1157b;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1156a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1157b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof d1) {
                d1 d1Var = (d1) spinnerAdapter;
                if (d1Var.getDropDownViewTheme() == null) {
                    d1Var.a();
                }
            }
        }

        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1157b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1156a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public final View getDropDownView(int i8, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1156a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i8, view, viewGroup);
        }

        public final Object getItem(int i8) {
            SpinnerAdapter spinnerAdapter = this.f1156a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i8);
        }

        public final long getItemId(int i8) {
            SpinnerAdapter spinnerAdapter = this.f1156a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i8);
        }

        public final int getItemViewType(int i8) {
            return 0;
        }

        public final View getView(int i8, View view, ViewGroup viewGroup) {
            return getDropDownView(i8, view, viewGroup);
        }

        public final int getViewTypeCount() {
            return 1;
        }

        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1156a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public final boolean isEmpty() {
            return getCount() == 0;
        }

        public final boolean isEnabled(int i8) {
            ListAdapter listAdapter = this.f1157b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i8);
            }
            return true;
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1156a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1156a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class g extends p0 implements i {
        public CharSequence Y;
        public ListAdapter Z;

        /* renamed from: a0  reason: collision with root package name */
        public final Rect f1158a0 = new Rect();

        /* renamed from: b0  reason: collision with root package name */
        public int f1159b0;

        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i8, long j10) {
                g gVar = g.this;
                y.this.setSelection(i8);
                if (y.this.getOnItemClickListener() != null) {
                    y.this.performItemClick(view, i8, gVar.Z.getItemId(i8));
                }
                gVar.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public final void onGlobalLayout() {
                g gVar = g.this;
                y yVar = y.this;
                gVar.getClass();
                WeakHashMap<View, d1> weakHashMap = i0.f7217a;
                if (!(i0.g.b(yVar) && yVar.getGlobalVisibleRect(gVar.f1158a0))) {
                    gVar.dismiss();
                    return;
                }
                gVar.s();
                gVar.b();
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1163a;

            public c(b bVar) {
                this.f1163a = bVar;
            }

            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = y.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1163a);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i8) {
            super(context, attributeSet, i8, 0);
            this.K = y.this;
            this.U = true;
            this.V.setFocusable(true);
            this.L = new a();
        }

        public final CharSequence f() {
            return this.Y;
        }

        public final void i(CharSequence charSequence) {
            this.Y = charSequence;
        }

        public final void m(int i8) {
            this.f1159b0 = i8;
        }

        public final void n(int i8, int i10) {
            ViewTreeObserver viewTreeObserver;
            boolean a10 = a();
            s();
            q qVar = this.V;
            qVar.setInputMethodMode(2);
            b();
            k0 k0Var = this.f1104c;
            k0Var.setChoiceMode(1);
            c.d(k0Var, i8);
            c.c(k0Var, i10);
            y yVar = y.this;
            int selectedItemPosition = yVar.getSelectedItemPosition();
            k0 k0Var2 = this.f1104c;
            if (a() && k0Var2 != null) {
                k0Var2.setListSelectionHidden(false);
                k0Var2.setSelection(selectedItemPosition);
                if (k0Var2.getChoiceMode() != 0) {
                    k0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a10 && (viewTreeObserver = yVar.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                qVar.setOnDismissListener(new c(bVar));
            }
        }

        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.Z = listAdapter;
        }

        public final void s() {
            int i8;
            Drawable h3 = h();
            y yVar = y.this;
            if (h3 != null) {
                h3.getPadding(yVar.D);
                i8 = q1.a(yVar) ? yVar.D.right : -yVar.D.left;
            } else {
                Rect rect = yVar.D;
                rect.right = 0;
                rect.left = 0;
                i8 = 0;
            }
            int paddingLeft = yVar.getPaddingLeft();
            int paddingRight = yVar.getPaddingRight();
            int width = yVar.getWidth();
            int i10 = yVar.C;
            if (i10 == -2) {
                int a10 = yVar.a((SpinnerAdapter) this.Z, h());
                int i11 = yVar.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = yVar.D;
                int i12 = (i11 - rect2.left) - rect2.right;
                if (a10 > i12) {
                    a10 = i12;
                }
                r(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i10 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i10);
            }
            this.B = q1.a(yVar) ? (((width - paddingRight) - this.f1106e) - this.f1159b0) + i8 : paddingLeft + this.f1159b0 + i8;
        }
    }

    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public boolean f1165a;

        public class a implements Parcelable.Creator<h> {
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            public final Object[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeByte(this.f1165a ? (byte) 1 : 0);
        }

        public h(Parcel parcel) {
            super(parcel);
            this.f1165a = parcel.readByte() != 0;
        }
    }

    public interface i {
        boolean a();

        int c();

        void dismiss();

        void e(int i8);

        CharSequence f();

        Drawable h();

        void i(CharSequence charSequence);

        void k(Drawable drawable);

        void l(int i8);

        void m(int i8);

        void n(int i8, int i10);

        int o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r5 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.D = r0
            android.content.Context r0 = r10.getContext()
            androidx.appcompat.widget.c1.a(r10, r0)
            int[] r0 = cb.e.S
            r1 = 0
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r12, r0, r13, r1)
            androidx.appcompat.widget.e r3 = new androidx.appcompat.widget.e
            r3.<init>(r10)
            r10.f1146a = r3
            r3 = 4
            int r3 = r2.getResourceId(r3, r1)
            if (r3 == 0) goto L_0x002e
            h.c r4 = new h.c
            r4.<init>((android.content.Context) r11, (int) r3)
            r10.f1147b = r4
            goto L_0x0030
        L_0x002e:
            r10.f1147b = r11
        L_0x0030:
            r3 = -1
            r4 = 0
            int[] r5 = E     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r5, r13, r1)     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            boolean r6 = r5.hasValue(r1)     // Catch:{ Exception -> 0x0047 }
            if (r6 == 0) goto L_0x0058
            int r3 = r5.getInt(r1, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0058
        L_0x0043:
            r11 = move-exception
            r4 = r5
            goto L_0x00cb
        L_0x0047:
            r6 = move-exception
            goto L_0x004f
        L_0x0049:
            r11 = move-exception
            goto L_0x00cb
        L_0x004c:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L_0x004f:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch:{ all -> 0x0043 }
            if (r5 == 0) goto L_0x005b
        L_0x0058:
            r5.recycle()
        L_0x005b:
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0093
            if (r3 == r6) goto L_0x0062
            goto L_0x00a0
        L_0x0062:
            androidx.appcompat.widget.y$g r3 = new androidx.appcompat.widget.y$g
            android.content.Context r7 = r10.f1147b
            r3.<init>(r7, r12, r13)
            android.content.Context r7 = r10.f1147b
            androidx.appcompat.widget.h1 r0 = androidx.appcompat.widget.h1.m(r7, r12, r0, r13)
            android.content.res.TypedArray r7 = r0.f1015b
            r8 = 3
            r9 = -2
            int r7 = r7.getLayoutDimension(r8, r9)
            r10.C = r7
            android.graphics.drawable.Drawable r7 = r0.e(r6)
            r3.k(r7)
            java.lang.String r5 = r2.getString(r5)
            r3.Y = r5
            r0.n()
            r10.B = r3
            androidx.appcompat.widget.x r0 = new androidx.appcompat.widget.x
            r0.<init>(r10, r10, r3)
            r10.f1148c = r0
            goto L_0x00a0
        L_0x0093:
            androidx.appcompat.widget.y$e r0 = new androidx.appcompat.widget.y$e
            r0.<init>()
            r10.B = r0
            java.lang.String r3 = r2.getString(r5)
            r0.f1154c = r3
        L_0x00a0:
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
            if (r0 == 0) goto L_0x00b7
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r11, r3, r0)
            r11 = 2131493050(0x7f0c00ba, float:1.860957E38)
            r1.setDropDownViewResource(r11)
            r10.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00b7:
            r2.recycle()
            r10.f1150e = r6
            android.widget.SpinnerAdapter r11 = r10.f1149d
            if (r11 == 0) goto L_0x00c5
            r10.setAdapter((android.widget.SpinnerAdapter) r11)
            r10.f1149d = r4
        L_0x00c5:
            androidx.appcompat.widget.e r11 = r10.f1146a
            r11.d(r12, r13)
            return
        L_0x00cb:
            if (r4 == 0) goto L_0x00d0
            r4.recycle()
        L_0x00d0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i8 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i10 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i10;
        }
        Rect rect = this.D;
        drawable.getPadding(rect);
        return i10 + rect.left + rect.right;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1146a;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        i iVar = this.B;
        return iVar != null ? iVar.c() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        i iVar = this.B;
        return iVar != null ? iVar.o() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.B != null ? this.C : super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.B;
    }

    public Drawable getPopupBackground() {
        i iVar = this.B;
        return iVar != null ? iVar.h() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f1147b;
    }

    public CharSequence getPrompt() {
        i iVar = this.B;
        return iVar != null ? iVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1146a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1146a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.B;
        if (iVar != null && iVar.a()) {
            iVar.dismiss();
        }
    }

    public final void onMeasure(int i8, int i10) {
        super.onMeasure(i8, i10);
        if (this.B != null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i8)), getMeasuredHeight());
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (hVar.f1165a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        i iVar = this.B;
        hVar.f1165a = iVar != null && iVar.a();
        return hVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x xVar = this.f1148c;
        if (xVar == null || !xVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        i iVar = this.B;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.a()) {
            return true;
        }
        iVar.n(c.b(this), c.a(this));
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1146a;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        e eVar = this.f1146a;
        if (eVar != null) {
            eVar.f(i8);
        }
    }

    public void setDropDownHorizontalOffset(int i8) {
        i iVar = this.B;
        if (iVar != null) {
            iVar.m(i8);
            iVar.e(i8);
            return;
        }
        super.setDropDownHorizontalOffset(i8);
    }

    public void setDropDownVerticalOffset(int i8) {
        i iVar = this.B;
        if (iVar != null) {
            iVar.l(i8);
        } else {
            super.setDropDownVerticalOffset(i8);
        }
    }

    public void setDropDownWidth(int i8) {
        if (this.B != null) {
            this.C = i8;
        } else {
            super.setDropDownWidth(i8);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.B;
        if (iVar != null) {
            iVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i8) {
        setPopupBackgroundDrawable(f.a.a(getPopupContext(), i8));
    }

    public void setPrompt(CharSequence charSequence) {
        i iVar = this.B;
        if (iVar != null) {
            iVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1146a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1146a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1150e) {
            this.f1149d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        i iVar = this.B;
        if (iVar != null) {
            Context context = this.f1147b;
            if (context == null) {
                context = getContext();
            }
            iVar.p(new f(spinnerAdapter, context.getTheme()));
        }
    }
}
