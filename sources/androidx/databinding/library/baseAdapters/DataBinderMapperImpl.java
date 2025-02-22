package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.c;
import androidx.databinding.d;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f1787a = new SparseIntArray(0);

    public final List<c> a() {
        return new ArrayList(0);
    }

    public final ViewDataBinding b(d dVar, View view, int i8) {
        if (f1787a.get(i8) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public final ViewDataBinding c(d dVar, View[] viewArr, int i8) {
        if (viewArr.length == 0 || f1787a.get(i8) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
