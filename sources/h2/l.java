package h2;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import b2.h;
import java.lang.reflect.Method;
import java.util.Locale;

public final class l {

    public static class a {
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static int b(View view) {
            return view.getLayoutDirection();
        }

        public static int c(View view) {
            return view.getTextDirection();
        }

        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        public static void f(TextView textView, int i8, int i10, int i11, int i12) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i8, i10, i11, i12);
        }

        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void h(View view, int i8) {
            view.setTextDirection(i8);
        }
    }

    public static class c {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int i8) {
            textView.setBreakStrategy(i8);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i8) {
            textView.setHyphenationFrequency(i8);
        }
    }

    public static class d {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    public static class e {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void c(TextView textView, int i8) {
            textView.setFirstBaselineToTopHeight(i8);
        }
    }

    public static class f implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f9105a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f9106b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f9107c;

        /* renamed from: d  reason: collision with root package name */
        public Method f9108d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9109e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f9110f = false;

        public f(ActionMode.Callback callback, TextView textView) {
            this.f9105a = callback;
            this.f9106b = textView;
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f9105a.onActionItemClicked(actionMode, menuItem);
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f9105a.onCreateActionMode(actionMode, menu);
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f9105a.onDestroyActionMode(actionMode);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x009f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
            /*
                r13 = this;
                android.widget.TextView r0 = r13.f9106b
                android.content.Context r1 = r0.getContext()
                android.content.pm.PackageManager r2 = r1.getPackageManager()
                boolean r3 = r13.f9110f
                r4 = 1
                java.lang.String r5 = "removeItemAt"
                r6 = 0
                if (r3 != 0) goto L_0x0032
                r13.f9110f = r4
                java.lang.String r3 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r13.f9107c = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r7[r6] = r8     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r13.f9108d = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r13.f9109e = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                goto L_0x0032
            L_0x002b:
                r3 = 0
                r13.f9107c = r3
                r13.f9108d = r3
                r13.f9109e = r6
            L_0x0032:
                boolean r3 = r13.f9109e     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                if (r3 == 0) goto L_0x0041
                java.lang.Class<?> r3 = r13.f9107c     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                boolean r3 = r3.isInstance(r15)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                if (r3 == 0) goto L_0x0041
                java.lang.reflect.Method r3 = r13.f9108d     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                goto L_0x004f
            L_0x0041:
                java.lang.Class r3 = r15.getClass()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                r7[r6] = r8     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r7)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
            L_0x004f:
                int r5 = r15.size()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                int r5 = r5 - r4
            L_0x0054:
                java.lang.String r7 = "android.intent.action.PROCESS_TEXT"
                if (r5 < 0) goto L_0x007e
                android.view.MenuItem r8 = r15.getItem(r5)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                android.content.Intent r9 = r8.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                if (r9 == 0) goto L_0x007b
                android.content.Intent r8 = r8.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                java.lang.String r8 = r8.getAction()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                boolean r7 = r7.equals(r8)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                if (r7 == 0) goto L_0x007b
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r5)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                r7[r6] = r8     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
                r3.invoke(r15, r7)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0127 }
            L_0x007b:
                int r5 = r5 + -1
                goto L_0x0054
            L_0x007e:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                boolean r5 = r1 instanceof android.app.Activity
                java.lang.String r8 = "text/plain"
                if (r5 != 0) goto L_0x008a
                goto L_0x00d5
            L_0x008a:
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                android.content.Intent r5 = r5.setAction(r7)
                android.content.Intent r5 = r5.setType(r8)
                java.util.List r5 = r2.queryIntentActivities(r5, r6)
                java.util.Iterator r5 = r5.iterator()
            L_0x009f:
                boolean r9 = r5.hasNext()
                if (r9 == 0) goto L_0x00d5
                java.lang.Object r9 = r5.next()
                android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9
                java.lang.String r10 = r1.getPackageName()
                android.content.pm.ActivityInfo r11 = r9.activityInfo
                java.lang.String r11 = r11.packageName
                boolean r10 = r10.equals(r11)
                if (r10 == 0) goto L_0x00ba
                goto L_0x00ce
            L_0x00ba:
                android.content.pm.ActivityInfo r10 = r9.activityInfo
                boolean r11 = r10.exported
                if (r11 != 0) goto L_0x00c1
                goto L_0x00cc
            L_0x00c1:
                java.lang.String r10 = r10.permission
                if (r10 == 0) goto L_0x00ce
                int r10 = r1.checkSelfPermission(r10)
                if (r10 != 0) goto L_0x00cc
                goto L_0x00ce
            L_0x00cc:
                r10 = r6
                goto L_0x00cf
            L_0x00ce:
                r10 = r4
            L_0x00cf:
                if (r10 == 0) goto L_0x009f
                r3.add(r9)
                goto L_0x009f
            L_0x00d5:
                r1 = r6
            L_0x00d6:
                int r5 = r3.size()
                if (r1 >= r5) goto L_0x0127
                java.lang.Object r5 = r3.get(r1)
                android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
                int r9 = r1 + 100
                java.lang.CharSequence r10 = r5.loadLabel(r2)
                android.view.MenuItem r9 = r15.add(r6, r6, r9, r10)
                android.content.Intent r10 = new android.content.Intent
                r10.<init>()
                android.content.Intent r10 = r10.setAction(r7)
                android.content.Intent r10 = r10.setType(r8)
                boolean r11 = r0 instanceof android.text.Editable
                if (r11 == 0) goto L_0x010b
                boolean r11 = r0.onCheckIsTextEditor()
                if (r11 == 0) goto L_0x010b
                boolean r11 = r0.isEnabled()
                if (r11 == 0) goto L_0x010b
                r11 = r4
                goto L_0x010c
            L_0x010b:
                r11 = r6
            L_0x010c:
                r11 = r11 ^ r4
                java.lang.String r12 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r10 = r10.putExtra(r12, r11)
                android.content.pm.ActivityInfo r5 = r5.activityInfo
                java.lang.String r11 = r5.packageName
                java.lang.String r5 = r5.name
                android.content.Intent r5 = r10.setClassName(r11, r5)
                android.view.MenuItem r5 = r9.setIntent(r5)
                r5.setShowAsAction(r4)
                int r1 = r1 + 1
                goto L_0x00d6
            L_0x0127:
                android.view.ActionMode$Callback r0 = r13.f9105a
                boolean r14 = r0.onPrepareActionMode(r14, r15)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.l.f.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    public static h.a a(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            return new h.a(e.b(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a10 = c.a(textView);
        int d10 = c.d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z10 = true;
            if (i8 < 28 || (textView.getInputType() & 15) != 3) {
                if (b.b(textView) != 1) {
                    z10 = false;
                }
                switch (b.c(textView)) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (!z10) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                }
            } else {
                byte directionality = Character.getDirectionality(e.a(d.a(b.d(textView)))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new h.a(textPaint, textDirectionHeuristic, a10, d10);
    }

    public static void b(TextView textView, int i8) {
        b7.a.p(i8);
        if (Build.VERSION.SDK_INT >= 28) {
            e.c(textView, i8);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = a.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i8 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i8 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i8) {
        b7.a.p(i8);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i10 = a.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i8 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i8 - i10);
        }
    }

    public static ActionMode.Callback d(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}
