package nc;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;

public abstract class a1 extends ViewDataBinding {
    public static final /* synthetic */ int Z = 0;
    public final MaterialCardView S;
    public final Guideline T;
    public final RecyclerView U;
    public final TextView V;
    public final TextView W;
    public final TextView X;
    public final TextView Y;

    public a1(Object obj, View view, MaterialCardView materialCardView, Guideline guideline, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(0, view, obj);
        this.S = materialCardView;
        this.T = guideline;
        this.U = recyclerView;
        this.V = textView;
        this.W = textView2;
        this.X = textView3;
        this.Y = textView4;
    }
}
