package com.example.wolfgangreithmeier.javaplusapp;

import android.support.annotation.NonNull;

import java.util.function.Function;

/**
 * Created by wolfgangreithmeier on 12/01/2017.
 */

public final class Utils {

    public static <T, R> R let(T obj, @NonNull Function<T, R> func) {
        return obj == null ? null : func.apply(obj);
    }

    public static <T> T cast(Object obj, Class<T> clazz) {
        return obj == null || clazz.isInstance(obj) ? null : clazz.cast(obj);
    }
}
