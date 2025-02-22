package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.h1;
import cb.e;
import com.quickkonnect.silencio.R;
import d2.d1;
import d2.i0;
import java.util.WeakHashMap;

public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    public TextView B;
    public ImageView C;
    public ImageView D;
    public LinearLayout E;
    public final Drawable F;
    public final int G;
    public final Context H;
    public boolean I;
    public final Drawable J;
    public final boolean K;
    public LayoutInflater L;
    public boolean M;

    /* renamed from: a  reason: collision with root package name */
    public h f685a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f686b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f687c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f688d;

    /* renamed from: e  reason: collision with root package name */
    public CheckBox f689e;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h1 m = h1.m(getContext(), attributeSet, e.O, R.attr.listMenuViewStyle);
        this.F = m.e(5);
        this.G = m.i(1, -1);
        this.I = m.a(7, false);
        this.H = context;
        this.J = m.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.K = obtainStyledAttributes.hasValue(0);
        m.n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.L == null) {
            this.L = LayoutInflater.from(getContext());
        }
        return this.L;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.C;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.D;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.D.getLayoutParams();
            rect.top = this.D.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r0 == false) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.appcompat.view.menu.h r11) {
        /*
            r10 = this;
            r10.f685a = r11
            boolean r0 = r11.isVisible()
            r1 = 0
            r2 = 8
            if (r0 == 0) goto L_0x000d
            r0 = r1
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f752e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            androidx.appcompat.view.menu.f r0 = r11.f760n
            boolean r3 = r0.o()
            r4 = 1
            if (r3 == 0) goto L_0x0035
            boolean r3 = r0.n()
            if (r3 == 0) goto L_0x002f
            char r3 = r11.f757j
            goto L_0x0031
        L_0x002f:
            char r3 = r11.f755h
        L_0x0031:
            if (r3 == 0) goto L_0x0035
            r3 = r4
            goto L_0x0036
        L_0x0035:
            r3 = r1
        L_0x0036:
            r0.n()
            if (r3 == 0) goto L_0x0058
            androidx.appcompat.view.menu.h r0 = r10.f685a
            androidx.appcompat.view.menu.f r3 = r0.f760n
            boolean r5 = r3.o()
            if (r5 == 0) goto L_0x0054
            boolean r3 = r3.n()
            if (r3 == 0) goto L_0x004e
            char r0 = r0.f757j
            goto L_0x0050
        L_0x004e:
            char r0 = r0.f755h
        L_0x0050:
            if (r0 == 0) goto L_0x0054
            r0 = r4
            goto L_0x0055
        L_0x0054:
            r0 = r1
        L_0x0055:
            if (r0 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r1 = r2
        L_0x0059:
            if (r1 != 0) goto L_0x0117
            android.widget.TextView r0 = r10.B
            androidx.appcompat.view.menu.h r3 = r10.f685a
            androidx.appcompat.view.menu.f r5 = r3.f760n
            boolean r5 = r5.n()
            if (r5 == 0) goto L_0x006a
            char r5 = r3.f757j
            goto L_0x006c
        L_0x006a:
            char r5 = r3.f755h
        L_0x006c:
            if (r5 != 0) goto L_0x0072
            java.lang.String r2 = ""
            goto L_0x0114
        L_0x0072:
            androidx.appcompat.view.menu.f r6 = r3.f760n
            android.content.Context r7 = r6.f722a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r6.f722a
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            boolean r9 = r9.hasPermanentMenuKey()
            if (r9 == 0) goto L_0x0095
            r9 = 2131951654(0x7f130026, float:1.9539729E38)
            java.lang.String r9 = r7.getString(r9)
            r8.append(r9)
        L_0x0095:
            boolean r6 = r6.n()
            if (r6 == 0) goto L_0x009e
            int r3 = r3.f758k
            goto L_0x00a0
        L_0x009e:
            int r3 = r3.f756i
        L_0x00a0:
            r6 = 2131951650(0x7f130022, float:1.953972E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 65536(0x10000, float:9.18355E-41)
            androidx.appcompat.view.menu.h.c(r3, r9, r6, r8)
            r6 = 2131951646(0x7f13001e, float:1.9539712E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 4096(0x1000, float:5.74E-42)
            androidx.appcompat.view.menu.h.c(r3, r9, r6, r8)
            r6 = 2131951645(0x7f13001d, float:1.953971E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 2
            androidx.appcompat.view.menu.h.c(r3, r9, r6, r8)
            r6 = 2131951651(0x7f130023, float:1.9539723E38)
            java.lang.String r6 = r7.getString(r6)
            androidx.appcompat.view.menu.h.c(r3, r4, r6, r8)
            r4 = 2131951653(0x7f130025, float:1.9539727E38)
            java.lang.String r4 = r7.getString(r4)
            r6 = 4
            androidx.appcompat.view.menu.h.c(r3, r6, r4, r8)
            r4 = 2131951649(0x7f130021, float:1.9539718E38)
            java.lang.String r4 = r7.getString(r4)
            androidx.appcompat.view.menu.h.c(r3, r2, r4, r8)
            if (r5 == r2) goto L_0x0106
            r2 = 10
            if (r5 == r2) goto L_0x00fb
            r2 = 32
            if (r5 == r2) goto L_0x00f0
            r8.append(r5)
            goto L_0x0110
        L_0x00f0:
            r2 = 2131951652(0x7f130024, float:1.9539725E38)
            java.lang.String r2 = r7.getString(r2)
            r8.append(r2)
            goto L_0x0110
        L_0x00fb:
            r2 = 2131951648(0x7f130020, float:1.9539716E38)
            java.lang.String r2 = r7.getString(r2)
            r8.append(r2)
            goto L_0x0110
        L_0x0106:
            r2 = 2131951647(0x7f13001f, float:1.9539714E38)
            java.lang.String r2 = r7.getString(r2)
            r8.append(r2)
        L_0x0110:
            java.lang.String r2 = r8.toString()
        L_0x0114:
            r0.setText(r2)
        L_0x0117:
            android.widget.TextView r0 = r10.B
            int r0 = r0.getVisibility()
            if (r0 == r1) goto L_0x0124
            android.widget.TextView r0 = r10.B
            r0.setVisibility(r1)
        L_0x0124:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f763q
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(androidx.appcompat.view.menu.h):void");
    }

    public h getItemData() {
        return this.f685a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap<View, d1> weakHashMap = i0.f7217a;
        i0.d.q(this, this.F);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f688d = textView;
        int i8 = this.G;
        if (i8 != -1) {
            textView.setTextAppearance(this.H, i8);
        }
        this.B = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.C = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.J);
        }
        this.D = (ImageView) findViewById(R.id.group_divider);
        this.E = (LinearLayout) findViewById(R.id.content);
    }

    public final void onMeasure(int i8, int i10) {
        if (this.f686b != null && this.I) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f686b.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i8, i10);
    }

    public void setCheckable(boolean z10) {
        View view;
        CompoundButton compoundButton;
        if (z10 || this.f687c != null || this.f689e != null) {
            if ((this.f685a.f770x & 4) != 0) {
                if (this.f687c == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    this.f687c = radioButton;
                    LinearLayout linearLayout = this.E;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f687c;
                view = this.f689e;
            } else {
                if (this.f689e == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    this.f689e = checkBox;
                    LinearLayout linearLayout2 = this.E;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f689e;
                view = this.f687c;
            }
            if (z10) {
                compoundButton.setChecked(this.f685a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f689e;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f687c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if ((this.f685a.f770x & 4) != 0) {
            if (this.f687c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
                this.f687c = radioButton;
                LinearLayout linearLayout = this.E;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f687c;
        } else {
            if (this.f689e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                this.f689e = checkBox;
                LinearLayout linearLayout2 = this.E;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f689e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.M = z10;
        this.I = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setVisibility((this.K || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f685a.f760n.getClass();
        boolean z10 = this.M;
        if (z10 || this.I) {
            ImageView imageView = this.f686b;
            if (imageView != null || drawable != null || this.I) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f686b = imageView2;
                    LinearLayout linearLayout = this.E;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.I) {
                    ImageView imageView3 = this.f686b;
                    if (!z10) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f686b.getVisibility() != 0) {
                        this.f686b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f686b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f688d.setText(charSequence);
            if (this.f688d.getVisibility() != 0) {
                this.f688d.setVisibility(0);
            }
        } else if (this.f688d.getVisibility() != 8) {
            this.f688d.setVisibility(8);
        }
    }
}
