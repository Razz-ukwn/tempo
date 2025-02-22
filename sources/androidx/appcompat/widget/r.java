package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import w1.b;

public class r {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1115c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f1116a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f1117b;

    public r(ProgressBar progressBar) {
        this.f1116a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i8) {
        ProgressBar progressBar = this.f1116a;
        h1 m = h1.m(progressBar.getContext(), attributeSet, f1115c, i8);
        Drawable f10 = m.f(0);
        if (f10 != null) {
            if (f10 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f10;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i10 = 0; i10 < numberOfFrames; i10++) {
                    Drawable b10 = b(animationDrawable.getFrame(i10), true);
                    b10.setLevel(10000);
                    animationDrawable2.addFrame(b10, animationDrawable.getDuration(i10));
                }
                animationDrawable2.setLevel(10000);
                f10 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f10);
        }
        Drawable f11 = m.f(1);
        if (f11 != null) {
            progressBar.setProgressDrawable(b(f11, false));
        }
        m.n();
    }

    public final Drawable b(Drawable drawable, boolean z10) {
        if (drawable instanceof b) {
            b bVar = (b) drawable;
            Drawable b10 = bVar.b();
            if (b10 != null) {
                bVar.a(b(b10, z10));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i8 = 0; i8 < numberOfLayers; i8++) {
                int id2 = layerDrawable.getId(i8);
                drawableArr[i8] = b(layerDrawable.getDrawable(i8), id2 == 16908301 || id2 == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i10 = 0; i10 < numberOfLayers; i10++) {
                layerDrawable2.setId(i10, layerDrawable.getId(i10));
                layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
                layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
                layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
                layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
                layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
                layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
                layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
                layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
                layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1117b == null) {
                this.f1117b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
