package com.google.android.gms.internal.measurement;

import b1.b;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class j8 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f5341a;

    static {
        char[] cArr = new char[80];
        f5341a = cArr;
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
                sb2.append(b.o(new i6(((String) obj).getBytes(m7.f5399a))));
                sb2.append('\"');
            } else if (obj instanceof k6) {
                sb2.append(": \"");
                sb2.append(b.o((k6) obj));
                sb2.append('\"');
            } else if (obj instanceof g7) {
                sb2.append(" {");
                c((g7) obj, sb2, i8 + 2);
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
            sb2.append(f5341a, 0, i10);
            i8 -= i10;
        }
    }

    public static void c(h8 h8Var, StringBuilder sb2, int i8) {
        int i10;
        boolean z10;
        Method method;
        Method method2;
        h8 h8Var2 = h8Var;
        StringBuilder sb3 = sb2;
        int i11 = i8;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = h8Var.getClass().getDeclaredMethods();
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
                a(sb3, i11, substring.substring(0, substring.length() - 4), g7.n(method2, h8Var2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb3, i11, substring.substring(0, substring.length() - 3), g7.n(method, h8Var2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object n2 = g7.n(method4, h8Var2, new Object[0]);
                    if (method5 == null) {
                        if (n2 instanceof Boolean) {
                            if (!((Boolean) n2).booleanValue()) {
                            }
                        } else if (n2 instanceof Integer) {
                            if (((Integer) n2).intValue() == 0) {
                            }
                        } else if (n2 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) n2).floatValue()) == 0) {
                            }
                        } else if (!(n2 instanceof Double)) {
                            if (n2 instanceof String) {
                                z10 = n2.equals("");
                            } else if (n2 instanceof k6) {
                                z10 = n2.equals(k6.f5359b);
                            } else if (n2 instanceof h8) {
                                if (n2 == ((h8) n2).b()) {
                                }
                            } else if ((n2 instanceof Enum) && ((Enum) n2).ordinal() == 0) {
                            }
                            if (z10) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) n2).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) g7.n(method5, h8Var2, new Object[0])).booleanValue()) {
                    }
                    a(sb3, i11, substring, n2);
                }
            }
            i10 = 3;
        }
        if (!(h8Var2 instanceof d7)) {
            e9 e9Var = ((g7) h8Var2).zzc;
            if (e9Var != null) {
                for (int i13 = 0; i13 < e9Var.f5260a; i13++) {
                    a(sb3, i11, String.valueOf(e9Var.f5261b[i13] >>> 3), e9Var.f5262c[i13]);
                }
                return;
            }
            return;
        }
        d7 d7Var = (d7) h8Var2;
        throw null;
    }
}
