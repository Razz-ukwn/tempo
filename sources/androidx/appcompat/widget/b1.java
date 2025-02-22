package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.quickkonnect.silencio.R;
import i2.c;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

public final class b1 extends c implements View.OnClickListener {
    public static final /* synthetic */ int T = 0;
    public final SearchView G;
    public final SearchableInfo H;
    public final Context I;
    public final WeakHashMap<String, Drawable.ConstantState> J;
    public final int K;
    public int L = 1;
    public ColorStateList M;
    public int N = -1;
    public int O = -1;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
    public int S = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f945a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f946b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f947c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f948d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f949e;

        public a(View view) {
            this.f945a = (TextView) view.findViewById(16908308);
            this.f946b = (TextView) view.findViewById(16908309);
            this.f947c = (ImageView) view.findViewById(16908295);
            this.f948d = (ImageView) view.findViewById(16908296);
            this.f949e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public b1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.G = searchView;
        this.H = searchableInfo;
        this.K = searchView.getSuggestionCommitIconResId();
        this.I = context;
        this.J = weakHashMap;
    }

    public static String i(int i8, Cursor cursor) {
        if (i8 == -1) {
            return null;
        }
        try {
            return cursor.getString(i8);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.view.View r21, android.database.Cursor r22) {
        /*
            r20 = this;
            r1 = r20
            r2 = r22
            java.lang.Object r0 = r21.getTag()
            r3 = r0
            androidx.appcompat.widget.b1$a r3 = (androidx.appcompat.widget.b1.a) r3
            int r0 = r1.S
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x0017
            int r0 = r2.getInt(r0)
            r5 = r0
            goto L_0x0018
        L_0x0017:
            r5 = r4
        L_0x0018:
            android.widget.TextView r6 = r3.f945a
            r0 = 8
            if (r6 == 0) goto L_0x0034
            int r7 = r1.N
            java.lang.String r7 = i(r7, r2)
            r6.setText(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0031
            r6.setVisibility(r0)
            goto L_0x0034
        L_0x0031:
            r6.setVisibility(r4)
        L_0x0034:
            r7 = 1
            r8 = 2
            android.content.Context r9 = r1.I
            android.widget.TextView r10 = r3.f946b
            if (r10 == 0) goto L_0x00b9
            int r11 = r1.P
            java.lang.String r11 = i(r11, r2)
            if (r11 == 0) goto L_0x008a
            android.content.res.ColorStateList r12 = r1.M
            if (r12 != 0) goto L_0x0063
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            android.content.res.Resources$Theme r13 = r9.getTheme()
            r14 = 2130904290(0x7f0304e2, float:1.7415422E38)
            r13.resolveAttribute(r14, r12, r7)
            android.content.res.Resources r13 = r9.getResources()
            int r12 = r12.resourceId
            android.content.res.ColorStateList r12 = r13.getColorStateList(r12)
            r1.M = r12
        L_0x0063:
            android.text.SpannableString r12 = new android.text.SpannableString
            r12.<init>(r11)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r14 = 0
            r16 = 0
            r17 = 0
            android.content.res.ColorStateList r13 = r1.M
            r18 = 0
            r19 = r13
            r13 = r15
            r0 = r15
            r15 = r16
            r16 = r17
            r17 = r19
            r13.<init>(r14, r15, r16, r17, r18)
            int r11 = r11.length()
            r13 = 33
            r12.setSpan(r0, r4, r11, r13)
            goto L_0x0090
        L_0x008a:
            int r0 = r1.O
            java.lang.String r12 = i(r0, r2)
        L_0x0090:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x009f
            if (r6 == 0) goto L_0x00a7
            r6.setSingleLine(r4)
            r6.setMaxLines(r8)
            goto L_0x00a7
        L_0x009f:
            if (r6 == 0) goto L_0x00a7
            r6.setSingleLine(r7)
            r6.setMaxLines(r7)
        L_0x00a7:
            r10.setText(r12)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L_0x00b6
            r0 = 8
            r10.setVisibility(r0)
            goto L_0x00b9
        L_0x00b6:
            r10.setVisibility(r4)
        L_0x00b9:
            android.widget.ImageView r7 = r3.f947c
            if (r7 == 0) goto L_0x0161
            int r0 = r1.Q
            r8 = -1
            if (r0 != r8) goto L_0x00c5
            r0 = 0
            goto L_0x014d
        L_0x00c5:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.g(r0)
            if (r0 == 0) goto L_0x00d1
            goto L_0x014d
        L_0x00d1:
            android.app.SearchableInfo r0 = r1.H
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r8 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r10 = r1.J
            boolean r11 = r10.containsKey(r8)
            if (r11 == 0) goto L_0x00f6
            java.lang.Object r0 = r10.get(r8)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00ed
            r0 = 0
            goto L_0x0142
        L_0x00ed:
            android.content.res.Resources r8 = r9.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r8)
            goto L_0x0142
        L_0x00f6:
            java.lang.String r11 = "SuggestionsAdapter"
            android.content.pm.PackageManager r12 = r9.getPackageManager()
            r13 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r13 = r12.getActivityInfo(r0, r13)     // Catch:{ NameNotFoundException -> 0x012c }
            int r14 = r13.getIconResource()
            if (r14 != 0) goto L_0x0109
            goto L_0x0135
        L_0x0109:
            java.lang.String r15 = r0.getPackageName()
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r15, r14, r13)
            if (r12 != 0) goto L_0x0136
            java.lang.String r12 = "Invalid icon resource "
            java.lang.String r13 = " for "
            java.lang.StringBuilder r12 = androidx.appcompat.widget.a1.b(r12, r14, r13)
            java.lang.String r0 = r0.flattenToShortString()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            android.util.Log.w(r11, r0)
            goto L_0x0135
        L_0x012c:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = r12.toString()
            android.util.Log.w(r11, r0)
        L_0x0135:
            r12 = 0
        L_0x0136:
            if (r12 != 0) goto L_0x013a
            r0 = 0
            goto L_0x013e
        L_0x013a:
            android.graphics.drawable.Drawable$ConstantState r0 = r12.getConstantState()
        L_0x013e:
            r10.put(r8, r0)
            r0 = r12
        L_0x0142:
            if (r0 == 0) goto L_0x0145
            goto L_0x014d
        L_0x0145:
            android.content.pm.PackageManager r0 = r9.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x014d:
            r7.setImageDrawable(r0)
            if (r0 != 0) goto L_0x0157
            r0 = 4
            r7.setVisibility(r0)
            goto L_0x0161
        L_0x0157:
            r7.setVisibility(r4)
            r0.setVisible(r4, r4)
            r7 = 1
            r0.setVisible(r7, r4)
        L_0x0161:
            android.widget.ImageView r0 = r3.f948d
            if (r0 == 0) goto L_0x018a
            int r7 = r1.R
            r8 = -1
            if (r7 != r8) goto L_0x016c
            r2 = 0
            goto L_0x0174
        L_0x016c:
            java.lang.String r2 = r2.getString(r7)
            android.graphics.drawable.Drawable r2 = r1.g(r2)
        L_0x0174:
            r0.setImageDrawable(r2)
            if (r2 != 0) goto L_0x017f
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x018a
        L_0x017f:
            r0.setVisibility(r4)
            r2.setVisible(r4, r4)
            r0 = 1
            r2.setVisible(r0, r4)
            goto L_0x018b
        L_0x018a:
            r0 = 1
        L_0x018b:
            int r2 = r1.L
            android.widget.ImageView r3 = r3.f949e
            r7 = 2
            if (r2 == r7) goto L_0x019f
            if (r2 != r0) goto L_0x0199
            r0 = r5 & 1
            if (r0 == 0) goto L_0x0199
            goto L_0x019f
        L_0x0199:
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x01ac
        L_0x019f:
            r3.setVisibility(r4)
            java.lang.CharSequence r0 = r6.getText()
            r3.setTag(r0)
            r3.setOnClickListener(r1)
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b1.b(android.view.View, android.database.Cursor):void");
    }

    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.N = cursor.getColumnIndex("suggest_text_1");
                this.O = cursor.getColumnIndex("suggest_text_2");
                this.P = cursor.getColumnIndex("suggest_text_2_url");
                this.Q = cursor.getColumnIndex("suggest_icon_1");
                this.R = cursor.getColumnIndex("suggest_icon_2");
                this.S = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    public final String d(Cursor cursor) {
        String i8;
        String i10;
        if (cursor == null) {
            return null;
        }
        String i11 = i(cursor.getColumnIndex("suggest_intent_query"), cursor);
        if (i11 != null) {
            return i11;
        }
        SearchableInfo searchableInfo = this.H;
        if (searchableInfo.shouldRewriteQueryFromData() && (i10 = i(cursor.getColumnIndex("suggest_intent_data"), cursor)) != null) {
            return i10;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (i8 = i(cursor.getColumnIndex("suggest_text_1"), cursor)) == null) {
            return null;
        }
        return i8;
    }

    public final View e(ViewGroup viewGroup) {
        View inflate = this.F.inflate(this.D, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.K);
        return inflate;
    }

    public final Drawable f(Uri uri) {
        int i8;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.I.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i8 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i8 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i8 != 0) {
                        return resourcesForApplication.getDrawable(i8);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0090 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable g(java.lang.String r11) {
        /*
            r10 = this;
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r10.J
            java.lang.String r1 = "SuggestionsAdapter"
            android.content.Context r2 = r10.I
            java.lang.String r3 = "android.resource://"
            r4 = 0
            if (r11 == 0) goto L_0x0115
            boolean r5 = r11.isEmpty()
            if (r5 != 0) goto L_0x0115
            java.lang.String r5 = "0"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x001b
            goto L_0x0115
        L_0x001b:
            int r5 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            r6.<init>(r3)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            java.lang.String r3 = r2.getPackageName()     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            r6.append(r3)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            java.lang.String r3 = "/"
            r6.append(r3)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            r6.append(r5)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            java.lang.String r3 = r6.toString()     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            android.graphics.drawable.Drawable$ConstantState r6 = (android.graphics.drawable.Drawable.ConstantState) r6     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            if (r6 != 0) goto L_0x0041
            r6 = r4
            goto L_0x0045
        L_0x0041:
            android.graphics.drawable.Drawable r6 = r6.newDrawable()     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
        L_0x0045:
            if (r6 == 0) goto L_0x0048
            return r6
        L_0x0048:
            java.lang.Object r6 = t1.a.f15323a     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            android.graphics.drawable.Drawable r5 = t1.a.c.b(r2, r5)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            if (r5 == 0) goto L_0x0057
            android.graphics.drawable.Drawable$ConstantState r6 = r5.getConstantState()     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
            r0.put(r3, r6)     // Catch:{ NumberFormatException -> 0x0062, NotFoundException -> 0x0058 }
        L_0x0057:
            return r5
        L_0x0058:
            java.lang.String r0 = "Icon resource not found: "
            java.lang.String r11 = r0.concat(r11)
            android.util.Log.w(r1, r11)
            return r4
        L_0x0062:
            java.lang.Object r3 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r3 = (android.graphics.drawable.Drawable.ConstantState) r3
            if (r3 != 0) goto L_0x006c
            r3 = r4
            goto L_0x0070
        L_0x006c:
            android.graphics.drawable.Drawable r3 = r3.newDrawable()
        L_0x0070:
            if (r3 == 0) goto L_0x0073
            return r3
        L_0x0073:
            android.net.Uri r3 = android.net.Uri.parse(r11)
            java.lang.String r5 = "Error closing icon stream for "
            java.lang.String r6 = "Failed to open "
            java.lang.String r7 = "Resource does not exist: "
            java.lang.String r8 = r3.getScheme()     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r9 = "android.resource"
            boolean r8 = r9.equals(r8)     // Catch:{ FileNotFoundException -> 0x00ee }
            if (r8 == 0) goto L_0x00a2
            android.graphics.drawable.Drawable r1 = r10.f(r3)     // Catch:{ NotFoundException -> 0x0090 }
            r4 = r1
            goto L_0x010c
        L_0x0090:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee }
            r5.<init>(r7)     // Catch:{ FileNotFoundException -> 0x00ee }
            r5.append(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x00ee }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ee }
            throw r2     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00a2:
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x00ee }
            java.io.InputStream r2 = r2.openInputStream(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            if (r2 == 0) goto L_0x00dc
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromStream(r2, r4)     // Catch:{ all -> 0x00c6 }
            r2.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00c4
        L_0x00b4:
            r2 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee }
            r7.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ee }
            r7.append(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r5 = r7.toString()     // Catch:{ FileNotFoundException -> 0x00ee }
            android.util.Log.e(r1, r5, r2)     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00c4:
            r4 = r6
            goto L_0x010c
        L_0x00c6:
            r6 = move-exception
            r2.close()     // Catch:{ IOException -> 0x00cb }
            goto L_0x00db
        L_0x00cb:
            r2 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee }
            r7.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ee }
            r7.append(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r5 = r7.toString()     // Catch:{ FileNotFoundException -> 0x00ee }
            android.util.Log.e(r1, r5, r2)     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00db:
            throw r6     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00dc:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ee }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00ee }
            r5.append(r3)     // Catch:{ FileNotFoundException -> 0x00ee }
            java.lang.String r5 = r5.toString()     // Catch:{ FileNotFoundException -> 0x00ee }
            r2.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00ee }
            throw r2     // Catch:{ FileNotFoundException -> 0x00ee }
        L_0x00ee:
            r2 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Icon not found: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = ", "
            r5.append(r3)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.util.Log.w(r1, r2)
        L_0x010c:
            if (r4 == 0) goto L_0x0115
            android.graphics.drawable.Drawable$ConstantState r1 = r4.getConstantState()
            r0.put(r11, r1)
        L_0x0115:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b1.g(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final View getDropDownView(int i8, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i8, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.F.inflate(this.E, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f945a.setText(e10.toString());
            }
            return inflate;
        }
    }

    public final View getView(int i8, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i8, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View e11 = e(viewGroup);
            ((a) e11.getTag()).f945a.setText(e10.toString());
            return e11;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        Uri build = fragment.build();
        return this.I.getContentResolver().query(build, (String[]) null, suggestSelection, strArr, (String) null);
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f9420c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f9420c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.G.p((CharSequence) tag);
        }
    }
}
