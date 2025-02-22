package com.google.android.gms.internal.p000firebaseauthapi;

import ag.d;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q3  reason: invalid package */
public final class q3 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f4834a;

    static {
        char[] cArr = new char[80];
        f4834a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i8, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a10 : (List) obj) {
                a(sb2, i8, str, a10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a11 : ((Map) obj).entrySet()) {
                a(sb2, i8, str, a11);
            }
        } else {
            sb2.append(10);
            b(i8, sb2);
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Character.toLowerCase(str.charAt(0)));
                for (int i10 = 1; i10 < str.length(); i10++) {
                    char charAt = str.charAt(i10);
                    if (Character.isUpperCase(charAt)) {
                        sb3.append("_");
                    }
                    sb3.append(Character.toLowerCase(charAt));
                }
                str = sb3.toString();
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(d.m(new p1(((String) obj).getBytes(u2.f4974a))));
                sb2.append('\"');
            } else if (obj instanceof q1) {
                sb2.append(": \"");
                sb2.append(d.m((q1) obj));
                sb2.append('\"');
            } else if (obj instanceof p2) {
                sb2.append(" {");
                c((p2) obj, sb2, i8 + 2);
                sb2.append("\n");
                b(i8, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i11 = i8 + 2;
                a(sb2, i11, "key", entry.getKey());
                a(sb2, i11, "value", entry.getValue());
                sb2.append("\n");
                b(i8, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    public static void b(int i8, StringBuilder sb2) {
        while (i8 > 0) {
            int i10 = 80;
            if (i8 <= 80) {
                i10 = i8;
            }
            sb2.append(f4834a, 0, i10);
            i8 -= i10;
        }
    }

    public static void c(o3 o3Var, StringBuilder sb2, int i8) {
        int i10;
        boolean z10;
        Method method;
        Method method2;
        o3 o3Var2 = o3Var;
        StringBuilder sb3 = sb2;
        int i11 = i8;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = o3Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i10 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb3, i11, substring.substring(0, substring.length() - 4), p2.d(method2, o3Var2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb3, i11, substring.substring(0, substring.length() - 3), p2.d(method, o3Var2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object d10 = p2.d(method4, o3Var2, new Object[0]);
                    if (method5 == null) {
                        if (d10 instanceof Boolean) {
                            if (!((Boolean) d10).booleanValue()) {
                            }
                        } else if (d10 instanceof Integer) {
                            if (((Integer) d10).intValue() == 0) {
                            }
                        } else if (d10 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) d10).floatValue()) == 0) {
                            }
                        } else if (!(d10 instanceof Double)) {
                            if (d10 instanceof String) {
                                z10 = d10.equals("");
                            } else if (d10 instanceof q1) {
                                z10 = d10.equals(q1.f4830b);
                            } else if (d10 instanceof o3) {
                                if (d10 == ((o3) d10).f()) {
                                }
                            } else if ((d10 instanceof Enum) && ((Enum) d10).ordinal() == 0) {
                            }
                            if (z10) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) d10).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) p2.d(method5, o3Var2, new Object[0])).booleanValue()) {
                    }
                    a(sb3, i11, substring, d10);
                }
            }
            i10 = 3;
        }
        if (!(o3Var2 instanceof n2)) {
            l4 l4Var = ((p2) o3Var2).zzc;
            if (l4Var != null) {
                for (int i13 = 0; i13 < l4Var.f4704a; i13++) {
                    a(sb3, i11, String.valueOf(l4Var.f4705b[i13] >>> 3), l4Var.f4706c[i13]);
                }
                return;
            }
            return;
        }
        n2 n2Var = (n2) o3Var2;
        throw null;
    }
}
