package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import d2.c0;

public final class y {
    public static int a(Context context, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i8});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f2162a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f2163b;

        public a(Animation animation) {
            this.f2162a = animation;
            this.f2163b = null;
        }

        public a(Animator animator) {
            this.f2162a = null;
            this.f2163b = animator;
        }
    }

    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final ViewGroup f2164a;

        /* renamed from: b  reason: collision with root package name */
        public final View f2165b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2166c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2167d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2168e = true;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2164a = viewGroup;
            this.f2165b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public final boolean getTransformation(long j10, Transformation transformation) {
            this.f2168e = true;
            if (this.f2166c) {
                return !this.f2167d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2166c = true;
                c0.a(this.f2164a, this);
            }
            return true;
        }

        public final void run() {
            boolean z10 = this.f2166c;
            ViewGroup viewGroup = this.f2164a;
            if (z10 || !this.f2168e) {
                viewGroup.endViewTransition(this.f2165b);
                this.f2167d = true;
                return;
            }
            this.f2168e = false;
            viewGroup.post(this);
        }

        public final boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f2168e = true;
            if (this.f2166c) {
                return !this.f2167d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2166c = true;
                c0.a(this.f2164a, this);
            }
            return true;
        }
    }
}
