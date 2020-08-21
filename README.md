# Fractions
Operations on Fraction

This is an exercise in TDD, proposed by J.B. Reinsberger (https://online-training.jbrains.ca/p/wbitdd-01)

Some considerations after having finished it:

1. Write a test that fails first. There are several resons to do this:
  - you must be sure that the test is actually executed (sometimes you miss the @Test annotation)
  - sometimes the test goes ok, so one of these: you didn't imagine that its case was already covered by the existing code,
    or simply the test is wrong
  - if you write the code at first, chances are that it won't be covered by any test
  
2. Small steps
  - never refactor more methods simultaneously: chances are that you'll introduce some fastidious bugs that are difficult to remove 
 
