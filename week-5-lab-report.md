# Week 5 Lab Report
## Part 1 - Bugs
The program below is buggy, in that it doesn't return the expected, reversed output.

```
static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
```

However, the JUnit test below passes. We input the array `{ 3 }`.

```
@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
```
Our JUnit output is as follows:

```
$ bash test.sh
JUnit version 4.13.2
.....
Time: 0.022

OK (5 tests)
```

A failure-inducing input, `{ 1, 2, 3, 4, 5 }` is shown here:

```
@Test
  public void testRIP2() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertEquals(5, input1[0]);
    assertEquals(4, input1[1]);
    assertEquals(3, input1[2]);
    assertEquals(2, input1[3]);
    assertEquals(1, input1[4]);
  }
```

Our JUnit output is as follows:

```
$ bash test.sh
JUnit version 4.13.2
.E.....
Time: 0.037
There was 1 failure:
1) testRIP2(ArrayTests)
java.lang.AssertionError: expected:<2> but was:<4>
        at org.junit.Assert.fail(Assert.java:89)
        at org.junit.Assert.failNotEquals(Assert.java:835) 
        at org.junit.Assert.assertEquals(Assert.java:647)  
        at org.junit.Assert.assertEquals(Assert.java:633)  
        at ArrayTests.testRIP2(ArrayTests.java:26)

FAILURES!!!
Tests run: 6,  Failures: 1
```

We expect the reversed array to look like this: ` { 5, 4, 3, 2, 1 } `

However, we get an array which looks like this: ` { 5, 4, 3, 4, 5 } `

If we look closer at the buggy code, we see that it uses the final returned array as a template to reverse. This means that the first half of the array acts as a template for the reversal of the rest of the array.

To fix this, we need to change a few lines. We have to create a new array which acts as a blank slate for our input to be reversed onto, so that previous inputs do not affect subsequent inputs.

Our final code will look like this:
```
static void reverseInPlace(int[] arr) {
    int arrCopy[] = arr.clone();
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arrCopy[arr.length - 1 - i];
    }
  }
```

## Part 2 - Researching Commands





