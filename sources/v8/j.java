package v8;

import ag.v1;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import v8.f;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final l[] f16301a = new l[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f16302b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f16303c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f16304d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f16305e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f16306f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final l f16307g = new l();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f16308h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f16309i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f16310j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f16311k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f16312l = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final j f16313a = new j();
    }

    public j() {
        for (int i8 = 0; i8 < 4; i8++) {
            this.f16301a[i8] = new l();
            this.f16302b[i8] = new Matrix();
            this.f16303c[i8] = new Matrix();
        }
    }

    public final void a(i iVar, float f10, RectF rectF, f.a aVar, Path path) {
        int i8;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        l[] lVarArr;
        Path path2;
        f.a aVar2;
        char c3;
        Path path3;
        j jVar = this;
        i iVar2 = iVar;
        float f11 = f10;
        RectF rectF2 = rectF;
        f.a aVar3 = aVar;
        Path path4 = path;
        path.rewind();
        Path path5 = jVar.f16305e;
        path5.rewind();
        Path path6 = jVar.f16306f;
        path6.rewind();
        path6.addRect(rectF2, Path.Direction.CW);
        int i10 = 0;
        while (true) {
            i8 = 4;
            matrixArr = jVar.f16303c;
            fArr = jVar.f16308h;
            matrixArr2 = jVar.f16302b;
            lVarArr = jVar.f16301a;
            if (i10 >= 4) {
                break;
            }
            c cVar = i10 != 1 ? i10 != 2 ? i10 != 3 ? iVar2.f16282f : iVar2.f16281e : iVar2.f16284h : iVar2.f16283g;
            v1 v1Var = i10 != 1 ? i10 != 2 ? i10 != 3 ? iVar2.f16278b : iVar2.f16277a : iVar2.f16280d : iVar2.f16279c;
            l lVar = lVarArr[i10];
            v1Var.getClass();
            v1Var.k(f11, cVar.a(rectF2), lVar);
            int i11 = i10 + 1;
            float f12 = (float) ((i11 % 4) * 90);
            matrixArr2[i10].reset();
            PointF pointF = jVar.f16304d;
            int i12 = i11;
            if (i10 == 1) {
                path3 = path5;
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i10 == 2) {
                path3 = path5;
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i10 != 3) {
                path3 = path5;
                pointF.set(rectF2.right, rectF2.top);
            } else {
                path3 = path5;
                pointF.set(rectF2.left, rectF2.top);
            }
            matrixArr2[i10].setTranslate(pointF.x, pointF.y);
            matrixArr2[i10].preRotate(f12);
            l lVar2 = lVarArr[i10];
            fArr[0] = lVar2.f16318c;
            fArr[1] = lVar2.f16319d;
            matrixArr2[i10].mapPoints(fArr);
            matrixArr[i10].reset();
            matrixArr[i10].setTranslate(fArr[0], fArr[1]);
            matrixArr[i10].preRotate(f12);
            i10 = i12;
            path5 = path3;
        }
        Path path7 = path5;
        char c10 = 1;
        char c11 = 0;
        int i13 = 0;
        while (i13 < i8) {
            l lVar3 = lVarArr[i13];
            fArr[c11] = lVar3.f16316a;
            fArr[c10] = lVar3.f16317b;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path4.moveTo(fArr[c11], fArr[c10]);
            } else {
                path4.lineTo(fArr[c11], fArr[c10]);
            }
            lVarArr[i13].c(matrixArr2[i13], path4);
            if (aVar3 != null) {
                l lVar4 = lVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                f fVar = f.this;
                BitSet bitSet = fVar.f16253d;
                lVar4.getClass();
                bitSet.set(i13, false);
                lVar4.b(lVar4.f16321f);
                fVar.f16251b[i13] = new k(new ArrayList(lVar4.f16323h), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            l lVar5 = lVarArr[i13];
            fArr[0] = lVar5.f16318c;
            fArr[1] = lVar5.f16319d;
            matrixArr2[i13].mapPoints(fArr);
            l lVar6 = lVarArr[i15];
            float f13 = lVar6.f16316a;
            int i16 = i14;
            float[] fArr2 = jVar.f16309i;
            fArr2[0] = f13;
            fArr2[1] = lVar6.f16317b;
            matrixArr2[i15].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot((double) (fArr[0] - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
            l lVar7 = lVarArr[i13];
            fArr[0] = lVar7.f16318c;
            fArr[1] = lVar7.f16319d;
            matrixArr2[i13].mapPoints(fArr);
            float abs = (i13 == 1 || i13 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            l lVar8 = jVar.f16307g;
            lVar8.e(0.0f, 270.0f, 0.0f);
            (i13 != 1 ? i13 != 2 ? i13 != 3 ? iVar2.f16286j : iVar2.f16285i : iVar2.f16288l : iVar2.f16287k).a(max, abs, f11, lVar8);
            Path path8 = jVar.f16310j;
            path8.reset();
            lVar8.c(matrixArr[i13], path8);
            if (!jVar.f16312l || (!jVar.b(path8, i13) && !jVar.b(path8, i15))) {
                path2 = path7;
                path4 = path;
                lVar8.c(matrixArr[i13], path4);
                aVar2 = aVar;
            } else {
                path8.op(path8, path6, Path.Op.DIFFERENCE);
                fArr[0] = lVar8.f16316a;
                fArr[1] = lVar8.f16317b;
                matrixArr[i13].mapPoints(fArr);
                path2 = path7;
                path2.moveTo(fArr[0], fArr[1]);
                lVar8.c(matrixArr[i13], path2);
                aVar2 = aVar;
                path4 = path;
            }
            if (aVar2 != null) {
                Matrix matrix2 = matrixArr[i13];
                f fVar2 = f.this;
                c3 = 0;
                fVar2.f16253d.set(i13 + 4, false);
                lVar8.b(lVar8.f16321f);
                fVar2.f16252c[i13] = new k(new ArrayList(lVar8.f16323h), new Matrix(matrix2));
            } else {
                c3 = 0;
            }
            jVar = this;
            c11 = c3;
            aVar3 = aVar2;
            path7 = path2;
            i13 = i16;
            c10 = 1;
            i8 = 4;
            iVar2 = iVar;
            RectF rectF3 = rectF;
        }
        Path path9 = path7;
        path.close();
        path9.close();
        if (!path9.isEmpty()) {
            path4.op(path9, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i8) {
        Path path2 = this.f16311k;
        path2.reset();
        this.f16301a[i8].c(this.f16302b[i8], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
