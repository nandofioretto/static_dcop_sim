/*
 * Copyright (c) 2015.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package kernel;

/**
 * Created by ffiorett on 7/8/15.
 */
public class Constants {
    public static final int infinity = Integer.MAX_VALUE-1;
    public static final int NaN      = Integer.MAX_VALUE;
    public static final int OPT_MAXIMIZE = 1;
    public static final int OPT_MINIMIZE = 2;
    public static boolean isInf(int value) {return (value == infinity || value == -infinity);}
    public static boolean isInf(double value) {return (value == infinity || value == -infinity);}
    public static int worstValue() { return -infinity; }
    public static String printValue(double value) {return (value == infinity) ? "Inf" : String.valueOf(value); }
}
