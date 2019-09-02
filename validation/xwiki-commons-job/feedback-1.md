# xwiki-commons-job feedback

## 1

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/xwiki-commons-job/selected-issues/1.md

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


4. The hint provided in the description

- [ ] points to the exact solution
- [X] provides helpful information to solve the issue
- [ ] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.

> According to the test, it's not really the size of property that we should assert as suggested in the description, but more importantly the value of the property. 

## 2

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/xwiki-commons-job/selected-issues/2.md

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


4. The hint provided in the description

- [ ] points to the exact solution
- [X] provides helpful information to solve the issue
- [ ] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.

> IMO the main problem here is that we only check half of the method store(), the first half which put the jobStatus in a cache. So it would be useful to also have some information about the part that is not covered here: the second half, that we should check by adding some stub method call verifications. 

## 3

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/xwiki-commons-job/selected-issues/3.md

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

> 

## 4

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/xwiki-commons-job/selected-issues/4.md

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

> 

## 5

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/xwiki-commons-job/selected-issues/5.md

1. The issue in the description is:

- [ ] relevant
- [X] of medium relevance
- [ ] not important
- [ ] not really a testing issue

2. You would solve the issue by:
- [ ] adding a new assertion to an existing test case (Possibly adding a new method call as well)
- [ ] creating a new test case which is a slight modification of an existing test case
- [ ] creating a completely new test case
- [X] Other: this needs a proper test case but in a different test class than the one mentioned in the issue

3. If you actually solve the issue, please share the URL to the commit


4. The hint provided in the description

- [X] points to the exact solution
- [ ] provides helpful information to solve the issue
- [ ] is not really helpful
- [ ] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.

> Here the description can be misleading: the method is called by JobStatusSerializer so it is indirectly tested by JobStatusSerializerTest, but it should actually be tested in its own test class, especially since the method pointed here is public. IMO the description should point out either the test class where to put the new test, or at least to mention that it shouldn't be tested in the same test class. 

## 6

Please check the testing issue and hint described in the  following URL https://github.com/STAMP-project/descartes-amplification-experiments/blob/master/validation/xwiki-commons-job/selected-issues/6.md

1. The issue in the description is:

- [ ] relevant
- [X] of medium relevance
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
- [ ] provides helpful information to solve the issue
- [ ] is not really helpful
- [X] is misleading

5. Please, include here any general feedback you would like to provide regarding this issue.

> So, as before here the new test case should be in a different test class, but more importantly, it shouldn't be at all a modified variant of the other test. It's a public method of an abstract class. So either we want to test it from a concrete class, and then it might be interesting to point out what are the existing concrete classes, and the variant might make sense. Or we want to test it really unitary, by creating a mock concrete class in our tests, and then it should be tested in a dedicated test class for the abstract class. 