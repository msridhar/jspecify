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

class NotNullAwareUseOfTypeVariable {
  interface Super<T extends @Nullable Object> {
    T get();
  }

  @DefaultNonNull
  interface SubObject extends Super<Object> {}

  @DefaultNonNull
  interface SubObjectUnspec extends Super<@NullnessUnspecified Object> {}

  @DefaultNonNull
  interface SubObjectUnionNull extends Super<@Nullable Object> {}

  @DefaultNonNull
  class Caller {
    Object x0(SubObject s) {
      // NOT-ENOUGH-INFORMATION
      return s.get();
    }

    Object x1(SubObjectUnspec s) {
      // NOT-ENOUGH-INFORMATION
      return s.get();
    }

    Object x2(SubObjectUnionNull s) {
      // MISMATCH
      return s.get();
    }

    Object x3(Super<Object> s) {
      // NOT-ENOUGH-INFORMATION
      return s.get();
    }

    Object x4(Super<@NullnessUnspecified Object> s) {
      // NOT-ENOUGH-INFORMATION
      return s.get();
    }

    Object x5(Super<@Nullable Object> s) {
      // MISMATCH
      return s.get();
    }

    Object x6(Super<? extends Object> s) {
      // NOT-ENOUGH-INFORMATION
      return s.get();
    }

    Object x7(Super<? extends @NullnessUnspecified Object> s) {
      // NOT-ENOUGH-INFORMATION
      return s.get();
    }

    Object x8(Super<? extends @Nullable Object> s) {
      // MISMATCH
      return s.get();
    }

    Object x9(Super<?> s) {
      // MISMATCH
      return s.get();
    }
  }
}