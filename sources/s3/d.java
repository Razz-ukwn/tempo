package s3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import s3.g;
import u1.f;
import u1.k;
import w1.a;

public final class d extends f implements Animatable {
    public final a B;

    /* renamed from: b  reason: collision with root package name */
    public final b f14599b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f14600c;

    /* renamed from: d  reason: collision with root package name */
    public e f14601d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<c> f14602e;

    public class a implements Drawable.Callback {
        public a() {
        }

        public final void invalidateDrawable(Drawable drawable) {
            d.this.invalidateSelf();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            d.this.scheduleSelf(runnable, j10);
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            d.this.unscheduleSelf(runnable);
        }
    }

    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public g f14604a;

        /* renamed from: b  reason: collision with root package name */
        public AnimatorSet f14605b;

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<Animator> f14606c;

        /* renamed from: d  reason: collision with root package name */
        public o.a<Animator, String> f14607d;

        public b(a aVar) {
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public d() {
        this((Context) null);
    }

    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            a.b.a(drawable, theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            return a.b.b(drawable);
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f14599b;
        bVar.f14604a.draw(canvas);
        if (bVar.f14605b.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f14610a;
        return drawable != null ? a.C0303a.a(drawable) : this.f14599b.f14604a.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f14599b.getClass();
        return changingConfigurations | 0;
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f14610a;
        return drawable != null ? a.b.c(drawable) : this.f14599b.f14604a.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f14610a != null) {
            return new c(this.f14610a.getConstantState());
        }
        return null;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f14610a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f14599b.f14604a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f14610a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f14599b.f14604a.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.f14610a;
        return drawable != null ? drawable.getOpacity() : this.f14599b.f14604a.getOpacity();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar;
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            a.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            bVar = this.f14599b;
            if (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if ("animated-vector".equals(name)) {
                        TypedArray e10 = k.e(resources, theme, attributeSet, a.f14595e);
                        int resourceId = e10.getResourceId(0, 0);
                        if (resourceId != 0) {
                            g gVar = new g();
                            ThreadLocal<TypedValue> threadLocal = f.f15671a;
                            gVar.f14610a = f.a.a(resources, resourceId, theme);
                            new g.h(gVar.f14610a.getConstantState());
                            gVar.B = false;
                            gVar.setCallback(this.B);
                            g gVar2 = bVar.f14604a;
                            if (gVar2 != null) {
                                gVar2.setCallback((Drawable.Callback) null);
                            }
                            bVar.f14604a = gVar;
                        }
                        e10.recycle();
                    } else if ("target".equals(name)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f14596f);
                        String string = obtainAttributes.getString(0);
                        int resourceId2 = obtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.f14600c;
                            if (context != null) {
                                Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                                loadAnimator.setTarget(bVar.f14604a.f14611b.f14657b.f14655o.getOrDefault(string, null));
                                if (bVar.f14606c == null) {
                                    bVar.f14606c = new ArrayList<>();
                                    bVar.f14607d = new o.a<>();
                                }
                                bVar.f14606c.add(loadAnimator);
                                bVar.f14607d.put(loadAnimator, string);
                            } else {
                                obtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                        }
                        obtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
        }
        if (bVar.f14605b == null) {
            bVar.f14605b = new AnimatorSet();
        }
        bVar.f14605b.playTogether(bVar.f14606c);
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f14610a;
        return drawable != null ? a.C0303a.d(drawable) : this.f14599b.f14604a.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.f14610a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f14599b.f14605b.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.f14610a;
        return drawable != null ? drawable.isStateful() : this.f14599b.f14604a.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f14599b.f14604a.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i8) {
        Drawable drawable = this.f14610a;
        return drawable != null ? drawable.setLevel(i8) : this.f14599b.f14604a.setLevel(i8);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f14610a;
        return drawable != null ? drawable.setState(iArr) : this.f14599b.f14604a.setState(iArr);
    }

    public final void setAlpha(int i8) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.setAlpha(i8);
        } else {
            this.f14599b.f14604a.setAlpha(i8);
        }
    }

    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            a.C0303a.e(drawable, z10);
        } else {
            this.f14599b.f14604a.setAutoMirrored(z10);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f14599b.f14604a.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i8) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            w1.a.a(drawable, i8);
        } else {
            this.f14599b.f14604a.setTint(i8);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            w1.a.b(drawable, colorStateList);
        } else {
            this.f14599b.f14604a.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            w1.a.c(drawable, mode);
        } else {
            this.f14599b.f14604a.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f14599b.f14604a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    public final void start() {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f14599b;
        if (!bVar.f14605b.isStarted()) {
            bVar.f14605b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.f14610a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f14599b.f14605b.end();
        }
    }

    public d(Context context) {
        this.f14601d = null;
        this.f14602e = null;
        a aVar = new a();
        this.B = aVar;
        this.f14600c = context;
        this.f14599b = new b(aVar);
    }

    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f14608a;

        public c(Drawable.ConstantState constantState) {
            this.f14608a = constantState;
        }

        public final boolean canApplyTheme() {
            return this.f14608a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f14608a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            d dVar = new d();
            Drawable newDrawable = this.f14608a.newDrawable();
            dVar.f14610a = newDrawable;
            newDrawable.setCallback(dVar.B);
            return dVar;
        }

        public final Drawable newDrawable(Resources resources) {
            d dVar = new d();
            Drawable newDrawable = this.f14608a.newDrawable(resources);
            dVar.f14610a = newDrawable;
            newDrawable.setCallback(dVar.B);
            return dVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            Drawable newDrawable = this.f14608a.newDrawable(resources, theme);
            dVar.f14610a = newDrawable;
            newDrawable.setCallback(dVar.B);
            return dVar;
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
