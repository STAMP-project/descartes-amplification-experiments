# greycat feeddback

## 1

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/greycat/selected-hints/01.md 

1. The issue in the description is:

- [ ] relevant
- [X] of medium relevance
- [ ] not important
- [ ] not really a testing issue

2. You would solve the issue by:
- [ ] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [X] creating a new test case which is a slight modification of an existing test case
- [ ] creating a completely new test case
- [ ] Other:

3. If you actually solve the issue, please share the URL to the commit


4. The hint provided in the description

- [X] points to the exact solution
- [ ] provides helpful information to solve the issue
- [ ] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.
> The group method is kind of a getter. As the pointed testing cases are here to check if a graph node is well retrieved, the test suit should check if the group is an expected one, even after been modified.

## 2

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/greycat/selected-hints/02.md 

1. The issue in the description is:

- [X] relevant
- [ ] of medium relevance
- [ ] not important
- [ ] not really a testing issue

2. You would solve the issue by:
- [ ] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [ ] creating a new test case which is a slight modification of an existing test case
- [ ] creating a completely new test case
- [X] Other: Fixing the test case

3. If you actually solve the issue, please share the URL to the commit


4. The hint provided in the description

- [ ] points to the exact solution
- [ ] provides helpful information to solve the issue
- [X] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.
> Here it's more a bug in the test case. The `traverse` method call a callback in which the assertion is called. By removing the body of this method, the callback is not called and so the assertion. Assertions should not be called inside a callback, other mechanism needs to be applied.

> Concerning the hint, first I do not have a huge knowledge about the utility of the `_dead` variable. Plus, in the test case, there is at least 2 instances, so I don't for which one the problem detected appears.

## 3

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/greycat/selected-hints/03.md 

1. The issue in the description is:

- [ ] relevant
- [X] of medium relevance
- [ ] not important
- [ ] not really a testing issue

2. You would solve the issue by:
- [ ] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [ ] creating a new test case which is a slight modification of an existing test case
- [ ] creating a completely new test case
- [X] Other: From my understanding, sounds like a bug in the test case due to asynchronous nature of the method.

3. If you actually solve the issue, please share the URL to the commit


4. The hint provided in the description

- [ ] points to the exact solution
- [ ] provides helpful information to solve the issue
- [ ] is not really helpful
- [X] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.
> I have not a broad understanding of this part of the framework. Answers here have not been done with high confidence.
> From my understanding, the code in line 91 from column 48 to column 69 of GraphWorkerTest.java should not be impacted by the tested method. The difference could come from the multi-thread execution of the test case. (The test case create 3 threads which execute the different tasks)

## 4

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/greycat/selected-hints/04.md 

1. The issue in the description is:

- [X] relevant
- [ ] of medium relevance
- [ ] not important
- [ ] not really a testing issue

2. You would solve the issue by:
- [ ] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [ ] creating a new test case which is a slight modification of an existing test case
- [X] creating a completely new test case
- [ ] Other:

3. If you actually solve the issue, please share the URL to the commit


4. The hint provided in the description

- [X] points to the exact solution
- [ ] provides helpful information to solve the issue
- [ ] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.
> The modified method is used to resolve a node at a time. By modifying the method, the node is always resolve at the same time point. However, the pointed method do not test the time traveling feature.


## 5

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/greycat/selected-hints/05.md 

1. The issue in the description is:

- [X] relevant
- [ ] of medium relevance
- [ ] not important
- [ ] not really a testing issue

2. You would solve the issue by:
- [ ] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [ ] creating a new test case which is a slight modification of an existing test case
- [ ] creating a completely new test case
- [X] Other: Fixing the issue

3. If you actually solve the issue, please share the URL to the commit


4. The hint provided in the description

- [ ] points to the exact solution
- [ ] provides helpful information to solve the issue
- [X] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.
> In the test method, the `declareVariable` is actually done 2 times using different ways. The fact that the body is removed is thus "fixed" by the second method. The test case requires refactoring.

## 6

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/greycat/selected-hints/06.md 

1. The issue in the description is:

- [X] relevant
- [ ] of medium relevance
- [ ] not important
- [ ] not really a testing issue

2. You would solve the issue by:
- [ ] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [ ] creating a new test case which is a slight modification of an existing test case
- [X] creating a completely new test case
- [ ] Other:

3. If you actually solve the issue, please share the URL to the commit


4. The hint provided in the description

- [ ] points to the exact solution
- [X] provides helpful information to solve the issue
- [ ] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.
> Thanks to the hints provided, (and by just reading the code), we can understand that the modified code is never executed. A test should be added which will go there.