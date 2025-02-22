package r2;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f13782a;

    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f13783a;

        /* renamed from: b  reason: collision with root package name */
        public final d f13784b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f13785c = true;

        public a(TextView textView) {
            this.f13783a = textView;
            this.f13784b = new d(textView);
        }

        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f13785c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i8 = 0; i8 < inputFilterArr.length; i8++) {
                    InputFilter inputFilter = inputFilterArr[i8];
                    if (inputFilter instanceof d) {
                        sparseArray.put(i8, inputFilter);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (sparseArray.indexOfKey(i11) < 0) {
                        inputFilterArr2[i10] = inputFilterArr[i11];
                        i10++;
                    }
                }
                return inputFilterArr2;
            }
            int length2 = inputFilterArr.length;
            int i12 = 0;
            while (true) {
                d dVar = this.f13784b;
                if (i12 >= length2) {
                    InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
                    System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                    inputFilterArr3[length2] = dVar;
                    return inputFilterArr3;
                } else if (inputFilterArr[i12] == dVar) {
                    return inputFilterArr;
                } else {
                    i12++;
                }
            }
        }

        public final void b(boolean z10) {
            if (z10) {
                d();
            }
        }

        public final void c(boolean z10) {
            this.f13785c = z10;
            d();
            TextView textView = this.f13783a;
            textView.setFilters(a(textView.getFilters()));
        }

        public final void d() {
            TextView textView = this.f13783a;
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (this.f13785c) {
                if (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                    transformationMethod = new h(transformationMethod);
                }
            } else if (transformationMethod instanceof h) {
                transformationMethod = ((h) transformationMethod).f13792a;
            }
            textView.setTransformationMethod(transformationMethod);
        }
    }

    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public void b(boolean z10) {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }
    }

    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f13786a;

        public c(TextView textView) {
            this.f13786a = new a(textView);
        }

        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            return (androidx.emoji2.text.f.f1823k != null) ^ true ? inputFilterArr : this.f13786a.a(inputFilterArr);
        }

        public final void b(boolean z10) {
            if (!(!(androidx.emoji2.text.f.f1823k != null))) {
                this.f13786a.b(z10);
            }
        }

        public final void c(boolean z10) {
            boolean z11 = !(androidx.emoji2.text.f.f1823k != null);
            a aVar = this.f13786a;
            if (z11) {
                aVar.f13785c = z10;
            } else {
                aVar.c(z10);
            }
        }
    }

    public f(TextView textView) {
        if (textView != null) {
            this.f13782a = new c(textView);
            return;
        }
        throw new NullPointerException("textView cannot be null");
    }
}
