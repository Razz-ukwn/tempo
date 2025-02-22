package q5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.List;
import r5.i;
import s5.a;
import s5.f;
import s5.k;
import w5.b;
import y5.d;
import y5.h;
import z5.c;
import z5.e;
import z5.g;

@SuppressLint({"RtlHardcoded"})
public abstract class a<T extends s5.a<? extends b<? extends f>>> extends b<T> implements v5.a {
    public final RectF A0 = new RectF();
    public final Matrix B0 = new Matrix();
    public final z5.b C0;
    public final z5.b D0;
    public final float[] E0;

    /* renamed from: b0  reason: collision with root package name */
    public int f12851b0 = 100;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f12852c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f12853d0 = false;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f12854e0 = true;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f12855f0 = true;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f12856g0 = true;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f12857h0 = true;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f12858i0 = true;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f12859j0 = true;

    /* renamed from: k0  reason: collision with root package name */
    public Paint f12860k0;

    /* renamed from: l0  reason: collision with root package name */
    public Paint f12861l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f12862m0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f12863n0 = false;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f12864o0 = false;

    /* renamed from: p0  reason: collision with root package name */
    public float f12865p0 = 15.0f;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f12866q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public i f12867r0;

    /* renamed from: s0  reason: collision with root package name */
    public i f12868s0;

    /* renamed from: t0  reason: collision with root package name */
    public y5.i f12869t0;

    /* renamed from: u0  reason: collision with root package name */
    public y5.i f12870u0;

    /* renamed from: v0  reason: collision with root package name */
    public e f12871v0;

    /* renamed from: w0  reason: collision with root package name */
    public e f12872w0;

    /* renamed from: x0  reason: collision with root package name */
    public h f12873x0;

    /* renamed from: y0  reason: collision with root package name */
    public long f12874y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public long f12875z0 = 0;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Matrix();
        this.C0 = z5.b.b(0.0d, 0.0d);
        this.D0 = z5.b.b(0.0d, 0.0d);
        this.E0 = new float[2];
    }

    public final e a(i.a aVar) {
        return aVar == i.a.f14064a ? this.f12871v0 : this.f12872w0;
    }

    public void b() {
        RectF rectF = this.A0;
        i(rectF);
        float f10 = rectF.left + 0.0f;
        float f11 = rectF.top + 0.0f;
        float f12 = rectF.right + 0.0f;
        float f13 = rectF.bottom + 0.0f;
        i iVar = this.f12867r0;
        boolean z10 = false;
        if (iVar.f14035a && iVar.f14027s && iVar.H == 1) {
            f10 += iVar.e(this.f12869t0.f17256e);
        }
        i iVar2 = this.f12868s0;
        if (iVar2.f14035a && iVar2.f14027s && iVar2.H == 1) {
            z10 = true;
        }
        if (z10) {
            f12 += iVar2.e(this.f12870u0.f17256e);
        }
        r5.h hVar = this.E;
        if (hVar.f14035a && hVar.f14027s) {
            float f14 = ((float) hVar.D) + hVar.f14037c;
            int i8 = hVar.E;
            if (i8 == 2) {
                f13 += f14;
            } else {
                if (i8 != 1) {
                    if (i8 == 3) {
                        f13 += f14;
                    }
                }
                f11 += f14;
            }
        }
        float extraTopOffset = getExtraTopOffset() + f11;
        float extraRightOffset = getExtraRightOffset() + f12;
        float extraBottomOffset = getExtraBottomOffset() + f13;
        float extraLeftOffset = getExtraLeftOffset() + f10;
        float c3 = z5.f.c(this.f12865p0);
        g gVar = this.N;
        gVar.f17756b.set(Math.max(c3, extraLeftOffset), Math.max(c3, extraTopOffset), gVar.f17757c - Math.max(c3, extraRightOffset), gVar.f17758d - Math.max(c3, extraBottomOffset));
        if (this.f12876a) {
            Log.i("MPAndroidChart", "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
            StringBuilder sb2 = new StringBuilder("Content: ");
            sb2.append(this.N.f17756b.toString());
            Log.i("MPAndroidChart", sb2.toString());
        }
        e eVar = this.f12872w0;
        this.f12868s0.getClass();
        eVar.g();
        e eVar2 = this.f12871v0;
        this.f12867r0.getClass();
        eVar2.g();
        k();
    }

    public final void computeScroll() {
        x5.b bVar = this.I;
        if (bVar instanceof x5.a) {
            x5.a aVar = (x5.a) bVar;
            c cVar = aVar.L;
            if (cVar.f17729b != 0.0f || cVar.f17730c != 0.0f) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f10 = cVar.f17729b;
                T t2 = aVar.f16967d;
                a aVar2 = (a) t2;
                cVar.f17729b = aVar2.getDragDecelerationFrictionCoef() * f10;
                float dragDecelerationFrictionCoef = aVar2.getDragDecelerationFrictionCoef() * cVar.f17730c;
                cVar.f17730c = dragDecelerationFrictionCoef;
                float f11 = ((float) (currentAnimationTimeMillis - aVar.J)) / 1000.0f;
                float f12 = cVar.f17729b * f11;
                float f13 = dragDecelerationFrictionCoef * f11;
                c cVar2 = aVar.K;
                float f14 = cVar2.f17729b + f12;
                cVar2.f17729b = f14;
                float f15 = cVar2.f17730c + f13;
                cVar2.f17730c = f15;
                a aVar3 = aVar2;
                MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f14, f15, 0);
                boolean z10 = aVar3.f12856g0;
                c cVar3 = aVar.C;
                float f16 = z10 ? cVar2.f17729b - cVar3.f17729b : 0.0f;
                float f17 = aVar3.f12857h0 ? cVar2.f17730c - cVar3.f17730c : 0.0f;
                aVar.f16963e.set(aVar.B);
                ((a) t2).getOnChartGestureListener();
                aVar.b();
                aVar.f16963e.postTranslate(f16, f17);
                obtain.recycle();
                g viewPortHandler = aVar3.getViewPortHandler();
                Matrix matrix = aVar.f16963e;
                viewPortHandler.k(matrix, t2, false);
                aVar.f16963e = matrix;
                aVar.J = currentAnimationTimeMillis;
                if (((double) Math.abs(cVar.f17729b)) >= 0.01d || ((double) Math.abs(cVar.f17730c)) >= 0.01d) {
                    DisplayMetrics displayMetrics = z5.f.f17746a;
                    t2.postInvalidateOnAnimation();
                    return;
                }
                aVar3.b();
                aVar3.postInvalidate();
                c cVar4 = aVar.L;
                cVar4.f17729b = 0.0f;
                cVar4.f17730c = 0.0f;
            }
        }
    }

    public void e() {
        super.e();
        this.f12867r0 = new i(i.a.f14064a);
        this.f12868s0 = new i(i.a.f14065b);
        this.f12871v0 = new e(this.N);
        this.f12872w0 = new e(this.N);
        this.f12869t0 = new y5.i(this.N, this.f12867r0, this.f12871v0);
        this.f12870u0 = new y5.i(this.N, this.f12868s0, this.f12872w0);
        this.f12873x0 = new h(this.N, this.E, this.f12871v0);
        setHighlighter(new u5.a(this));
        this.I = new x5.a(this, this.N.f17755a);
        Paint paint = new Paint();
        this.f12860k0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f12860k0.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.f12861l0 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f12861l0.setColor(-16777216);
        this.f12861l0.setStrokeWidth(z5.f.c(1.0f));
    }

    public final void f() {
        r5.e eVar;
        float f10;
        ArrayList arrayList;
        float f11;
        if (this.f12878b != null) {
            if (this.f12876a) {
                Log.i("MPAndroidChart", "Preparing...");
            }
            y5.c cVar = this.L;
            if (cVar != null) {
                cVar.k();
            }
            h();
            y5.i iVar = this.f12869t0;
            i iVar2 = this.f12867r0;
            iVar.f(iVar2.B, iVar2.A);
            y5.i iVar3 = this.f12870u0;
            i iVar4 = this.f12868s0;
            iVar3.f(iVar4.B, iVar4.A);
            h hVar = this.f12873x0;
            r5.h hVar2 = this.E;
            hVar.f(hVar2.B, hVar2.A);
            if (this.H != null) {
                d dVar = this.K;
                T t2 = this.f12878b;
                r5.e eVar2 = dVar.f17270d;
                eVar2.getClass();
                ArrayList arrayList2 = dVar.f17271e;
                arrayList2.clear();
                for (int i8 = 0; i8 < t2.c(); i8++) {
                    w5.d b10 = t2.b(i8);
                    List<Integer> I = b10.I();
                    int V = b10.V();
                    if (b10 instanceof w5.a) {
                        w5.a aVar = (w5.a) b10;
                        if (aVar.O()) {
                            String[] Q = aVar.Q();
                            int i10 = 0;
                            while (i10 < I.size() && i10 < aVar.J()) {
                                String str = Q[i10 % Q.length];
                                int b11 = b10.b();
                                float B = b10.B();
                                float x10 = b10.x();
                                b10.i();
                                arrayList2.add(new r5.f(str, b11, B, x10, (DashPathEffect) null, I.get(i10).intValue()));
                                i10++;
                            }
                            if (aVar.n() != null) {
                                arrayList2.add(new r5.f(b10.n(), 1, Float.NaN, Float.NaN, (DashPathEffect) null, 1122867));
                            }
                        }
                    }
                    if (b10 instanceof w5.h) {
                        w5.h hVar3 = (w5.h) b10;
                        int i11 = 0;
                        while (i11 < I.size() && i11 < V) {
                            ((k) hVar3.y(i11)).getClass();
                            int b12 = b10.b();
                            float B2 = b10.B();
                            float x11 = b10.x();
                            b10.i();
                            arrayList2.add(new r5.f((String) null, b12, B2, x11, (DashPathEffect) null, I.get(i11).intValue()));
                            i11++;
                        }
                        if (hVar3.n() != null) {
                            arrayList2.add(new r5.f(b10.n(), 1, Float.NaN, Float.NaN, (DashPathEffect) null, 1122867));
                        }
                    } else {
                        if (b10 instanceof w5.c) {
                            w5.c cVar2 = (w5.c) b10;
                            if (cVar2.d0() != 1122867) {
                                int d02 = cVar2.d0();
                                int R = cVar2.R();
                                int b13 = b10.b();
                                float B3 = b10.B();
                                float x12 = b10.x();
                                b10.i();
                                arrayList2.add(new r5.f((String) null, b13, B3, x12, (DashPathEffect) null, d02));
                                String n2 = b10.n();
                                int b14 = b10.b();
                                float B4 = b10.B();
                                float x13 = b10.x();
                                b10.i();
                                arrayList2.add(new r5.f(n2, b14, B4, x13, (DashPathEffect) null, R));
                            }
                        }
                        int i12 = 0;
                        while (i12 < I.size() && i12 < V) {
                            String n10 = (i12 >= I.size() - 1 || i12 >= V + -1) ? t2.b(i8).n() : null;
                            int b15 = b10.b();
                            float B5 = b10.B();
                            float x14 = b10.x();
                            b10.i();
                            arrayList2.add(new r5.f(n10, b15, B5, x14, (DashPathEffect) null, I.get(i12).intValue()));
                            i12++;
                        }
                    }
                }
                eVar2.f14042f = (r5.f[]) arrayList2.toArray(new r5.f[arrayList2.size()]);
                Paint paint = dVar.f17268b;
                paint.setTextSize(eVar2.f14038d);
                paint.setColor(eVar2.f14039e);
                g gVar = (g) dVar.f12427a;
                float f12 = eVar2.f14048l;
                float c3 = z5.f.c(f12);
                float c10 = z5.f.c(eVar2.f14051p);
                float f13 = eVar2.f14050o;
                float c11 = z5.f.c(f13);
                float c12 = z5.f.c(eVar2.f14049n);
                float c13 = z5.f.c(0.0f);
                r5.f[] fVarArr = eVar2.f14042f;
                int length = fVarArr.length;
                z5.f.c(f13);
                r5.f[] fVarArr2 = eVar2.f14042f;
                int length2 = fVarArr2.length;
                float f14 = 0.0f;
                float f15 = 0.0f;
                int i13 = 0;
                while (i13 < length2) {
                    r5.f fVar = fVarArr2[i13];
                    float c14 = z5.f.c(Float.isNaN(fVar.f14060c) ? f12 : fVar.f14060c);
                    if (c14 > f14) {
                        f14 = c14;
                    }
                    String str2 = fVar.f14058a;
                    if (str2 != null) {
                        float measureText = (float) ((int) paint.measureText(str2));
                        if (measureText > f15) {
                            f15 = measureText;
                        }
                    }
                    i13++;
                }
                float f16 = 0.0f;
                for (r5.f fVar2 : eVar2.f14042f) {
                    String str3 = fVar2.f14058a;
                    if (str3 != null) {
                        float a10 = (float) z5.f.a(paint, str3);
                        if (a10 > f16) {
                            f16 = a10;
                        }
                    }
                }
                int c15 = q.g.c(eVar2.f14045i);
                if (c15 == 0) {
                    float f17 = c3;
                    Paint.FontMetrics fontMetrics = z5.f.f17750e;
                    paint.getFontMetrics(fontMetrics);
                    float f18 = fontMetrics.descent - fontMetrics.ascent;
                    paint.getFontMetrics(fontMetrics);
                    float f19 = (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom + c13;
                    gVar.a();
                    ArrayList arrayList3 = eVar2.f14056u;
                    arrayList3.clear();
                    ArrayList arrayList4 = eVar2.f14055t;
                    arrayList4.clear();
                    ArrayList arrayList5 = eVar2.f14057v;
                    arrayList5.clear();
                    float f20 = c12;
                    float f21 = 0.0f;
                    int i14 = -1;
                    int i15 = 0;
                    float f22 = 0.0f;
                    float f23 = 0.0f;
                    while (i15 < length) {
                        r5.f fVar3 = fVarArr[i15];
                        r5.f[] fVarArr3 = fVarArr;
                        float f24 = f19;
                        boolean z10 = fVar3.f14059b != 1;
                        float f25 = fVar3.f14060c;
                        if (Float.isNaN(f25)) {
                            eVar = eVar2;
                            f10 = f17;
                        } else {
                            f10 = z5.f.c(f25);
                            eVar = eVar2;
                        }
                        arrayList3.add(Boolean.FALSE);
                        float f26 = i14 == -1 ? 0.0f : f21 + c10;
                        String str4 = fVar3.f14058a;
                        if (str4 != null) {
                            arrayList4.add(z5.f.b(paint, str4));
                            arrayList = arrayList3;
                            f21 = f26 + (z10 ? f10 + c11 : 0.0f) + ((z5.a) arrayList4.get(i15)).f17723b;
                        } else {
                            arrayList = arrayList3;
                            arrayList4.add(z5.a.b(0.0f, 0.0f));
                            if (!z10) {
                                f10 = 0.0f;
                            }
                            f21 = f26 + f10;
                            if (i14 == -1) {
                                i14 = i15;
                            }
                        }
                        if (str4 != null || i15 == length - 1) {
                            float f27 = (f23 == 0.0f ? 0.0f : f20) + f21 + f23;
                            if (i15 == length - 1) {
                                arrayList5.add(z5.a.b(f27, f18));
                                f22 = Math.max(f22, f27);
                            }
                            f23 = f27;
                        }
                        if (str4 != null) {
                            i14 = -1;
                        }
                        i15++;
                        fVarArr = fVarArr3;
                        f19 = f24;
                        eVar2 = eVar;
                        arrayList3 = arrayList;
                    }
                    float f28 = f19;
                    eVar2.f14053r = f22;
                    eVar2.f14054s = (f28 * ((float) (arrayList5.size() == 0 ? 0 : arrayList5.size() - 1))) + (f18 * ((float) arrayList5.size()));
                } else if (c15 == 1) {
                    Paint.FontMetrics fontMetrics2 = z5.f.f17750e;
                    paint.getFontMetrics(fontMetrics2);
                    float f29 = fontMetrics2.descent - fontMetrics2.ascent;
                    float f30 = 0.0f;
                    float f31 = 0.0f;
                    float f32 = 0.0f;
                    int i16 = 0;
                    boolean z11 = false;
                    while (i16 < length) {
                        r5.f fVar4 = fVarArr[i16];
                        float f33 = f32;
                        boolean z12 = fVar4.f14059b != 1;
                        float f34 = fVar4.f14060c;
                        float c16 = Float.isNaN(f34) ? c3 : z5.f.c(f34);
                        if (!z11) {
                            f33 = 0.0f;
                        }
                        if (z12) {
                            if (z11) {
                                f33 += c10;
                            }
                            f33 += c16;
                        }
                        float f35 = c3;
                        float f36 = f33;
                        String str5 = fVar4.f14058a;
                        if (str5 != null) {
                            if (z12 && !z11) {
                                f11 = f36 + c11;
                            } else if (z11) {
                                f30 = Math.max(f30, f36);
                                f31 += f29 + c13;
                                f11 = 0.0f;
                                z11 = false;
                            } else {
                                f11 = f36;
                            }
                            f32 = f11 + ((float) ((int) paint.measureText(str5)));
                            if (i16 < length - 1) {
                                f31 = f29 + c13 + f31;
                            }
                        } else {
                            float f37 = f36 + c16;
                            if (i16 < length - 1) {
                                f37 += c10;
                            }
                            f32 = f37;
                            z11 = true;
                        }
                        f30 = Math.max(f30, f32);
                        i16++;
                        c3 = f35;
                    }
                    eVar2.f14053r = f30;
                    eVar2.f14054s = f31;
                }
                eVar2.f14054s += eVar2.f14037c;
                eVar2.f14053r += eVar2.f14036b;
            }
            b();
        } else if (this.f12876a) {
            Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
        }
    }

    public i getAxisLeft() {
        return this.f12867r0;
    }

    public i getAxisRight() {
        return this.f12868s0;
    }

    public /* bridge */ /* synthetic */ s5.a getData() {
        return (s5.a) super.getData();
    }

    public x5.e getDrawListener() {
        return null;
    }

    public float getHighestVisibleX() {
        e a10 = a(i.a.f14064a);
        RectF rectF = this.N.f17756b;
        float f10 = rectF.right;
        float f11 = rectF.bottom;
        z5.b bVar = this.D0;
        a10.c(f10, f11, bVar);
        return (float) Math.min((double) this.E.A, bVar.f17726b);
    }

    public float getLowestVisibleX() {
        e a10 = a(i.a.f14064a);
        RectF rectF = this.N.f17756b;
        float f10 = rectF.left;
        float f11 = rectF.bottom;
        z5.b bVar = this.C0;
        a10.c(f10, f11, bVar);
        return (float) Math.max((double) this.E.B, bVar.f17726b);
    }

    public int getMaxVisibleCount() {
        return this.f12851b0;
    }

    public float getMinOffset() {
        return this.f12865p0;
    }

    public y5.i getRendererLeftYAxis() {
        return this.f12869t0;
    }

    public y5.i getRendererRightYAxis() {
        return this.f12870u0;
    }

    public h getRendererXAxis() {
        return this.f12873x0;
    }

    public float getScaleX() {
        g gVar = this.N;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f17763i;
    }

    public float getScaleY() {
        g gVar = this.N;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f17764j;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    public float getYChartMax() {
        return Math.max(this.f12867r0.A, this.f12868s0.A);
    }

    public float getYChartMin() {
        return Math.min(this.f12867r0.B, this.f12868s0.B);
    }

    public void h() {
        r5.h hVar = this.E;
        T t2 = this.f12878b;
        hVar.a(((s5.a) t2).f14724d, ((s5.a) t2).f14723c);
        i iVar = this.f12867r0;
        i.a aVar = i.a.f14064a;
        iVar.a(((s5.a) this.f12878b).f(aVar), ((s5.a) this.f12878b).e(aVar));
        i iVar2 = this.f12868s0;
        i.a aVar2 = i.a.f14065b;
        iVar2.a(((s5.a) this.f12878b).f(aVar2), ((s5.a) this.f12878b).e(aVar2));
    }

    public final void i(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        r5.e eVar = this.H;
        if (eVar != null && eVar.f14035a) {
            int c3 = q.g.c(eVar.f14045i);
            if (c3 == 0) {
                int c10 = q.g.c(this.H.f14044h);
                if (c10 == 0) {
                    float f10 = rectF.top;
                    r5.e eVar2 = this.H;
                    rectF.top = Math.min(eVar2.f14054s, this.N.f17758d * eVar2.f14052q) + this.H.f14037c + f10;
                } else if (c10 == 2) {
                    float f11 = rectF.bottom;
                    r5.e eVar3 = this.H;
                    rectF.bottom = Math.min(eVar3.f14054s, this.N.f17758d * eVar3.f14052q) + this.H.f14037c + f11;
                }
            } else if (c3 == 1) {
                int c11 = q.g.c(this.H.f14043g);
                if (c11 == 0) {
                    float f12 = rectF.left;
                    r5.e eVar4 = this.H;
                    rectF.left = Math.min(eVar4.f14053r, this.N.f17757c * eVar4.f14052q) + this.H.f14036b + f12;
                } else if (c11 == 1) {
                    int c12 = q.g.c(this.H.f14044h);
                    if (c12 == 0) {
                        float f13 = rectF.top;
                        r5.e eVar5 = this.H;
                        rectF.top = Math.min(eVar5.f14054s, this.N.f17758d * eVar5.f14052q) + this.H.f14037c + f13;
                    } else if (c12 == 2) {
                        float f14 = rectF.bottom;
                        r5.e eVar6 = this.H;
                        rectF.bottom = Math.min(eVar6.f14054s, this.N.f17758d * eVar6.f14052q) + this.H.f14037c + f14;
                    }
                } else if (c11 == 2) {
                    float f15 = rectF.right;
                    r5.e eVar7 = this.H;
                    rectF.right = Math.min(eVar7.f14053r, this.N.f17757c * eVar7.f14052q) + this.H.f14036b + f15;
                }
            }
        }
    }

    public final void j(i.a aVar) {
        (aVar == i.a.f14064a ? this.f12867r0 : this.f12868s0).getClass();
    }

    public void k() {
        if (this.f12876a) {
            Log.i("MPAndroidChart", "Preparing Value-Px Matrix, xmin: " + this.E.B + ", xmax: " + this.E.A + ", xdelta: " + this.E.C);
        }
        e eVar = this.f12872w0;
        r5.h hVar = this.E;
        float f10 = hVar.B;
        float f11 = hVar.C;
        i iVar = this.f12868s0;
        eVar.h(f10, f11, iVar.C, iVar.B);
        e eVar2 = this.f12871v0;
        r5.h hVar2 = this.E;
        float f12 = hVar2.B;
        float f13 = hVar2.C;
        i iVar2 = this.f12867r0;
        eVar2.h(f12, f13, iVar2.C, iVar2.B);
    }

    public final void l() {
        float f10 = this.E.C / 30.0f;
        g gVar = this.N;
        gVar.getClass();
        float f11 = 1.0f;
        if (f10 >= 1.0f) {
            f11 = f10;
        }
        if (f10 == 0.0f) {
            f10 = Float.MAX_VALUE;
        }
        gVar.f17761g = f11;
        gVar.f17762h = f10;
        gVar.i(gVar.f17755a, gVar.f17756b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r37) {
        /*
            r36 = this;
            r0 = r36
            r7 = r37
            super.onDraw(r37)
            T r1 = r0.f12878b
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            long r8 = java.lang.System.currentTimeMillis()
            boolean r1 = r0.f12862m0
            if (r1 == 0) goto L_0x001d
            z5.g r1 = r0.N
            android.graphics.RectF r1 = r1.f17756b
            android.graphics.Paint r2 = r0.f12860k0
            r7.drawRect(r1, r2)
        L_0x001d:
            boolean r1 = r0.f12863n0
            if (r1 == 0) goto L_0x002a
            z5.g r1 = r0.N
            android.graphics.RectF r1 = r1.f17756b
            android.graphics.Paint r2 = r0.f12861l0
            r7.drawRect(r1, r2)
        L_0x002a:
            boolean r1 = r0.f12852c0
            if (r1 == 0) goto L_0x0099
            float r1 = r36.getLowestVisibleX()
            float r2 = r36.getHighestVisibleX()
            T r3 = r0.f12878b
            s5.a r3 = (s5.a) r3
            java.util.ArrayList r4 = r3.f14729i
            java.util.Iterator r4 = r4.iterator()
        L_0x0040:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0050
            java.lang.Object r5 = r4.next()
            w5.d r5 = (w5.d) r5
            r5.K(r1, r2)
            goto L_0x0040
        L_0x0050:
            r3.a()
            r5.h r1 = r0.E
            T r2 = r0.f12878b
            s5.a r2 = (s5.a) r2
            float r3 = r2.f14724d
            float r2 = r2.f14723c
            r1.a(r3, r2)
            r5.i r1 = r0.f12867r0
            boolean r2 = r1.f14035a
            if (r2 == 0) goto L_0x007b
            T r2 = r0.f12878b
            s5.a r2 = (s5.a) r2
            r5.i$a r3 = r5.i.a.f14064a
            float r2 = r2.f(r3)
            T r4 = r0.f12878b
            s5.a r4 = (s5.a) r4
            float r3 = r4.e(r3)
            r1.a(r2, r3)
        L_0x007b:
            r5.i r1 = r0.f12868s0
            boolean r2 = r1.f14035a
            if (r2 == 0) goto L_0x0096
            T r2 = r0.f12878b
            s5.a r2 = (s5.a) r2
            r5.i$a r3 = r5.i.a.f14065b
            float r2 = r2.f(r3)
            T r4 = r0.f12878b
            s5.a r4 = (s5.a) r4
            float r3 = r4.e(r3)
            r1.a(r2, r3)
        L_0x0096:
            r36.b()
        L_0x0099:
            r5.i r1 = r0.f12867r0
            boolean r2 = r1.f14035a
            if (r2 == 0) goto L_0x00a8
            y5.i r2 = r0.f12869t0
            float r3 = r1.B
            float r1 = r1.A
            r2.f(r3, r1)
        L_0x00a8:
            r5.i r1 = r0.f12868s0
            boolean r2 = r1.f14035a
            if (r2 == 0) goto L_0x00b7
            y5.i r2 = r0.f12870u0
            float r3 = r1.B
            float r1 = r1.A
            r2.f(r3, r1)
        L_0x00b7:
            r5.h r1 = r0.E
            boolean r2 = r1.f14035a
            if (r2 == 0) goto L_0x00c6
            y5.h r2 = r0.f12873x0
            float r3 = r1.B
            float r1 = r1.A
            r2.f(r3, r1)
        L_0x00c6:
            y5.h r1 = r0.f12873x0
            r1.n(r7)
            y5.i r1 = r0.f12869t0
            r1.m(r7)
            y5.i r1 = r0.f12870u0
            r1.m(r7)
            r5.h r1 = r0.E
            boolean r1 = r1.f14030v
            if (r1 == 0) goto L_0x00e0
            y5.h r1 = r0.f12873x0
            r1.o(r7)
        L_0x00e0:
            r5.i r1 = r0.f12867r0
            boolean r1 = r1.f14030v
            if (r1 == 0) goto L_0x00eb
            y5.i r1 = r0.f12869t0
            r1.n(r7)
        L_0x00eb:
            r5.i r1 = r0.f12868s0
            boolean r1 = r1.f14030v
            if (r1 == 0) goto L_0x00f6
            y5.i r1 = r0.f12870u0
            r1.n(r7)
        L_0x00f6:
            r5.h r1 = r0.E
            boolean r1 = r1.f14035a
            r5.i r1 = r0.f12867r0
            boolean r1 = r1.f14035a
            r5.i r1 = r0.f12868s0
            boolean r1 = r1.f14035a
            int r1 = r37.save()
            z5.g r2 = r0.N
            android.graphics.RectF r2 = r2.f17756b
            r7.clipRect(r2)
            y5.c r2 = r0.L
            r2.g(r7)
            r5.h r2 = r0.E
            boolean r2 = r2.f14030v
            if (r2 != 0) goto L_0x011d
            y5.h r2 = r0.f12873x0
            r2.o(r7)
        L_0x011d:
            r5.i r2 = r0.f12867r0
            boolean r2 = r2.f14030v
            if (r2 != 0) goto L_0x0128
            y5.i r2 = r0.f12869t0
            r2.n(r7)
        L_0x0128:
            r5.i r2 = r0.f12868s0
            boolean r2 = r2.f14030v
            if (r2 != 0) goto L_0x0133
            y5.i r2 = r0.f12870u0
            r2.n(r7)
        L_0x0133:
            u5.b[] r2 = r0.U
            r10 = 0
            if (r2 == 0) goto L_0x0142
            int r3 = r2.length
            if (r3 <= 0) goto L_0x0142
            r3 = r2[r10]
            if (r3 != 0) goto L_0x0140
            goto L_0x0142
        L_0x0140:
            r3 = 1
            goto L_0x0143
        L_0x0142:
            r3 = r10
        L_0x0143:
            if (r3 == 0) goto L_0x014a
            y5.c r3 = r0.L
            r3.i(r7, r2)
        L_0x014a:
            r7.restoreToCount(r1)
            y5.c r1 = r0.L
            r1.h(r7)
            r5.h r1 = r0.E
            boolean r1 = r1.f14035a
            if (r1 == 0) goto L_0x015d
            y5.h r1 = r0.f12873x0
            r1.p(r7)
        L_0x015d:
            r5.i r1 = r0.f12867r0
            boolean r1 = r1.f14035a
            if (r1 == 0) goto L_0x0168
            y5.i r1 = r0.f12869t0
            r1.o(r7)
        L_0x0168:
            r5.i r1 = r0.f12868s0
            boolean r1 = r1.f14035a
            if (r1 == 0) goto L_0x0173
            y5.i r1 = r0.f12870u0
            r1.o(r7)
        L_0x0173:
            y5.h r1 = r0.f12873x0
            r1.m(r7)
            y5.i r1 = r0.f12869t0
            r1.l(r7)
            y5.i r1 = r0.f12870u0
            r1.l(r7)
            boolean r1 = r0.f12864o0
            if (r1 == 0) goto L_0x019a
            int r1 = r37.save()
            z5.g r2 = r0.N
            android.graphics.RectF r2 = r2.f17756b
            r7.clipRect(r2)
            y5.c r2 = r0.L
            r2.j(r7)
            r7.restoreToCount(r1)
            goto L_0x019f
        L_0x019a:
            y5.c r1 = r0.L
            r1.j(r7)
        L_0x019f:
            y5.d r12 = r0.K
            r5.e r1 = r12.f17270d
            boolean r2 = r1.f14035a
            if (r2 != 0) goto L_0x01ab
            r21 = r8
            goto L_0x04eb
        L_0x01ab:
            android.graphics.Paint r13 = r12.f17268b
            float r2 = r1.f14038d
            r13.setTextSize(r2)
            int r2 = r1.f14039e
            r13.setColor(r2)
            android.graphics.Paint$FontMetrics r2 = r12.f17272f
            android.util.DisplayMetrics r3 = z5.f.f17746a
            r13.getFontMetrics(r2)
            float r3 = r2.descent
            float r4 = r2.ascent
            float r14 = r3 - r4
            r13.getFontMetrics(r2)
            float r3 = r2.ascent
            float r4 = r2.top
            float r3 = r3 - r4
            float r2 = r2.bottom
            float r3 = r3 + r2
            r15 = 0
            float r2 = z5.f.c(r15)
            float r16 = r2 + r3
            java.lang.String r2 = "ABC"
            int r2 = z5.f.a(r13, r2)
            float r2 = (float) r2
            r17 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r17
            float r18 = r14 - r2
            r5.f[] r6 = r1.f14042f
            float r2 = r1.f14050o
            float r5 = z5.f.c(r2)
            float r2 = r1.f14049n
            float r4 = z5.f.c(r2)
            float r2 = r1.f14048l
            float r19 = z5.f.c(r2)
            float r2 = r1.f14051p
            float r3 = z5.f.c(r2)
            float r2 = r1.f14037c
            float r10 = r1.f14036b
            int r15 = r1.f14043g
            int r11 = q.g.c(r15)
            r21 = r8
            int r9 = r1.f14045i
            int r8 = r1.f14046j
            r23 = r3
            java.lang.Object r3 = r12.f12427a
            if (r11 == 0) goto L_0x0291
            r24 = r4
            r4 = 1
            if (r11 == r4) goto L_0x0243
            r4 = 2
            if (r11 == r4) goto L_0x0224
            r27 = r5
            r28 = r13
            r29 = r14
            r10 = 0
            goto L_0x02ab
        L_0x0224:
            if (r9 != r4) goto L_0x022c
            r4 = r3
            z5.g r4 = (z5.g) r4
            float r4 = r4.f17757c
            goto L_0x0233
        L_0x022c:
            r4 = r3
            z5.g r4 = (z5.g) r4
            android.graphics.RectF r4 = r4.f17756b
            float r4 = r4.right
        L_0x0233:
            float r4 = r4 - r10
            r10 = 1
            if (r8 != r10) goto L_0x023a
            float r10 = r1.f14053r
            float r4 = r4 - r10
        L_0x023a:
            r10 = r4
            r27 = r5
            r28 = r13
            r29 = r14
            goto L_0x02ab
        L_0x0243:
            r4 = 2
            if (r9 != r4) goto L_0x024e
            r4 = r3
            z5.g r4 = (z5.g) r4
            float r4 = r4.f17757c
            float r4 = r4 / r17
            goto L_0x025c
        L_0x024e:
            r4 = r3
            z5.g r4 = (z5.g) r4
            android.graphics.RectF r11 = r4.f17756b
            float r11 = r11.left
            float r4 = r4.a()
            float r4 = r4 / r17
            float r4 = r4 + r11
        L_0x025c:
            r11 = 1
            if (r8 != r11) goto L_0x0261
            r11 = r10
            goto L_0x0262
        L_0x0261:
            float r11 = -r10
        L_0x0262:
            float r4 = r4 + r11
            r11 = 2
            if (r9 != r11) goto L_0x028a
            r11 = r5
            double r4 = (double) r4
            r25 = 4611686018427387904(0x4000000000000000, double:2.0)
            r27 = r11
            r11 = 1
            if (r8 != r11) goto L_0x027c
            float r11 = r1.f14053r
            float r11 = -r11
            r28 = r13
            r29 = r14
            double r13 = (double) r11
            double r13 = r13 / r25
            double r10 = (double) r10
            double r13 = r13 + r10
            goto L_0x0287
        L_0x027c:
            r28 = r13
            r29 = r14
            float r11 = r1.f14053r
            double r13 = (double) r11
            double r13 = r13 / r25
            double r10 = (double) r10
            double r13 = r13 - r10
        L_0x0287:
            double r4 = r4 + r13
            float r4 = (float) r4
            goto L_0x02aa
        L_0x028a:
            r27 = r5
            r28 = r13
            r29 = r14
            goto L_0x02aa
        L_0x0291:
            r24 = r4
            r27 = r5
            r28 = r13
            r29 = r14
            r4 = 2
            if (r9 != r4) goto L_0x029d
            goto L_0x02a5
        L_0x029d:
            r5 = r3
            z5.g r5 = (z5.g) r5
            android.graphics.RectF r5 = r5.f17756b
            float r5 = r5.left
            float r10 = r10 + r5
        L_0x02a5:
            if (r8 != r4) goto L_0x02ab
            float r4 = r1.f14053r
            float r4 = r4 + r10
        L_0x02aa:
            r10 = r4
        L_0x02ab:
            int r4 = q.g.c(r9)
            int r5 = r1.f14044h
            if (r4 == 0) goto L_0x03a7
            r9 = 1
            if (r4 == r9) goto L_0x02b8
            goto L_0x04eb
        L_0x02b8:
            int r4 = q.g.c(r5)
            if (r4 == 0) goto L_0x02e7
            if (r4 == r9) goto L_0x02d7
            r5 = 2
            if (r4 == r5) goto L_0x02c5
            r3 = 0
            goto L_0x02f4
        L_0x02c5:
            if (r15 != r5) goto L_0x02cc
            z5.g r3 = (z5.g) r3
            float r3 = r3.f17758d
            goto L_0x02d2
        L_0x02cc:
            z5.g r3 = (z5.g) r3
            android.graphics.RectF r3 = r3.f17756b
            float r3 = r3.bottom
        L_0x02d2:
            float r1 = r1.f14054s
            float r1 = r1 + r2
            float r3 = r3 - r1
            goto L_0x02f4
        L_0x02d7:
            z5.g r3 = (z5.g) r3
            float r2 = r3.f17758d
            float r2 = r2 / r17
            float r3 = r1.f14054s
            float r3 = r3 / r17
            float r2 = r2 - r3
            float r1 = r1.f14037c
            float r3 = r2 + r1
            goto L_0x02f4
        L_0x02e7:
            r1 = 2
            if (r15 != r1) goto L_0x02ec
            r1 = 0
            goto L_0x02f2
        L_0x02ec:
            z5.g r3 = (z5.g) r3
            android.graphics.RectF r1 = r3.f17756b
            float r1 = r1.top
        L_0x02f2:
            float r3 = r1 + r2
        L_0x02f4:
            r9 = r3
            r11 = 0
            r13 = 0
            r14 = 0
        L_0x02f8:
            int r1 = r6.length
            if (r13 >= r1) goto L_0x04e9
            r15 = r6[r13]
            int r1 = r15.f14059b
            r2 = 1
            if (r1 == r2) goto L_0x0305
            r17 = r2
            goto L_0x0307
        L_0x0305:
            r17 = 0
        L_0x0307:
            float r1 = r15.f14060c
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 == 0) goto L_0x0312
            r24 = r19
            goto L_0x0318
        L_0x0312:
            float r1 = z5.f.c(r1)
            r24 = r1
        L_0x0318:
            if (r17 == 0) goto L_0x0345
            if (r8 != r2) goto L_0x031f
            float r1 = r10 + r14
            goto L_0x0323
        L_0x031f:
            float r1 = r24 - r14
            float r1 = r10 - r1
        L_0x0323:
            r25 = r1
            float r4 = r9 + r18
            r5.e r5 = r12.f17270d
            r1 = r12
            r2 = r37
            r0 = r23
            r3 = r25
            r26 = r5
            r23 = r12
            r12 = r27
            r5 = r15
            r27 = r10
            r10 = r6
            r6 = r26
            r1.f(r2, r3, r4, r5, r6)
            r1 = 1
            if (r8 != r1) goto L_0x0351
            float r25 = r25 + r24
            goto L_0x0351
        L_0x0345:
            r1 = r2
            r0 = r23
            r23 = r12
            r12 = r27
            r27 = r10
            r10 = r6
            r25 = r27
        L_0x0351:
            java.lang.String r2 = r15.f14058a
            if (r2 == 0) goto L_0x038d
            if (r17 == 0) goto L_0x0361
            if (r11 != 0) goto L_0x0361
            if (r8 != r1) goto L_0x035d
            r5 = r12
            goto L_0x035e
        L_0x035d:
            float r5 = -r12
        L_0x035e:
            float r25 = r25 + r5
            goto L_0x0365
        L_0x0361:
            if (r11 == 0) goto L_0x0365
            r25 = r27
        L_0x0365:
            r1 = 2
            if (r8 != r1) goto L_0x0373
            r6 = r28
            float r1 = r6.measureText(r2)
            int r1 = (int) r1
            float r1 = (float) r1
            float r25 = r25 - r1
            goto L_0x0375
        L_0x0373:
            r6 = r28
        L_0x0375:
            r1 = r25
            if (r11 != 0) goto L_0x037f
            float r14 = r9 + r29
            r7.drawText(r2, r1, r14, r6)
            goto L_0x0387
        L_0x037f:
            float r14 = r29 + r16
            float r9 = r9 + r14
            float r14 = r9 + r29
            r7.drawText(r2, r1, r14, r6)
        L_0x0387:
            float r14 = r29 + r16
            float r14 = r14 + r9
            r9 = r14
            r14 = 0
            goto L_0x0396
        L_0x038d:
            r6 = r28
            float r24 = r24 + r0
            float r24 = r24 + r14
            r14 = r24
            r11 = 1
        L_0x0396:
            int r13 = r13 + 1
            r28 = r6
            r6 = r10
            r10 = r27
            r27 = r12
            r12 = r23
            r23 = r0
            r0 = r36
            goto L_0x02f8
        L_0x03a7:
            r0 = r23
            r23 = r12
            r12 = r27
            r27 = r10
            r10 = r6
            r6 = r28
            java.util.ArrayList r9 = r1.f14057v
            java.util.ArrayList r11 = r1.f14055t
            java.util.ArrayList r13 = r1.f14056u
            int r4 = q.g.c(r5)
            if (r4 == 0) goto L_0x03dc
            r5 = 1
            if (r4 == r5) goto L_0x03d0
            r5 = 2
            if (r4 == r5) goto L_0x03c6
            r1 = 0
            goto L_0x03dd
        L_0x03c6:
            z5.g r3 = (z5.g) r3
            float r3 = r3.f17758d
            float r3 = r3 - r2
            float r1 = r1.f14054s
            float r1 = r3 - r1
            goto L_0x03dd
        L_0x03d0:
            z5.g r3 = (z5.g) r3
            float r3 = r3.f17758d
            float r1 = r1.f14054s
            float r3 = r3 - r1
            float r3 = r3 / r17
            float r1 = r3 + r2
            goto L_0x03dd
        L_0x03dc:
            r1 = r2
        L_0x03dd:
            int r14 = r10.length
            r2 = r27
            r3 = 0
            r5 = 0
        L_0x03e2:
            if (r5 >= r14) goto L_0x04e9
            r4 = r10[r5]
            r20 = r2
            int r2 = r4.f14059b
            r28 = r6
            r6 = 1
            if (r2 == r6) goto L_0x03f2
            r25 = 1
            goto L_0x03f4
        L_0x03f2:
            r25 = 0
        L_0x03f4:
            float r2 = r4.f14060c
            boolean r6 = java.lang.Float.isNaN(r2)
            if (r6 == 0) goto L_0x03ff
            r26 = r19
            goto L_0x0405
        L_0x03ff:
            float r2 = z5.f.c(r2)
            r26 = r2
        L_0x0405:
            int r2 = r13.size()
            if (r5 >= r2) goto L_0x041f
            java.lang.Object r2 = r13.get(r5)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x041f
            float r2 = r29 + r16
            float r2 = r2 + r1
            r20 = r2
            r2 = r27
            goto L_0x0423
        L_0x041f:
            r2 = r20
            r20 = r1
        L_0x0423:
            int r1 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r1 != 0) goto L_0x0449
            r1 = 2
            if (r15 != r1) goto L_0x0449
            int r6 = r9.size()
            if (r3 >= r6) goto L_0x0449
            if (r8 != r1) goto L_0x043b
            java.lang.Object r1 = r9.get(r3)
            z5.a r1 = (z5.a) r1
            float r1 = r1.f17723b
            goto L_0x0444
        L_0x043b:
            java.lang.Object r1 = r9.get(r3)
            z5.a r1 = (z5.a) r1
            float r1 = r1.f17723b
            float r1 = -r1
        L_0x0444:
            float r1 = r1 / r17
            float r2 = r2 + r1
            int r3 = r3 + 1
        L_0x0449:
            r30 = r3
            java.lang.String r6 = r4.f14058a
            if (r6 != 0) goto L_0x0452
            r31 = 1
            goto L_0x0454
        L_0x0452:
            r31 = 0
        L_0x0454:
            if (r25 == 0) goto L_0x048e
            r1 = 2
            if (r8 != r1) goto L_0x045b
            float r2 = r2 - r26
        L_0x045b:
            r32 = r2
            float r33 = r20 + r18
            r3 = r23
            r5.e r2 = r3.f17270d
            r1 = r3
            r23 = r2
            r2 = r37
            r34 = r3
            r3 = r32
            r35 = r9
            r9 = r24
            r24 = r4
            r4 = r33
            r33 = r10
            r10 = r5
            r5 = r24
            r24 = r13
            r13 = r28
            r28 = r14
            r14 = r6
            r6 = r23
            r1.f(r2, r3, r4, r5, r6)
            r1 = 1
            if (r8 != r1) goto L_0x048b
            float r2 = r32 + r26
            goto L_0x049e
        L_0x048b:
            r2 = r32
            goto L_0x049e
        L_0x048e:
            r35 = r9
            r33 = r10
            r34 = r23
            r9 = r24
            r10 = r5
            r24 = r13
            r13 = r28
            r28 = r14
            r14 = r6
        L_0x049e:
            if (r31 != 0) goto L_0x04cc
            r1 = 2
            if (r25 == 0) goto L_0x04a9
            if (r8 != r1) goto L_0x04a7
            float r5 = -r12
            goto L_0x04a8
        L_0x04a7:
            r5 = r12
        L_0x04a8:
            float r2 = r2 + r5
        L_0x04a9:
            if (r8 != r1) goto L_0x04b4
            java.lang.Object r1 = r11.get(r10)
            z5.a r1 = (z5.a) r1
            float r1 = r1.f17723b
            float r2 = r2 - r1
        L_0x04b4:
            float r1 = r20 + r29
            r7.drawText(r14, r2, r1, r13)
            r1 = 1
            if (r8 != r1) goto L_0x04c5
            java.lang.Object r3 = r11.get(r10)
            z5.a r3 = (z5.a) r3
            float r3 = r3.f17723b
            float r2 = r2 + r3
        L_0x04c5:
            r3 = 2
            if (r8 != r3) goto L_0x04ca
            float r4 = -r9
            goto L_0x04d3
        L_0x04ca:
            r4 = r9
            goto L_0x04d3
        L_0x04cc:
            r1 = 1
            r3 = 2
            if (r8 != r3) goto L_0x04d2
            float r4 = -r0
            goto L_0x04d3
        L_0x04d2:
            r4 = r0
        L_0x04d3:
            float r2 = r2 + r4
            int r5 = r10 + 1
            r6 = r13
            r1 = r20
            r13 = r24
            r14 = r28
            r3 = r30
            r10 = r33
            r23 = r34
            r24 = r9
            r9 = r35
            goto L_0x03e2
        L_0x04e9:
            r0 = r36
        L_0x04eb:
            r5.c r1 = r0.G
            if (r1 == 0) goto L_0x0540
            boolean r1 = r1.f14035a
            if (r1 == 0) goto L_0x0540
            android.graphics.Paint r1 = r0.C
            r2 = 0
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r0.C
            r5.c r2 = r0.G
            float r2 = r2.f14038d
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r0.C
            r5.c r2 = r0.G
            int r2 = r2.f14039e
            r1.setColor(r2)
            android.graphics.Paint r1 = r0.C
            r5.c r2 = r0.G
            android.graphics.Paint$Align r2 = r2.f14041g
            r1.setTextAlign(r2)
            int r1 = r36.getWidth()
            float r1 = (float) r1
            z5.g r2 = r0.N
            float r3 = r2.f17757c
            android.graphics.RectF r2 = r2.f17756b
            float r2 = r2.right
            float r3 = r3 - r2
            float r1 = r1 - r3
            r5.c r2 = r0.G
            float r2 = r2.f14036b
            float r1 = r1 - r2
            int r2 = r36.getHeight()
            float r2 = (float) r2
            z5.g r3 = r0.N
            float r3 = r3.j()
            float r2 = r2 - r3
            r5.c r3 = r0.G
            float r4 = r3.f14037c
            float r2 = r2 - r4
            android.graphics.Paint r4 = r0.C
            java.lang.String r3 = r3.f14040f
            r7.drawText(r3, r1, r2, r4)
        L_0x0540:
            boolean r1 = r0.f12876a
            if (r1 == 0) goto L_0x057c
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r21
            long r3 = r0.f12874y0
            long r3 = r3 + r1
            r0.f12874y0 = r3
            long r5 = r0.f12875z0
            r7 = 1
            long r5 = r5 + r7
            r0.f12875z0 = r5
            long r3 = r3 / r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Drawtime: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = " ms, average: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = " ms, cycles: "
            r5.append(r1)
            long r1 = r0.f12875z0
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = "MPAndroidChart"
            android.util.Log.i(r2, r1)
        L_0x057c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.a.onDraw(android.graphics.Canvas):void");
    }

    public final void onSizeChanged(int i8, int i10, int i11, int i12) {
        float[] fArr = this.E0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        boolean z10 = this.f12866q0;
        i.a aVar = i.a.f14064a;
        if (z10) {
            RectF rectF = this.N.f17756b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            a(aVar).e(fArr);
        }
        super.onSizeChanged(i8, i10, i11, i12);
        if (this.f12866q0) {
            a(aVar).f(fArr);
            g gVar = this.N;
            Matrix matrix = gVar.f17767n;
            matrix.reset();
            matrix.set(gVar.f17755a);
            float f10 = fArr[0];
            RectF rectF2 = gVar.f17756b;
            matrix.postTranslate(-(f10 - rectF2.left), -(fArr[1] - rectF2.top));
            gVar.k(matrix, this, true);
            return;
        }
        g gVar2 = this.N;
        gVar2.k(gVar2.f17755a, this, true);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        x5.b bVar = this.I;
        if (bVar == null || this.f12878b == null || !this.F) {
            return false;
        }
        ((x5.a) bVar).onTouch(this, motionEvent);
        return true;
    }

    public void setAutoScaleMinMaxEnabled(boolean z10) {
        this.f12852c0 = z10;
    }

    public void setBorderColor(int i8) {
        this.f12861l0.setColor(i8);
    }

    public void setBorderWidth(float f10) {
        this.f12861l0.setStrokeWidth(z5.f.c(f10));
    }

    public void setClipValuesToContent(boolean z10) {
        this.f12864o0 = z10;
    }

    public void setDoubleTapToZoomEnabled(boolean z10) {
        this.f12854e0 = z10;
    }

    public void setDragEnabled(boolean z10) {
        this.f12856g0 = z10;
        this.f12857h0 = z10;
    }

    public void setDragOffsetX(float f10) {
        g gVar = this.N;
        gVar.getClass();
        gVar.f17766l = z5.f.c(f10);
    }

    public void setDragOffsetY(float f10) {
        g gVar = this.N;
        gVar.getClass();
        gVar.m = z5.f.c(f10);
    }

    public void setDragXEnabled(boolean z10) {
        this.f12856g0 = z10;
    }

    public void setDragYEnabled(boolean z10) {
        this.f12857h0 = z10;
    }

    public void setDrawBorders(boolean z10) {
        this.f12863n0 = z10;
    }

    public void setDrawGridBackground(boolean z10) {
        this.f12862m0 = z10;
    }

    public void setGridBackgroundColor(int i8) {
        this.f12860k0.setColor(i8);
    }

    public void setHighlightPerDragEnabled(boolean z10) {
        this.f12855f0 = z10;
    }

    public void setKeepPositionOnRotation(boolean z10) {
        this.f12866q0 = z10;
    }

    public void setMaxVisibleValueCount(int i8) {
        this.f12851b0 = i8;
    }

    public void setMinOffset(float f10) {
        this.f12865p0 = f10;
    }

    public void setOnDrawListener(x5.e eVar) {
    }

    public void setPinchZoom(boolean z10) {
        this.f12853d0 = z10;
    }

    public void setRendererLeftYAxis(y5.i iVar) {
        this.f12869t0 = iVar;
    }

    public void setRendererRightYAxis(y5.i iVar) {
        this.f12870u0 = iVar;
    }

    public void setScaleEnabled(boolean z10) {
        this.f12858i0 = z10;
        this.f12859j0 = z10;
    }

    public void setScaleXEnabled(boolean z10) {
        this.f12858i0 = z10;
    }

    public void setScaleYEnabled(boolean z10) {
        this.f12859j0 = z10;
    }

    public void setVisibleXRangeMaximum(float f10) {
        float f11 = this.E.C / f10;
        g gVar = this.N;
        gVar.getClass();
        if (f11 < 1.0f) {
            f11 = 1.0f;
        }
        gVar.f17761g = f11;
        gVar.i(gVar.f17755a, gVar.f17756b);
    }

    public void setVisibleXRangeMinimum(float f10) {
        float f11 = this.E.C / f10;
        g gVar = this.N;
        gVar.getClass();
        if (f11 == 0.0f) {
            f11 = Float.MAX_VALUE;
        }
        gVar.f17762h = f11;
        gVar.i(gVar.f17755a, gVar.f17756b);
    }

    public void setXAxisRenderer(h hVar) {
        this.f12873x0 = hVar;
    }
}
