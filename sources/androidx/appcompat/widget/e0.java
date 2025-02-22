package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class e0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f980l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})
    public static final ConcurrentHashMap<String, Method> m = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f981a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f982b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f983c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f984d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f985e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f986f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f987g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f988h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f989i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f990j;

    /* renamed from: k  reason: collision with root package name */
    public final d f991k;

    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i8, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i8, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i8, int i10, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i8);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i10 == -1) {
                i10 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i10);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    public static class d extends f {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) e0.e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
        }
    }

    public static class e extends d {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) e0.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public e0(TextView textView) {
        this.f989i = textView;
        this.f990j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f991k = new e();
        } else {
            this.f991k = new d();
        }
    }

    public static int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (i8 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i8)) < 0) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = m;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        if (i() && this.f981a != 0) {
            if (this.f982b) {
                if (this.f989i.getMeasuredHeight() > 0 && this.f989i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f991k.b(this.f989i) ? 1048576 : (this.f989i.getMeasuredWidth() - this.f989i.getTotalPaddingLeft()) - this.f989i.getTotalPaddingRight();
                    int height = (this.f989i.getHeight() - this.f989i.getCompoundPaddingBottom()) - this.f989i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f980l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float c3 = (float) c(rectF);
                            if (c3 != this.f989i.getTextSize()) {
                                f(0, c3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f982b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        RectF rectF2 = rectF;
        int length = this.f986f.length;
        if (length != 0) {
            int i8 = length - 1;
            int i10 = 1;
            int i11 = 0;
            while (i10 <= i8) {
                int i12 = (i10 + i8) / 2;
                int i13 = this.f986f[i12];
                TextView textView = this.f989i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null)) {
                    text = transformation;
                }
                int b10 = a.b(textView);
                TextPaint textPaint = this.f988h;
                if (textPaint == null) {
                    this.f988h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f988h.set(textView.getPaint());
                this.f988h.setTextSize((float) i13);
                StaticLayout a10 = c.a(text, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF2.right), b10, this.f989i, this.f988h, this.f991k);
                if ((b10 == -1 || (a10.getLineCount() <= b10 && a10.getLineEnd(a10.getLineCount() - 1) == text.length())) && ((float) a10.getHeight()) <= rectF2.bottom) {
                    int i14 = i12 + 1;
                    i11 = i10;
                    i10 = i14;
                } else {
                    i11 = i12 - 1;
                    i8 = i11;
                }
            }
            return this.f986f[i11];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(int i8, float f10) {
        Context context = this.f990j;
        float applyDimension = TypedValue.applyDimension(i8, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f989i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a10 = b.a(textView);
            if (textView.getLayout() != null) {
                this.f982b = false;
                try {
                    Method d10 = d("nullLayouts");
                    if (d10 != null) {
                        d10.invoke(textView, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!a10) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (!i() || this.f981a != 1) {
            this.f982b = false;
        } else {
            if (!this.f987g || this.f986f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f985e - this.f984d) / this.f983c))) + 1;
                int[] iArr = new int[floor];
                for (int i8 = 0; i8 < floor; i8++) {
                    iArr[i8] = Math.round((((float) i8) * this.f983c) + this.f984d);
                }
                this.f986f = b(iArr);
            }
            this.f982b = true;
        }
        return this.f982b;
    }

    public final boolean h() {
        int[] iArr = this.f986f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f987g = z10;
        if (z10) {
            this.f981a = 1;
            this.f984d = (float) iArr[0];
            this.f985e = (float) iArr[length - 1];
            this.f983c = -1.0f;
        }
        return z10;
    }

    public final boolean i() {
        return !(this.f989i instanceof k);
    }

    public final void j(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f981a = 1;
            this.f984d = f10;
            this.f985e = f11;
            this.f983c = f12;
            this.f987g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }
}
