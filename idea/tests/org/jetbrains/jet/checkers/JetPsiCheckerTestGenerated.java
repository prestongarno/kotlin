/*
 * Copyright 2010-2012 JetBrains s.r.o.
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
package org.jetbrains.jet.checkers;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.checkers.AbstractJetPsiCheckerTest;

/** This class is generated by {@link org.jetbrains.jet.checkers.AbstractJetPsiCheckerTest}. DO NOT MODIFY MANUALLY */
public class JetPsiCheckerTestGenerated extends AbstractJetPsiCheckerTest {
    @TestMetadata("idea/testData/checker")
    public static class Checker extends AbstractJetPsiCheckerTest {
        @TestMetadata("Abstract.jet")
        public void testAbstract() throws Exception {
            doTest("idea/testData/checker/Abstract.jet");
        }
        
        public void testAllFilesPresentInChecker() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.checkers.AbstractJetPsiCheckerTest", new File("idea/testData/checker"), "jet", false);
        }
        
        @TestMetadata("AnonymousInitializers.jet")
        public void testAnonymousInitializers() throws Exception {
            doTest("idea/testData/checker/AnonymousInitializers.jet");
        }
        
        @TestMetadata("BinaryCallsOnNullableValues.jet")
        public void testBinaryCallsOnNullableValues() throws Exception {
            doTest("idea/testData/checker/BinaryCallsOnNullableValues.jet");
        }
        
        @TestMetadata("Bounds.jet")
        public void testBounds() throws Exception {
            doTest("idea/testData/checker/Bounds.jet");
        }
        
        @TestMetadata("Bounds2.jet")
        public void testBounds2() throws Exception {
            doTest("idea/testData/checker/Bounds2.jet");
        }
        
        @TestMetadata("BoundsWithSubstitutors.jet")
        public void testBoundsWithSubstitutors() throws Exception {
            doTest("idea/testData/checker/BoundsWithSubstitutors.jet");
        }
        
        @TestMetadata("BreakContinue.jet")
        public void testBreakContinue() throws Exception {
            doTest("idea/testData/checker/BreakContinue.jet");
        }
        
        @TestMetadata("Builders.jet")
        public void testBuilders() throws Exception {
            doTest("idea/testData/checker/Builders.jet");
        }
        
        @TestMetadata("Casts.jet")
        public void testCasts() throws Exception {
            doTest("idea/testData/checker/Casts.jet");
        }
        
        @TestMetadata("ClassObjects.jet")
        public void testClassObjects() throws Exception {
            doTest("idea/testData/checker/ClassObjects.jet");
        }
        
        @TestMetadata("Constants.jet")
        public void testConstants() throws Exception {
            doTest("idea/testData/checker/Constants.jet");
        }
        
        @TestMetadata("Constructors.jet")
        public void testConstructors() throws Exception {
            doTest("idea/testData/checker/Constructors.jet");
        }
        
        @TestMetadata("CyclicHierarchy.jet")
        public void testCyclicHierarchy() throws Exception {
            doTest("idea/testData/checker/CyclicHierarchy.jet");
        }
        
        @TestMetadata("Enums.jet")
        public void testEnums() throws Exception {
            doTest("idea/testData/checker/Enums.jet");
        }
        
        @TestMetadata("ExtensionFunctions.jet")
        public void testExtensionFunctions() throws Exception {
            doTest("idea/testData/checker/ExtensionFunctions.jet");
        }
        
        @TestMetadata("ForRangeConventions.jet")
        public void testForRangeConventions() throws Exception {
            doTest("idea/testData/checker/ForRangeConventions.jet");
        }
        
        @TestMetadata("FunctionReturnTypes.jet")
        public void testFunctionReturnTypes() throws Exception {
            doTest("idea/testData/checker/FunctionReturnTypes.jet");
        }
        
        @TestMetadata("GenericArgumentConsistency.jet")
        public void testGenericArgumentConsistency() throws Exception {
            doTest("idea/testData/checker/GenericArgumentConsistency.jet");
        }
        
        @TestMetadata("IncDec.jet")
        public void testIncDec() throws Exception {
            doTest("idea/testData/checker/IncDec.jet");
        }
        
        @TestMetadata("IsExpressions.jet")
        public void testIsExpressions() throws Exception {
            doTest("idea/testData/checker/IsExpressions.jet");
        }
        
        @TestMetadata("LocalObjects.jet")
        public void testLocalObjects() throws Exception {
            doTest("idea/testData/checker/LocalObjects.jet");
        }
        
        @TestMetadata("MultipleBounds.jet")
        public void testMultipleBounds() throws Exception {
            doTest("idea/testData/checker/MultipleBounds.jet");
        }
        
        @TestMetadata("NamespaceAsExpression.jet")
        public void testNamespaceAsExpression() throws Exception {
            doTest("idea/testData/checker/NamespaceAsExpression.jet");
        }
        
        @TestMetadata("NamespaceQualified.jet")
        public void testNamespaceQualified() throws Exception {
            doTest("idea/testData/checker/NamespaceQualified.jet");
        }
        
        @TestMetadata("NestedObjects.jet")
        public void testNestedObjects() throws Exception {
            doTest("idea/testData/checker/NestedObjects.jet");
        }
        
        @TestMetadata("Nullability.jet")
        public void testNullability() throws Exception {
            doTest("idea/testData/checker/Nullability.jet");
        }
        
        @TestMetadata("Objects.jet")
        public void testObjects() throws Exception {
            doTest("idea/testData/checker/Objects.jet");
        }
        
        @TestMetadata("Override.jet")
        public void testOverride() throws Exception {
            doTest("idea/testData/checker/Override.jet");
        }
        
        @TestMetadata("OverridesAndGenerics.jet")
        public void testOverridesAndGenerics() throws Exception {
            doTest("idea/testData/checker/OverridesAndGenerics.jet");
        }
        
        @TestMetadata("PrimaryConstructors.jet")
        public void testPrimaryConstructors() throws Exception {
            doTest("idea/testData/checker/PrimaryConstructors.jet");
        }
        
        @TestMetadata("ProjectionsInSupertypes.jet")
        public void testProjectionsInSupertypes() throws Exception {
            doTest("idea/testData/checker/ProjectionsInSupertypes.jet");
        }
        
        @TestMetadata("Properties.jet")
        public void testProperties() throws Exception {
            doTest("idea/testData/checker/Properties.jet");
        }
        
        @TestMetadata("QualifiedExpressions.jet")
        public void testQualifiedExpressions() throws Exception {
            doTest("idea/testData/checker/QualifiedExpressions.jet");
        }
        
        @TestMetadata("QualifiedThis.jet")
        public void testQualifiedThis() throws Exception {
            doTest("idea/testData/checker/QualifiedThis.jet");
        }
        
        @TestMetadata("QualifiedThisInClosures.jet")
        public void testQualifiedThisInClosures() throws Exception {
            doTest("idea/testData/checker/QualifiedThisInClosures.jet");
        }
        
        @TestMetadata("RecursiveTypeInference.jet")
        public void testRecursiveTypeInference() throws Exception {
            doTest("idea/testData/checker/RecursiveTypeInference.jet");
        }
        
        @TestMetadata("Redeclarations.jet")
        public void testRedeclarations() throws Exception {
            doTest("idea/testData/checker/Redeclarations.jet");
        }
        
        @TestMetadata("ResolveToJava.jet")
        public void testResolveToJava() throws Exception {
            doTest("idea/testData/checker/ResolveToJava.jet");
        }
        
        @TestMetadata("StringTemplates.jet")
        public void testStringTemplates() throws Exception {
            doTest("idea/testData/checker/StringTemplates.jet");
        }
        
        @TestMetadata("SupertypeListChecks.jet")
        public void testSupertypeListChecks() throws Exception {
            doTest("idea/testData/checker/SupertypeListChecks.jet");
        }
        
        @TestMetadata("TraitSupertypeList.jet")
        public void testTraitSupertypeList() throws Exception {
            doTest("idea/testData/checker/TraitSupertypeList.jet");
        }
        
        @TestMetadata("UnreachableCode.jet")
        public void testUnreachableCode() throws Exception {
            doTest("idea/testData/checker/UnreachableCode.jet");
        }
        
        @TestMetadata("Unresolved.jet")
        public void testUnresolved() throws Exception {
            doTest("idea/testData/checker/Unresolved.jet");
        }
        
        @TestMetadata("Variance.jet")
        public void testVariance() throws Exception {
            doTest("idea/testData/checker/Variance.jet");
        }
        
        @TestMetadata("When.jet")
        public void testWhen() throws Exception {
            doTest("idea/testData/checker/When.jet");
        }
        
    }
    
    @TestMetadata("idea/testData/checker/regression")
    public static class Regression extends AbstractJetPsiCheckerTest {
        public void testAllFilesPresentInRegression() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.checkers.AbstractJetPsiCheckerTest", new File("idea/testData/checker/regression"), "jet", false);
        }
        
        @TestMetadata("AmbiguityOnLazyTypeComputation.jet")
        public void testAmbiguityOnLazyTypeComputation() throws Exception {
            doTest("idea/testData/checker/regression/AmbiguityOnLazyTypeComputation.jet");
        }
        
        @TestMetadata("AssignmentsUnderOperators.jet")
        public void testAssignmentsUnderOperators() throws Exception {
            doTest("idea/testData/checker/regression/AssignmentsUnderOperators.jet");
        }
        
        @TestMetadata("CoercionToUnit.jet")
        public void testCoercionToUnit() throws Exception {
            doTest("idea/testData/checker/regression/CoercionToUnit.jet");
        }
        
        @TestMetadata("DoubleDefine.jet")
        public void testDoubleDefine() throws Exception {
            doTest("idea/testData/checker/regression/DoubleDefine.jet");
        }
        
        @TestMetadata("Jet11.jet")
        public void testJet11() throws Exception {
            doTest("idea/testData/checker/regression/Jet11.jet");
        }
        
        @TestMetadata("Jet121.jet")
        public void testJet121() throws Exception {
            doTest("idea/testData/checker/regression/Jet121.jet");
        }
        
        @TestMetadata("Jet124.jet")
        public void testJet124() throws Exception {
            doTest("idea/testData/checker/regression/Jet124.jet");
        }
        
        @TestMetadata("Jet169.jet")
        public void testJet169() throws Exception {
            doTest("idea/testData/checker/regression/Jet169.jet");
        }
        
        @TestMetadata("Jet17.jet")
        public void testJet17() throws Exception {
            doTest("idea/testData/checker/regression/Jet17.jet");
        }
        
        @TestMetadata("Jet183.jet")
        public void testJet183() throws Exception {
            doTest("idea/testData/checker/regression/Jet183.jet");
        }
        
        @TestMetadata("Jet183-1.jet")
        public void testJet183_1() throws Exception {
            doTest("idea/testData/checker/regression/Jet183-1.jet");
        }
        
        @TestMetadata("Jet53.jet")
        public void testJet53() throws Exception {
            doTest("idea/testData/checker/regression/Jet53.jet");
        }
        
        @TestMetadata("Jet67.jet")
        public void testJet67() throws Exception {
            doTest("idea/testData/checker/regression/Jet67.jet");
        }
        
        @TestMetadata("Jet68.jet")
        public void testJet68() throws Exception {
            doTest("idea/testData/checker/regression/Jet68.jet");
        }
        
        @TestMetadata("Jet69.jet")
        public void testJet69() throws Exception {
            doTest("idea/testData/checker/regression/Jet69.jet");
        }
        
        @TestMetadata("Jet72.jet")
        public void testJet72() throws Exception {
            doTest("idea/testData/checker/regression/Jet72.jet");
        }
        
        @TestMetadata("Jet81.jet")
        public void testJet81() throws Exception {
            doTest("idea/testData/checker/regression/Jet81.jet");
        }
        
        @TestMetadata("kt251.jet")
        public void testKt251() throws Exception {
            doTest("idea/testData/checker/regression/kt251.jet");
        }
        
        @TestMetadata("kt303.jet")
        public void testKt303() throws Exception {
            doTest("idea/testData/checker/regression/kt303.jet");
        }
        
        @TestMetadata("OverrideResolution.jet")
        public void testOverrideResolution() throws Exception {
            doTest("idea/testData/checker/regression/OverrideResolution.jet");
        }
        
        @TestMetadata("ScopeForSecondaryConstructors.jet")
        public void testScopeForSecondaryConstructors() throws Exception {
            doTest("idea/testData/checker/regression/ScopeForSecondaryConstructors.jet");
        }
        
        @TestMetadata("SpecififcityByReceiver.jet")
        public void testSpecififcityByReceiver() throws Exception {
            doTest("idea/testData/checker/regression/SpecififcityByReceiver.jet");
        }
        
        @TestMetadata("WrongTraceInCallResolver.jet")
        public void testWrongTraceInCallResolver() throws Exception {
            doTest("idea/testData/checker/regression/WrongTraceInCallResolver.jet");
        }
        
    }
    
    @TestMetadata("idea/testData/checker/infos")
    public static class Infos extends AbstractJetPsiCheckerTest {
        public void testAllFilesPresentInInfos() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.checkers.AbstractJetPsiCheckerTest", new File("idea/testData/checker/infos"), "jet", false);
        }
        
        @TestMetadata("Autocasts.jet")
        public void testAutocasts() throws Exception {
            doTestWithInfos("idea/testData/checker/infos/Autocasts.jet");
        }
        
        @TestMetadata("PropertiesWithBackingFields.jet")
        public void testPropertiesWithBackingFields() throws Exception {
            doTestWithInfos("idea/testData/checker/infos/PropertiesWithBackingFields.jet");
        }
        
        @TestMetadata("WrapIntoRef.jet")
        public void testWrapIntoRef() throws Exception {
            doTestWithInfos("idea/testData/checker/infos/WrapIntoRef.jet");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("JetPsiCheckerTestGenerated");
        suite.addTestSuite(Checker.class);
        suite.addTestSuite(Regression.class);
        suite.addTestSuite(Infos.class);
        return suite;
    }
}
