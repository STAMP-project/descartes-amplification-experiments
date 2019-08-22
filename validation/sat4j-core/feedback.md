# SAT4J Core feedback

## 1

Please check the testing issue and hint described in the  following URL  https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/sat4j-core/selected-issues/1.md

1. The issue in the description is:

- [ ] relevant
- [ ] of medium relevance
- [ ] not important
- [X] not really a testing issue

2. You would solve the issue by:
- [ ] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [ ] creating a new test case which is a slight modification of an existing test case
- [ ] creating a completely new test case
- [X] Other: N/A

3. If you actually solve the issue, please share the URL to the commit


4. The hint provided in the description

- [ ] points to the exact solution
- [X] provides helpful information to solve the issue
- [ ] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.

> This is not an issue. The report is actually misleading, because it reports that only one method call returns a different value while there are actually several method call with different values. I had to launch eclipse and run that specific test to check it. As such, I think that a better report would have been to report all the changes. I could have decided directly that the report was normal, because several values changed, which is normal because the heuristics used to return the model is different when the method body is disabled or not.

## 2

Please check the testing issue and hint described in the  following URL  https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/sat4j-core/selected-issues/2.md

1. The issue in the description is:

- [ ] relevant
- [ ] of medium relevance
- [ ] not important
- [X] not really a testing issue

2. You would solve the issue by:
- [ ] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [ ] creating a new test case which is a slight modification of an existing test case
- [ ] creating a completely new test case
- [X] Other: The observation is not correct

3. If you actually solve the issue, please share the URL to the commit


4. The hint provided in the description

- [ ] points to the exact solution
- [ ] provides helpful information to solve the issue
- [ ] is not really helpful
- [X] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.

> The issue mentions a specific state change in the object when the modified method is called. The fact that the conflictCount object reference is null or not is unrelated to that method, which can be seen when looking at the code. It would have been helpful however to point to the specific test for which that observation was made, to help the developer understand why such inference has been made by the tool.

## 3

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/sat4j-core/selected-issues/3.md

1. The issue in the description is:

- [ ] relevant
- [ ] of medium relevance
- [X] not important
- [ ] not really a testing issue

2. You would solve the issue by:
- [ ] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [ ] creating a new test case which is a slight modification of an existing test case
- [ ] creating a completely new test case
- [X] Other: cleaning learned clauses only speeds up the search

3. If you actually solve the issue, please share the URL to the commit


4. The hint provided in the description

- [ ] points to the exact solution
- [ ] provides helpful information to solve the issue
- [X] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.

> It looks strange for the developer that reduceDB() is only called in that test. There is no easy way to plan when reduceDB() will be called, because it depends on the LearnedConstraintDeletionStrategy. I could add one test to check that the reduceDB() method is correctly called for a specific LearnedConstraintDeletionStrategy, but this would be quite artificial.

## 4

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/sat4j-core/selected-issues/4.md

1. The issue in the description is:

- [X] relevant
- [ ] of medium relevance
- [ ] not important
- [ ] not really a testing issue

2. You would solve the issue by:
- [ ] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [ ] creating a new test case which is a slight modification of an existing test case
- [ ] creating a completely new test case
- [X] Other: I cannot reproduce the problem. Two Bug34 tests fail if I return null. Note, however, that the tests execute in different order because the tests are generated using Java reflection.

3. If you actually solve the issue, please share the URL to the commit
https://gitlab.ow2.org/sat4j/sat4j/commit/a2de38673f8b727875cf30ed791e59f9ee1a7a80

4. The hint provided in the description

- [ ] points to the exact solution
- [X] provides helpful information to solve the issue
- [ ] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.

> The report helped figuring out an issue in the tests (they are not run in the same order because of Java Reflection API). The fix was thus to make sure that the tests are executed properly.

## 5

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/sat4j-core/selected-issues/5.md

1. The issue in the description is:

- [X] relevant
- [ ] of medium relevance
- [ ] not important
- [ ] not really a testing issue

2. You would solve the issue by:
- [ ] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [ ] creating a new test case which is a slight modification of an existing test case
- [ ] creating a completely new test case
- [X] Other: Same as the precious issue.

3. If you actually solve the issue, please share the URL to the commit


4. The hint provided in the description

- [ ] points to the exact solution
- [X] provides helpful information to solve the issue
- [ ] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.

> Duplicate of issue 4.

## 6

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/sat4j-core/selected-issues/6.md 

1. The issue in the description is:

- [X] relevant
- [ ] of medium relevance
- [ ] not important
- [ ] not really a testing issue

2. You would solve the issue by:
- [X] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [ ] creating a new test case which is a slight modification of an existing test case
- [ ] creating a completely new test case
- [ ] Other:

3. If you actually solve the issue, please share the URL to the commit
https://gitlab.ow2.org/sat4j/sat4j/commit/d3e769790700806107ebcc1766f000a1be216460

4. The hint provided in the description

- [X] points to the exact solution
- [ ] provides helpful information to solve the iss`ue
- [ ] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.