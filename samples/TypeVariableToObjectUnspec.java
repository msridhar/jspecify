/*
 * Copyright 2020 The jspecify Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.jspecify.annotations.DefaultNonNull;
import org.jspecify.annotations.Nullable;
import org.jspecify.annotations.NullnessUnspecified;

@DefaultNonNull
class TypeVariableToObjectUnspec<
    Never1T,
    ChildOfNever1T extends Never1T,
    UnspecChildOfNever1T extends @NullnessUnspecified Never1T,
    NullChildOfNever1T extends @Nullable Never1T,
    //
    Never2T extends Object,
    ChildOfNever2T extends Never2T,
    UnspecChildOfNever2T extends @NullnessUnspecified Never2T,
    NullChildOfNever2T extends @Nullable Never2T,
    //
    UnspecT extends @NullnessUnspecified Object,
    ChildOfUnspecT extends UnspecT,
    UnspecChildOfUnspecT extends @NullnessUnspecified UnspecT,
    NullChildOfUnspecT extends @Nullable UnspecT,
    //
    ParametricT extends @Nullable Object,
    ChildOfParametricT extends ParametricT,
    UnspecChildOfParametricT extends @NullnessUnspecified ParametricT,
    NullChildOfParametricT extends @Nullable ParametricT,
    //
    UnusedT> {
  @NullnessUnspecified
  Object x0(Never1T x) {
    return x;
  }

  @NullnessUnspecified
  Object x1(ChildOfNever1T x) {
    return x;
  }

  @NullnessUnspecified
  Object x2(UnspecChildOfNever1T x) {
    // NOT-ENOUGH-INFORMATION
    return x;
  }

  @NullnessUnspecified
  Object x3(NullChildOfNever1T x) {
    // NOT-ENOUGH-INFORMATION
    return x;
  }

  @NullnessUnspecified
  Object x4(Never2T x) {
    return x;
  }

  @NullnessUnspecified
  Object x5(ChildOfNever2T x) {
    return x;
  }

  @NullnessUnspecified
  Object x6(UnspecChildOfNever2T x) {
    // NOT-ENOUGH-INFORMATION
    return x;
  }

  @NullnessUnspecified
  Object x7(NullChildOfNever2T x) {
    // NOT-ENOUGH-INFORMATION
    return x;
  }

  @NullnessUnspecified
  Object x8(UnspecT x) {
    // NOT-ENOUGH-INFORMATION
    return x;
  }

  @NullnessUnspecified
  Object x9(ChildOfUnspecT x) {
    // NOT-ENOUGH-INFORMATION
    return x;
  }

  @NullnessUnspecified
  Object x10(UnspecChildOfUnspecT x) {
    // NOT-ENOUGH-INFORMATION
    return x;
  }

  @NullnessUnspecified
  Object x11(NullChildOfUnspecT x) {
    // NOT-ENOUGH-INFORMATION
    return x;
  }

  @NullnessUnspecified
  Object x12(ParametricT x) {
    // NOT-ENOUGH-INFORMATION
    return x;
  }

  @NullnessUnspecified
  Object x13(ChildOfParametricT x) {
    // NOT-ENOUGH-INFORMATION
    return x;
  }

  @NullnessUnspecified
  Object x14(UnspecChildOfParametricT x) {
    // NOT-ENOUGH-INFORMATION
    return x;
  }

  @NullnessUnspecified
  Object x15(NullChildOfParametricT x) {
    // NOT-ENOUGH-INFORMATION
    return x;
  }
}