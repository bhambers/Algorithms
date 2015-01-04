/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.pedrovgs.problem52;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Pedro Vicente Gómez Sánchez.
 */
public class ReplaceSpacesTest {

  private ReplaceSpaces replaceSpaces;

  @Before public void setUp() {
    replaceSpaces = new ReplaceSpaces();
  }

  @Test(expected = IllegalArgumentException.class) public void shouldNotAcceptNullArrays() {
    replaceSpaces.replace(null);
  }

  @Test public void shouldReplaceAllTheContentIfTheArrayIsFullOfSpaces() {
    char[] input = new char[6];
    input[0] = ' ';
    input[1] = ' ';

    replaceSpaces.replace(input);

    assertArrayEquals(new char[] { '%', '2', '0', '%', '2', '0' }, input);
  }

  @Test public void shouldReplaceSpacesWithTheStatementChar() {
    char[] input = new char[8];
    input[0] = 'p';
    input[1] = 'e';
    input[2] = ' ';
    input[3] = 'd';
    input[4] = 'r';
    input[5] = 'o';

    replaceSpaces.replace(input);

    assertArrayEquals(new char[] { '%', '2', '0', '%', '2', '0' }, input);
  }
}
