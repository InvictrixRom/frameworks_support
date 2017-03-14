/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

interface ObjectAnimatorUtilsImpl {

    <T> ObjectAnimator ofInt(T target, String xPropertyName, String yPropertyName, Path path);

    <T> ObjectAnimator ofInt(T target, Property<T, Integer> xProperty,
            Property<T, Integer> yProperty, Path path);

    <T> ObjectAnimator ofFloat(T target, Property<T, Float> xProperty,
            Property<T, Float> yProperty, Path path);

}
