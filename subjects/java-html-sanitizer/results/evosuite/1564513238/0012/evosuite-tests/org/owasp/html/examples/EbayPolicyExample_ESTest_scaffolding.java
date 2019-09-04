/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 30 19:15:54 GMT 2019
 */

package org.owasp.html.examples;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class EbayPolicyExample_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.owasp.html.examples.EbayPolicyExample"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
    org.evosuite.runtime.util.SystemInUtil.getInstance().initForTestCase(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/ubuntu/oscar/descartes-evosuite/subjects/java-html-sanitizer/results/evosuite/1564513238/0012"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(EbayPolicyExample_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableMultimap$Itr",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "org.owasp.html.AttributePolicy",
      "com.google.common.collect.MapMaker$NullComputingConcurrentMap",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.ComputingConcurrentHashMap",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.collect.ImmutableSet$Indexed",
      "org.owasp.html.StandardUrlAttributePolicy",
      "org.owasp.html.AbstractTokenStream",
      "org.owasp.html.HtmlElementTables$HtmlElementNames",
      "org.owasp.html.AttributePolicy$2",
      "org.owasp.html.AttributePolicy$1",
      "org.owasp.html.Trie",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Sets$3",
      "com.google.common.io.CharStreams$NullWriter",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.collect.Sets$1",
      "com.google.common.collect.ImmutableSortedMap$1EntrySet",
      "com.google.common.collect.Platform",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl",
      "com.google.common.collect.NullsLastOrdering",
      "com.google.common.collect.RegularImmutableMultiset",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.collect.ImmutableMultimap$Values",
      "org.owasp.html.Joinable$JoinStrategy",
      "org.owasp.html.CssGrammar$PropertyHandler",
      "com.google.common.collect.ByFunctionOrdering",
      "org.owasp.html.Joinable$JoinHelper",
      "org.owasp.html.HtmlElementTables$DenseElementSet",
      "com.google.common.collect.RegularImmutableMultiset$ElementSet",
      "org.owasp.html.HtmlElementTables$1",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.collect.Iterators$11",
      "com.google.common.collect.ImmutableBiMap$Builder",
      "com.google.common.base.Predicate",
      "com.google.common.collect.ImmutableListMultimap$Builder",
      "com.google.common.collect.ImmutableSet$Indexed$1",
      "com.google.common.base.Joiner",
      "com.google.common.io.CharStreams$1",
      "org.owasp.html.AttributePolicy$JoinableAttributePolicy",
      "org.owasp.html.HtmlElementTables$DenseElementBinaryMatrix",
      "com.google.common.collect.NullsFirstOrdering",
      "org.owasp.html.HtmlPolicyBuilder$AttributeBuilder",
      "org.owasp.html.HtmlStreamEventProcessor",
      "com.google.common.collect.Iterators$13",
      "com.google.common.collect.RegularImmutableMultiset$NonTerminalEntry",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "org.owasp.html.HtmlPolicyBuilder$JoinRelsOnLinksPolicies",
      "com.google.common.collect.Multisets$ImmutableEntry",
      "com.google.common.collect.UnmodifiableListIterator",
      "org.owasp.html.JoinedAttributePolicy",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.base.Charsets",
      "com.google.common.collect.Sets$4",
      "com.google.common.base.Absent",
      "com.google.common.collect.MapMakerInternalMap$Strength",
      "com.google.common.collect.Maps$BiMapConverter",
      "com.google.common.collect.MapMakerInternalMap$Segment",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.ImmutableSortedSet$Builder",
      "com.google.common.base.Equivalence$Equals",
      "org.owasp.html.HtmlInputSplitter",
      "com.google.common.base.Equivalence$Wrapper",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.collect.ComputingConcurrentHashMap$ComputingSegment",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.MapMaker",
      "com.google.common.collect.ImmutableMapValues",
      "com.google.common.collect.MapMaker$ComputingMapAdapter",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.MapMakerInternalMap$ValueReference",
      "com.google.common.base.Joiner$2",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.collect.EmptyImmutableSetMultimap",
      "org.owasp.html.StylingPolicy",
      "org.owasp.html.HtmlSanitizer$Policy",
      "com.google.common.collect.AbstractNavigableMap",
      "com.google.common.collect.ImmutableCollection",
      "org.owasp.html.HtmlElementTables$SparseElementMultitable",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.Iterators$7",
      "com.google.common.collect.BiMap",
      "org.owasp.html.Encoding",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "org.owasp.html.examples.EbayPolicyExample",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ImmutableSortedAsList",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.ImmutableMapValues$1",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.ImmutableMapValues$2",
      "org.owasp.html.ElementPolicy$JoinableElementPolicy",
      "org.owasp.html.IntVector",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.collect.ImmutableMultimap$EntryCollection",
      "org.owasp.html.PolicyFactory",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "org.owasp.html.HtmlSanitizer",
      "com.google.common.collect.Lists$2",
      "com.google.common.collect.Maps$IteratorBasedAbstractMap",
      "com.google.common.base.Ticker$1",
      "com.google.common.collect.Maps$FilteredEntryBiMap",
      "com.google.common.collect.RegularImmutableBiMap$Inverse",
      "com.google.common.collect.Lists$1",
      "com.google.common.collect.ImmutableMultimap$Builder",
      "com.google.common.base.Equivalence$Identity",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.ImmutableSetMultimap$EntrySet",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.base.Supplier",
      "org.owasp.html.HtmlPolicyBuilder",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "com.google.common.collect.ComputingConcurrentHashMap$ComputingValueReference",
      "org.owasp.html.HtmlStreamEventReceiver",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ReverseOrdering",
      "org.owasp.html.Handler",
      "com.google.common.collect.Maps$FilteredEntrySortedMap",
      "org.owasp.html.HtmlTokenType",
      "com.google.common.collect.MapMakerInternalMap$ReferenceEntry",
      "org.owasp.html.ElementAndAttributePolicyBasedSanitizerPolicy",
      "org.owasp.html.HtmlPolicyBuilder$1",
      "org.owasp.html.HtmlStreamRenderer",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.MapMaker$RemovalListener",
      "org.owasp.html.StylingPolicy$StylingPolicyJoinStrategy",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.io.LineProcessor",
      "com.google.common.collect.Maps$EntryTransformer",
      "org.owasp.html.HtmlStreamEventProcessor$Processors",
      "com.google.common.collect.Ordering",
      "org.owasp.html.HtmlToken",
      "com.google.common.collect.NaturalOrdering",
      "org.owasp.html.HtmlTextEscapingMode",
      "com.google.common.collect.MapMakerInternalMap",
      "com.google.common.collect.AllEqualOrdering",
      "org.owasp.html.HtmlElementTables$FreeWrapper",
      "com.google.common.collect.ImmutableMapEntrySet$EntrySetSerializedForm",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ListMultimap",
      "com.google.common.base.FunctionalEquivalence",
      "com.google.common.collect.ImmutableSortedMap$1EntrySet$1",
      "org.owasp.html.HtmlEntities",
      "com.google.common.collect.ImmutableSortedMap$Builder",
      "org.owasp.html.TagBalancingHtmlStreamEventReceiver",
      "com.google.common.collect.ComputationException",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.ImmutableMap$SerializedForm",
      "com.google.common.base.Optional",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "org.owasp.html.HtmlElementTables$SparseElementToElements",
      "org.owasp.html.HtmlStreamEventProcessor$Processors$1",
      "com.google.common.collect.ImmutableMapKeySet",
      "org.owasp.html.Strings",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1",
      "com.google.common.base.Ticker",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.MapMaker$NullConcurrentMap",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.collect.ImmutableListMultimap",
      "com.google.common.collect.ImmutableMultimap$1",
      "com.google.common.collect.Maps$AbstractFilteredMap",
      "com.google.common.base.Present",
      "com.google.common.collect.ImmutableMultimap$2",
      "com.google.common.collect.Iterables",
      "org.owasp.html.HtmlChangeListener",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.Maps$FilteredEntryMap",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.ImmutableSetMultimap$Builder",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.MapMaker$RemovalCause$4",
      "com.google.common.collect.MapMaker$RemovalCause$5",
      "org.owasp.html.ElementPolicy$Util$PolicyJoiner",
      "com.google.common.collect.MapMaker$RemovalCause$2",
      "com.google.common.collect.MapMaker$RemovalCause$3",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.UsingToStringOrdering",
      "com.google.common.collect.ImmutableMultimap$Keys",
      "com.google.common.collect.Multisets$AbstractEntry",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "org.owasp.html.HtmlStreamRenderer$CloseableHtmlStreamRenderer",
      "com.google.common.collect.MapMaker$RemovalCause$1",
      "com.google.common.collect.ImmutableSortedMap",
      "org.owasp.html.HtmlElementTablesCanned",
      "org.owasp.html.ElementPolicy$Util",
      "org.owasp.html.HtmlLexer$State",
      "org.owasp.html.examples.EbayPolicyExample$3",
      "com.google.common.collect.ObjectArrays",
      "org.owasp.html.examples.EbayPolicyExample$1",
      "org.owasp.html.examples.EbayPolicyExample$2",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.GenericMapMaker",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.RegularImmutableBiMap$Inverse$InverseEntrySet",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.SortedIterable",
      "org.owasp.html.ElementPolicy$2",
      "com.google.common.collect.UnmodifiableIterator",
      "org.owasp.html.ElementPolicy$1",
      "com.google.common.collect.RegularImmutableBiMap$Inverse$InverseEntrySet$1",
      "com.google.common.collect.Maps$FilteredEntryNavigableMap",
      "org.owasp.html.AttributePolicy$Util$AttributePolicyJoiner",
      "org.owasp.html.ElementPolicy",
      "com.google.common.collect.MapMaker$RemovalNotification",
      "com.google.common.collect.MapMaker$RemovalCause",
      "org.owasp.html.AttributePolicy$Util",
      "com.google.common.io.AppendableWriter",
      "org.owasp.html.HtmlPolicyBuilder$RelsOnLinksPolicy",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.ImmutableEnumSet",
      "org.owasp.html.JoinedElementPolicy",
      "com.google.common.collect.ImmutableMultiset$EntrySet",
      "com.google.common.io.CharStreams",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "org.owasp.html.Handler$2",
      "org.owasp.html.Handler$1",
      "org.owasp.html.HtmlElementTables",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.Converter",
      "com.google.common.collect.Maps$6",
      "com.google.common.base.Function",
      "org.owasp.html.HtmlLexer",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.AbstractIndexedListIterator",
      "org.owasp.html.HtmlSanitizer$1",
      "org.owasp.html.HtmlElementTables$TextContentModelBit",
      "com.google.common.collect.MapMakerInternalMap$Strength$2",
      "com.google.common.collect.MapMakerInternalMap$Strength$1",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.Multiset$Entry",
      "com.google.common.collect.Sets",
      "com.google.common.collect.MapMakerInternalMap$Strength$3",
      "com.google.common.collect.ImmutableSortedMapFauxverideShim",
      "org.owasp.html.CssSchema$Property",
      "org.owasp.html.ElementAndAttributePolicies",
      "com.google.common.collect.ExplicitOrdering",
      "com.google.common.collect.Maps$ViewCachingAbstractMap",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.collect.ImmutableList$Builder",
      "org.owasp.html.HtmlPolicyBuilder$AttributeBuilder$2",
      "org.owasp.html.TokenStream",
      "org.owasp.html.HtmlPolicyBuilder$AttributeBuilder$1",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableBiMapEntry",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.Iterators",
      "org.owasp.html.CssSchema",
      "com.google.common.collect.CompoundOrdering",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.ImmutableMultiset$Builder",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.base.PairwiseEquivalence",
      "com.google.common.collect.Ordering$IncomparableValueException",
      "com.google.common.collect.ImmutableMultiset$1",
      "com.google.common.collect.MapMakerInternalMap$2",
      "com.google.common.collect.MapMakerInternalMap$1",
      "org.owasp.html.HtmlPolicyBuilder$CompiledState",
      "com.google.common.base.Equivalence",
      "org.owasp.html.HtmlElementTables$TextContentModel",
      "org.owasp.html.Joinable",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.collect.Maps",
      "com.google.common.collect.SetMultimap",
      "org.owasp.html.AutoCloseableHtmlStreamRenderer",
      "com.google.common.collect.DescendingImmutableSortedSet",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.RegularImmutableSortedSet"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(EbayPolicyExample_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.owasp.html.examples.EbayPolicyExample$3",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.base.Joiner",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$11",
      "org.owasp.html.HtmlElementTables$1",
      "org.owasp.html.HtmlElementTables",
      "org.owasp.html.HtmlElementTables$HtmlElementNames",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "org.owasp.html.HtmlElementTables$DenseElementBinaryMatrix",
      "org.owasp.html.HtmlElementTables$SparseElementToElements",
      "org.owasp.html.HtmlElementTables$SparseElementMultitable",
      "org.owasp.html.HtmlElementTables$TextContentModel",
      "org.owasp.html.HtmlElementTables$DenseElementSet",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.Platform",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.collect.Lists",
      "org.owasp.html.HtmlElementTables$FreeWrapper",
      "org.owasp.html.HtmlElementTablesCanned",
      "org.owasp.html.HtmlPolicyBuilder",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.Collections2",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "com.google.common.collect.Sets",
      "org.owasp.html.HtmlStreamEventProcessor$Processors$1",
      "org.owasp.html.HtmlStreamEventProcessor$Processors",
      "org.owasp.html.AttributePolicy$1",
      "org.owasp.html.AttributePolicy$2",
      "org.owasp.html.AttributePolicy",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.collect.ImmutableList$Builder",
      "org.owasp.html.AbstractTokenStream",
      "org.owasp.html.HtmlLexer",
      "org.owasp.html.Strings",
      "org.owasp.html.HtmlPolicyBuilder$AttributeBuilder",
      "com.google.common.collect.SingletonImmutableList",
      "org.owasp.html.HtmlPolicyBuilder$AttributeBuilder$1",
      "org.owasp.html.AttributePolicy$Util",
      "org.owasp.html.Joinable$JoinHelper",
      "org.owasp.html.AttributePolicy$Util$AttributePolicyJoiner",
      "com.google.common.base.Optional",
      "com.google.common.base.Absent",
      "com.google.common.collect.Iterators$12",
      "org.owasp.html.CssSchema$Property",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.ImmutableSet$Builder",
      "org.owasp.html.CssSchema",
      "org.owasp.html.HtmlPolicyBuilder$AttributeBuilder$2",
      "org.owasp.html.ElementPolicy$1",
      "org.owasp.html.ElementPolicy$2",
      "org.owasp.html.ElementPolicy",
      "org.owasp.html.ElementPolicy$Util",
      "org.owasp.html.ElementPolicy$Util$PolicyJoiner",
      "org.owasp.html.HtmlElementTables$TextContentModelBit",
      "org.owasp.html.HtmlPolicyBuilder$RelsOnLinksPolicy",
      "org.owasp.html.HtmlPolicyBuilder$JoinRelsOnLinksPolicies",
      "org.owasp.html.StandardUrlAttributePolicy",
      "org.owasp.html.StylingPolicy",
      "org.owasp.html.HtmlPolicyBuilder$1",
      "org.owasp.html.JoinedAttributePolicy",
      "org.owasp.html.StylingPolicy$StylingPolicyJoinStrategy",
      "org.owasp.html.ElementAndAttributePolicies",
      "org.owasp.html.HtmlPolicyBuilder$CompiledState",
      "org.owasp.html.PolicyFactory",
      "com.google.common.collect.Iterables",
      "org.owasp.html.examples.EbayPolicyExample",
      "org.owasp.html.examples.EbayPolicyExample$1",
      "org.owasp.html.examples.EbayPolicyExample$2",
      "com.google.common.base.Charsets",
      "org.owasp.html.HtmlStreamRenderer",
      "org.owasp.html.AutoCloseableHtmlStreamRenderer",
      "org.owasp.html.HtmlTokenType",
      "org.owasp.html.HtmlSanitizer$1",
      "org.owasp.html.Encoding",
      "org.owasp.html.Trie",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "org.owasp.html.HtmlEntities",
      "com.google.common.io.CharStreams",
      "org.owasp.html.HtmlStreamRenderer$CloseableHtmlStreamRenderer",
      "org.owasp.html.HtmlTextEscapingMode",
      "org.owasp.html.ElementAndAttributePolicyBasedSanitizerPolicy",
      "org.owasp.html.HtmlSanitizer",
      "org.owasp.html.TagBalancingHtmlStreamEventReceiver",
      "org.owasp.html.IntVector",
      "org.owasp.html.HtmlLexer$State",
      "org.owasp.html.HtmlInputSplitter"
    );
  }
}
