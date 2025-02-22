package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import androidx.appcompat.widget.v0;
import com.quickkonnect.silencio.R;
import v1.d;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f1025b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static j f1026c;

    /* renamed from: a  reason: collision with root package name */
    public v0 f1027a;

    public class a implements v0.b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f1028a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f1029b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f1030c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f1031d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f1032e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f1033f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i8) {
            for (int i10 : iArr) {
                if (i10 == i8) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(Context context, int i8) {
            int c3 = c1.c(context, R.attr.colorControlHighlight);
            int b10 = c1.b(context, R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{c1.f957b, c1.f959d, c1.f958c, c1.f961f}, new int[]{b10, d.b(c3, i8), d.b(c3, i8), i8});
        }

        public static LayerDrawable c(v0 v0Var, Context context, int i8) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i8);
            Drawable e10 = v0Var.e(context, R.drawable.abc_star_black_48dp);
            Drawable e11 = v0Var.e(context, R.drawable.abc_star_half_black_48dp);
            if ((e10 instanceof BitmapDrawable) && e10.getIntrinsicWidth() == dimensionPixelSize && e10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) e10;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                e10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e10.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((e11 instanceof BitmapDrawable) && e11.getIntrinsicWidth() == dimensionPixelSize && e11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) e11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                e11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                e11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i8, PorterDuff.Mode mode) {
            int[] iArr = j0.f1034a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = j.f1025b;
            }
            mutate.setColorFilter(j.c(i8, mode));
        }

        public final ColorStateList d(Context context, int i8) {
            if (i8 == R.drawable.abc_edit_text_material) {
                return t1.a.b(context, R.color.abc_tint_edittext);
            }
            if (i8 == R.drawable.abc_switch_track_mtrl_alpha) {
                return t1.a.b(context, R.color.abc_tint_switch_track);
            }
            if (i8 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d10 = c1.d(context, R.attr.colorSwitchThumbNormal);
                if (d10 == null || !d10.isStateful()) {
                    iArr[0] = c1.f957b;
                    iArr2[0] = c1.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = c1.f960e;
                    iArr2[1] = c1.c(context, R.attr.colorControlActivated);
                    iArr[2] = c1.f961f;
                    iArr2[2] = c1.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    int[] iArr3 = c1.f957b;
                    iArr[0] = iArr3;
                    iArr2[0] = d10.getColorForState(iArr3, 0);
                    iArr[1] = c1.f960e;
                    iArr2[1] = c1.c(context, R.attr.colorControlActivated);
                    iArr[2] = c1.f961f;
                    iArr2[2] = d10.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i8 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, c1.c(context, R.attr.colorButtonNormal));
            } else {
                if (i8 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i8 == R.drawable.abc_btn_colored_material) {
                    return b(context, c1.c(context, R.attr.colorAccent));
                }
                if (i8 == R.drawable.abc_spinner_mtrl_am_alpha || i8 == R.drawable.abc_spinner_textfield_background_material) {
                    return t1.a.b(context, R.color.abc_tint_spinner);
                }
                if (a(this.f1029b, i8)) {
                    return c1.d(context, R.attr.colorControlNormal);
                }
                if (a(this.f1032e, i8)) {
                    return t1.a.b(context, R.color.abc_tint_default);
                }
                if (a(this.f1033f, i8)) {
                    return t1.a.b(context, R.color.abc_tint_btn_checkable);
                }
                if (i8 == R.drawable.abc_seekbar_thumb_material) {
                    return t1.a.b(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
        }
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f1026c == null) {
                d();
            }
            jVar = f1026c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter c(int i8, PorterDuff.Mode mode) {
        PorterDuffColorFilter g10;
        synchronized (j.class) {
            g10 = v0.g(i8, mode);
        }
        return g10;
    }

    public static synchronized void d() {
        synchronized (j.class) {
            if (f1026c == null) {
                j jVar = new j();
                f1026c = jVar;
                jVar.f1027a = v0.c();
                v0 v0Var = f1026c.f1027a;
                a aVar = new a();
                synchronized (v0Var) {
                    v0Var.f1131e = aVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, f1 f1Var, int[] iArr) {
        PorterDuff.Mode mode = v0.f1124f;
        int[] state = drawable.getState();
        int[] iArr2 = j0.f1034a;
        if (!(drawable.mutate() == drawable)) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = f1Var.f1000d;
        if (z10 || f1Var.f999c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z10 ? f1Var.f997a : null;
            PorterDuff.Mode mode2 = f1Var.f999c ? f1Var.f998b : v0.f1124f;
            if (!(colorStateList == null || mode2 == null)) {
                porterDuffColorFilter = v0.g(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        drawable.clearColorFilter();
    }

    public final synchronized Drawable b(Context context, int i8) {
        return this.f1027a.e(context, i8);
    }
}
