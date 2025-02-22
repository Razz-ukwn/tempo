package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.quickkonnect.silencio.R;
import d2.i0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends n0 implements h.b {
    public static final o E0 = (Build.VERSION.SDK_INT < 29 ? new o() : null);
    public Bundle A0;
    public final b B0;
    public final c C0;
    public final WeakHashMap<String, Drawable.ConstantState> D0;
    public final SearchAutoComplete L;
    public final View M;
    public final View N;
    public final View O;
    public final ImageView P;
    public final ImageView Q;
    public final ImageView R;
    public final ImageView S;
    public final View T;
    public q U;
    public final Rect V;
    public final Rect W;

    /* renamed from: a0  reason: collision with root package name */
    public final int[] f831a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int[] f832b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ImageView f833c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Drawable f834d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f835e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f836f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Intent f837g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Intent f838h0;

    /* renamed from: i0  reason: collision with root package name */
    public final CharSequence f839i0;

    /* renamed from: j0  reason: collision with root package name */
    public m f840j0;

    /* renamed from: k0  reason: collision with root package name */
    public View.OnFocusChangeListener f841k0;

    /* renamed from: l0  reason: collision with root package name */
    public View.OnClickListener f842l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f843m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f844n0;

    /* renamed from: o0  reason: collision with root package name */
    public i2.a f845o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f846p0;

    /* renamed from: q0  reason: collision with root package name */
    public CharSequence f847q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f848r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f849s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f850t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f851u0;

    /* renamed from: v0  reason: collision with root package name */
    public String f852v0;

    /* renamed from: w0  reason: collision with root package name */
    public CharSequence f853w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f854x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f855y0;

    /* renamed from: z0  reason: collision with root package name */
    public SearchableInfo f856z0;

    public static class SearchAutoComplete extends d {
        public SearchView B;
        public boolean C;
        public final a D = new a();

        /* renamed from: e  reason: collision with root package name */
        public int f857e = getThreshold();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.C) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.C = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i8 = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i8 >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i8 < 600) {
                return (i8 < 640 || i10 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.E0;
            oVar.getClass();
            o.a();
            Method method = oVar.f871c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public final boolean enoughToFilter() {
            return this.f857e <= 0 || super.enoughToFilter();
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.C) {
                a aVar = this.D;
                removeCallbacks(aVar);
                post(aVar);
            }
            return onCreateInputConnection;
        }

        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public final void onFocusChanged(boolean z10, int i8, Rect rect) {
            super.onFocusChanged(z10, i8, rect);
            SearchView searchView = this.B;
            searchView.w(searchView.f844n0);
            searchView.post(searchView.B0);
            if (searchView.L.hasFocus()) {
                searchView.l();
            }
        }

        public final boolean onKeyPreIme(int i8, KeyEvent keyEvent) {
            if (i8 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.B.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i8, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.B.hasFocus() && getVisibility() == 0) {
                boolean z11 = true;
                this.C = true;
                Context context = getContext();
                o oVar = SearchView.E0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z11 = false;
                }
                if (z11) {
                    a();
                }
            }
        }

        public final void performCompletion() {
        }

        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.D;
            if (!z10) {
                this.C = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.C = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.C = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.B = searchView;
        }

        public void setThreshold(int i8) {
            super.setThreshold(i8);
            this.f857e = i8;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
        }

        public final void onTextChanged(CharSequence charSequence, int i8, int i10, int i11) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.L.getText();
            searchView.f853w0 = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.v(z10);
            boolean z11 = !z10;
            int i12 = 8;
            if (searchView.f851u0 && !searchView.f844n0 && z11) {
                searchView.Q.setVisibility(8);
                i12 = 0;
            }
            searchView.S.setVisibility(i12);
            searchView.r();
            searchView.u();
            if (searchView.f840j0 != null && !TextUtils.equals(charSequence, searchView.f852v0)) {
                searchView.f840j0.a(charSequence.toString());
            }
            searchView.f852v0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            SearchView.this.s();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            i2.a aVar = SearchView.this.f845o0;
            if (aVar instanceof b1) {
                aVar.c((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public final void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f841k0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public final void onLayoutChange(View view, int i8, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            SearchView searchView = SearchView.this;
            View view2 = searchView.T;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.N.getPaddingLeft();
                Rect rect = new Rect();
                boolean a10 = q1.a(searchView);
                int dimensionPixelSize = searchView.f843m0 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                SearchAutoComplete searchAutoComplete = searchView.L;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                searchAutoComplete.setDropDownHorizontalOffset(a10 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public final void onClick(View view) {
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.P;
            SearchAutoComplete searchAutoComplete = searchView.L;
            if (view == imageView) {
                searchView.w(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f842l0;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.R) {
                searchView.m();
            } else if (view == searchView.Q) {
                searchView.q();
            } else if (view == searchView.S) {
                SearchableInfo searchableInfo = searchView.f856z0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.f837g0);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.k(searchView.f838h0, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchAutoComplete) {
                searchView.l();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public final boolean onKey(View view, int i8, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f856z0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.L;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i8 != 66) {
                    return false;
                }
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.j("android.intent.action.SEARCH", (Uri) null, (String) null, searchAutoComplete.getText().toString()));
                return true;
            } else if (searchView.f856z0 == null || searchView.f845o0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            } else {
                if (i8 == 66 || i8 == 84 || i8 == 61) {
                    searchView.n(searchAutoComplete.getListSelection());
                } else if (i8 == 21 || i8 == 22) {
                    searchAutoComplete.setSelection(i8 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                } else if (i8 != 19) {
                    return false;
                } else {
                    searchAutoComplete.getListSelection();
                    return false;
                }
                return true;
            }
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public final boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
            SearchView.this.q();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public final void onItemClick(AdapterView<?> adapterView, View view, int i8, long j10) {
            SearchView.this.n(i8);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i8, long j10) {
            SearchView.this.o(i8);
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i8) {
            searchAutoComplete.setInputMethodMode(i8);
        }
    }

    public interface l {
    }

    public interface m {
        void a(String str);

        void b(String str);
    }

    public interface n {
    }

    public static class o {

        /* renamed from: a  reason: collision with root package name */
        public final Method f869a = null;

        /* renamed from: b  reason: collision with root package name */
        public final Method f870b = null;

        /* renamed from: c  reason: collision with root package name */
        public final Method f871c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            a();
            try {
                Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f869a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f870b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f871c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class p extends k2.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f872c;

        public class a implements Parcelable.ClassLoaderCreator<p> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            public final Object[] newArray(int i8) {
                return new p[i8];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new p(parcel, (ClassLoader) null);
            }
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f872c + "}";
        }

        public final void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable(this.f10267a, i8);
            parcel.writeValue(Boolean.valueOf(this.f872c));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f872c = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class q extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f873a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f874b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f875c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f876d;

        /* renamed from: e  reason: collision with root package name */
        public final int f877e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f878f;

        public q(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f877e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f874b = rect3;
            Rect rect4 = new Rect();
            this.f876d = rect4;
            Rect rect5 = new Rect();
            this.f875c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i8 = -scaledTouchSlop;
            rect4.inset(i8, i8);
            rect5.set(rect2);
            this.f873a = searchAutoComplete;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 == r5) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f878f
                r8.f878f = r4
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f878f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f876d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r5 = r2
                r2 = r4
                goto L_0x0041
            L_0x002f:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f874b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f878f = r5
                r2 = r5
                goto L_0x0041
            L_0x003f:
                r2 = r5
                r5 = r4
            L_0x0041:
                if (r5 == 0) goto L_0x006e
                android.graphics.Rect r4 = r8.f875c
                android.view.View r5 = r8.f873a
                if (r2 == 0) goto L_0x005f
                boolean r2 = r4.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                int r0 = r5.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                int r1 = r5.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006a
            L_0x005f:
                int r2 = r4.left
                int r0 = r0 - r2
                float r0 = (float) r0
                int r2 = r4.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L_0x006a:
                boolean r4 = r5.dispatchTouchEvent(r9)
            L_0x006e:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.q.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.L;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void clearFocus() {
        this.f849s0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.L;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f849s0 = false;
    }

    public int getImeOptions() {
        return this.L.getImeOptions();
    }

    public int getInputType() {
        return this.L.getInputType();
    }

    public int getMaxWidth() {
        return this.f850t0;
    }

    public CharSequence getQuery() {
        return this.L.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f847q0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f856z0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f839i0 : getContext().getText(this.f856z0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f836f0;
    }

    public int getSuggestionRowLayout() {
        return this.f835e0;
    }

    public i2.a getSuggestionsAdapter() {
        return this.f845o0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f853w0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.A0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f856z0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.A0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i8 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.L;
        if (i8 >= 29) {
            k.a(searchAutoComplete);
            return;
        }
        o oVar = E0;
        oVar.getClass();
        o.a();
        Method method = oVar.f869a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        oVar.getClass();
        o.a();
        Method method2 = oVar.f870b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.L;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f843m0) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i8) {
        int i10;
        String i11;
        Cursor cursor = this.f845o0.f9420c;
        if (cursor != null && cursor.moveToPosition(i8)) {
            Intent intent = null;
            try {
                int i12 = b1.T;
                String i13 = b1.i(cursor.getColumnIndex("suggest_intent_action"), cursor);
                if (i13 == null) {
                    i13 = this.f856z0.getSuggestIntentAction();
                }
                if (i13 == null) {
                    i13 = "android.intent.action.SEARCH";
                }
                String i14 = b1.i(cursor.getColumnIndex("suggest_intent_data"), cursor);
                if (i14 == null) {
                    i14 = this.f856z0.getSuggestIntentData();
                }
                if (!(i14 == null || (i11 = b1.i(cursor.getColumnIndex("suggest_intent_data_id"), cursor)) == null)) {
                    i14 = i14 + "/" + Uri.encode(i11);
                }
                intent = j(i13, i14 == null ? null : Uri.parse(i14), b1.i(cursor.getColumnIndex("suggest_intent_extra_data"), cursor), b1.i(cursor.getColumnIndex("suggest_intent_query"), cursor));
            } catch (RuntimeException e10) {
                try {
                    i10 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i10 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i10 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.L;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i8) {
        Editable text = this.L.getText();
        Cursor cursor = this.f845o0.f9420c;
        if (cursor != null) {
            if (cursor.moveToPosition(i8)) {
                String d10 = this.f845o0.d(cursor);
                if (d10 != null) {
                    setQuery(d10);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.L;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f853w0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.f855y0);
        this.f854x0 = false;
    }

    public final void onActionViewExpanded() {
        if (!this.f854x0) {
            this.f854x0 = true;
            SearchAutoComplete searchAutoComplete = this.L;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.f855y0 = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            searchAutoComplete.setText("");
            setIconified(false);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.B0);
        post(this.C0);
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z10, int i8, int i10, int i11, int i12) {
        super.onLayout(z10, i8, i10, i11, i12);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.L;
            int[] iArr = this.f831a0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f832b0;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            Rect rect = this.V;
            rect.set(i14, i13, searchAutoComplete.getWidth() + i14, searchAutoComplete.getHeight() + i13);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.W;
            rect2.set(i15, 0, i16, i17);
            q qVar = this.U;
            if (qVar == null) {
                q qVar2 = new q(rect2, rect, searchAutoComplete);
                this.U = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.f874b.set(rect2);
            Rect rect3 = qVar.f876d;
            rect3.set(rect2);
            int i18 = -qVar.f877e;
            rect3.inset(i18, i18);
            qVar.f875c.set(rect);
        }
    }

    public final void onMeasure(int i8, int i10) {
        int i11;
        if (this.f844n0) {
            super.onMeasure(i8, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (mode == Integer.MIN_VALUE) {
            int i12 = this.f850t0;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f850t0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i11 = this.f850t0) > 0) {
            size = Math.min(i11, size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.f10267a);
        w(pVar.f872c);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f872c = this.f844n0;
        return pVar;
    }

    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.B0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.L;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.f840j0;
            if (mVar != null) {
                mVar.b(text.toString());
            }
            if (this.f856z0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", (Uri) null, (String) null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.L.getText());
        int i8 = 0;
        if (!z11 && (!this.f843m0 || this.f854x0)) {
            z10 = false;
        }
        if (!z10) {
            i8 = 8;
        }
        ImageView imageView = this.R;
        imageView.setVisibility(i8);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final boolean requestFocus(int i8, Rect rect) {
        if (this.f849s0 || !isFocusable()) {
            return false;
        }
        if (this.f844n0) {
            return super.requestFocus(i8, rect);
        }
        boolean requestFocus = this.L.requestFocus(i8, rect);
        if (requestFocus) {
            w(false);
        }
        return requestFocus;
    }

    public final void s() {
        int[] iArr = this.L.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.N.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.O.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.A0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.L;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f842l0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f843m0 != z10) {
            this.f843m0 = z10;
            w(z10);
            t();
        }
    }

    public void setImeOptions(int i8) {
        this.L.setImeOptions(i8);
    }

    public void setInputType(int i8) {
        this.L.setInputType(i8);
    }

    public void setMaxWidth(int i8) {
        this.f850t0 = i8;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f841k0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f840j0 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f842l0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f847q0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f848r0 = z10;
        i2.a aVar = this.f845o0;
        if (aVar instanceof b1) {
            ((b1) aVar).L = z10 ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f856z0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.L
            r1 = 1
            r2 = 65536(0x10000, float:9.18355E-41)
            r3 = 0
            if (r8 == 0) goto L_0x0068
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f856z0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f856z0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L_0x0034
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f856z0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L_0x0034
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L_0x0034:
            r0.setInputType(r8)
            i2.a r8 = r7.f845o0
            if (r8 == 0) goto L_0x003e
            r8.c(r3)
        L_0x003e:
            android.app.SearchableInfo r8 = r7.f856z0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L_0x0065
            androidx.appcompat.widget.b1 r8 = new androidx.appcompat.widget.b1
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f856z0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r6 = r7.D0
            r8.<init>(r4, r7, r5, r6)
            r7.f845o0 = r8
            r0.setAdapter(r8)
            i2.a r8 = r7.f845o0
            androidx.appcompat.widget.b1 r8 = (androidx.appcompat.widget.b1) r8
            boolean r4 = r7.f848r0
            if (r4 == 0) goto L_0x0062
            r4 = 2
            goto L_0x0063
        L_0x0062:
            r4 = r1
        L_0x0063:
            r8.L = r4
        L_0x0065:
            r7.t()
        L_0x0068:
            android.app.SearchableInfo r8 = r7.f856z0
            if (r8 == 0) goto L_0x0098
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L_0x0098
            android.app.SearchableInfo r8 = r7.f856z0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L_0x007d
            android.content.Intent r3 = r7.f837g0
            goto L_0x0087
        L_0x007d:
            android.app.SearchableInfo r8 = r7.f856z0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L_0x0087
            android.content.Intent r3 = r7.f838h0
        L_0x0087:
            if (r3 == 0) goto L_0x0098
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            r7.f851u0 = r1
            if (r1 == 0) goto L_0x00a2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        L_0x00a2:
            boolean r8 = r7.f844n0
            r7.w(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f846p0 = z10;
        w(this.f844n0);
    }

    public void setSuggestionsAdapter(i2.a aVar) {
        this.f845o0 = aVar;
        this.L.setAdapter(aVar);
    }

    public final void t() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z10 = this.f843m0;
        SearchAutoComplete searchAutoComplete = this.L;
        if (z10 && (drawable = this.f834d0) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        int i8 = 0;
        if (!((this.f846p0 || this.f851u0) && !this.f844n0) || !(this.Q.getVisibility() == 0 || this.S.getVisibility() == 0)) {
            i8 = 8;
        }
        this.O.setVisibility(i8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (r2.f851u0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f846p0
            if (r0 == 0) goto L_0x0021
            r1 = 0
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f851u0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.f844n0
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f851u0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.Q
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.v(boolean):void");
    }

    public final void w(boolean z10) {
        this.f844n0 = z10;
        int i8 = 0;
        int i10 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.L.getText());
        this.P.setVisibility(i10);
        v(z11);
        this.M.setVisibility(z10 ? 8 : 0);
        ImageView imageView = this.f833c0;
        imageView.setVisibility((imageView.getDrawable() == null || this.f843m0) ? 8 : 0);
        r();
        boolean z12 = !z11;
        if (!this.f851u0 || this.f844n0 || !z12) {
            i8 = 8;
        } else {
            this.Q.setVisibility(8);
        }
        this.S.setVisibility(i8);
        u();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        Context context2 = context;
        this.V = new Rect();
        this.W = new Rect();
        this.f831a0 = new int[2];
        this.f832b0 = new int[2];
        this.B0 = new b();
        this.C0 = new c();
        this.D0 = new WeakHashMap<>();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        a aVar = new a();
        int[] iArr = cb.e.R;
        AttributeSet attributeSet2 = attributeSet;
        int i10 = i8;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i10, 0);
        h1 h1Var = new h1(context2, obtainStyledAttributes);
        i0.m(this, context, iArr, attributeSet2, obtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(h1Var.i(17, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.L = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.M = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.N = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.O = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.P = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.Q = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.R = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.S = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f833c0 = imageView5;
        i0.d.q(findViewById, h1Var.e(18));
        i0.d.q(findViewById2, h1Var.e(23));
        imageView.setImageDrawable(h1Var.e(21));
        imageView2.setImageDrawable(h1Var.e(13));
        imageView3.setImageDrawable(h1Var.e(10));
        imageView4.setImageDrawable(h1Var.e(26));
        imageView5.setImageDrawable(h1Var.e(21));
        this.f834d0 = h1Var.e(20);
        m1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f835e0 = h1Var.i(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.f836f0 = h1Var.i(11, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(gVar);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(h1Var.a(16, true));
        int d10 = h1Var.d(2, -1);
        if (d10 != -1) {
            setMaxWidth(d10);
        }
        this.f839i0 = h1Var.k(12);
        this.f847q0 = h1Var.k(19);
        int h3 = h1Var.h(6, -1);
        if (h3 != -1) {
            setImeOptions(h3);
        }
        int h10 = h1Var.h(5, -1);
        if (h10 != -1) {
            setInputType(h10);
        }
        setFocusable(h1Var.a(1, true));
        h1Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f837g0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f838h0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.T = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        w(this.f843m0);
        t();
    }
}
